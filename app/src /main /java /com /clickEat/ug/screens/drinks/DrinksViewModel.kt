package com.clickEat.ug.screens.drinks

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.network.DataRepository
import kotlinx.coroutines.*

class DrinksViewModel(application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val database = AppDataBase.getInstance(getApplication())
    private  val repository = DataRepository(database, getApplication())

    init {
        coroutineScope.launch {
            repository.refreshSubCatDrinks()
        }
    }

    val drink = repository.subCatDrinks
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }


}