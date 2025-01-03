package com.clickEat.ug.screens.cart

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.CartItemFromServer
import com.clickEat.ug.data.FreeDelivery
import com.clickEat.ug.data.UpdateCartItem
import com.clickEat.ug.databinding.FragmentCartBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.custom_categories.MainFragmentDirections
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import kotlinx.android.synthetic.main.item_quantity_layout.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartFragment : Fragment(), Step {
    private val progressDialog = CustomProgressDialog()
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var viewModelFactory: CartViewModelFactory
    private lateinit var binding: FragmentCartBinding
    private lateinit var cartViewModel: CartViewModel
    private var customerID: Int? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false)
        val application  = requireNotNull(activity).application
        userViewModel.currentUser.observe(viewLifecycleOwner, Observer {customerDetails ->
            if(customerDetails.names == "click_it"  && customerDetails.email == "welcome to click it App"){
                securityAlert(requireContext(), this)
            }else{
                customerID = customerDetails.customer_id
                viewModelFactory = CartViewModelFactory(customerID!!, application)
                cartViewModel = ViewModelProvider(this, viewModelFactory).get(CartViewModel::class.java)
                binding.lifecycleOwner = this
            }

        })


        return binding.root
    }

    override fun verifyStep(): VerificationError? {
        return when(cartViewModel.cart.value?.cart_items?.isEmpty()){
            true -> {
                VerificationError("You have not added items on your cart!!")
            }
            else -> null
        }

    }

    override fun onSelected() {
        binding.cartLinear.visibility = View.GONE
        progressDialog.show(requireContext(),"Please Wait...")
        val cartIcon = this.activity?.findViewById<BottomNavigationView>(R.id.bottomNav)
        cartViewModel.cart.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null != it){
                if (it.cart_items.isEmpty()){
                    alert("You have not added items on your cart!!")
                    cartIcon?.getOrCreateBadge(R.id.cart_item)
                    cartIcon?.removeBadge(R.id.cart_item)
                    binding.cartLinear.visibility = View.GONE
                }else{
                    binding.cartItem = cartViewModel
                    binding.cartLinear.visibility = View.VISIBLE
//                            binding.checkoutPageNav.visibility = View.VISIBLE
                    binding.viewWidgets.visibility = View.VISIBLE
                    binding.divider2.visibility = View.VISIBLE
                    binding.cartItems.visibility = View.VISIBLE
                    binding.divider3.visibility = View.VISIBLE
                    binding.linearLayout2.visibility = View.VISIBLE
                    binding.divider4.visibility = View.VISIBLE
                    val free = it.cart_items.filter { cartItemFromServer -> cartItemFromServer.free_delivery }
                    FreeDelivery.free_delivery = free.isNotEmpty()
                    if(it.cart_items[0].total_quantity > 0){
                        val badge = cartIcon?.getOrCreateBadge(R.id.cart_item)
                        badge?.number = it.cart_items[0].total_quantity
                    }else{
                        cartIcon?.removeBadge(R.id.cart_item)
                    }

                    binding.cartItems.adapter = CartAdapter(
                        UpdateCartInformation {
                                product ->  updateDialog(requireContext(),cartViewModel,userViewModel,this,product)
                        },

                        DeleteCartItem {
                                product: CartItemFromServer ->  deleteCartItemDialog(requireContext(),cartViewModel,userViewModel,this,product)
                        }
                    )

                }

            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@CartFragment,
                        binding.cartLinear
                    )
                    binding.cartLinear.visibility = View.VISIBLE
                }
            }


        })
    }

    override fun onError(error: VerificationError) {
        alert(error.errorMessage)
    }

    private fun alert(error: String) {
        val builder = AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(error)
        builder.setPositiveButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Go order -></font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { _, _ ->

            this.findNavController().navigate(R.id.resturantsFragment)
        }
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }


}

