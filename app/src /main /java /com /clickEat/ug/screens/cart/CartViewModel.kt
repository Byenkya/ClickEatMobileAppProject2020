package com.clickEat.ug.screens.cart

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.CustomerCartItems
import com.clickEat.ug.data.OrderedProducts
import com.clickEat.ug.data.UpdateCartItem
import kotlinx.coroutines.*

class CartViewModel(private val customer_id: Int, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _cart = MutableLiveData<CustomerCartItems>()
    val cart: LiveData<CustomerCartItems>
        get() = _cart

    init{
        getCartItems(customer_id)
    }

    private fun getCartItems(customer_id: Int){
        coroutineScope.launch {
            try {
                val items = getCart(customer_id)
                _cart.value = items
                OrderedProducts.orderedProducts = items
            }catch (it: Throwable){
                _cart.value = null
            }
        }
    }

    private suspend fun getCart(customer_id: Int): CustomerCartItems{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getCustomerCartItemsAsync(customer_id).await()
        }
    }

    fun updateCartItem(customer_id: Int, update: UpdateCartItem){
        coroutineScope.launch {
            try {
                val items = updateCart(customer_id, update)
                _cart.value = items
                OrderedProducts.orderedProducts = items
            }catch (it: Throwable){
                _cart.value = null
            }
        }
    }

    private suspend fun updateCart(customer_id: Int, update: UpdateCartItem): CustomerCartItems{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.updateCartItemAsync(customer_id, update).await()
        }
    }

    fun delCartItem(product_id: Int){
        coroutineScope.launch {
            try{
                val items = delCart(product_id)
                _cart.value = items
                OrderedProducts.orderedProducts = items
            }catch (it: Throwable){
                _cart.value = null
            }
        }
    }

    private suspend fun delCart(product_id: Int): CustomerCartItems{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.deleteCartItemAsync(product_id).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}