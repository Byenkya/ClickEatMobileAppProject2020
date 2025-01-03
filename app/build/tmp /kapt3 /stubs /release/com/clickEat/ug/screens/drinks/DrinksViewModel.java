package com.clickEat.ug.screens.drinks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/clickEat/ug/screens/drinks/DrinksViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/clickEat/ug/database/AppDataBase;", "getDatabase", "()Lcom/clickEat/ug/database/AppDataBase;", "drink", "Landroidx/lifecycle/LiveData;", "Lcom/clickEat/ug/data/ClickEatDrinksSubCategories;", "getDrink", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/clickEat/ug/network/DataRepository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "onCleared", "", "app_release"})
public final class DrinksViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.clickEat.ug.database.AppDataBase database = null;
    private final com.clickEat.ug.network.DataRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> drink = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.AppDataBase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> getDrink() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public DrinksViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}