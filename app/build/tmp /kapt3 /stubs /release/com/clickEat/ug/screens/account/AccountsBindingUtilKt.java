package com.clickEat.ug.screens.account;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\f"}, d2 = {"contact", "", "Lcom/google/android/material/textfield/TextInputEditText;", "item", "Lcom/clickEat/ug/data/Customer;", "customerEmail", "customerNames", "deliveryAddresses", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Lcom/clickEat/ug/data/ListCustomerAddresses;", "secondContact", "app_release"})
public final class AccountsBindingUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"customerNames"})
    public static final void customerNames(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$customerNames, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Customer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customerEmail"})
    public static final void customerEmail(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$customerEmail, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Customer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contact"})
    public static final void contact(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$contact, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Customer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"secondContact"})
    public static final void secondContact(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$secondContact, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.Customer item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"deliveryAddresses"})
    public static final void deliveryAddresses(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$deliveryAddresses, @org.jetbrains.annotations.Nullable()
    com.clickEat.ug.data.ListCustomerAddresses items) {
    }
}