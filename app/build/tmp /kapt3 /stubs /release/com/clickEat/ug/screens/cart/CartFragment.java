package com.clickEat.ug.screens.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/clickEat/ug/screens/cart/CartFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/stepstone/stepper/Step;", "()V", "binding", "Lcom/clickEat/ug/databinding/FragmentCartBinding;", "cartViewModel", "Lcom/clickEat/ug/screens/cart/CartViewModel;", "customerID", "", "Ljava/lang/Integer;", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/clickEat/ug/screens/cart/CartViewModelFactory;", "alert", "", "error", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onError", "Lcom/stepstone/stepper/VerificationError;", "onSelected", "verifyStep", "app_release"})
public final class CartFragment extends androidx.fragment.app.Fragment implements com.stepstone.stepper.Step {
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private final kotlin.Lazy userViewModel$delegate = null;
    private com.clickEat.ug.screens.cart.CartViewModelFactory viewModelFactory;
    private com.clickEat.ug.databinding.FragmentCartBinding binding;
    private com.clickEat.ug.screens.cart.CartViewModel cartViewModel;
    private java.lang.Integer customerID;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stepstone.stepper.VerificationError verifyStep() {
        return null;
    }
    
    @java.lang.Override()
    public void onSelected() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    com.stepstone.stepper.VerificationError error) {
    }
    
    private final void alert(java.lang.String error) {
    }
    
    public CartFragment() {
        super();
    }
}