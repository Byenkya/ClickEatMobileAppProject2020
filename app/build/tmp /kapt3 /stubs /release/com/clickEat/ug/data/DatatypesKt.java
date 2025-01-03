package com.clickEat.ug.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\t\u00a2\u0006\u0002\u0010\n\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\f\u001a\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0018\u001a\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007*\u00020\t\u00a2\u0006\u0002\u0010\u001a\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0018\u001a\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007*\u00020\u001f\u00a2\u0006\u0002\u0010 \u001a\n\u0010!\u001a\u00020\u001e*\u00020\"\u001a\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020$\u00a2\u0006\u0002\u0010%\u001a\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007*\u00020\t\u00a2\u0006\u0002\u0010\'\u001a\n\u0010(\u001a\u00020)*\u00020\u0018\u001a\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0007*\u00020\t\u00a2\u0006\u0002\u0010+\u001a\n\u0010,\u001a\u00020-*\u00020.\u001a\n\u0010/\u001a\u000200*\u000201\u00a8\u00062"}, d2 = {"asDrinksItemSubCategoriesDatabaseModel", "Lcom/clickEat/ug/database/SubDrinksTable;", "Lcom/clickEat/ug/data/DrinkSubCategories;", "asHomeCatDataBaseModel", "Lcom/clickEat/ug/database/HomeTitleCatTable;", "Lcom/clickEat/ug/data/HomeCatTitles;", "asHomeImagesCarouselModel", "", "Lcom/clickEat/ug/database/HomeImagesTable;", "Lcom/clickEat/ug/data/HomeImagesSubCat;", "(Lcom/clickEat/ug/data/HomeImagesSubCat;)[Lcom/clickEat/ug/database/HomeImagesTable;", "asHomeImagesModel", "Lcom/clickEat/ug/data/HomeImages;", "asHomeProductModel", "Lcom/clickEat/ug/database/HomeProductsTable;", "Lcom/clickEat/ug/data/HomeProducts;", "titleID", "", "(Lcom/clickEat/ug/data/HomeProducts;I)[Lcom/clickEat/ug/database/HomeProductsTable;", "asHomeSubCatModel", "Lcom/clickEat/ug/database/HomeSubCategoriesTable;", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "asMoreProductDomainModel", "Lcom/clickEat/ug/database/MoreProductsTable;", "Lcom/clickEat/ug/data/Product;", "asMoreProductModel", "(Lcom/clickEat/ug/data/HomeImagesSubCat;)[Lcom/clickEat/ug/database/MoreProductsTable;", "asProductDatabaseModel", "Lcom/clickEat/ug/database/ProductsTable;", "asRestaurantDatabaseModel", "Lcom/clickEat/ug/database/RestaurantsTable;", "Lcom/clickEat/ug/data/ClickEatRestaurants;", "(Lcom/clickEat/ug/data/ClickEatRestaurants;)[Lcom/clickEat/ug/database/RestaurantsTable;", "asRestaurantItemDatabaseModel", "Lcom/clickEat/ug/data/Restaurant;", "asSubCatDrinksDatabaseModel", "Lcom/clickEat/ug/data/ClickEatDrinksSubCategories;", "(Lcom/clickEat/ug/data/ClickEatDrinksSubCategories;)[Lcom/clickEat/ug/database/SubDrinksTable;", "asSubCatModel", "(Lcom/clickEat/ug/data/HomeImagesSubCat;)[Lcom/clickEat/ug/database/HomeSubCategoriesTable;", "asTopProductDomainModel", "Lcom/clickEat/ug/database/TopSellingProductsTable;", "asTopSellingProduct", "(Lcom/clickEat/ug/data/HomeImagesSubCat;)[Lcom/clickEat/ug/database/TopSellingProductsTable;", "toCartTable", "Lcom/clickEat/ug/database/CartTable;", "Lcom/clickEat/ug/data/CartItem;", "toCustomerTable", "Lcom/clickEat/ug/database/CustomerTable;", "Lcom/clickEat/ug/data/Customer;", "app_release"})
public final class DatatypesKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeImagesTable asHomeImagesModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeImages $this$asHomeImagesModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeSubCategoriesTable asHomeSubCatModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeSubCategoryDisplay $this$asHomeSubCatModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeImagesTable[] asHomeImagesCarouselModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeImagesSubCat $this$asHomeImagesCarouselModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeSubCategoriesTable[] asSubCatModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeImagesSubCat $this$asSubCatModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.MoreProductsTable[] asMoreProductModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeImagesSubCat $this$asMoreProductModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.TopSellingProductsTable[] asTopSellingProduct(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeImagesSubCat $this$asTopSellingProduct) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeProductsTable[] asHomeProductModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeProducts $this$asHomeProductModel, int titleID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.HomeTitleCatTable asHomeCatDataBaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeCatTitles $this$asHomeCatDataBaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.ProductsTable asProductDatabaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Product $this$asProductDatabaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.MoreProductsTable asMoreProductDomainModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Product $this$asMoreProductDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.TopSellingProductsTable asTopProductDomainModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Product $this$asTopProductDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.RestaurantsTable asRestaurantItemDatabaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Restaurant $this$asRestaurantItemDatabaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.RestaurantsTable[] asRestaurantDatabaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.ClickEatRestaurants $this$asRestaurantDatabaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.CustomerTable toCustomerTable(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Customer $this$toCustomerTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.SubDrinksTable asDrinksItemSubCategoriesDatabaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.DrinkSubCategories $this$asDrinksItemSubCategoriesDatabaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.SubDrinksTable[] asSubCatDrinksDatabaseModel(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.ClickEatDrinksSubCategories $this$asSubCatDrinksDatabaseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.clickEat.ug.database.CartTable toCartTable(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.CartItem $this$toCartTable) {
        return null;
    }
}