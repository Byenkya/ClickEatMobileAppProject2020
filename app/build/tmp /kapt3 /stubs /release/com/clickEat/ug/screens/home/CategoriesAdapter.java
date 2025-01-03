package com.clickEat.ug.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/clickEat/ug/screens/home/CategoriesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/clickEat/ug/screens/home/CategoriesAdapter$ViewHolder;", "categories", "", "clickListener", "Lcom/clickEat/ug/screens/home/CategoriesListener;", "(Ljava/util/List;Lcom/clickEat/ug/screens/home/CategoriesListener;)V", "getCategories", "()Ljava/util/List;", "getClickListener", "()Lcom/clickEat/ug/screens/home/CategoriesListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class CategoriesAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.String, com.clickEat.ug.screens.home.CategoriesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.screens.home.CategoriesListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.home.CategoriesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.home.CategoriesAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.screens.home.CategoriesListener getClickListener() {
        return null;
    }
    
    public CategoriesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.home.CategoriesListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/clickEat/ug/screens/home/CategoriesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/CustomCategoriesLayoutBinding;", "(Lcom/clickEat/ug/databinding/CustomCategoriesLayoutBinding;)V", "getBinding", "()Lcom/clickEat/ug/databinding/CustomCategoriesLayoutBinding;", "bind", "", "item", "", "clickListener", "Lcom/clickEat/ug/screens/home/CategoriesListener;", "Companion", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.CustomCategoriesLayoutBinding binding = null;
        public static final com.clickEat.ug.screens.home.CategoriesAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String item, @org.jetbrains.annotations.NotNull()
        com.clickEat.ug.screens.home.CategoriesListener clickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.CustomCategoriesLayoutBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.CustomCategoriesLayoutBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/clickEat/ug/screens/home/CategoriesAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/home/CategoriesAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_release"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.home.CategoriesAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}