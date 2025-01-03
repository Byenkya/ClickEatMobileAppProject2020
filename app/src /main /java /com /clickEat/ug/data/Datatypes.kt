package com.clickEat.ug.data

import android.os.Parcelable
import com.clickEat.ug.database.*
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object CustomerToken{
    var token = ""
}

object SearchString{
    var searchTerm = ""
}

object AccountInFormation{
    var addresses: ListCustomerAddresses = ListCustomerAddresses(null)
    var accountInformation = Customer(0,"",null,"","","",false,"",0)
}

object SelectedProduct{
        var product = Product(0,"","","","",0,"",0,"",0,"",false,null,null, "", false, false)
}

object OrderedProducts{
        var orderedProducts: CustomerCartItems? = null
}

object EditAddress{
        var editAddress: CustomerAddress?  = null
}

object CustomerPlacedOrder{
      var customerPlaceOrder: CustomerOrder? = CustomerOrder(0,null,"",null,"",false,"")
}

object RecentlyViewed{
        var products: ArrayList<Product> = ArrayList()
}

object PreOrderStatus{
        var status: Boolean = false
}

object FreeDelivery{
        var free_delivery: Boolean = false
        var free_delivery_fee: Int = 0
        var delivery_fee: Int? = 0
}

data class HomeImages(
        val id: Int,
        val info_type: String,
        val image_name: String,
        val image_desc: String?
)

fun HomeImages.asHomeImagesModel() = HomeImagesTable(
        id = id,
        info_type = info_type,
        image_name = image_name,
        image_desc = image_desc!!
)

data class HomeSubCategoryDisplay(
        val id: Int,
        val subCatImage: String,
        val name: String
)

fun HomeSubCategoryDisplay.asHomeSubCatModel() = HomeSubCategoriesTable(
        id = id,
        subCatImage = subCatImage,
        name = name
)

data class TopSellingProducts(
        val all_products: List<Product>,
        val top_selling: List<Product>
)
data class HomeImagesSubCat(
        val home_images_products: List<HomeProducts>,
        val home_images : List<HomeImages>,
        val sub_cats : List<HomeSubCategoryDisplay>,
        val all_products: List<Product>,
        val top_selling_products: List<Product>
)

fun HomeImagesSubCat.asHomeImagesCarouselModel() = home_images.map {
    it.asHomeImagesModel()
}.toTypedArray()

fun HomeImagesSubCat.asSubCatModel() = sub_cats.map {
    it.asHomeSubCatModel()
}.toTypedArray()

fun HomeImagesSubCat.asMoreProductModel() = all_products.map {
        it.asMoreProductDomainModel()
}.toTypedArray()

fun HomeImagesSubCat.asTopSellingProduct() = top_selling_products.map {
        it.asTopProductDomainModel()
}.toTypedArray()

data class ListCustomerAddresses(
        var data: List<CustomerAddress>?
)

data class Products(
        val products: List<SubCategory>
)

data class SubCategory(
    val sub_category: String,
    val products: List<Product>
)



data class HomeProducts(
        val id: Int,
        val title : String,
        val products: List<Product>
)

data class HomePageInfo(
        val titleInfo: HomeCatTitles,
        val products: List<Product>
)

fun HomeProducts.asHomeProductModel(titleID:Int) = products.map {
    HomeProductsTable(
            product_id = it.product_id,
            productName = it.product_name,
            productPicture = it.product_picture,
            description = it.description,
            price = it.price,
            restaurantId = it.restaurant_id,
            restaurantName = it.restaurant_name,
            brandId = it.brand_id,
            brandName = it.brand_name,
            sub_category_id = it.sub_category_id,
            sub_category = it.sub_category,
            home_title_id = titleID,
            promotional_price_set = it.promotional_price_set,
            promotional_price = it.promotional_price,
            headsup = it.headsup,
            served_with = it.served_with,
            free_delivery = it.free_delivery,
            available = it.available
    )
}.toTypedArray()

data class HomeCatTitles(
        val id: Int,
        val title: String
)

fun HomeCatTitles.asHomeCatDataBaseModel() = HomeTitleCatTable(
        id = id,
        title = title
)

