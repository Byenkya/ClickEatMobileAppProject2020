package com.clickEat.ug.screens.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/clickEat/ug/screens/signup/SignUpModelView;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/clickEat/ug/data/ApiResponse;", "getResult", "()Landroidx/lifecycle/MutableLiveData;", "setResult", "(Landroidx/lifecycle/MutableLiveData;)V", "viewModalJob", "Lkotlinx/coroutines/CompletableJob;", "createAccount", "newUser", "Lcom/clickEat/ug/data/NewUser;", "(Lcom/clickEat/ug/data/NewUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "", "signUpUser", "app_debug"})
public final class SignUpModelView extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModalJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ApiResponse> result;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ApiResponse> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.ApiResponse> p0) {
    }
    
    public final void signUpUser(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.NewUser newUser) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SignUpModelView(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}