package com.clickEat.ug.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0011\u0010%\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/clickEat/ug/network/DataRepository;", "", "database", "Lcom/clickEat/ug/database/AppDataBase;", "application", "Landroid/app/Application;", "(Lcom/clickEat/ug/database/AppDataBase;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "homeProducts", "Landroidx/lifecycle/LiveData;", "", "Lcom/clickEat/ug/data/HomePageInfo;", "getHomeProducts", "()Landroidx/lifecycle/LiveData;", "home_images", "Lcom/clickEat/ug/data/HomeImages;", "getHome_images", "moreProducts", "Lcom/clickEat/ug/screens/custom_categories/AllHomeProducts;", "getMoreProducts", "rests", "Lcom/clickEat/ug/data/ClickEatRestaurants;", "getRests", "subCatDrinks", "Lcom/clickEat/ug/data/ClickEatDrinksSubCategories;", "getSubCatDrinks", "subCategories", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "getSubCategories", "topSellingProducts", "Lcom/clickEat/ug/data/Product;", "getTopSellingProducts", "refreshHomeProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshRestaurants", "refreshSubCatDrinks", "app_release"})
public final class DataRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomePageInfo>> homeProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeImages>> home_images = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> subCategories = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> topSellingProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> moreProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatRestaurants> rests = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> subCatDrinks = null;
    private final com.clickEat.ug.database.AppDataBase database = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomePageInfo>> getHomeProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeImages>> getHome_images() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> getSubCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> getTopSellingProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> getMoreProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshHomeProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatRestaurants> getRests() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshRestaurants(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> getSubCatDrinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshSubCatDrinks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.AppDataBase database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}