fun deleteCartItemDialog(
        context: Context,
        viewModel: CartViewModel,
        userViewModel: MainActivityViewModel,
        fragment: Fragment,
        product: CartItemFromServer
){
    val builder = AlertDialog.Builder(context)
    var mDialog: AlertDialog? = null
    builder.setTitle("Alert")
    builder.setIcon(R.drawable.ic_baseline_delete_24)
    builder.setMessage("Are you sure you want to delete ${product.product_name}?")
    builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Delete</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){_, _ ->
        userViewModel.currentUser.observe(fragment.viewLifecycleOwner, Observer { it ->
            if (it.names == "click_it" && it.email =="welcome to click it App" ){
                mDialog!!.dismiss()
                securityAlert(context,fragment)
            }else{
                viewModel.delCartItem(product.product_id)
                Toast.makeText(context, "Product: ${product.product_name} deleted successfully", Toast.LENGTH_LONG).show()
                reloadFragment(fragment)
            }
        })
    }
    builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
    ){dialogInterface, _ ->  dialogInterface.cancel()}

    mDialog = builder.show()
}

fun updateDialog(
        context: Context,
        viewModel: CartViewModel,
        userViewModel: MainActivityViewModel,
        fragment: Fragment,
        product: CartItemFromServer
){
    val mDialogView = LayoutInflater.from(context).inflate(R.layout.item_quantity_layout, null)
    mDialogView.add.text = "Update"
    val quantities = (1..15).toList()
    var amount = 0
    var quantity = 0
    val adapter = ArrayAdapter<Int>(context, R.layout.support_simple_spinner_dropdown_item, quantities)
    mDialogView.quantities.adapter = adapter

    mDialogView.quantities.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            quantity = mDialogView.quantities.selectedItem.toString().toInt()
            amount = product.unit_price.times(quantity)
            mDialogView.amount.text = amount.toString()
        }
    }

    val mBuilder = AlertDialog.Builder(context)
            .setView(mDialogView)
            .setTitle(product.product_name)
            .setIcon(R.drawable.ic_baseline_edit_24)

    val mAlertDialog = mBuilder.show()

    //dismiss the dialog window
//    mDialogView.cancel.setOnClickListener { mAlertDialog.dismiss() }
    mDialogView.add.setOnClickListener {
        userViewModel.currentUser.observe(fragment.viewLifecycleOwner, Observer { it ->
            if (it.names == "click_it" && it.email =="welcome to click it App" ){
                mAlertDialog.dismiss()
                securityAlert(context, fragment)
            }else{
                viewModel.updateCartItem(
                        it.customer_id,
                        UpdateCartItem(
                                product.product_id,
                                quantity
                        )
                )

                viewModel.cart.observe(fragment.viewLifecycleOwner, Observer {
                   it?.let {
                       if(it.cart_items.isNullOrEmpty()){
                           mAlertDialog.dismiss()
                           Toast.makeText(context, "Product: ${product.product_name} was not updated successfully!!.", Toast.LENGTH_SHORT).show()
                       }else{
                           mAlertDialog.dismiss()
                           Toast.makeText(context, "Product: ${product.product_name} was updated successfully.", Toast.LENGTH_SHORT).show()
                           reloadFragment(fragment)
                       }
                   }
                })
            }
        })

    }
}

fun reloadFragment(fragment: Fragment) {
    val fragmentTransaction: FragmentTransaction = fragment.parentFragmentManager.beginTransaction()
    val stepperFragment = fragment.childFragmentManager.findFragmentById(R.id.myStepperFragment)
    stepperFragment?.let {
        fragmentTransaction.detach(it)
        fragmentTransaction.attach(it)
        fragmentTransaction.commit()
    }

}

fun securityAlert(context: Context, fragment: Fragment) {
    val builder = AlertDialog.Builder(context)
    builder.setTitle("Alert")
    builder.setIcon(R.drawable.ic_baseline_error_outline_24)
    builder.setMessage("Your must first login")
    fragment.findNavController().navigate(R.id.login)
    builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
    ) { dialogInterface, _ -> dialogInterface.cancel() }

    builder.show()
}


