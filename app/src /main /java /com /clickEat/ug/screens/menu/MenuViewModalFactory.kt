package com.clickEat.ug.screens.menu

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MenuViewModalFactory(private val restaurant_id: Int, private val application: Application): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MenuViewModel::class.java)){
            return MenuViewModel(restaurant_id, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModal class")
    }
}