@Parcelize
data class HomeProduct(
        val product_id: Int,
        @Json(name = "name") val product_name: String,
        val product_picture: String,
        val description: String,
        val price: String,
        @Json(name = "resturant_id") val restaurant_id: Int,
        @Json(name = "resturant") val restaurant_name: String,
        val brand_id: Int,
        @Json(name = "brand") val brand_name: String,
        val sub_category_id: Int,
        val sub_category: String
): Parcelable



@Parcelize
data class Product(
    val product_id: Int,
    @Json(name = "name") val product_name: String,
    val product_picture: String,
    val description: String,
    val price: String,
    @Json(name = "resturant_id") val restaurant_id: Int,
    @Json(name = "resturant") val restaurant_name: String,
    val brand_id: Int,
    @Json(name = "brand") val brand_name: String,
    val sub_category_id: Int,
    val sub_category: String,
    val promotional_price_set: Boolean,
    val promotional_price: Int?,
    val headsup: String?,
    val served_with: String,
    val free_delivery: Boolean,
    var available: Boolean
): Parcelable


fun Product.asProductDatabaseModel() = ProductsTable(
        product_id = product_id,
        productName = product_name,
        productPicture = product_picture,
        description = description,
        price = price,
        restaurantId = restaurant_id,
        restaurantName = restaurant_name,
        brandId = brand_id,
        brandName = brand_name,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)

fun Product.asMoreProductDomainModel() = MoreProductsTable(
        product_id = product_id,
        productName = product_name,
        productPicture = product_picture,
        description = description,
        price = price,
        restaurantId = restaurant_id,
        restaurantName = restaurant_name,
        brandId = brand_id,
        brandName = brand_name,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)

fun Product.asTopProductDomainModel() = TopSellingProductsTable(
        product_id = product_id,
        productName = product_name,
        productPicture = product_picture,
        description = description,
        price = price,
        restaurantId = restaurant_id,
        restaurantName = restaurant_name,
        brandId = brand_id,
        brandName = brand_name,
        sub_category_id = sub_category_id,
        sub_category = sub_category,
        promotional_price_set = promotional_price_set,
        promotional_price = promotional_price,
        headsup = headsup,
        served_with = served_with,
        free_delivery = free_delivery,
        available = available
)


data class Restaurant(
        val id: Int,
        val business_name: String,
        val business_profile_picture: String,
        val address: String,
        val email: String,
        val contact: String,
        val second_contact: String,
        val location: String,
        val description: String,
        val admin_names: String,
        val admin_username: String,
        val admin_email: String,
        val admin_telephone: String,
        val operation_start_time: String,
        val operation_stop_time: String,
        val operational_status: Boolean
)

fun Restaurant.asRestaurantItemDatabaseModel() = RestaurantsTable(
        restaurant_id = id,
        businessName = business_name,
        businessProfilePicture = business_profile_picture,
        address = address,
        email = email,
        contact = contact,
        secondContact = second_contact,
        location = location,
        description = description,
        admin_names = admin_names,
        admin_username =  admin_username,
        admin_email = admin_email,
        admin_telephone = admin_telephone,
        operation_start_time = operation_start_time,
        operation_stop_time = operation_stop_time,
        operational_status = operational_status
)

data class ClickEatRestaurants(
        val restaurants: List<Restaurant>
)


fun ClickEatRestaurants.asRestaurantDatabaseModel() = restaurants.map {
    it.asRestaurantItemDatabaseModel()
}.toTypedArray()




@Parcelize
data class AruaDistrict(
        val district: String,
        val counties: List<County>

): Parcelable

@Parcelize
data class County(
        val county_name: String,
        val details: List<SubCounty>
): Parcelable

@Parcelize
data class SubCounty(
        val sub_county_name: String,
        val villages: List<Village>
): Parcelable

@Parcelize
data class Village(
        val village: String,
        val fee: Int?,
        val sub_county_name: String,
        val county_name: String
): Parcelable

@Parcelize
data class AruaVillages(
        val villages: List<Village>
): Parcelable

data class NewUser(
        val names: String,
        val email: String,
        val contact: String,
        val profile_picture: String?,
        val password: String
)

data class ApiResponse(
    val status: String?,
    val message: String?,
    val data: Int?
)

data class ForgotPassword(
    val email: String
)


data class LoginCredentials(
        val telephone: String,
        val password: String
)

