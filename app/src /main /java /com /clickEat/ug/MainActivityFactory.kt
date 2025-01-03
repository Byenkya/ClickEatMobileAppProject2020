package com.clickEat.ug

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clickEat.ug.database.DatabaseDao
import java.lang.IllegalArgumentException

class MainActivityModelFactory(private val database: DatabaseDao, private val application: Application): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(database, application) as T
        }
        throw IllegalArgumentException("Unknown view model MainActivityViewModel")
    }
}