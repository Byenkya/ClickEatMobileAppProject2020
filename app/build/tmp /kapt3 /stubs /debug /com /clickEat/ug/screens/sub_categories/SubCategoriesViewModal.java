package com.clickEat.ug.screens.sub_categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/clickEat/ug/screens/sub_categories/SubCategoriesViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_subCats", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "subCats", "Landroidx/lifecycle/LiveData;", "getSubCats", "()Landroidx/lifecycle/LiveData;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "fetchAllSubCategories", "", "fetchSubCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_debug"})
public final class SubCategoriesViewModal extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> _subCats = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> getSubCats() {
        return null;
    }
    
    public final void fetchAllSubCategories() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SubCategoriesViewModal(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}