package com.clickEat.ug.screens.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/clickEat/ug/screens/menu/FoodItemAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/data/Product;", "Lcom/clickEat/ug/screens/menu/FoodItemAdapter$ViewHolder;", "showCart", "Lcom/clickEat/ug/screens/menu/CartInformation;", "onClickListener", "Lcom/clickEat/ug/screens/menu/OnClickListener;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/screens/menu/CartInformation;Lcom/clickEat/ug/screens/menu/OnClickListener;Landroid/graphics/Rect;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class FoodItemAdapter extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.data.Product, com.clickEat.ug.screens.menu.FoodItemAdapter.ViewHolder> {
    private final com.clickEat.ug.screens.menu.CartInformation showCart = null;
    private final com.clickEat.ug.screens.menu.OnClickListener onClickListener = null;
    private final android.graphics.Rect rect = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.menu.FoodItemAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.menu.FoodItemAdapter.ViewHolder holder, int position) {
    }
    
    public FoodItemAdapter(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.menu.CartInformation showCart, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.menu.OnClickListener onClickListener, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/clickEat/ug/screens/menu/FoodItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/ItemBinding;", "(Lcom/clickEat/ug/databinding/ItemBinding;)V", "getBinding", "()Lcom/clickEat/ug/databinding/ItemBinding;", "bind", "", "item", "Lcom/clickEat/ug/data/Product;", "cartInformation", "Lcom/clickEat/ug/screens/menu/CartInformation;", "onClickListener", "Lcom/clickEat/ug/screens/menu/OnClickListener;", "rect", "Landroid/graphics/Rect;", "Companion", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.ItemBinding binding = null;
        public static final com.clickEat.ug.screens.menu.FoodItemAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.Product item, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.menu.CartInformation cartInformation, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.menu.OnClickListener onClickListener, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect rect) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.ItemBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.ItemBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/menu/FoodItemAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/menu/FoodItemAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_release"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.menu.FoodItemAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}