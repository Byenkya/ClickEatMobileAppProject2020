package com.clickEat.ug.screens.categories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CategoryViewModalFactory(private val categoryName: String, private val application: Application): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CategoryProductsViewModal::class.java)){
            return CategoryProductsViewModal(categoryName, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModal class")
    }
}