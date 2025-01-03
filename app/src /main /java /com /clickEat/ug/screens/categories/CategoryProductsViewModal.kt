package com.clickEat.ug.screens.categories

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.Product
import com.clickEat.ug.data.SubCategory
import kotlinx.coroutines.*

class CategoryProductsViewModal(categoryName: String, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main +  viewModelJob)

    private val _catProducts = MutableLiveData<List<Product>>()
    val catProducts: LiveData<List<Product>>
        get() = _catProducts

    init {
        getCategoryProducts(categoryName)
    }

    fun getCategoryProducts(catName: String){
        coroutineScope.launch {
            try {
                _catProducts.value = getAllCategoryProducts(catName)
            }catch (it: Throwable){
                _catProducts.value = null
            }
        }
    }

    private suspend fun getAllCategoryProducts(catName: String): List<Product>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getCategoryProductsAsync(catName).await()
        }
    }
}