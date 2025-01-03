package com.clickEat.ug.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [
    HomeTitleCatTable::class,
    CartTable::class,
    CustomerTable::class,
    RestaurantsTable::class,
    SubDrinksTable::class,
    HomeProductsTable::class,
    ProductsTable::class,
    HomeImagesTable::class,
    HomeSubCategoriesTable::class,
    MoreProductsTable::class,
    TopSellingProductsTable::class],
        version = 6,
        exportSchema = false
)
abstract class AppDataBase: RoomDatabase(){
    abstract val databaseDao: DatabaseDao
    companion object{
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBase::class.java, "app_database"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}