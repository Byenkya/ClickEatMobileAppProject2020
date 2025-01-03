package com.clickEat.ug.database

import androidx.room.*
import com.clickEat.ug.data.*
import com.clickEat.ug.screens.custom_categories.AllHomeProducts


@Entity(tableName = "home_images_table")
data class HomeImagesTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "id")
        val id: Int,

        @ColumnInfo(name = "info_type")
        val info_type: String,

        @ColumnInfo(name = "image_name")
        val image_name: String,

        @ColumnInfo(name = "image_desc")
        val image_desc: String
)

fun HomeImagesTable.asHomeImagesDomainModel() = HomeImages(
        id = id,
        info_type = info_type,
        image_name = image_name,
        image_desc = image_desc
)

@Entity(tableName = "home_sub_categories_table")
data class HomeSubCategoriesTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "id")
        val id: Int,

        @ColumnInfo(name = "subCatImage")
        val subCatImage: String,

        @ColumnInfo(name = "name")
        val name: String
)

fun HomeSubCategoriesTable.asHomeSubCategoriesDomainModel() = HomeSubCategoryDisplay(
        id = id,
        subCatImage = subCatImage,
        name = name
)

@Entity(tableName = "home_title_cat_table")
data class HomeTitleCatTable(
        @PrimaryKey(autoGenerate = false)
        @ColumnInfo(name = "id")
        val id: Int,

        @ColumnInfo(name = "title")
        val title: String
)

@Entity(tableName = "home_products_table")
data class HomeProductsTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "product_id")
        val product_id: Int,

        @ColumnInfo(name = "product_name")
        val productName: String,

        @ColumnInfo(name = "product_picture")
        val productPicture: String?,

        @ColumnInfo(name = "description")
        val description: String,

        @ColumnInfo(name = "price")
        val price: String,

        @ColumnInfo(name = "restaurant_id")
        val restaurantId: Int,

        @ColumnInfo(name = "restaurant_name")
        val restaurantName: String,

        @ColumnInfo(name = "brand_id")
        val brandId: Int,

        @ColumnInfo(name = "brand_name")
        val brandName: String,

        @ColumnInfo(name = "sub_category_id")
        val sub_category_id: Int,

        @ColumnInfo(name = "sub_category")
        val sub_category: String,

        @ColumnInfo(name = "home_title_id")
        val home_title_id: Int,

        @ColumnInfo(name = "promotional_price_set")
        val promotional_price_set: Boolean,

        @ColumnInfo(name = "promotional_price")
        val promotional_price: Int?,

        @ColumnInfo(name = "headsup")
        val headsup: String?,

        @ColumnInfo(name = "served_with")
        val served_with: String,

        @ColumnInfo(name = "free_delivery")
        val free_delivery: Boolean,

        @ColumnInfo(name = "available")
        val available: Boolean


)

//relationship
data class HomeProductsWithTitles(
        @Embedded
        val titleInfo: HomeTitleCatTable,
        @Relation(parentColumn = "id", entityColumn = "home_title_id")
        val products: List<HomeProductsTable>
)

//data conversion
fun HomeTitleCatTable.asHomeCatTitlesDomainModel() = HomeCatTitles(
        id = id,
        title = title
)

fun HomeProductsTable.asHomeProductDomainModel() = Product(
        product_id = product_id,
        product_name = productName,
        product_picture = productPicture!!,
        description = description,
        price = price,
        restaurant_id = restaurantId,
        restaurant_name = restaurantName,
        brand_id = brandId,
        brand_name = brandName,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)

fun HomeProductsWithTitles.asHomeProductsWithTitlesDomainModel() = HomePageInfo(
        titleInfo = titleInfo.asHomeCatTitlesDomainModel(),
        products = products.map { it.asHomeProductDomainModel() }
)


