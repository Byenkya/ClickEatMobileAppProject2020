package com.clickEat.ug.screens.subcatproducts

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SubCatProductsModalFactory(private val subCatID: Int, private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SubCatProductsViewModal::class.java)){
            return SubCatProductsViewModal(subCatID, application) as T
        }

        throw IllegalArgumentException("Unknown ViewModal class")
    }
}