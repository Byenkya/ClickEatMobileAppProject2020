package com.clickEat.ug.screens.menu

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.SubCategory
import kotlinx.coroutines.*

class MenuViewModel(restaurant_id: Int, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main +  viewModelJob)
    private var _products = MutableLiveData<List<SubCategory>>()
    val products: LiveData<List<SubCategory>>
        get() = _products


    init {
        getAllProducts(restaurant_id)
    }

    private fun getAllProducts(restaurant_id: Int){
        coroutineScope.launch {
            try {
                _products.value = getProducts(restaurant_id)

            }catch (it: Throwable){
                _products.value = null
            }
        }
    }

    private suspend fun getProducts(restaurant_id: Int): List<SubCategory>{
        return  withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getProductsAsync(restaurant_id).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }


}