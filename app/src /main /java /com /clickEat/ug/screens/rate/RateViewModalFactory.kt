package com.clickEat.ug.screens.rate

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clickEat.ug.data.Product
import java.lang.IllegalArgumentException

class RateViewModalFactory(private val product: Product, private val app: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RateViewModal::class.java)){
            return RateViewModal(product, app) as T
        }

        throw IllegalArgumentException("Unknown view modal class RateViewModal")
    }
}