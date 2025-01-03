package com.clickEat.ug.screens.resturants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\f"}, d2 = {"restaurantImage", "", "Landroid/widget/ImageView;", "data", "Lcom/clickEat/ug/data/Restaurant;", "restaurants", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/clickEat/ug/data/ClickEatRestaurants;", "setIcon", "item", "setTitle", "Landroid/widget/TextView;", "app_release"})
public final class ResturantBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"rest_name"})
    public static final void setTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTitle, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Restaurant item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"rest_logo"})
    public static final void setIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setIcon, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Restaurant item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"restaurants"})
    public static final void restaurants(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$restaurants, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ClickEatRestaurants data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"restaurantImage"})
    public static final void restaurantImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$restaurantImage, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Restaurant data) {
    }
}