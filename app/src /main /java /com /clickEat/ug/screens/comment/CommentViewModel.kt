package com.clickEat.ug.screens.comment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.Comment
import com.clickEat.ug.data.ServerComment
import kotlinx.coroutines.*

class CommentViewModel(private val productID: Int, application: Application): AndroidViewModel(application) {
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _comments = MutableLiveData<List<ServerComment>>()
    val comments: LiveData<List<ServerComment>>
        get() = _comments


    init {
        getProductComments(productID)
    }

    private fun getProductComments(productID: Int){
        coroutineScope.launch {
            try {
                _comments.value = getComments(productID)
            }catch (it: Throwable){
                _comments.value = null
            }
        }
    }

    private suspend fun getComments(productID: Int): List<ServerComment>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getProductCommentsAsync(productID).await()
        }
    }

    fun addProductComment(customerID: Int, comment:Comment){
        coroutineScope.launch {
            try {
                _comments.value = addComment(customerID, comment)
            }catch (it: Throwable){
                _comments.value = null
            }
        }
    }

    private suspend fun addComment(customerID: Int, comment: Comment): List<ServerComment>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.addProductCommentAsync(customerID, comment).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}