@Entity(tableName = "products_table")
data class ProductsTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "product_id")
        val product_id: Int,

        @ColumnInfo(name = "product_name")
        val productName: String,

        @ColumnInfo(name = "product_picture")
        val productPicture: String?,

        @ColumnInfo(name = "description")
        val description: String,

        @ColumnInfo(name = "price")
        val price: String,

        @ColumnInfo(name = "restaurant_id")
        val restaurantId: Int,

        @ColumnInfo(name = "restaurant_name")
        val restaurantName: String,

        @ColumnInfo(name = "brand_id")
        val brandId: Int,

        @ColumnInfo(name = "brand_name")
        val brandName: String,

        @ColumnInfo(name = "sub_category_id")
        val sub_category_id: Int,

        @ColumnInfo(name = "sub_category")
        val sub_category: String,

        @ColumnInfo(name = "promotional_price_set")
        val promotional_price_set: Boolean,

        @ColumnInfo(name = "promotional_price")
        val promotional_price: Int?,

        @ColumnInfo(name = "headsup")
        val headsup: String?,

        @ColumnInfo(name = "served_with")
        val served_with: String,

        @ColumnInfo(name = "free_delivery")
        val free_delivery: Boolean,

        @ColumnInfo(name = "available")
        val available: Boolean
)


@Entity(tableName = "more_products_table")
data class MoreProductsTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "product_id")
        val product_id: Int,

        @ColumnInfo(name = "product_name")
        val productName: String,

        @ColumnInfo(name = "product_picture")
        val productPicture: String?,

        @ColumnInfo(name = "description")
        val description: String,

        @ColumnInfo(name = "price")
        val price: String,

        @ColumnInfo(name = "restaurant_id")
        val restaurantId: Int,

        @ColumnInfo(name = "restaurant_name")
        val restaurantName: String,

        @ColumnInfo(name = "brand_id")
        val brandId: Int,

        @ColumnInfo(name = "brand_name")
        val brandName: String,

        @ColumnInfo(name = "sub_category_id")
        val sub_category_id: Int,

        @ColumnInfo(name = "sub_category")
        val sub_category: String,

        @ColumnInfo(name = "promotional_price_set")
        val promotional_price_set: Boolean,

        @ColumnInfo(name = "promotional_price")
        val promotional_price: Int?,

        @ColumnInfo(name = "headsup")
        val headsup: String?,

        @ColumnInfo(name = "served_with")
        val served_with: String,

        @ColumnInfo(name = "free_delivery")
        val free_delivery: Boolean,

        @ColumnInfo(name = "available")
        val available: Boolean
)

@Entity(tableName = "top_selling_products")
data class TopSellingProductsTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "product_id")
        val product_id: Int,

        @ColumnInfo(name = "product_name")
        val productName: String,

        @ColumnInfo(name = "product_picture")
        val productPicture: String?,

        @ColumnInfo(name = "description")
        val description: String,

        @ColumnInfo(name = "price")
        val price: String,

        @ColumnInfo(name = "restaurant_id")
        val restaurantId: Int,

        @ColumnInfo(name = "restaurant_name")
        val restaurantName: String,

        @ColumnInfo(name = "brand_id")
        val brandId: Int,

        @ColumnInfo(name = "brand_name")
        val brandName: String,

        @ColumnInfo(name = "sub_category_id")
        val sub_category_id: Int,

        @ColumnInfo(name = "sub_category")
        val sub_category: String,

        @ColumnInfo(name = "promotional_price_set")
        val promotional_price_set: Boolean,

        @ColumnInfo(name = "promotional_price")
        val promotional_price: Int?,

        @ColumnInfo(name = "headsup")
        val headsup: String?,

        @ColumnInfo(name = "served_with")
        val served_with: String,

        @ColumnInfo(name = "free_delivery")
        val free_delivery: Boolean,

        @ColumnInfo(name ="available")
        val available: Boolean
)


@Entity(tableName = "cart_table")
data class CartTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "product_id")
        val product_id: Int,

        @ColumnInfo(name = "customer_id")
        val customer_id: Int,

        @ColumnInfo(name = "product_name")
        val product_name: String,

        @ColumnInfo(name = "product_image")
        val product_image: String,

        @ColumnInfo(name = "unit_price")
        val unit_price: String,

        @ColumnInfo(name = "quantity")
        var quantity: String,

        @ColumnInfo(name = "served_with")
        var served_with: String

)

@Entity(tableName = "customer_table")
data class CustomerTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "customer_id")
        val customer_id: Int,

        @ColumnInfo(name = "customer_names")
        var names: String,

        @ColumnInfo(name = "email")
        var email: String?,

        @ColumnInfo(name = "contact")
        var contact: String,

        @ColumnInfo(name = "second_contact")
        var second_contact: String?,

        @ColumnInfo(name = "date_of_reg")
        var date_of_reg: String,

        @ColumnInfo(name = "account_active")
        var account_active: Boolean,

        @ColumnInfo(name = "token")
        var token: String?,

        @ColumnInfo(name = "cart_size")
        var cart_size: Int?
)

