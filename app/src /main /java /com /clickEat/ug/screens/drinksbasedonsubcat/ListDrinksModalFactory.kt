package com.clickEat.ug.screens.drinksbasedonsubcat

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ListDrinksModalFactory(private val drinksSubCatID: Int, private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListDrinksViewModal::class.java)){
            return ListDrinksViewModal(drinksSubCatID, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModal class")
    }
}