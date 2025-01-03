package com.clickEat.ug.screens.rate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0019\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001aH\u0014J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u001e\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020#J!\u0010$\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/clickEat/ug/screens/rate/RateViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "product", "Lcom/clickEat/ug/data/Product;", "app", "Landroid/app/Application;", "(Lcom/clickEat/ug/data/Product;Landroid/app/Application;)V", "_products", "Landroidx/lifecycle/MutableLiveData;", "", "_rate", "Lcom/clickEat/ug/data/ProductRate;", "_selectedProduct", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "products", "Landroidx/lifecycle/LiveData;", "getProducts", "()Landroidx/lifecycle/LiveData;", "rate", "getRate", "selectedProduct", "getSelectedProduct", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getProductRate", "", "productID", "", "getProductsYouLike", "subCategoryID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "productsYouMayLike", "rateProduct", "Lcom/clickEat/ug/data/Rate;", "ratingProduct", "(ILcom/clickEat/ug/data/Rate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RateViewModal extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ProductRate> _rate = null;
    private final androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.Product> _selectedProduct = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Product>> _products = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ProductRate> getRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.Product> getSelectedProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> getProducts() {
        return null;
    }
    
    private final void getProductRate(int productID) {
    }
    
    public final void rateProduct(int productID, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Rate rate) {
    }
    
    public final void getProductsYouLike(int subCategoryID) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public RateViewModal(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Product product, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}