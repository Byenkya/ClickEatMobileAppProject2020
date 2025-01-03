package com.clickEat.ug.screens.stepper_layout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/clickEat/ug/screens/stepper_layout/MyStepperViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/clickEat/ug/data/ApiResponse;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "status", "Landroidx/lifecycle/LiveData;", "getStatus", "()Landroidx/lifecycle/LiveData;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addCustomerOrder", "customerOrder", "Lcom/clickEat/ug/data/CustomerOrder;", "(Lcom/clickEat/ug/data/CustomerOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrder", "", "onCleared", "app_debug"})
public final class MyStepperViewModal extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ApiResponse> _status;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ApiResponse> getStatus() {
        return null;
    }
    
    public final void addOrder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.CustomerOrder customerOrder) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public MyStepperViewModal(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}