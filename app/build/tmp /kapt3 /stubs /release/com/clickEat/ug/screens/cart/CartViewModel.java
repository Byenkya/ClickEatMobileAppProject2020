package com.clickEat.ug.screens.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0003J\u0019\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J!\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/clickEat/ug/screens/cart/CartViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "customer_id", "", "application", "Landroid/app/Application;", "(ILandroid/app/Application;)V", "_cart", "Landroidx/lifecycle/MutableLiveData;", "Lcom/clickEat/ug/data/CustomerCartItems;", "cart", "Landroidx/lifecycle/LiveData;", "getCart", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "delCart", "product_id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delCartItem", "", "getCartItems", "onCleared", "updateCart", "update", "Lcom/clickEat/ug/data/UpdateCartItem;", "(ILcom/clickEat/ug/data/UpdateCartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCartItem", "app_release"})
public final class CartViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.CustomerCartItems> _cart;
    private final int customer_id = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.CustomerCartItems> getCart() {
        return null;
    }
    
    private final void getCartItems(int customer_id) {
    }
    
    public final void updateCartItem(int customer_id, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.UpdateCartItem update) {
    }
    
    public final void delCartItem(int product_id) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CartViewModel(int customer_id, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}