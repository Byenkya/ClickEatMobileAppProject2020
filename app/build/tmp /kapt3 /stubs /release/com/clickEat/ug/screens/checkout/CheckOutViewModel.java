package com.clickEat.ug.screens.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/clickEat/ug/screens/checkout/CheckOutViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "customer_id", "", "application", "Landroid/app/Application;", "(ILandroid/app/Application;)V", "_addresses", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clickEat/ug/data/CustomerAddress;", "_places", "Lcom/clickEat/ug/data/Village;", "addresses", "Landroidx/lifecycle/LiveData;", "getAddresses", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "places", "getPlaces", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPlaces", "", "getCustomerAddresses", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_release"})
public final class CheckOutViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.CustomerAddress>> _addresses;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Village>> _places;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.CustomerAddress>> getAddresses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Village>> getPlaces() {
        return null;
    }
    
    private final void getCustomerAddresses(int customer_id) {
    }
    
    public final void getAllPlaces() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CheckOutViewModel(int customer_id, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}