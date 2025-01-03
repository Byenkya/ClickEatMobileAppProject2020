package com.clickEat.ug.screens.drinks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/clickEat/ug/screens/drinks/DrinksRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/data/DrinkSubCategories;", "Lcom/clickEat/ug/screens/drinks/DrinksRecyclerAdapter$ViewHolder;", "drinksListener", "Lcom/clickEat/ug/screens/drinks/OnClickDrinkListener;", "(Lcom/clickEat/ug/screens/drinks/OnClickDrinkListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class DrinksRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.data.DrinkSubCategories, com.clickEat.ug.screens.drinks.DrinksRecyclerAdapter.ViewHolder> {
    private final com.clickEat.ug.screens.drinks.OnClickDrinkListener drinksListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.drinks.DrinksRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.drinks.DrinksRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    public DrinksRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.drinks.OnClickDrinkListener drinksListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/clickEat/ug/screens/drinks/DrinksRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/DrinksSubcatitemLayoutBinding;", "(Lcom/clickEat/ug/databinding/DrinksSubcatitemLayoutBinding;)V", "getBinding", "()Lcom/clickEat/ug/databinding/DrinksSubcatitemLayoutBinding;", "bind", "", "item", "Lcom/clickEat/ug/data/DrinkSubCategories;", "drinksListener", "Lcom/clickEat/ug/screens/drinks/OnClickDrinkListener;", "Companion", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.DrinksSubcatitemLayoutBinding binding = null;
        public static final com.clickEat.ug.screens.drinks.DrinksRecyclerAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.DrinkSubCategories item, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.drinks.OnClickDrinkListener drinksListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.DrinksSubcatitemLayoutBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.DrinksSubcatitemLayoutBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/drinks/DrinksRecyclerAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/drinks/DrinksRecyclerAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_release"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.drinks.DrinksRecyclerAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}