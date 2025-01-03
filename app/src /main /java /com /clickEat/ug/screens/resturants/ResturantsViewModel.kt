package com.clickEat.ug.screens.resturants

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.network.DataRepository
import kotlinx.coroutines.*

class ResturantViewModel(application: Application) : AndroidViewModel(application){
    private  val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val database = AppDataBase.getInstance(getApplication())
    private  val repository = DataRepository(database, getApplication())

    init {
        coroutineScope.launch {
            repository.refreshRestaurants()
        }
    }

    val restaurants = repository.rests

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}