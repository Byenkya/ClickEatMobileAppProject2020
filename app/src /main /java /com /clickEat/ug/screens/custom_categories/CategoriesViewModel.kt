package com.clickEat.ug.screens.custom_categories

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.*
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.network.DataRepository
import kotlinx.coroutines.*
import java.util.ArrayList

class CategoriesViewModel(application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val database = AppDataBase.getInstance(getApplication())
    private  val repository = DataRepository(database, getApplication())

    var productsToDisplay = MutableLiveData<List<Product>>()
    var mainRecycler = MutableLiveData<List<AllHomeProducts>>()
    var moreProducts: LiveData<List<AllHomeProducts>> = repository.moreProducts

    val home_images = repository.home_images
    val subCategories = repository.subCategories
    val topSellingProducts = repository.topSellingProducts
    val products = repository.homeProducts

    init {
        coroutineScope.launch {
            repository.refreshHomeProducts()
        }

    }


    fun dataToDisplay(moreProducts: List<AllHomeProducts>){
        coroutineScope.launch {
            try {
                val images = AllHomeProducts.HomePictures
                val subs = AllHomeProducts.HomeSubCategories
                val top_sell = AllHomeProducts.TopSellingProducts
                val top_home_cats = AllHomeProducts.TopHomeCategories
                val pdt_with_titles = AllHomeProducts.HomeDisplayProducts
                val subList = moreProducts.subList(0,4)
                val layouts = ArrayList<AllHomeProducts>()
                layouts.add(images)
                layouts.add(subs)
                layouts.add(top_sell)
                layouts.add(top_home_cats)
                layouts.add(pdt_with_titles)
                mainRecycler.postValue(layouts + subList)

            }catch (it: Throwable){
            }
        }
    }


    fun addProducts(){
        val adapterLastItem = mainRecycler.value!!.lastIndex
        val dataListItem = moreProducts.value!!.lastIndex
        if(dataListItem > adapterLastItem){
            val diff = dataListItem - adapterLastItem
            if (diff >= 6){
                val itemsToAdd = moreProducts.value!!.subList(adapterLastItem + 1, adapterLastItem + 6 + 1)
                mainRecycler.postValue(mainRecycler.value!! + itemsToAdd)
            }else{
                val itemsToAdd = moreProducts.value!!.subList(adapterLastItem + 1, adapterLastItem + diff + 1)
                mainRecycler.postValue(mainRecycler.value!! + itemsToAdd)
            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}