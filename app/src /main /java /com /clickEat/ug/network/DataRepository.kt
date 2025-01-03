package com.clickEat.ug.network

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.*
import com.clickEat.ug.database.*
import com.clickEat.ug.screens.custom_categories.AllHomeProducts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DataRepository(private val database: AppDataBase, val application: Application){

    val homeProducts: LiveData<List<HomePageInfo>> = Transformations.map(database.databaseDao.getHomeProducts()){list->
        list.map{
            it.asHomeProductsWithTitlesDomainModel()
        }
    }
    val home_images: LiveData<List<HomeImages>> = Transformations.map(database.databaseDao.getHomeImages()){list ->
        list.map {
            it.asHomeImagesDomainModel()
        }
    }


    val subCategories: LiveData<List<HomeSubCategoryDisplay>> = Transformations.map(database.databaseDao.getHomeSubCategoreis()){list ->
        list.map {
            it.asHomeSubCategoriesDomainModel()
        }
    }

    val topSellingProducts: LiveData<List<Product>> = Transformations.map(database.databaseDao.getTopSellingProducts()){list ->
        list.map {
            it.asTopProductDomainModel()
        }
    }

    val moreProducts: LiveData<List<AllHomeProducts>> = Transformations.map(database.databaseDao.getMoreProducts()){list ->
        list.map {
            it.asProductDomainModel()
        }
    }


    suspend fun refreshHomeProducts(){
        withContext(Dispatchers.IO){
            try{
                val data = ApiConnection(application).connectionService.getHomeProductAsync().await()
                database.databaseDao.run {
                    deleteHomeTitleInfo()
                    deleteHomeProducts()
                    deleteHomeImages()
                    deleteHomeSubCategories()
                    deleteTopSellingProducts()
                    deleteMoreProducts()


                    data.home_images.map {home_images->
                        insertHomeImages(*data.asHomeImagesCarouselModel())
                    }

                    data.sub_cats.map { sub_cat->
                        insertHomeSubCategories(*data.asSubCatModel())
                    }

                    data.home_images_products.map {
                        it.let {
                            insertHomeTitleInfo(HomeCatTitles(it.id,it.title).asHomeCatDataBaseModel())
                            insertHomeProducts(*it.asHomeProductModel(it.id))
                        }
                    }

                    data.all_products.map {
                        it.let {
                            insertMoreProducts(*data.asMoreProductModel())
                        }
                    }

                    data.top_selling_products.map {
                        it.let {
                            insertTopSellingProducts(*data.asTopSellingProduct())
                        }
                    }
                }
            }catch (it: Throwable){
                println("ggggggggggggggggggggggqqqqqqqqqqqqqqqqqqqqqtttttttttttttttt$it")

            }

        }
    }

    val rests: LiveData<ClickEatRestaurants> = Transformations.map(database.databaseDao.getRestaurants()){
        ClickEatRestaurants(
                it.map { RestaurantsTable -> RestaurantsTable.asRestaurantDomainModel() }
        )
    }

    suspend fun refreshRestaurants(){
        withContext(Dispatchers.IO){
            try {
                val data = ApiConnection(application).connectionService.getRestaurantsAsync().await()
                database.databaseDao.insertAllRestaurants(*data.asRestaurantDatabaseModel())

            }catch (it: Throwable){
                println("KKKKKKKKKKKKKKKKKKKKKKKKKKKK$it")
            }
        }
    }


    val subCatDrinks: LiveData<ClickEatDrinksSubCategories> = Transformations.map(database.databaseDao.getDrinksSubCats()){
        ClickEatDrinksSubCategories(
                it.map { subDrinksTable -> subDrinksTable.asSubDrinksDomainModel() }
        )
    }

    suspend fun refreshSubCatDrinks(){
        withContext(Dispatchers.IO){
            try {
                val data = ApiConnection(application).connectionService.getDrinksSubCategoriesAsync().await()
                database.databaseDao.insertAllSubDrinksCat(*data.asSubCatDrinksDatabaseModel())
            }catch (it: Throwable){
                println(">>>>>>>>>>>>>>>>>$it")
            }
        }
    }
}