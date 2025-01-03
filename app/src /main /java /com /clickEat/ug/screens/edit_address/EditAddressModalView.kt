package com.clickEat.ug.screens.edit_address

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.ApiResponse
import com.clickEat.ug.data.AruaDistrict
import com.clickEat.ug.data.CustomerNewAddress
import com.clickEat.ug.data.Village
import kotlinx.coroutines.*

class EditAddressModalView(application: Application): AndroidViewModel(application){
    private val viewModalJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModalJob)

    private var _places = MutableLiveData<List<Village>>()
    val places: LiveData<List<Village>>
        get() = _places

    private var _response = MutableLiveData<ApiResponse>()
    val response: LiveData<ApiResponse>
        get() = _response

    init {
        getAllPlaces()
    }

    private fun getAllPlaces(){
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

    fun updateAddress(addressID: Int, customerNewAddress: CustomerNewAddress){
        coroutineScope.launch {
            try {
                _response.value = updateCustomerAddress(addressID, customerNewAddress)
            }catch (it: Throwable){
                _response.value = ApiResponse("error", "${it.message}", 0)
            }
        }
    }

    private suspend fun updateCustomerAddress(addressID: Int, customerNewAddress: CustomerNewAddress): ApiResponse{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.updateCustomerAddressAsync(addressID, customerNewAddress).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModalJob.cancel()
    }
}