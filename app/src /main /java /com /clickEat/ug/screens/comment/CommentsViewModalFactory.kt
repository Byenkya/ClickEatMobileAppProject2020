package com.clickEat.ug.screens.comment

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CommentsViewModalFactory(private val productID: Int, private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CommentViewModel::class.java)){
            return CommentViewModel(productID, application) as T
        }

        throw IllegalArgumentException("Unknown view modal class CommentViewModal")
    }
}
