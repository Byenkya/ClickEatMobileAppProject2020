package com.clickEat.ug.screens.orders

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.CustomerPlaceOrder
import com.clickEat.ug.data.Reason
import com.clickEat.ug.databinding.FragmentOrdersBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.cart.securityAlert
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.menu.formatWithThousandComma
import kotlinx.android.synthetic.main.order_item_summary_layout.view.*
import kotlinx.android.synthetic.main.terminate_layout.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.StringBuilder

class OrdersFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var ordersViewModel: OrdersViewModel
    private lateinit var viewModalFactory: OrdersViewModalFactory
    private lateinit var binding: FragmentOrdersBinding
    private val userViewModel: MainActivityViewModel by activityViewModels()
    var customerID: Int? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val application  = requireNotNull(activity).application
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_orders, container, false)
        userViewModel.currentUser.observe(viewLifecycleOwner, Observer {it ->
            if(it.names == "click_it"  && it.email == "welcome to click it App"){
                securityAlert(requireContext(), this)
            }else{
                customerID = it.customer_id
                viewModalFactory = OrdersViewModalFactory(customerID!!, application)

                ordersViewModel =  ViewModelProvider(this, viewModalFactory).get(OrdersViewModel::class.java)

                binding.lifecycleOwner = this
                progressDialog.show(requireContext(),"Please Wait...")

                ordersViewModel.orders.observe(viewLifecycleOwner, Observer {
                    progressDialog.dialog.dismiss()
                    if(null != it){
                        if (it.isEmpty()){
                            alert()
                        }else {
                            binding.viewModal = ordersViewModel
                            binding.myOrders.adapter = OrdersRecyclerAdapter(
                                OrderInformation {
                                        order: CustomerPlaceOrder ->  showOrder(requireContext(),ordersViewModel,customerID!!,order, this)
                                }
                            )
                            binding.ordersLayout.visibility = View.VISIBLE
                        }


                    }else{
                        CoroutineScope(Dispatchers.Main).launch {
                            CheckInternetConnection(requireContext()).isConnectedToInternet(
                                this@OrdersFragment,
                                binding.ordersLayout
                            )
                            binding.ordersLayout.visibility = View.VISIBLE
                        }
                    }
                })
            }
        })

        return binding.root
    }


    private fun alert() {
        val builder = android.app.AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage("No Orders Available!!")
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

}

private fun showOrder(context: Context,ordersViewModel: OrdersViewModel, customerId:Int,order:CustomerPlaceOrder, fragment: Fragment){
    val mDialogView = LayoutInflater.from(context).inflate(R.layout.order_item_summary_layout, null)
    mDialogView.order_id_value.text = order.id.toString()
    mDialogView.simple_version_value.text = order.orderRefSimpleVersion
    mDialogView.order_date_value.text = order.orderDate

    if(order.isTerminated){
        mDialogView.reasonLayout.visibility = View.VISIBLE
    }

    mDialogView.paid_value.setImageResource(
        when(order.isPaid){
            true -> R.drawable.ic_baseline_check_24
            else -> R.drawable.ic_baseline_close_24
        }
    )

    mDialogView.prepared_value.setImageResource(
        when(order.isPrepared){
            true -> R.drawable.ic_baseline_check_24
            else -> R.drawable.ic_baseline_close_24
        }
    )

    mDialogView.terminated_value.setImageResource(
        when(order.isTerminated){
            true -> R.drawable.ic_baseline_check_24
            else -> R.drawable.ic_baseline_close_24
        }
    )

    if(order.terminationReason != null){
        mDialogView.reason_value.text = order.terminationReason
    }else{
        mDialogView.reason_value.text = "No reason"
    }


    mDialogView.received_value.setImageResource(
        when(order.customerReceived){
            true -> R.drawable.ic_baseline_check_24
            else -> R.drawable.ic_baseline_close_24
        }
    )

    mDialogView.delivery_fee_value.text = """Ugx ${order.deliveryFee.formatWithThousandComma()}"""

    val mBuilder = AlertDialog.Builder(context)
        .setView(mDialogView)
        .setTitle(order.orderRefSimpleVersion)
        .setIcon(R.drawable.ic_baseline_receipt_24)

    mBuilder.setNegativeButton( HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){
            dialogInterface, _ ->  dialogInterface.cancel()
    }

    val mAlertDialog = mBuilder.show()
    val adapter = OrderedItemsAdapter(context, order)
    mDialogView.orderedItems.adapter = adapter
    mDialogView.orderedItems.isEnabled = true
    val overallTotal = order.orderItems.map { t-> t.total }
    mDialogView.order_cart_total_value.text = "Ugx ${(overallTotal.sum() + order.deliveryFee).formatWithThousandComma()}"

    if(order.isPaid || order.isPrepared || order.isTerminated || order.customerReceived){
        mDialogView.terminateOrder.visibility = View.GONE
    }


    mDialogView.terminateOrder.setOnClickListener {
        val builder = android.app.AlertDialog.Builder(context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_remove_shopping_cart_24)
        builder.setMessage("Are you sure you want to terminate this Order?")
        builder.setPositiveButton( HtmlCompat.fromHtml("<font color='#FF7F27'>Yes</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){ _, _ ->
            val dialogView = LayoutInflater.from(context).inflate(R.layout.terminate_layout, null)
            val dialogBuilder = AlertDialog.Builder(context)
                .setView(dialogView)
                .setTitle(order.orderRefSimpleVersion)
                .setIcon(R.drawable.ic_baseline_assignment_24)
            val alertDialog = dialogBuilder.show()
            dialogView.done.setOnClickListener {
                if(dialogView.reason.text.isNullOrBlank() || dialogView.reason.text.isNullOrEmpty()){
                    dialogView.reason.error = "Please enter reason for terminating Order."
                }else{
                    mAlertDialog.dismiss()
                    alertDialog.dismiss()
                    ordersViewModel.terminateOrder(customerId, Reason(dialogView.reason.text.toString()))
                    ordersViewModel.orders.observe(fragment.viewLifecycleOwner, Observer {apiResponse->
                        apiResponse?.let {
                            if(it.isEmpty()){
                                Toast.makeText(
                                    context,
                                    HtmlCompat.fromHtml("<font color='#F81504'>Order was not terminated successfully. Contact customer care for futher assistance.</font>", HtmlCompat.FROM_HTML_MODE_COMPACT),
                                    Toast.LENGTH_LONG
                                ).run {
                                    setGravity(Gravity.CENTER, 0, 0)
                                    show()
                                }
                            }else{
                                reloadFragment(fragment)

                                Toast.makeText(
                                    context,
                                    HtmlCompat.fromHtml("<font color='#FF5722'>Order was terminated successfully!!.</font>", HtmlCompat.FROM_HTML_MODE_COMPACT),
                                    Toast.LENGTH_LONG
                                ).run {
                                    setGravity(Gravity.CENTER, 0, 0)
                                    show()
                                }

                            }

                        }
                    })
                }
            }

        }
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>No</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }


}



private fun reloadFragment(fragment: Fragment) {
    val fragmentTransaction: FragmentTransaction = fragment.parentFragmentManager.beginTransaction()
    fragmentTransaction.detach(fragment)
    fragmentTransaction.attach(fragment)
    fragmentTransaction.commit()
}