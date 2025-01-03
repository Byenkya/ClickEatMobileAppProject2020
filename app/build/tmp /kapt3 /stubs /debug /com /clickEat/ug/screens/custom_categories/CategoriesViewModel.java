package com.clickEat.ug.screens.custom_categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020-J\u0014\u0010.\u001a\u00020-2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\rJ\b\u0010/\u001a\u00020-H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0010R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/clickEat/ug/database/AppDataBase;", "getDatabase", "()Lcom/clickEat/ug/database/AppDataBase;", "home_images", "Landroidx/lifecycle/LiveData;", "", "Lcom/clickEat/ug/data/HomeImages;", "getHome_images", "()Landroidx/lifecycle/LiveData;", "mainRecycler", "Landroidx/lifecycle/MutableLiveData;", "Lcom/clickEat/ug/screens/custom_categories/AllHomeProducts;", "getMainRecycler", "()Landroidx/lifecycle/MutableLiveData;", "setMainRecycler", "(Landroidx/lifecycle/MutableLiveData;)V", "moreProducts", "getMoreProducts", "setMoreProducts", "(Landroidx/lifecycle/LiveData;)V", "products", "Lcom/clickEat/ug/data/HomePageInfo;", "getProducts", "productsToDisplay", "Lcom/clickEat/ug/data/Product;", "getProductsToDisplay", "setProductsToDisplay", "repository", "Lcom/clickEat/ug/network/DataRepository;", "subCategories", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "getSubCategories", "topSellingProducts", "getTopSellingProducts", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addProducts", "", "dataToDisplay", "onCleared", "app_debug"})
public final class CategoriesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.database.AppDataBase database = null;
    private final com.clickEat.ug.network.DataRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Product>> productsToDisplay;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> mainRecycler;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> moreProducts;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeImages>> home_images = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> subCategories = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> topSellingProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomePageInfo>> products = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.AppDataBase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Product>> getProductsToDisplay() {
        return null;
    }
    
    public final void setProductsToDisplay(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Product>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> getMainRecycler() {
        return null;
    }
    
    public final void setMainRecycler(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> getMoreProducts() {
        return null;
    }
    
    public final void setMoreProducts(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> p0) {
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
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomePageInfo>> getProducts() {
        return null;
    }
    
    public final void dataToDisplay(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.clickEat.ug.screens.custom_categories.AllHomeProducts> moreProducts) {
    }
    
    public final void addProducts() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CategoriesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}