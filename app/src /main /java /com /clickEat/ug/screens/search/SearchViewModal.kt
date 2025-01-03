package com.clickEat.ug.screens.search

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.Product
import kotlinx.coroutines.*

class SearchViewModal(searchString: String,application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _searchedProducts = MutableLiveData<List<Product>>()
    val searchedProducts: LiveData<List<Product>>
        get() = _searchedProducts


    init {
        getSearchedProducts(searchString)
    }


    private fun getSearchedProducts(searchString: String? = null){
        coroutineScope.launch {
            try{
                _searchedProducts.value = getAllSearchedProducts(searchString)
            }catch (it: Throwable){
                _searchedProducts.value = null
            }
        }
    }

    private suspend fun getAllSearchedProducts(searchString: String?): List<Product>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getSearchedProductsAsync(searchString).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}