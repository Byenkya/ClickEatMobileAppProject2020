package com.clickEat.ug.screens.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\f"}, d2 = {"commentDate", "", "Landroid/widget/TextView;", "item", "Lcom/clickEat/ug/data/ServerComment;", "commentValue", "customerNames", "productComments", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "reply", "app_release"})
public final class CommentBindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"productComments"})
    public static final void productComments(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$productComments, @org.jetbrains.annotations.Nullable()
    java.util.List<com.clickEat.ug.data.ServerComment> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customerNames"})
    public static final void customerNames(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$customerNames, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ServerComment item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"commentDate"})
    public static final void commentDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$commentDate, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ServerComment item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"commentValue"})
    public static final void commentValue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$commentValue, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ServerComment item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"reply"})
    public static final void reply(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$reply, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ServerComment item) {
    }
}