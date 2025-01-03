package com.clickEat.ug.screens.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressRecyclerView;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/data/CustomerAddress;", "Lcom/clickEat/ug/screens/checkout/AddressRecyclerView$ViewHolder;", "clickListener", "Lcom/clickEat/ug/screens/checkout/AddressListener;", "editListener", "Lcom/clickEat/ug/screens/checkout/EditLocationListener;", "deleteListener", "Lcom/clickEat/ug/screens/checkout/DeleteLocationListener;", "(Lcom/clickEat/ug/screens/checkout/AddressListener;Lcom/clickEat/ug/screens/checkout/EditLocationListener;Lcom/clickEat/ug/screens/checkout/DeleteLocationListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AddressRecyclerView extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.data.CustomerAddress, com.clickEat.ug.screens.checkout.AddressRecyclerView.ViewHolder> {
    private final com.clickEat.ug.screens.checkout.AddressListener clickListener = null;
    private final com.clickEat.ug.screens.checkout.EditLocationListener editListener = null;
    private final com.clickEat.ug.screens.checkout.DeleteLocationListener deleteListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.checkout.AddressRecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.AddressRecyclerView.ViewHolder holder, int position) {
    }
    
    public AddressRecyclerView(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.AddressListener clickListener, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.EditLocationListener editListener, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.checkout.DeleteLocationListener deleteListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressRecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/AddressItemLayoutBinding;", "(Lcom/clickEat/ug/databinding/AddressItemLayoutBinding;)V", "getBinding", "()Lcom/clickEat/ug/databinding/AddressItemLayoutBinding;", "bind", "", "item", "Lcom/clickEat/ug/data/CustomerAddress;", "clickListener", "Lcom/clickEat/ug/screens/checkout/AddressListener;", "editListener", "Lcom/clickEat/ug/screens/checkout/EditLocationListener;", "deleteListener", "Lcom/clickEat/ug/screens/checkout/DeleteLocationListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.AddressItemLayoutBinding binding = null;
        public static final com.clickEat.ug.screens.checkout.AddressRecyclerView.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.CustomerAddress item, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.checkout.AddressListener clickListener, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.checkout.EditLocationListener editListener, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.checkout.DeleteLocationListener deleteListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.AddressItemLayoutBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.AddressItemLayoutBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/checkout/AddressRecyclerView$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/checkout/AddressRecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.checkout.AddressRecyclerView.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}