@Entity(tableName = "restaurants_table")
data class RestaurantsTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "restuarant_id")
        val restaurant_id: Int,

        @ColumnInfo(name = "business_name")
        val businessName: String,

        @ColumnInfo(name = "business_profile_picture")
        val businessProfilePicture: String?,

        @ColumnInfo(name = "address")
        val address: String,

        @ColumnInfo(name = "email")
        val email: String,

        @ColumnInfo(name = "contact")
        val contact: String,

        @ColumnInfo(name = "second_contact")
        val secondContact: String,

        @ColumnInfo(name = "location")
        val location: String,

        @ColumnInfo(name = "description")
        val description: String,

        @ColumnInfo(name = "admin_names")
        val admin_names: String,

        @ColumnInfo(name = "admin_username")
        val admin_username: String,

        @ColumnInfo(name = "admin_email")
        val admin_email: String,

        @ColumnInfo(name = "admin_telephone")
        val admin_telephone: String,

        @ColumnInfo(name = "operation_start_time")
        val operation_start_time: String,

        @ColumnInfo(name = "operation_stop_time")
        val operation_stop_time: String,

        @ColumnInfo(name = "operation_status")
        val operational_status: Boolean
)

@Entity(tableName = "sub_drinks_categories")
data class SubDrinksTable(
        @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "sub_cat_id")
        val sub_cat_id: Int,

        @ColumnInfo(name = "name")
        val names: String,

        @ColumnInfo(name = "category_id")
        val categoryId: Int
)



/*
*             data conversions
*
* */


fun ProductsTable.asProductDomainModel() = Product(
        product_id = product_id,
        product_name = productName,
        product_picture = productPicture!!,
        description = description,
        price = price,
        restaurant_id = restaurantId,
        restaurant_name = restaurantName,
        brand_id = brandId,
        brand_name = brandName,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)

fun MoreProductsTable.asProductDomainModel() = AllHomeProducts.MoreProducts(
        item = Product(
                product_id = product_id,
                product_name = productName,
                product_picture = productPicture!!,
                description = description,
                price = price,
                restaurant_id = restaurantId,
                restaurant_name = restaurantName,
                brand_id = brandId,
                brand_name = brandName,
                sub_category_id = sub_category_id,
                sub_category = sub_category,
                promotional_price_set = promotional_price_set,
                promotional_price = promotional_price,
                headsup = headsup,
                served_with = served_with,
                free_delivery = free_delivery,
                available = available
        )

)
fun TopSellingProductsTable.asTopProductDomainModel() = Product(
        product_id = product_id,
        product_name = productName,
        product_picture = productPicture!!,
        description = description,
        price = price,
        restaurant_id = restaurantId,
        restaurant_name = restaurantName,
        brand_id = brandId,
        brand_name = brandName,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)

fun CustomerTable.toCustomer() = Customer(
        customer_id =  customer_id,
        names = names,
        email = email!!,
        contact = contact,
        second_contact = second_contact,
        date_of_reg = date_of_reg,
        account_active = account_active,
        token = token!!,
        cartSize = cart_size!!
)

//fun CartTable.toCartItem() = CartItem(
//        product_id = product_id,
//        customer_id = customer_id,
//        product_name = product_name,
//        product_image = product_image,
//        unit_price = unit_price,
//        quantity = quantity,
//        served_with = served_with
//)

fun RestaurantsTable.asRestaurantDomainModel() = Restaurant(
        id = restaurant_id,
        business_name = businessName,
        business_profile_picture = businessProfilePicture!!,
        address = address,
        email = email,
        contact = contact,
        second_contact = secondContact,
        location = location,
        description = description,
        admin_names = admin_names,
        admin_username = admin_username,
        admin_email = admin_email,
        admin_telephone = admin_telephone,
        operation_start_time = operation_start_time,
        operation_stop_time = operation_stop_time,
        operational_status = operational_status
)

fun SubDrinksTable.asSubDrinksDomainModel() = DrinkSubCategories(
        sub_category_id = sub_cat_id,
        name = names,
        categoryId = categoryId
)