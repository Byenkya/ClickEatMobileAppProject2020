package com.clickEat.ug.screens.rate

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.Product
import com.clickEat.ug.data.ProductRate
import com.clickEat.ug.data.Rate
import kotlinx.coroutines.*

class RateViewModal(product: Product, app:Application): AndroidViewModel(app) {
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private  val _rate = MutableLiveData<ProductRate>()
    val rate: LiveData<ProductRate>
        get() = _rate

    private val _selectedProduct = MutableLiveData<Product>()
    val selectedProduct: LiveData<Product>
        get() = _selectedProduct

    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>>
        get() = _products

    init {
        _selectedProduct.value = product
        getProductRate(product.product_id)
    }

    private fun getProductRate(productID: Int){
        coroutineScope.launch {
            try {
                _rate.value = getRate(productID)
            }catch (it: Throwable){
                _rate.value = null
            }
        }
    }

    private suspend fun getRate(productID: Int): ProductRate{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getProductRatingAsync(productID).await()
        }
    }

    fun rateProduct(productID:Int ,rate: Rate){
        coroutineScope.launch {
            try {
                _rate.value = ratingProduct(productID,rate)
            }catch (it: Throwable){
                _rate.value = null
            }
        }
    }

    private suspend fun ratingProduct(productID: Int, rate: Rate): ProductRate{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.rateProductAsync(productID,rate).await()
        }
    }

    fun getProductsYouLike(subCategoryID: Int){
        coroutineScope.launch {
            try {
                _products.value = productsYouMayLike(subCategoryID)
            }catch (it: Throwable){
                _products.value = null
            }
        }
    }

    private suspend fun productsYouMayLike(subCategoryID: Int): List<Product>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getSubCatProductsAsync(subCategoryID).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}