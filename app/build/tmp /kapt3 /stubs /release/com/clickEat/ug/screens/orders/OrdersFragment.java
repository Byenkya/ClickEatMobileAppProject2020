package com.clickEat.ug.screens.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/clickEat/ug/screens/orders/OrdersFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/clickEat/ug/databinding/FragmentOrdersBinding;", "customerID", "", "getCustomerID", "()Ljava/lang/Integer;", "setCustomerID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ordersViewModel", "Lcom/clickEat/ug/screens/orders/OrdersViewModel;", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "Lkotlin/Lazy;", "viewModalFactory", "Lcom/clickEat/ug/screens/orders/OrdersViewModalFactory;", "alert", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class OrdersFragment extends androidx.fragment.app.Fragment {
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private com.clickEat.ug.screens.orders.OrdersViewModel ordersViewModel;
    private com.clickEat.ug.screens.orders.OrdersViewModalFactory viewModalFactory;
    private com.clickEat.ug.databinding.FragmentOrdersBinding binding;
    private final kotlin.Lazy userViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer customerID;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCustomerID() {
        return null;
    }
    
    public final void setCustomerID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void alert() {
    }
    
    public OrdersFragment() {
        super();
    }
}