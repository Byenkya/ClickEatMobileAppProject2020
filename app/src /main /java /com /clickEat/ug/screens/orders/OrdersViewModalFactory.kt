package com.clickEat.ug.screens.orders

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class OrdersViewModalFactory(private val customerId: Int, private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(OrdersViewModel::class.java)){
            return OrdersViewModel(customerId, application) as T
        }

        throw IllegalArgumentException("Unknown view modal class OrdersViewModal")
    }
}