package com.clickEat.ug.screens.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0001*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u0011"}, d2 = {"cartProducts", "", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Lcom/clickEat/ug/data/CustomerCartItems;", "cartTotal", "Lcom/google/android/material/textview/MaterialTextView;", "productImage", "Lde/hdodenhof/circleimageview/CircleImageView;", "item", "Lcom/clickEat/ug/data/CartItemFromServer;", "productName", "productQuantity", "Landroid/widget/Button;", "productTotal", "served_with", "unitPrice", "app_release"})
public final class CartBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"cartProducts"})
    public static final void cartProducts(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$cartProducts, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerCartItems items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"cartTotal"})
    public static final void cartTotal(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$cartTotal, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerCartItems items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"served_with"})
    public static final void served_with(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$served_with, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productImage"})
    public static final void productImage(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView $this$productImage, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productName"})
    public static final void productName(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$productName, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productQuantity"})
    public static final void productQuantity(@org.jetbrains.annotations.NotNull()
    android.widget.Button $this$productQuantity, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"unitPrice"})
    public static final void unitPrice(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$unitPrice, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productTotal"})
    public static final void productTotal(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$productTotal, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CartItemFromServer item) {
    }
}