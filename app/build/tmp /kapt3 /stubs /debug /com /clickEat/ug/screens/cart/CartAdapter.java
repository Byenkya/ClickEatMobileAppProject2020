package com.clickEat.ug.screens.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/clickEat/ug/screens/cart/CartAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/data/CartItemFromServer;", "Lcom/clickEat/ug/screens/cart/CartAdapter$ViewHolder;", "updateCartInformation", "Lcom/clickEat/ug/screens/cart/UpdateCartInformation;", "deleteCartItem", "Lcom/clickEat/ug/screens/cart/DeleteCartItem;", "(Lcom/clickEat/ug/screens/cart/UpdateCartInformation;Lcom/clickEat/ug/screens/cart/DeleteCartItem;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.data.CartItemFromServer, com.clickEat.ug.screens.cart.CartAdapter.ViewHolder> {
    private final com.clickEat.ug.screens.cart.UpdateCartInformation updateCartInformation = null;
    private final com.clickEat.ug.screens.cart.DeleteCartItem deleteCartItem = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.cart.CartAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.cart.CartAdapter.ViewHolder holder, int position) {
    }
    
    public CartAdapter(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.cart.UpdateCartInformation updateCartInformation, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.cart.DeleteCartItem deleteCartItem) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/clickEat/ug/screens/cart/CartAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/CartItemLayoutBinding;", "(Lcom/clickEat/ug/databinding/CartItemLayoutBinding;)V", "getBinding", "()Lcom/clickEat/ug/databinding/CartItemLayoutBinding;", "bind", "", "item", "Lcom/clickEat/ug/data/CartItemFromServer;", "updateCartInfo", "Lcom/clickEat/ug/screens/cart/UpdateCartInformation;", "deleteCartItem", "Lcom/clickEat/ug/screens/cart/DeleteCartItem;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.CartItemLayoutBinding binding = null;
        public static final com.clickEat.ug.screens.cart.CartAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.CartItemFromServer item, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.cart.UpdateCartInformation updateCartInfo, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.cart.DeleteCartItem deleteCartItem) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.CartItemLayoutBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.CartItemLayoutBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/cart/CartAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/cart/CartAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.cart.CartAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}