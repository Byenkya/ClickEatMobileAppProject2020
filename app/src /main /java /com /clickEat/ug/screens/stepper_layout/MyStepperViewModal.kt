package com.clickEat.ug.screens.stepper_layout

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.ApiResponse
import com.clickEat.ug.data.CustomerOrder
import kotlinx.coroutines.*

class MyStepperViewModal(application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _status = MutableLiveData<ApiResponse>()
    val status: LiveData<ApiResponse>
        get() = _status

    fun addOrder(customerOrder: CustomerOrder){
        coroutineScope.launch {
            try {
                _status.value = addCustomerOrder(customerOrder)
            }catch (it: Throwable){
                _status.value = ApiResponse("error", it.message, 0)
            }
        }
    }

    private suspend fun addCustomerOrder(customerOrder: CustomerOrder): ApiResponse {
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.addCustomerOrderAsync(customerOrder).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}