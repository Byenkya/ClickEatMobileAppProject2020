package com.clickEat.ug.screens.checkout

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.*
import kotlinx.coroutines.*

class CheckOutViewModel(customer_id: Int, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var _addresses  = MutableLiveData<List<CustomerAddress>>()
    val addresses: LiveData<List<CustomerAddress>>
        get() = _addresses

    private var _places = MutableLiveData<List<Village>>()
    val places: LiveData<List<Village>>
        get() = _places


    init {
        getCustomerAddresses(customer_id)
    }

    private fun getCustomerAddresses(customer_id: Int){
        coroutineScope.launch {
            try{
                _addresses.value = getAddresses(customer_id)
            }catch (it: Throwable){
                _addresses.value = null
            }
        }

    }

    private suspend fun getAddresses(customer_id: Int):List<CustomerAddress>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getCustomerAddressesAsync(customer_id).await()
        }
    }

    fun getAllPlaces(){
        coroutineScope.launch {
            try {
                _places.value = getPlaces()
            }catch (it: Throwable){
                _places.value = null
            }
        }
    }

    private suspend fun getPlaces(): List<Village>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getPlacesAsync().await()
        }
    }



    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}