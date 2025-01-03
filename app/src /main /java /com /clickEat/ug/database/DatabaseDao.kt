package com.clickEat.ug.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.clickEat.ug.data.Product

@Dao
interface DatabaseDao {
    @Insert
    fun addNewCartItem(cart: CartTable)

    @Update
    fun updateCartItem(cart: CartTable)

    @Query("DELETE FROM cart_table")
    fun clearCart()

    @Query("SELECT * FROM cart_table")
    fun getCartItems(): List<CartTable>?

    @Query("SELECT count(product_id) FROM cart_table")
    fun cartSize(): LiveData<Int>

    @Query("SELECT * FROM customer_table limit 1")
    fun getCustomer(): CustomerTable?

    @Query("SELECT * FROM customer_table limit 1")
    fun getCurrentUser(): LiveData<CustomerTable?>

    @Update()
    fun updateCustomer(customer: CustomerTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCustomer(customer: CustomerTable)

    @Query("DELETE FROM customer_table")
    fun deleteCustomer()

    @Query("update customer_table set token = :newToken where token = :oldToken")
    fun updateCustomerToken(newToken: String, oldToken: String)

    @Query("SELECT * FROM restaurants_table")
    fun getRestaurants(): LiveData<List<RestaurantsTable>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllRestaurants(vararg restaurants: RestaurantsTable)

    @Query("SELECT * FROM sub_drinks_categories")
    fun getDrinksSubCats(): LiveData<List<SubDrinksTable>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllSubDrinksCat(vararg subDrinksCat: SubDrinksTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHomeTitleInfo(titleInfo: HomeTitleCatTable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHomeProducts(vararg products: HomeProductsTable)

    @Query("SELECT * FROM home_title_cat_table")
    fun getHomeProducts(): LiveData<List<HomeProductsWithTitles>>


    @Query("DELETE FROM home_title_cat_table")
    fun deleteHomeTitleInfo()

    @Query("DELETE FROM home_products_table")
    fun deleteHomeProducts()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHomeImages(vararg homeImages: HomeImagesTable)

    @Query("SELECT * FROM home_images_table")
    fun getHomeImages(): LiveData<List<HomeImagesTable>>

    @Query("DELETE FROM home_images_table")
    fun deleteHomeImages()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHomeSubCategories(vararg homeSubCats: HomeSubCategoriesTable)

    @Query("SELECT * FROM home_sub_categories_table")
    fun getHomeSubCategoreis(): LiveData<List<HomeSubCategoriesTable>>

    @Query("DELETE FROM home_sub_categories_table")
    fun deleteHomeSubCategories()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMoreProducts(vararg moreProducts: MoreProductsTable)

    @Query("SELECT * FROM more_products_table")
    fun getMoreProducts(): LiveData<List<MoreProductsTable>>

    @Query("DELETE FROM more_products_table")
    fun deleteMoreProducts()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTopSellingProducts(vararg topSelling: TopSellingProductsTable)

    @Query("SELECT * FROM top_selling_products")
    fun getTopSellingProducts(): LiveData<List<TopSellingProductsTable>>

    @Query("DELETE FROM top_selling_products")
    fun  deleteTopSellingProducts()


}