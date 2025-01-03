package com.clickEat.ug.screens.rate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u0005*\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u001c\u0010\u000b\u001a\u00020\u0005*\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0005*\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0012\u001a\u00020\u0005*\u00020\u00132\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0005*\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\u0005*\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u0018H\u0007\u00a8\u0006\u0019"}, d2 = {"productActualPrice", "", "item", "Lcom/clickEat/ug/data/Product;", "freeDelivery", "", "Lcom/google/android/material/textview/MaterialTextView;", "itemImage", "Lcom/google/android/material/imageview/ShapeableImageView;", "", "productAvailability", "productCommentsRatingSection", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/clickEat/ug/data/ServerComment;", "productHeadsUp", "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "productPriceValue", "Landroid/widget/TextView;", "productsDisplay", "Lcom/denzcoskun/imageslider/ImageSlider;", "ratingIndicator", "Landroid/widget/LinearLayout;", "Lcom/clickEat/ug/data/ProductRate;", "app_release"})
public final class RatingBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"itemImage"})
    public static final void itemImage(@org.jetbrains.annotations.NotNull()
    com.google.android.material.imageview.ShapeableImageView $this$itemImage, @org.jetbrains.annotations.Nullable()
    java.lang.String item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productsDisplay"})
    public static final void productsDisplay(@org.jetbrains.annotations.NotNull()
    com.denzcoskun.imageslider.ImageSlider $this$productsDisplay, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productPriceValue"})
    public static final void productPriceValue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$productPriceValue, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    private static final java.lang.CharSequence productActualPrice(com.clickEat.ug.data.Product item) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"productHeadsUp"})
    public static final void productHeadsUp(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton $this$productHeadsUp, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"freeDelivery"})
    public static final void freeDelivery(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$freeDelivery, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productAvailability"})
    public static final void productAvailability(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView $this$productAvailability, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Product item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"ratingIndicator"})
    public static final void ratingIndicator(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout $this$ratingIndicator, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ProductRate item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"productComments"})
    public static final void productCommentsRatingSection(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$productCommentsRatingSection, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.ServerComment> data) {
    }
}