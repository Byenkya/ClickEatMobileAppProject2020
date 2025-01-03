package com.clickEat.ug.screens.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u0005*\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u0005*\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0005*\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0005*\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u0005*\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u0005*\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u0016"}, d2 = {"itemActualPrice", "", "item", "Lcom/clickEat/ug/data/Product;", "foodItems", "", "Landroidx/recyclerview/widget/RecyclerView;", "data", "Lcom/clickEat/ug/data/SubCategory;", "formatWithThousandComma", "", "", "itemDesc", "Landroid/widget/TextView;", "itemName", "itemPrice", "productAvailable", "productImage", "Landroid/widget/ImageView;", "subCategoreis", "", "subCategoryName", "app_release"})
public final class MenuBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"itemName"})
    public static final void itemName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$itemName, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productAvailable"})
    public static final void productAvailable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$productAvailable, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"itemDesc"})
    public static final void itemDesc(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$itemDesc, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"itemPrice"})
    public static final void itemPrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$itemPrice, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    private static final java.lang.CharSequence itemActualPrice(com.clickEat.ug.data.Product item) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"productImage"})
    public static final void productImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$productImage, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"subCategories"})
    public static final void subCategoreis(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$subCategoreis, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.SubCategory> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"menuItems"})
    public static final void foodItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$foodItems, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.SubCategory data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"subCategoryName"})
    public static final void subCategoryName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$subCategoryName, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.SubCategory data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatWithThousandComma(int $this$formatWithThousandComma) {
        return null;
    }
}