@Parcelize
data class Customer(
        val customer_id: Int,
        val names: String,
        val email: String?,
        var contact: String,
        val second_contact: String?,
        val date_of_reg: String,
        val account_active: Boolean,
        var token: String,
        @Json(name="cart_size") val cartSize: Int

): Parcelable


data class CustomerAddress(
        val id: Int,
        val county: String,
        val sub_county: String,
        val village: String,
        val other_details: String,
        var is_default: Boolean,
        val customer_id: Int
)

data class CustomerNewAddress(
    val county: String?,
    val sub_county: String?,
    val village: String?,
    val other_details: String?,
    var is_default: Boolean?
)

@Parcelize
data class AllCustomerAddresses(
    val data: @RawValue List<CustomerAddress>?
) : Parcelable

fun Customer.toCustomerTable() = CustomerTable(
        customer_id = customer_id,
        names = names,
        email = email,
        contact = contact,
        second_contact = second_contact,
        date_of_reg = date_of_reg,
        account_active = account_active,
        token = token,
        cart_size = cartSize
)

data class CartItem(
        val product_id: Int,
        val customer_id: Int,
        val product_name: String,
        val product_image: String,
        val unit_price: String,
        var quantity: String,
        var served_with: String,
        val free_delivery: Boolean,
        val restaurant: String
)

data class CustomerCartItems(
        val cart_items: List<CartItemFromServer>
)

data class CartItemFromServer(
        val product_id: Int,
        val product_name: String,
        val product_image: String,
        val unit_price: Int,
        val quantity: Int,
        val served_with: String,
        val total: Int,
        val total_quantity: Int,
        val cart_total_amount: Int,
        val free_delivery: Boolean,
        val restaurant: String
)

data class UpdateCartItem(
        val product_id: Int,
        val quantity: Int
)

data class CustomerOrder(
        var customer_id: Int,
        var address: CustomerNewAddress?,
        var payment_method: String,
        var deliveryFee: Int?,
        var deliveryContact: String,
        var pre_order: Boolean,
        var pre_order_date: String
)


data class CustomerPlaceOrder(
        val id: Int,
        @Json(name="order_ref") val orderRef: String,
        @Json(name="order_ref_simple_version") val orderRefSimpleVersion: String,
        @Json(name="order_date") val orderDate: String,
        @Json(name="is_paid") val isPaid: Boolean,
        @Json(name="is_prepared") val isPrepared: Boolean,
        @Json(name="is_terminated") val isTerminated: Boolean,
        @Json(name="termination_reason") val terminationReason: String?,
        @Json(name="customer_received") val customerReceived: Boolean,
        @Json(name="delivery_fee") val deliveryFee: Int,
        @Json(name="order_items") val orderItems: List<CartItemFromServer>
)

data class Reason(
    val reason: String
)

data class Comment(
        val productId: Int,
        val comment: String
)

data class ServerComment(
        val product_id: Int,
        val comment: String,
        val date: String,
        val reply: String?,
        val customerNames: String
)

data class Rate(
    val productID: Int,
    val customerID: Int,
    val rate: Int
)

data class ProductRate(
    val rate: Int
)

data class ChangePassword(
        val oldPassword: String,
        val newPassword: String
)

data class UpdateCustomer(
    val names: String?,
    val email: String?,
    val contact: String?,
    val secondContact: String?
)

data class DrinkSubCategories(
        @Json(name="sub_category_id") val sub_category_id: Int,
        val name: String,
        @Json(name="category_id") val categoryId: Int
)

fun DrinkSubCategories.asDrinksItemSubCategoriesDatabaseModel() = SubDrinksTable(
        sub_cat_id = sub_category_id,
        names = name,
        categoryId = categoryId
)

data class ClickEatDrinksSubCategories(
        val drinksSubCat: List<DrinkSubCategories>
)

fun ClickEatDrinksSubCategories.asSubCatDrinksDatabaseModel() = drinksSubCat.map {
    it.asDrinksItemSubCategoriesDatabaseModel()
}.toTypedArray()



fun CartItem.toCartTable() = CartTable(
        product_id = product_id,
        customer_id = customer_id,
        product_name = product_name,
        product_image = product_image,
        unit_price = unit_price,
        quantity = quantity,
        served_with = served_with
)

data class HomeTopCategories(
        val category: String
)
