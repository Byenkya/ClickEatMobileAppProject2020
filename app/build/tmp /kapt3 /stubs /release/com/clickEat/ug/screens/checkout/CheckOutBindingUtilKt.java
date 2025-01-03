package com.clickEat.ug.screens.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"addressDetails", "", "Lcom/google/android/material/textview/MaterialTextView;", "item", "Lcom/clickEat/ug/data/CustomerAddress;", "addressTitle", "addresses", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Lcom/clickEat/ug/data/AllCustomerAddresses;", "newVillage", "Lcom/toptoche/searchablespinnerlibrary/SearchableSpinner;", "Lcom/clickEat/ug/data/AruaVillages;", "selectedCustomerAddress", "Landroid/widget/ImageView;", "app_release"})
public final class CheckOutBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"addressTitle"})
    public static final void addressTitle(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$addressTitle, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerAddress item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"addressDetails"})
    public static final void addressDetails(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$addressDetails, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerAddress item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"addresses"})
    public static final void addresses(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addresses, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.AllCustomerAddresses items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedCustomerAddress"})
    public static final void selectedCustomerAddress(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$selectedCustomerAddress, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerAddress item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"newVillage"})
    public static final void newVillage(@org.jetbrains.annotations.NotNull()
    com.toptoche.searchablespinnerlibrary.SearchableSpinner $this$newVillage, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.AruaVillages item) {
    }
}