package com.clickEat.ug.screens.drinksbasedonsubcat

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.SubCategory
import kotlinx.coroutines.*

class ListDrinksViewModal(private val drinksSubCatID: Int, application: Application): AndroidViewModel(application) {
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main +  viewModelJob)
    private var _products = MutableLiveData<List<SubCategory>>()
    val products: LiveData<List<SubCategory>>
        get() = _products


    init {
        getAllProducts(drinksSubCatID)
    }

    private fun getAllProducts(drinksSubCatID: Int){
        coroutineScope.launch {
            try {
                _products.value = getProducts(drinksSubCatID)

            }catch (it: Throwable){
                println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>$it")
                _products.value = null
            }
        }
    }

    private suspend fun getProducts(drinksSubCatID: Int): List<SubCategory>{
        return  withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getDrinksAsync(drinksSubCatID).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}