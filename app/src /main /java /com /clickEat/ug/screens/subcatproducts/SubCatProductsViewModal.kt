package com.clickEat.ug.screens.subcatproducts

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.Product
import kotlinx.coroutines.*

class SubCatProductsViewModal(subCatID: Int, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _subCatProducts = MutableLiveData<List<Product>>()
    val subCatProducts: LiveData<List<Product>>
        get() = _subCatProducts

    init {
        getSubCatProducts(subCatID)
    }

    private fun getSubCatProducts(subCatID: Int){
        coroutineScope.launch {
            try {
                _subCatProducts.value = getSubProducts(subCatID)
            }catch (it: Throwable){
                println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq$it")
                _subCatProducts.value = null
            }
        }
    }

    private suspend fun getSubProducts(subCatID: Int): List<Product> {
        return withContext(Dispatchers.IO){
                                                                                                                                                                ApiConnection(getApplication()).connectionService.getSubCatProductsAsync(subCatID).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}