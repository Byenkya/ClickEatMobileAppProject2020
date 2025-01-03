package com.clickEat.ug.screens.checkout

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.text.format.DateFormat
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.TextView
import android.widget.TimePicker
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.FragmentCheckoutBinding
import com.clickEat.ug.screens.cart.CartViewModel
import com.clickEat.ug.screens.cart.CartViewModelFactory
import com.clickEat.ug.screens.cart.securityAlert
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.menu.formatWithThousandComma
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import kotlinx.android.synthetic.main.order_step_1.view.*
import kotlinx.android.synthetic.main.order_summary_layout.view.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CheckoutFragment : Fragment(), AddressDialog.AddressSelectedListener, Step, TimePickerDialog.OnTimeSetListener {
    private val progressDialog = CustomProgressDialog()
    private lateinit var viewModelFactory: CheckOutModelFactory
    private lateinit var checkOutViewModel: CheckOutViewModel
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var binding: FragmentCheckoutBinding
    private lateinit var sharedModel: CartViewModel
    private var customerId: Int? = null
    private var addressId: Int? = null
    private var deliveryAddress: CustomerNewAddress? = null
    private var order: CustomerOrder? = null
    var cal = Calendar.getInstance()
    var hour: Int = 0
    var minute: Int = 0
    var myDay = 0
    var myMonth: Int = 0
    var myYear: Int = 0
    var myHour: Int = 0
    var myMinute: Int = 0
    var status = false

    override fun onDialogClickListener(id: Int) {
        checkOutViewModel.places.observe(this, Observer { villages ->
            if(null != villages){
                addressId = id
                val address = checkOutViewModel.addresses.value?.find { it.id == addressId }
                val village = villages?.find { it.village == address?.village }
                FreeDelivery.delivery_fee = village?.fee
                val string = StringBuilder().run {
                    append("<html><body>")
                    append("<p>")
                    append("<b>County: </b>${address?.county}<br/>")
                    append("<b>Sub county: </b>${address?.sub_county}<br/>")
                    append("<b>Village: </b>${address?.village}<br/>")
                    append("<b>Other details: </b>${address?.other_details}.")
                    append("</p>")
                    append("</body></html>")
                    toString()
                }

                deliveryAddress = CustomerNewAddress(address?.county,address?.sub_county,address?.village,address?.other_details,address?.is_default)
                binding.invalidateAll()
                binding.step2.yourDeliveryAddressLabelValue.run {
                    text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
                }

                binding.step1.address_label.visibility = View.GONE
                binding.step1.new_address.visibility = View.GONE
                binding.step1.existing_addresses.visibility = View.GONE
                if(FreeDelivery.free_delivery){
                    "Ugx ${FreeDelivery.free_delivery_fee}".also { binding.step2.delivery_fee_value.text = it }
                }else{
                    "Ugx ${FreeDelivery.delivery_fee.toString()}".also { binding.step2.delivery_fee_value.text = it }
                }
                binding.step2.visibility = View.VISIBLE
                binding.step2.yourDeliveryAddressLabel.visibility = View.VISIBLE
                binding.step2.yourDeliveryAddressLabelValue.visibility = View.VISIBLE
                binding.step2.changeDeliveryAddress.visibility = View.VISIBLE
                showOrderSummary()
            }
        })

    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_checkout, container, false)

        userViewModel.currentUser.observe(viewLifecycleOwner, Observer {customerDetails ->
            if(customerDetails.names == "click_it"  && customerDetails.email == "welcome to click it App"){
                securityAlert(requireContext(), this)
            }else{
                val application  = requireNotNull(activity).application
                customerId = customerDetails.customer_id
                viewModelFactory = CheckOutModelFactory(customerId!!, application)
                checkOutViewModel = ViewModelProvider(this, viewModelFactory).get(CheckOutViewModel::class.java)
                val viewModelFactory = CartViewModelFactory(customerId!!, application)
                sharedModel = ViewModelProvider(this, viewModelFactory).get(CartViewModel::class.java)
                binding.lifecycleOwner = this
                //get Arua places
                checkOutViewModel.getAllPlaces()
                binding.step1.visibility = View.VISIBLE
            }
        })
        // create an OnDateSetListener
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                myDay = dayOfMonth
                myYear = year
                myMonth = monthOfYear + 1
                val calendar: Calendar = Calendar.getInstance()
                hour = calendar.get(Calendar.HOUR)
                minute = calendar.get(Calendar.MINUTE)
                val timePickerDialog = TimePickerDialog(binding.root.context, R.style.MyDatePickerDialogTheme,this, hour, minute,
                    DateFormat.is24HourFormat(binding.root.context))
                timePickerDialog.show()
            }
        status = PreOrderStatus.status
        binding.step2.preOrdercheckBox.setOnClickListener {
            if(binding.step2.preOrdercheckBox.isChecked){
                PreOrderStatus.status = false
                val datePickerDialog =
                    DatePickerDialog(binding.root.context,R.style.MyDatePickerDialogTheme, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH))
                datePickerDialog.datePicker.minDate = System.currentTimeMillis() - 1000
                datePickerDialog.show()
            }else{
                binding.step2.pre_order_date_details.visibility = View.GONE
                CustomerPlacedOrder.let {
                    it.customerPlaceOrder?.pre_order = false
                    it.customerPlaceOrder?.pre_order_date = ""
                }
                PreOrderStatus.status = status

            }

        }


        return binding.root
    }

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        var hrs = ""
        var mins = ""
        myHour = p1
        myMinute = p2
        val am_hours = 0..11
        val hour_check = myHour.toString()
        val min_check = myMinute.toString()
        hrs = if(hour_check.length == 1){
                    "0$hour_check"
                }else{
                    hour_check
                }
        mins = if(min_check.length == 1){
                    "0$min_check"
                }else{
                    min_check
                }

        val string = java.lang.StringBuilder().run {
            append("<html><body>")
            append("<div>")
            append("<b>Pre order date details:</b><br/>")
            append("<p>Date: <b><font color='#FF5722'>${myDay}/${myMonth}/$myYear</font></b></p>")
            if (am_hours.contains(myHour)){
                append("<p>Time(24 hour clock): <b><font color='#FF5722'>${hrs}:${mins} AM</font></b></p>")
            }else{
                append("<p>Time(24 hour clock): <b><font color='#FF5722'>${hrs}:${mins} PM</font></b></p>")
            }
            append("</div>")
            append("</body></html>")
            toString()
        }

        binding.step2.pre_order_date_details.text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
        binding.step2.pre_order_date_details.visibility = View.VISIBLE
        CustomerPlacedOrder.let {
            it.customerPlaceOrder?.pre_order = true
            it.customerPlaceOrder?.pre_order_date = "$myYear-$myMonth-$myDay-$myHour-$myMinute"
        }
    }

    override fun verifyStep(): VerificationError? {
        if(validateInputs()){
            return when(deliveryAddress == null){
                true -> VerificationError("Please select a delivery address")
                else -> {
                    when(PreOrderStatus.status){
                        true -> {
                            val string = java.lang.StringBuilder().run {
                                append("<html><body>")
                                append("<div>")
                                append("<p><font color='#FFFFFF'>You cannot get this order at the moment.<br/>Select <b>Pre Order</b> Option to get it later on</font></p>")
                                append("</div>")
                                append("</body></html>")
                                toString()
                            }
                            VerificationError(HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim().toString())
                        }
                        false -> {
                            CustomerPlacedOrder.let {
                                it.customerPlaceOrder?.customer_id = customerId!!
                                it.customerPlaceOrder?.address = deliveryAddress
                                if(FreeDelivery.free_delivery){
                                    it.customerPlaceOrder?.deliveryFee = FreeDelivery.free_delivery_fee
                                }else{
                                    it.customerPlaceOrder?.deliveryFee = FreeDelivery.delivery_fee
                                }
                                it.customerPlaceOrder?.deliveryContact = binding.step2.deliveryContact.text.toString()
                            }
                            null
                        }
                    }

                }
            }
        }else{
            return VerificationError("Invalid Contact. Check that your delivery contact is correct!!")
        }

    }

    override fun onSelected() {
        showOrderSummary()
        userViewModel.newAddress.observe(viewLifecycleOwner, Observer {
            it?.let {customerAddress->
                val string = StringBuilder().run {
                    append("<html><body>")
                    append("<p>")
                    append("<b>County: </b>${customerAddress.county}<br/>")
                    append("<b>Sub county: </b>${customerAddress.sub_county}<br/>")
                    append("<b>Village: </b>${customerAddress.village}<br/>")
                    append("<b>Other details: </b>${customerAddress.other_details}.")
                    append("</p>")
                    append("</body></html>")
                    toString()
                }

                deliveryAddress = CustomerNewAddress(
                    customerAddress.county,
                    customerAddress.sub_county,
                    customerAddress.village,
                    customerAddress.other_details,
                    customerAddress.is_default
                )

                val village =checkOutViewModel.places.value?.find { it.village == customerAddress.village }
                FreeDelivery.delivery_fee = village?.fee
                binding.invalidateAll()
                binding.step2.yourDeliveryAddressLabelValue.run {
                    text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT)
                }

                binding.step1.address_label.visibility = View.GONE
                binding.step1.existing_addresses.visibility = View.GONE
                binding.step1.new_address.visibility = View.GONE
                if(FreeDelivery.free_delivery){
                    "Ugx ${FreeDelivery.free_delivery_fee}".also {deliverFee -> binding.step2.delivery_fee_value.text = deliverFee }
                }else{
                    "Ugx ${FreeDelivery.delivery_fee.toString()}".also {deliverFee -> binding.step2.delivery_fee_value.text = deliverFee }
                }

                binding.step2.visibility = View.VISIBLE
                binding.step2.yourDeliveryAddressLabel.visibility = View.VISIBLE
                binding.step2.yourDeliveryAddressLabelValue.visibility = View.VISIBLE
                binding.step2.changeDeliveryAddress.visibility = View.VISIBLE
                showOrderSummary()

            }
        })

        binding.step1.existing_addresses.setOnClickListener {
            progressDialog.show(requireContext(),"Please Wait...")
            checkOutViewModel.addresses.observe(viewLifecycleOwner, Observer {
                progressDialog.dialog.dismiss()
                if(null != it && it.isNotEmpty()){
                    val dialog = AddressDialog.newInstance(AllCustomerAddresses(checkOutViewModel.addresses.value))
                    dialog.setTargetFragment(this, 2)
                    dialog.isCancelable = false
                    dialog.show(this.parentFragmentManager, "AddressStationDialog")
                }else{
                    onAlertDialog(requireContext(),"Alert", "No Addresses found!!.")
                }
            })

        }

        binding.step1.new_address.setOnClickListener {
            checkOutViewModel.places.observe(viewLifecycleOwner, Observer {
                if(it == null){
                    onAlertDialog(requireContext(),"Error","No places found!!")
                }else{
                    val dialog = NewAddressDialog.newInstance(AruaVillages(checkOutViewModel.places.value!!),customerId!!)
                    dialog.setTargetFragment(this, 2)
                    dialog.isCancelable = false
                    dialog.show(this.parentFragmentManager, "NewAddressDialog")

                }
            })
        }

        binding.step2.changeDeliveryAddress.setOnClickListener {
            deliveryAddress = null
            binding.step1.existing_addresses.isChecked = false
            binding.step1.new_address.isChecked = false
            binding.step1.address_label.visibility = View.VISIBLE
            binding.step1.new_address.visibility = View.VISIBLE
            binding.step1.existing_addresses.visibility = View.VISIBLE
            binding.step2.yourDeliveryAddressLabel.visibility = View.GONE
            binding.step2.yourDeliveryAddressLabelValue.visibility = View.GONE
            binding.step2.changeDeliveryAddress.visibility = View.GONE
        }
    }

    override fun onError(error: VerificationError) {
        val builder = AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(error.errorMessage)
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

    private fun validateInputs(): Boolean{
        var validated = false
        binding.apply {
            when {
                binding.step2.deliveryContact.text.isNullOrEmpty() -> {
                    binding.step2.deliveryContact.error = "Please Enter Delivery Contact"
                }

                binding.step2.deliveryContact.text.toString().length !in 10..13 -> {
                    binding.step2.deliveryContact.error = "Invalid Contact!!."
                }

                else -> validated = true

            }
        }

        return validated
    }

    private fun showOrderSummary() {
        if (OrderedProducts.orderedProducts != null) {
            if(OrderedProducts.orderedProducts!!.cart_items.isNotEmpty()){
                val adapter = OrderCartRecyclerAdapter(requireContext(), OrderedProducts.orderedProducts!!)
                binding.step2.listViewOrderCartItems.adapter = adapter
                "Ugx ${OrderedProducts.orderedProducts!!.cart_items[0].cart_total_amount.formatWithThousandComma()}".also { binding.step2.order_cart_total_value.text = it }
                binding.step2.deliveryContact.setText(userViewModel.currentUser.value?.contact)
                if(FreeDelivery.free_delivery){
                    "Ugx ${FreeDelivery.free_delivery_fee}".also { binding.step2.delivery_fee_value.text = it }
                }else{
                    "Ugx ${FreeDelivery.delivery_fee.toString()}".also { binding.step2.delivery_fee_value.text = it }
                }
                if(FreeDelivery.free_delivery){
                    val orderTotal = FreeDelivery.free_delivery_fee.plus(OrderedProducts.orderedProducts!!.cart_items[0].cart_total_amount)
                    "Ugx ${orderTotal.formatWithThousandComma()}".also { binding.step2.order_total_value.text = it }
                }else{
                    val orderTotal = FreeDelivery.delivery_fee?.plus(OrderedProducts.orderedProducts!!.cart_items[0].cart_total_amount)
                    "Ugx ${orderTotal?.formatWithThousandComma()}".also { binding.step2.order_total_value.text = it }
                }

                userViewModel._newAddress.value = null
            }
        }
    }

    private fun onAlertDialog(context: Context, title: String, message: String){
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(message)
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }

}

