package com.clickEat.ug.screens.search

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class SearchModalFactory(private val searchString: String, private val application: Application): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SearchViewModal::class.java)){
            return SearchViewModal(searchString, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModal class")
    }
}