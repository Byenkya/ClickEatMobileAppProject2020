package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\b\u0010\t\u001a\u00020\u0003H\'J\b\u0010\n\u001a\u00020\u0003H\'J\b\u0010\u000b\u001a\u00020\u0003H\'J\b\u0010\f\u001a\u00020\u0003H\'J\b\u0010\r\u001a\u00020\u0003H\'J\b\u0010\u000e\u001a\u00020\u0003H\'J\b\u0010\u000f\u001a\u00020\u0003H\'J\b\u0010\u0010\u001a\u00020\u0003H\'J\u0010\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\'J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0007H\'J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u0007H\'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u0007H\'J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00120\u0007H\'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00120\u0007H\'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u0007H\'J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120\u0007H\'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00120\u0007H\'J!\u0010$\u001a\u00020\u00032\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&\"\u00020!H\'\u00a2\u0006\u0002\u0010\'J!\u0010(\u001a\u00020\u00032\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170&\"\u00020\u0017H\'\u00a2\u0006\u0002\u0010*J!\u0010+\u001a\u00020\u00032\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190&\"\u00020\u0019H\'\u00a2\u0006\u0002\u0010-J!\u0010.\u001a\u00020\u00032\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000&\"\u000200H\'\u00a2\u0006\u0002\u00101J!\u00102\u001a\u00020\u00032\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0&\"\u00020\u001dH\'\u00a2\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u000207H\'J!\u00108\u001a\u00020\u00032\u0012\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0&\"\u00020\u001fH\'\u00a2\u0006\u0002\u0010:J!\u0010;\u001a\u00020\u00032\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0&\"\u00020#H\'\u00a2\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0014H\'J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0014H\'J\u0018\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\'\u00a8\u0006F"}, d2 = {"Lcom/clickEat/ug/database/DatabaseDao;", "", "addNewCartItem", "", "cart", "Lcom/clickEat/ug/database/CartTable;", "cartSize", "Landroidx/lifecycle/LiveData;", "", "clearCart", "deleteCustomer", "deleteHomeImages", "deleteHomeProducts", "deleteHomeSubCategories", "deleteHomeTitleInfo", "deleteMoreProducts", "deleteTopSellingProducts", "getCartItems", "", "getCurrentUser", "Lcom/clickEat/ug/database/CustomerTable;", "getCustomer", "getDrinksSubCats", "Lcom/clickEat/ug/database/SubDrinksTable;", "getHomeImages", "Lcom/clickEat/ug/database/HomeImagesTable;", "getHomeProducts", "Lcom/clickEat/ug/database/HomeProductsWithTitles;", "getHomeSubCategoreis", "Lcom/clickEat/ug/database/HomeSubCategoriesTable;", "getMoreProducts", "Lcom/clickEat/ug/database/MoreProductsTable;", "getRestaurants", "Lcom/clickEat/ug/database/RestaurantsTable;", "getTopSellingProducts", "Lcom/clickEat/ug/database/TopSellingProductsTable;", "insertAllRestaurants", "restaurants", "", "([Lcom/clickEat/ug/database/RestaurantsTable;)V", "insertAllSubDrinksCat", "subDrinksCat", "([Lcom/clickEat/ug/database/SubDrinksTable;)V", "insertHomeImages", "homeImages", "([Lcom/clickEat/ug/database/HomeImagesTable;)V", "insertHomeProducts", "products", "Lcom/clickEat/ug/database/HomeProductsTable;", "([Lcom/clickEat/ug/database/HomeProductsTable;)V", "insertHomeSubCategories", "homeSubCats", "([Lcom/clickEat/ug/database/HomeSubCategoriesTable;)V", "insertHomeTitleInfo", "titleInfo", "Lcom/clickEat/ug/database/HomeTitleCatTable;", "insertMoreProducts", "moreProducts", "([Lcom/clickEat/ug/database/MoreProductsTable;)V", "insertTopSellingProducts", "topSelling", "([Lcom/clickEat/ug/database/TopSellingProductsTable;)V", "saveCustomer", "customer", "updateCartItem", "updateCustomer", "updateCustomerToken", "newToken", "", "oldToken", "app_debug"})
public abstract interface DatabaseDao {
    
    @androidx.room.Insert()
    public abstract void addNewCartItem(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.CartTable cart);
    
    @androidx.room.Update()
    public abstract void updateCartItem(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.CartTable cart);
    
    @androidx.room.Query(value = "DELETE FROM cart_table")
    public abstract void clearCart();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM cart_table")
    public abstract java.util.List<com.clickEat.ug.database.CartTable> getCartItems();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT count(product_id) FROM cart_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> cartSize();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM customer_table limit 1")
    public abstract com.clickEat.ug.database.CustomerTable getCustomer();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM customer_table limit 1")
    public abstract androidx.lifecycle.LiveData<com.clickEat.ug.database.CustomerTable> getCurrentUser();
    
    @androidx.room.Update()
    public abstract void updateCustomer(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.CustomerTable customer);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveCustomer(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.CustomerTable customer);
    
    @androidx.room.Query(value = "DELETE FROM customer_table")
    public abstract void deleteCustomer();
    
    @androidx.room.Query(value = "update customer_table set token = :newToken where token = :oldToken")
    public abstract void updateCustomerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String newToken, @org.jetbrains.annotations.NotNull()
    java.lang.String oldToken);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM restaurants_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.RestaurantsTable>> getRestaurants();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllRestaurants(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.RestaurantsTable... restaurants);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sub_drinks_categories")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.SubDrinksTable>> getDrinksSubCats();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllSubDrinksCat(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.SubDrinksTable... subDrinksCat);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertHomeTitleInfo(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.HomeTitleCatTable titleInfo);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertHomeProducts(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.HomeProductsTable... products);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM home_title_cat_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.HomeProductsWithTitles>> getHomeProducts();
    
    @androidx.room.Query(value = "DELETE FROM home_title_cat_table")
    public abstract void deleteHomeTitleInfo();
    
    @androidx.room.Query(value = "DELETE FROM home_products_table")
    public abstract void deleteHomeProducts();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertHomeImages(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.HomeImagesTable... homeImages);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM home_images_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.HomeImagesTable>> getHomeImages();
    
    @androidx.room.Query(value = "DELETE FROM home_images_table")
    public abstract void deleteHomeImages();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertHomeSubCategories(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.HomeSubCategoriesTable... homeSubCats);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM home_sub_categories_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.HomeSubCategoriesTable>> getHomeSubCategoreis();
    
    @androidx.room.Query(value = "DELETE FROM home_sub_categories_table")
    public abstract void deleteHomeSubCategories();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertMoreProducts(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.MoreProductsTable... moreProducts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM more_products_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.MoreProductsTable>> getMoreProducts();
    
    @androidx.room.Query(value = "DELETE FROM more_products_table")
    public abstract void deleteMoreProducts();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTopSellingProducts(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.TopSellingProductsTable... topSelling);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM top_selling_products")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.database.TopSellingProductsTable>> getTopSellingProducts();
    
    @androidx.room.Query(value = "DELETE FROM top_selling_products")
    public abstract void deleteTopSellingProducts();
}