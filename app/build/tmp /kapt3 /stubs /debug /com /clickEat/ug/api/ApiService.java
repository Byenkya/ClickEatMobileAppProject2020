package com.clickEat.ug.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u0003H\'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\'J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u0003H\'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00032\b\b\u0001\u0010#\u001a\u00020$H\'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u001e\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0003H\'J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0003H\'J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u0003H\'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u001e\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0003H\'J \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00032\n\b\u0001\u00108\u001a\u0004\u0018\u00010$H\'J\u001e\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u0003H\'J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010=\u001a\u00020>H\'J\"\u0010?\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010@\u001a\u00020AH\'J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010C\u001a\u00020DH\'J(\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010F\u001a\u00020GH\'J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010I\u001a\u00020JH\'J\"\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\'J\"\u0010L\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010M\u001a\u00020NH\'\u00a8\u0006O"}, d2 = {"Lcom/clickEat/ug/api/ApiService;", "", "addCustomerOrderAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/clickEat/ug/data/ApiResponse;", "customerOrder", "Lcom/clickEat/ug/data/CustomerOrder;", "addNewCustomerAddressAsync", "", "Lcom/clickEat/ug/data/CustomerAddress;", "id", "", "customerNewAddress", "Lcom/clickEat/ug/data/CustomerNewAddress;", "addProductCommentAsync", "Lcom/clickEat/ug/data/ServerComment;", "comment", "Lcom/clickEat/ug/data/Comment;", "addToCartAsync", "cartItem", "Lcom/clickEat/ug/data/CartItem;", "changeCustomerPasswordAsync", "changePassword", "Lcom/clickEat/ug/data/ChangePassword;", "deleteCartItemAsync", "Lcom/clickEat/ug/data/CustomerCartItems;", "deleteCustomerAddressAsync", "fetchAllSubCatsAsync", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "forgotPasswordAsync", "email", "Lcom/clickEat/ug/data/ForgotPassword;", "getAllProductsAsync", "Lcom/clickEat/ug/data/Product;", "getCategoryProductsAsync", "categoryName", "", "getCustomerAddressesAsync", "getCustomerCartItemsAsync", "getCustomerOrdersAsync", "Lcom/clickEat/ug/data/CustomerPlaceOrder;", "getDrinksAsync", "Lcom/clickEat/ug/data/SubCategory;", "getDrinksSubCategoriesAsync", "Lcom/clickEat/ug/data/ClickEatDrinksSubCategories;", "getHomeProductAsync", "Lcom/clickEat/ug/data/HomeImagesSubCat;", "getPlacesAsync", "Lcom/clickEat/ug/data/Village;", "getProductCommentsAsync", "getProductRatingAsync", "Lcom/clickEat/ug/data/ProductRate;", "getProductsAsync", "getRestaurantsAsync", "Lcom/clickEat/ug/data/ClickEatRestaurants;", "getSearchedProductsAsync", "searchString", "getSubCatProductsAsync", "getTopSellingProductsAsync", "getUserAsync", "Lcom/clickEat/ug/data/Customer;", "loginCredentials", "Lcom/clickEat/ug/data/LoginCredentials;", "rateProductAsync", "rate", "Lcom/clickEat/ug/data/Rate;", "signUpAsync", "newUser", "Lcom/clickEat/ug/data/NewUser;", "terminateCustomerOrderAsync", "reason", "Lcom/clickEat/ug/data/Reason;", "updateCartItemAsync", "update", "Lcom/clickEat/ug/data/UpdateCartItem;", "updateCustomerAddressAsync", "updateCustomerInformationAsync", "customer", "Lcom/clickEat/ug/data/UpdateCustomer;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "home_products")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.HomeImagesSubCat> getHomeProductAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.SubCategory>> getProductsAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drinks_based_on_sub_cat/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.SubCategory>> getDrinksAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "restaurants")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ClickEatRestaurants> getRestaurantsAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "arua_places")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Village>> getPlacesAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> signUpAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.NewUser newUser);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer_sign_in")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.Customer> getUserAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.LoginCredentials loginCredentials);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "addToCart")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> addToCartAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.CartItem cartItem);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cart_operations/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.CustomerCartItems> getCustomerCartItemsAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "cart_operations/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.CustomerCartItems> updateCartItemAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.UpdateCartItem update);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "cart_operations/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.CustomerCartItems> deleteCartItemAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "customer_addresses/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.CustomerAddress>> getCustomerAddressesAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "customer_addresses/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> deleteCustomerAddressAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer_order")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> addCustomerOrderAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.CustomerOrder customerOrder);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "customer_orders/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.CustomerPlaceOrder>> getCustomerOrdersAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer_orders/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.CustomerPlaceOrder>> terminateCustomerOrderAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.Reason reason);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "product_comments/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.ServerComment>> getProductCommentsAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "product_comments/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.ServerComment>> addProductCommentAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.Comment comment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "rate_product/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ProductRate> getProductRatingAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rate_product/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ProductRate> rateProductAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.Rate rate);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "update_info/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.Customer> updateCustomerInformationAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.UpdateCustomer customer);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "add_address/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.CustomerAddress>> addNewCustomerAddressAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.CustomerNewAddress customerNewAddress);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "add_address/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> updateCustomerAddressAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.CustomerNewAddress customerNewAddress);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "update_account_info/{id}")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> changeCustomerPasswordAsync(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.ChangePassword changePassword);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drinks_sub_cat")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ClickEatDrinksSubCategories> getDrinksSubCategoriesAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "forgot_password")
    public abstract kotlinx.coroutines.Deferred<com.clickEat.ug.data.ApiResponse> forgotPasswordAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.clickEat.ug.data.ForgotPassword email);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "searched_products")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Product>> getSearchedProductsAsync(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "searchString")
    java.lang.String searchString);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "sub_cat_products/{id}")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Product>> getSubCatProductsAsync(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "all_products")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Product>> getAllProductsAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "top_selling_products")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Product>> getTopSellingProductsAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cat_products")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.Product>> getCategoryProductsAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryName")
    java.lang.String categoryName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "fetch_all_subcats")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> fetchAllSubCatsAsync();
}