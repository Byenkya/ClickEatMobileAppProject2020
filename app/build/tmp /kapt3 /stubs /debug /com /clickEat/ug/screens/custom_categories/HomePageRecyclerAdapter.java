package com.clickEat.ug.screens.custom_categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007 !\"#$%&B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/clickEat/ug/screens/custom_categories/AllHomeProducts;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "fragment", "Landroidx/fragment/app/Fragment;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "(Landroidx/fragment/app/Fragment;Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;Lcom/clickEat/ug/MainActivityViewModel;Landroid/graphics/Rect;)V", "getCategoriesViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "Companion", "ViewHolder1", "ViewHolder2", "ViewHolder3", "ViewHolder4", "ViewHolder5", "ViewHolder6", "app_debug"})
public final class HomePageRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.clickEat.ug.screens.custom_categories.AllHomeProducts, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.MainActivityViewModel userViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect rect = null;
    public static final int VIEW_TYPE_COROUSEL = 0;
    public static final int VIEW_TYPE_SUBCATEGORY = 1;
    public static final int VIEW_TYPE_DEALOFTHEDAY = 2;
    public static final int VIEW_TYPE_TOPCATEGORIES = 3;
    public static final int VIEW_TYPE_SAMPLE_PRODUCTS = 4;
    public static final int VIEW_TYPE_MORE_PRODUCTS = 5;
    public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getCategoriesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Rect getRect() {
        return null;
    }
    
    public HomePageRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.MainActivityViewModel userViewModel, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder1;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/CorouselViewLayoutBinding;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lcom/clickEat/ug/databinding/CorouselViewLayoutBinding;Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;Landroidx/fragment/app/Fragment;)V", "getBinding", "()Lcom/clickEat/ug/databinding/CorouselViewLayoutBinding;", "getCategoriesViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getFragment", "()Landroidx/fragment/app/Fragment;", "bind", "", "Companion", "app_debug"})
    public static final class ViewHolder1 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.CorouselViewLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder1.Companion Companion = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.CorouselViewLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getCategoriesViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        private ViewHolder1(com.clickEat.ug.databinding.CorouselViewLayoutBinding binding, com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder1$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder1;", "parent", "Landroid/view/ViewGroup;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder1 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder2;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/HomeSubCategoriesLayoutBinding;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lcom/clickEat/ug/databinding/HomeSubCategoriesLayoutBinding;Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;Landroidx/fragment/app/Fragment;)V", "getBinding", "()Lcom/clickEat/ug/databinding/HomeSubCategoriesLayoutBinding;", "getCategoriesViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getFragment", "()Landroidx/fragment/app/Fragment;", "bind", "", "Companion", "app_debug"})
    public static final class ViewHolder2 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.HomeSubCategoriesLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder2.Companion Companion = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.HomeSubCategoriesLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getCategoriesViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        private ViewHolder2(com.clickEat.ug.databinding.HomeSubCategoriesLayoutBinding binding, com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder2$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder2;", "parent", "Landroid/view/ViewGroup;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder2 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder3;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/DealsOfTheDayLayoutBinding;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/databinding/DealsOfTheDayLayoutBinding;Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;Landroidx/fragment/app/Fragment;Lcom/clickEat/ug/MainActivityViewModel;Landroid/graphics/Rect;)V", "getBinding", "()Lcom/clickEat/ug/databinding/DealsOfTheDayLayoutBinding;", "getCategoriesViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "bind", "", "Companion", "app_debug"})
    public static final class ViewHolder3 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.DealsOfTheDayLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.MainActivityViewModel userViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Rect rect = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder3.Companion Companion = null;
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.DealsOfTheDayLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getCategoriesViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getRect() {
            return null;
        }
        
        private ViewHolder3(com.clickEat.ug.databinding.DealsOfTheDayLayoutBinding binding, com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, androidx.fragment.app.Fragment fragment, com.clickEat.ug.MainActivityViewModel userViewModel, android.graphics.Rect rect) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder3$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder3;", "parent", "Landroid/view/ViewGroup;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder3 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.MainActivityViewModel userViewModel, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect rect) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder4;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/TopCategoryItemLayoutBinding;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lcom/clickEat/ug/databinding/TopCategoryItemLayoutBinding;Landroidx/fragment/app/Fragment;)V", "getBinding", "()Lcom/clickEat/ug/databinding/TopCategoryItemLayoutBinding;", "getFragment", "()Landroidx/fragment/app/Fragment;", "bind", "", "Companion", "app_debug"})
    public static final class ViewHolder4 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.TopCategoryItemLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder4.Companion Companion = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.TopCategoryItemLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        private ViewHolder4(com.clickEat.ug.databinding.TopCategoryItemLayoutBinding binding, androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder4$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder4;", "parent", "Landroid/view/ViewGroup;", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder4 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder5;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/SampleProductsFromDifferentSubcatLayoutBinding;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/databinding/SampleProductsFromDifferentSubcatLayoutBinding;Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;Landroidx/fragment/app/Fragment;Lcom/clickEat/ug/MainActivityViewModel;Landroid/graphics/Rect;)V", "getBinding", "()Lcom/clickEat/ug/databinding/SampleProductsFromDifferentSubcatLayoutBinding;", "getCategoriesViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "bind", "", "Companion", "app_debug"})
    public static final class ViewHolder5 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.SampleProductsFromDifferentSubcatLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.MainActivityViewModel userViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Rect rect = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder5.Companion Companion = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.SampleProductsFromDifferentSubcatLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getCategoriesViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getRect() {
            return null;
        }
        
        private ViewHolder5(com.clickEat.ug.databinding.SampleProductsFromDifferentSubcatLayoutBinding binding, com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, androidx.fragment.app.Fragment fragment, com.clickEat.ug.MainActivityViewModel userViewModel, android.graphics.Rect rect) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder5$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder5;", "parent", "Landroid/view/ViewGroup;", "categoriesViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder5 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.screens.custom_categories.CategoriesViewModel categoriesViewModel, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.MainActivityViewModel userViewModel, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect rect) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder6;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/clickEat/ug/databinding/MoreProductsLayoutBinding;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "(Lcom/clickEat/ug/databinding/MoreProductsLayoutBinding;Landroidx/fragment/app/Fragment;Lcom/clickEat/ug/MainActivityViewModel;Landroid/graphics/Rect;)V", "getBinding", "()Lcom/clickEat/ug/databinding/MoreProductsLayoutBinding;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRect", "()Landroid/graphics/Rect;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "bind", "", "product", "Lcom/clickEat/ug/data/Product;", "Companion", "app_debug"})
    public static final class ViewHolder6 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.databinding.MoreProductsLayoutBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        @org.jetbrains.annotations.NotNull()
        private final com.clickEat.ug.MainActivityViewModel userViewModel = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Rect rect = null;
        public static final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder6.Companion Companion = null;
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.clickEat.ug.data.Product product) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.databinding.MoreProductsLayoutBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getRect() {
            return null;
        }
        
        private ViewHolder6(com.clickEat.ug.databinding.MoreProductsLayoutBinding binding, androidx.fragment.app.Fragment fragment, com.clickEat.ug.MainActivityViewModel userViewModel, android.graphics.Rect rect) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder6$Companion;", "", "()V", "from", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$ViewHolder6;", "parent", "Landroid/view/ViewGroup;", "fragment", "Landroidx/fragment/app/Fragment;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "rect", "Landroid/graphics/Rect;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter.ViewHolder6 from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
            com.clickEat.ug.MainActivityViewModel userViewModel, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect rect) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter$Companion;", "", "()V", "VIEW_TYPE_COROUSEL", "", "VIEW_TYPE_DEALOFTHEDAY", "VIEW_TYPE_MORE_PRODUCTS", "VIEW_TYPE_SAMPLE_PRODUCTS", "VIEW_TYPE_SUBCATEGORY", "VIEW_TYPE_TOPCATEGORIES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}