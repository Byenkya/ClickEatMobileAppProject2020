package com.clickEat.ug.screens.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u000f\u001a\u00020\u00152\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/clickEat/ug/screens/search/SearchViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "searchString", "", "application", "Landroid/app/Application;", "(Ljava/lang/String;Landroid/app/Application;)V", "_searchedProducts", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clickEat/ug/data/Product;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "searchedProducts", "Landroidx/lifecycle/LiveData;", "getSearchedProducts", "()Landroidx/lifecycle/LiveData;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getAllSearchedProducts", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onCleared", "app_release"})
public final class SearchViewModal extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Product>> _searchedProducts;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> getSearchedProducts() {
        return null;
    }
    
    private final void getSearchedProducts(java.lang.String searchString) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SearchViewModal(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}