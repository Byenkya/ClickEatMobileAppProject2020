package com.clickEat.ug.screens.custom_categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/clickEat/ug/screens/custom_categories/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/clickEat/ug/screens/custom_categories/HomePageRecyclerAdapter;", "binding", "Lcom/clickEat/ug/databinding/FragmentMainBinding;", "homeViewModel", "Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "getHomeViewModel", "()Lcom/clickEat/ug/screens/custom_categories/CategoriesViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "pastVisibleItems", "", "productsLoading", "", "productsObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/clickEat/ug/screens/custom_categories/AllHomeProducts;", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "totalItemCount", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "visibleItemCount", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private com.clickEat.ug.databinding.FragmentMainBinding binding;
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private final kotlin.Lazy userViewModel$delegate = null;
    private androidx.lifecycle.Observer<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> productsObserver;
    private com.clickEat.ug.screens.custom_categories.HomePageRecyclerAdapter adapter;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    private int pastVisibleItems = 0;
    private boolean productsLoading = true;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.screens.custom_categories.CategoriesViewModel getHomeViewModel() {
        return null;
    }
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public MainFragment() {
        super();
    }
}