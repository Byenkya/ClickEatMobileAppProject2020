package com.clickEat.ug.screens.edit_address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/clickEat/ug/screens/edit_address/EditAddressModalView;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_places", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clickEat/ug/data/Village;", "_response", "Lcom/clickEat/ug/data/ApiResponse;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "places", "Landroidx/lifecycle/LiveData;", "getPlaces", "()Landroidx/lifecycle/LiveData;", "response", "getResponse", "viewModalJob", "Lkotlinx/coroutines/CompletableJob;", "getAllPlaces", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "updateAddress", "addressID", "", "customerNewAddress", "Lcom/clickEat/ug/data/CustomerNewAddress;", "updateCustomerAddress", "(ILcom/clickEat/ug/data/CustomerNewAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EditAddressModalView extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModalJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.Village>> _places;
    private androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ApiResponse> _response;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Village>> getPlaces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ApiResponse> getResponse() {
        return null;
    }
    
    private final void getAllPlaces() {
    }
    
    public final void updateAddress(int addressID, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.CustomerNewAddress customerNewAddress) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public EditAddressModalView(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}