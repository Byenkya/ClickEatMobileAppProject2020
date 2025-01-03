  package com.clickEat.ug.screens.stepper_layout

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.CustomerOrder
import com.clickEat.ug.data.CustomerPlacedOrder
import com.clickEat.ug.data.FreeDelivery
import com.clickEat.ug.databinding.FragmentMyStepperBinding
import com.clickEat.ug.screens.cart.securityAlert
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class MyStepperFragment : Fragment(), StepperLayout.StepperListener {
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private val myStepperViewModal: MyStepperViewModal by viewModels()
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding:FragmentMyStepperBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_stepper, container, false)
        userViewModel.currentUser.observe(viewLifecycleOwner, Observer {customerDetails ->
            if(customerDetails.names == "click_it"  && customerDetails.email == "welcome to click it App"){
                securityAlert(requireContext(), this)
            }else{
                binding.stepperLayout.adapter = MyStepperAdapter(this.childFragmentManager, this.context)
                binding.stepperLayout.setListener(this)
            }})

        return binding.root
    }

    override fun onCompleted(completeButton: View?) {
        progressDialog.show(requireContext(),"Please Wait...")
        //add customer order to server
        val cartIcon = this.activity?.findViewById<BottomNavigationView>(R.id.bottomNav)
        if(CustomerPlacedOrder.customerPlaceOrder != null){
            myStepperViewModal.addOrder(CustomerPlacedOrder.customerPlaceOrder!!)

            myStepperViewModal.status.observe(viewLifecycleOwner, Observer {apiResponse ->
                progressDialog.dialog.dismiss()
                apiResponse?.let {
                    if (it.status == "error"){
                        onAlertDialog(requireContext(), "Alert", it.message!!)

                    }else{
                        FreeDelivery.free_delivery = false
                        CustomerPlacedOrder.let { order ->
                            order.customerPlaceOrder?.pre_order = false
                            order.customerPlaceOrder?.pre_order_date = ""
                        }
                        onAlertDialog(requireContext(), "Success", "Order placed successfully\nThank you for supporting Us :)")
                        cartIcon?.removeBadge(R.id.cart_item)
                        this.findNavController().navigate(R.id.mainFragment)
                    }
                }
            })
        }

//        Toast.makeText(this.context, "onCompleted!", Toast.LENGTH_SHORT).show()
    }

    override fun onError(verificationError: VerificationError?) {
        println("onError! -> " + verificationError?.errorMessage)
    }

    override fun onStepSelected(newStepPosition: Int) {
        println("onStepSelected! -> $newStepPosition")
    }

    override fun onReturn() {
        println("finished")
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