package com.clickEat.ug.screens.sub_categories

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.HomeSubCategoryDisplay
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.network.DataRepository
import kotlinx.coroutines.*

class SubCategoriesViewModal(application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val _subCats = MutableLiveData<List<HomeSubCategoryDisplay>>()
    val subCats : LiveData<List<HomeSubCategoryDisplay>>
        get() = _subCats

    init{
        fetchAllSubCategories()
    }

    fun fetchAllSubCategories(){
        coroutineScope.launch {
            try {
                _subCats.value = fetchSubCategories()
            }catch (it: Throwable){
                println("Eroooooooooooooooooooooor $it")
            }
        }
    }

    private suspend fun fetchSubCategories(): List<HomeSubCategoryDisplay>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.fetchAllSubCatsAsync().await()
        }
    }


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}