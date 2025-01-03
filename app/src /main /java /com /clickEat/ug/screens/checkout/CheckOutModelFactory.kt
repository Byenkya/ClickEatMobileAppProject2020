package com.clickEat.ug.screens.checkout

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CheckOutModelFactory(private val customer_id: Int, private val application: Application):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CheckOutViewModel::class.java)){
            return CheckOutViewModel(customer_id, application) as T
        }

        throw IllegalArgumentException("unknown view model class CheckOutModelFactory")
    }
}