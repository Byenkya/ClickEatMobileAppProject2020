package com.clickEat.ug.screens.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/clickEat/ug/screens/menu/MenuAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/data/SubCategory;", "Lcom/clickEat/ug/screens/menu/MenuAdapter$ViewHolder;", "viewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/MainActivityViewModel;Landroidx/fragment/app/Fragment;Landroid/graphics/Rect;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MenuAdapter extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.data.SubCategory, com.clickEat.ug.screens.menu.MenuAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.MainActivityViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect rect = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.clickEat.ug.screens.menu.MenuAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.menu.MenuAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.MainActivityViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Rect getRect() {
        return null;
    }
    
    public MenuAdapter(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.MainActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/clickEat/ug/screens/menu/MenuAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/MenuCustomLayoutBinding;", "viewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/databinding/MenuCustomLayoutBinding;Lcom/clickEat/ug/MainActivityViewModel;Landroidx/fragment/app/Fragment;Landroid/graphics/Rect;)V", "getBinding", "()Lcom/clickEat/ug/databinding/MenuCustomLayoutBinding;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "bind", "", "item", "Lcom/clickEat/ug/data/SubCategory;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.MenuCustomLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.MainActivityViewModel viewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Rect rect = null;
        public static final com.clickEat.ug.screens.menu.MenuAdapter.ViewHolder.Companion Companion = null;
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.SubCategory item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.MenuCustomLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.MainActivityViewModel getViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getRect() {
            return null;
        }
        
        private ViewHolder(com.clickEat.ug.databinding.MenuCustomLayoutBinding binding, com.clickEat.ug.MainActivityViewModel viewModel, androidx.fragment.app.Fragment fragment, android.graphics.Rect rect) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/clickEat/ug/screens/menu/MenuAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/menu/MenuAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "rect", "Landroid/graphics/Rect;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.menu.MenuAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.MainActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect rect) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}