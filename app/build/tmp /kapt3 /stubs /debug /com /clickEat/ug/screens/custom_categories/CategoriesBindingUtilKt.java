package com.clickEat.ug.screens.custom_categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bH\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0007\u001a\u001c\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bH\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0007\u001a\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u0016\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u0001*\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0007\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0007\u00a8\u0006\u001a"}, d2 = {"SubCatImage", "", "Landroid/widget/ImageView;", "data", "Lcom/clickEat/ug/data/HomeSubCategoryDisplay;", "carouselView", "Lcom/synnapps/carouselview/CarouselView;", "item", "", "Lcom/clickEat/ug/data/HomeImages;", "cat", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/clickEat/ug/data/HomePageInfo;", "homeItems", "moreProducts", "Lcom/clickEat/ug/data/Product;", "sample", "Lcom/clickEat/ug/screens/custom_categories/AllHomeProducts;", "searchedProducts", "subCatHomeName", "Landroid/widget/TextView;", "subCatText", "subCategoryLayoutFragmentBinding", "sub_cat", "title", "topDealsOfTheDay", "app_debug"})
public final class CategoriesBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"title"})
    public static final void title(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$title, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.HomePageInfo data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"subCatHomeName"})
    public static final void subCatHomeName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$subCatHomeName, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.HomeSubCategoryDisplay data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"SubCatImage"})
    public static final void SubCatImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$SubCatImage, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeSubCategoryDisplay data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"subCatText"})
    public static final void subCatText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$subCatText, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.HomeSubCategoryDisplay data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"cat"})
    public static final void cat(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$cat, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.HomePageInfo> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sub_cat"})
    public static final void sub_cat(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$sub_cat, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"subCategoryLayoutFragmentBinding"})
    public static final void subCategoryLayoutFragmentBinding(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$subCategoryLayoutFragmentBinding, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"homeItems"})
    public static final void homeItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$homeItems, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.HomePageInfo data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"searchedProducts"})
    public static final void searchedProducts(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$searchedProducts, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.Product> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"topDealsOfTheDay"})
    public static final void topDealsOfTheDay(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$topDealsOfTheDay, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.Product> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"moreProducts"})
    public static final void moreProducts(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$moreProducts, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.Product> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"homeProductsAdapter"})
    public static final void sample(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$sample, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.clickEat.ug.screens.custom_categories.AllHomeProducts> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"carouselView"})
    public static final void carouselView(@org.jetbrains.annotations.NotNull()
    com.synnapps.carouselview.CarouselView $this$carouselView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.HomeImages> item) {
    }
}