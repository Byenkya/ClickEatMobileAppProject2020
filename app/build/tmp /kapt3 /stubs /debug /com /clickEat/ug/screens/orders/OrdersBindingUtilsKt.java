package com.clickEat.ug.screens.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\n"}, d2 = {"allOrders", "", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/clickEat/ug/data/CustomerPlaceOrder;", "orderDate", "Landroid/widget/TextView;", "item", "orderRef", "app_debug"})
public final class OrdersBindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"allOrders"})
    public static final void allOrders(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$allOrders, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.CustomerPlaceOrder> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"orderRef"})
    public static final void orderRef(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$orderRef, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerPlaceOrder item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"orderDate"})
    public static final void orderDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$orderDate, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.CustomerPlaceOrder item) {
    }
}