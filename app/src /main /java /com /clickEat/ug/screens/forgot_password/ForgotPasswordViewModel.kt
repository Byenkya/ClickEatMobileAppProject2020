package com.clickEat.ug.screens.forgot_password

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.ApiResponse
import com.clickEat.ug.data.ForgotPassword
import kotlinx.coroutines.*

class ForgotPasswordViewModel(application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _result = MutableLiveData<ApiResponse>()
    val result: LiveData<ApiResponse>
        get() = _result

    fun forgotPassword(email: String){
        coroutineScope.launch {
            try {
                _result.value = sendForgotEmail(email)
            }catch (it: Throwable){
                _result.value = ApiResponse("error", "Email was not sent!!.", 0)
            }
        }
    }

    private suspend fun sendForgotEmail(email: String): ApiResponse{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.forgotPasswordAsync(ForgotPassword(email)).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}