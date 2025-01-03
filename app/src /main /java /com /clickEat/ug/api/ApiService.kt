package com.clickEat.ug.api

import com.clickEat.ug.data.*
import kotlinx.coroutines.Deferred
import retrofit2.http.*


interface ApiService {
    @GET("home_products")
    fun getHomeProductAsync(): Deferred<HomeImagesSubCat>

    @GET("products/{id}")
    fun getProductsAsync(
            @Path("id") id: Int
    ): Deferred<List<SubCategory>>

    @GET("drinks_based_on_sub_cat/{id}")
    fun getDrinksAsync(
        @Path("id") id: Int
    ): Deferred<List<SubCategory>>

    @GET("restaurants")
    fun getRestaurantsAsync(): Deferred<ClickEatRestaurants>

    @GET("arua_places")
    fun getPlacesAsync(): Deferred<List<Village>>

    @POST("register")
    fun signUpAsync(
            @Body newUser: NewUser
    ): Deferred<ApiResponse>

    @POST("customer_sign_in")
    fun getUserAsync(
            @Body loginCredentials: LoginCredentials
    ): Deferred<Customer>

    @POST("addToCart")
    fun addToCartAsync(
            @Body cartItem: CartItem
    ): Deferred<ApiResponse>

    @GET("cart_operations/{id}")
    fun getCustomerCartItemsAsync(
        @Path("id") id: Int
    ):Deferred<CustomerCartItems>

    @PUT("cart_operations/{id}")
    fun updateCartItemAsync(
            @Path("id") id: Int,
            @Body update: UpdateCartItem
    ):Deferred<CustomerCartItems>

    @DELETE("cart_operations/{id}")
    fun deleteCartItemAsync(
            @Path("id") id: Int
    ):Deferred<CustomerCartItems>

    @GET("customer_addresses/{id}")
    fun getCustomerAddressesAsync(
        @Path("id") id: Int
    ):Deferred<List<CustomerAddress>>

    @DELETE("customer_addresses/{id}")
    fun deleteCustomerAddressAsync(
            @Path("id")id: Int
    ):Deferred<ApiResponse>

    @POST("customer_order")
    fun addCustomerOrderAsync(
            @Body customerOrder: CustomerOrder
    ):Deferred<ApiResponse>

    @GET("customer_orders/{id}")
    fun getCustomerOrdersAsync(
            @Path("id") id: Int
    ):Deferred<List<CustomerPlaceOrder>>

    @POST("customer_orders/{id}")
    fun terminateCustomerOrderAsync(
        @Path("id") id: Int,
        @Body reason: Reason
    ):Deferred<List<CustomerPlaceOrder>>

    @GET("product_comments/{id}")
    fun getProductCommentsAsync(
        @Path("id") id: Int
    ):Deferred<List<ServerComment>>

    @POST("product_comments/{id}")
    fun addProductCommentAsync(
        @Path("id") id: Int,
        @Body comment: Comment
    ):Deferred<List<ServerComment>>

    @GET("rate_product/{id}")
    fun getProductRatingAsync(
        @Path("id") id: Int
    ):Deferred<ProductRate>

    @POST("rate_product/{id}")
    fun rateProductAsync(
        @Path("id") id: Int,
        @Body rate: Rate
    ):Deferred<ProductRate>

    @PUT("update_info/{id}")
    fun updateCustomerInformationAsync(
            @Path("id")id: Int,
            @Body customer: UpdateCustomer
    ):Deferred<Customer>

    @POST("add_address/{id}")
    fun addNewCustomerAddressAsync(
            @Path("id")id: Int,
            @Body customerNewAddress: CustomerNewAddress
    ):Deferred<List<CustomerAddress>>

    @PUT("add_address/{id}")
    fun updateCustomerAddressAsync(
            @Path("id")id: Int,
            @Body customerNewAddress: CustomerNewAddress
    ):Deferred<ApiResponse>

    @PUT("update_account_info/{id}")
    fun changeCustomerPasswordAsync(
          @Path("id")id: Int,
          @Body changePassword: ChangePassword
    ):Deferred<ApiResponse>

    @GET("drinks_sub_cat")
    fun getDrinksSubCategoriesAsync(): Deferred<ClickEatDrinksSubCategories>

    @POST("forgot_password")
    fun forgotPasswordAsync(
        @Body email: ForgotPassword
    ): Deferred<ApiResponse>

    @GET("searched_products")
    fun getSearchedProductsAsync(
            @Query("searchString")searchString: String?
    ): Deferred<List<Product>>

    @GET("sub_cat_products/{id}")
    fun getSubCatProductsAsync(
        @Path("id") id: Int
    ): Deferred<List<Product>>

    @GET("all_products")
    fun getAllProductsAsync(): Deferred<List<Product>>

    @GET("top_selling_products")
    fun getTopSellingProductsAsync(): Deferred<List<Product>>

    @GET("cat_products")
    fun getCategoryProductsAsync(
        @Query("categoryName") categoryName: String
    ): Deferred<List<Product>>

    @GET("fetch_all_subcats")
    fun fetchAllSubCatsAsync(): Deferred<List<HomeSubCategoryDisplay>>

}


