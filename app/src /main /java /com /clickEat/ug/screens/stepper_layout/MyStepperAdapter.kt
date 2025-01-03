package com.clickEat.ug.screens.stepper_layout

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.clickEat.ug.screens.cart.CartFragment
import com.clickEat.ug.screens.checkout.CheckoutFragment
import com.clickEat.ug.screens.payments.PaymentsFragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel


class MyStepperAdapter(fm: FragmentManager?, context: Context?) :
    AbstractFragmentStepAdapter(fm!!, context!!) {
    override fun createStep(position: Int): Step {
        return when(position){
            0 -> {
                CartFragment()
            }
            1 -> {
                CheckoutFragment()
            }
            2 -> {
                PaymentsFragment()
            }
            else -> CartFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getViewModel(position: Int): StepViewModel {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        return when(position){
            0 -> {
                StepViewModel.Builder(context)
                    .setTitle("Order") //can be a CharSequence instead
                    .create()
            }

            1 -> {
                StepViewModel.Builder(context)
                    .setTitle("Summary") //can be a CharSequence instead
                    .create()
            }

            2 -> {
                StepViewModel.Builder(context)
                    .setTitle("Payment") //can be a CharSequence instead
                    .create()
            }

            else -> {
                StepViewModel.Builder(context)
                    .setTitle("Order") //can be a CharSequence instead
                    .create()
            }
        }
    }
}

