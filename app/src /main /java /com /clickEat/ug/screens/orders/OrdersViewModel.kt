package com.clickEat.ug.screens.orders

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.CustomerPlaceOrder
import com.clickEat.ug.data.Reason
import kotlinx.coroutines.*

class OrdersViewModel(private val customerId: Int, application: Application): AndroidViewModel(application) {
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _orders = MutableLiveData<List<CustomerPlaceOrder>>()
    val orders: LiveData<List<CustomerPlaceOrder>>
        get() = _orders

    init {
        getCustomerOrders(customerId)
    }

    private fun getCustomerOrders(customerId: Int){
        coroutineScope.launch {
            try {
                _orders.value = getOrders(customerId)
            }catch (it: Throwable){
                _orders.value = null
            }
        }
    }

    private suspend fun getOrders(customerId: Int): List<CustomerPlaceOrder>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getCustomerOrdersAsync(customerId).await()
        }
    }

    fun terminateOrder(customerId: Int, reason: Reason){
        coroutineScope.launch {
            try {
                _orders.value = terminateCustomerOrder(customerId, reason)
            }catch (it: Throwable){
                _orders.value = null
            }
        }
    }

    private suspend fun terminateCustomerOrder(customerId: Int, reason: Reason): List<CustomerPlaceOrder>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.terminateCustomerOrderAsync(customerId, reason).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}