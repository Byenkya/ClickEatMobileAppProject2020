package com.clickEat.ug.screens.payments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import com.clickEat.ug.R
import com.clickEat.ug.data.CustomerOrder
import com.clickEat.ug.data.CustomerPlaceOrder
import com.clickEat.ug.data.CustomerPlacedOrder
import com.clickEat.ug.databinding.FragmentPaymentsBinding
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError

class PaymentsFragment : Fragment(), Step {
    private lateinit var binding: FragmentPaymentsBinding
    var paymentMethod: String? =  null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_payments, container, false)
        return binding.root
    }

    override fun verifyStep(): VerificationError? {
        return when(binding.paymentMethodsOptions.checkedRadioButtonId == -1) {
            true -> VerificationError("You must first select payment method to place order!!.")
            else -> {
                val id = binding.paymentMethodsOptions.checkedRadioButtonId
                val paymentMethod = binding.paymentMethodsOptions.findViewById<RadioButton>(id).text.toString()
                CustomerPlacedOrder.let {
                    it.customerPlaceOrder?.payment_method = paymentMethod
                }

                null
            }
        }
    }

    override fun onSelected() {
        binding.cashOnDeliveryInfo.visibility = View.GONE
        binding.paymentMethodsOptions.clearCheck()
        binding.paymentMethodsOptions.setOnCheckedChangeListener { radioGroup, _ ->
            val id = radioGroup.checkedRadioButtonId
            binding.paymentMethodsOptions.findViewById<RadioButton>(id).let {
                it?.setOnClickListener {
                    if(binding.paymentMethodsOptions.findViewById<RadioButton>(id).isChecked){
                        val paymentMethod = binding.paymentMethodsOptions.findViewById<RadioButton>(id).text.toString()
                        if(paymentMethod == "Cash on delivery"){
                            binding.cashOnDeliveryInfo.visibility = View.VISIBLE
                        }
                    }else{
                        binding.cashOnDeliveryInfo.visibility = View.GONE
                    }
                }
            }


        }
    }

    override fun onError(error: VerificationError) {
        val builder = AlertDialog.Builder(binding.root.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(error.errorMessage)

        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }
}