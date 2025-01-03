package com.clickEat.ug.screens.cart

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CartViewModelFactory(private val customer_id: Int, private val application: Application):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CartViewModel::class.java)){
            return CartViewModel(customer_id, application) as T
        }

        throw IllegalArgumentException("unknown view model class CartViewModel")
    }
}