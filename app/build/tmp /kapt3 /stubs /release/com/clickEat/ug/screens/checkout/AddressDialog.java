package com.clickEat.ug.screens.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J0\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "adapter", "Lcom/clickEat/ug/screens/checkout/AddressRecyclerView;", "getAdapter$app_release", "()Lcom/clickEat/ug/screens/checkout/AddressRecyclerView;", "setAdapter$app_release", "(Lcom/clickEat/ug/screens/checkout/AddressRecyclerView;)V", "addressId", "", "Ljava/lang/Integer;", "listener", "Lcom/clickEat/ug/screens/checkout/AddressDialog$AddressSelectedListener;", "getListener$app_release", "()Lcom/clickEat/ug/screens/checkout/AddressDialog$AddressSelectedListener;", "setListener$app_release", "(Lcom/clickEat/ug/screens/checkout/AddressDialog$AddressSelectedListener;)V", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "Lkotlin/Lazy;", "deleteAddress", "", "id", "fragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "userViewModal", "deleteAddressAlert", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "showMessage", "it", "Lcom/clickEat/ug/data/ApiResponse;", "AddressSelectedListener", "Companion", "app_release"})
public final class AddressDialog extends androidx.fragment.app.DialogFragment {
    private final kotlin.Lazy userViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.clickEat.ug.screens.checkout.AddressDialog.AddressSelectedListener listener;
    @org.jetbrains.annotations.NotNull()
    public com.clickEat.ug.screens.checkout.AddressRecyclerView adapter;
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private java.lang.Integer addressId;
    public static final com.clickEat.ug.screens.checkout.AddressDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.screens.checkout.AddressDialog.AddressSelectedListener getListener$app_release() {
        return null;
    }
    
    public final void setListener$app_release(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.AddressDialog.AddressSelectedListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.screens.checkout.AddressRecyclerView getAdapter$app_release() {
        return null;
    }
    
    public final void setAdapter$app_release(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.AddressRecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteAddressAlert(int id, androidx.fragment.app.Fragment fragment, android.content.Context context, com.clickEat.ug.MainActivityViewModel userViewModal, com.clickEat.ug.screens.login.CustomProgressDialog progressDialog) {
    }
    
    private final void deleteAddress(int id, androidx.fragment.app.Fragment fragment, android.content.Context context, com.clickEat.ug.MainActivityViewModel userViewModal, com.clickEat.ug.screens.login.CustomProgressDialog progressDialog) {
    }
    
    private final void showMessage(com.clickEat.ug.data.ApiResponse it, android.content.Context context) {
    }
    
    public AddressDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressDialog$AddressSelectedListener;", "", "onDialogClickListener", "", "id", "", "app_release"})
    public static abstract interface AddressSelectedListener {
        
        public abstract void onDialogClickListener(int id);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressDialog$Companion;", "", "()V", "newInstance", "Lcom/clickEat/ug/screens/checkout/AddressDialog;", "addresses", "Lcom/clickEat/ug/data/AllCustomerAddresses;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.screens.checkout.AddressDialog newInstance(@org.jetbrains.annotations.Nullable()
        com.clickEat.ug.data.AllCustomerAddresses addresses) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}