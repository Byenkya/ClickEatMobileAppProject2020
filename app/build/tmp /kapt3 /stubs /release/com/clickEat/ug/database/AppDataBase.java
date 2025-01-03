package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Database(entities = {com.clickEat.ug.database.HomeTitleCatTable.class, com.clickEat.ug.database.CartTable.class, com.clickEat.ug.database.CustomerTable.class, com.clickEat.ug.database.RestaurantsTable.class, com.clickEat.ug.database.SubDrinksTable.class, com.clickEat.ug.database.HomeProductsTable.class, com.clickEat.ug.database.ProductsTable.class, com.clickEat.ug.database.HomeImagesTable.class, com.clickEat.ug.database.HomeSubCategoriesTable.class, com.clickEat.ug.database.MoreProductsTable.class, com.clickEat.ug.database.TopSellingProductsTable.class}, version = 6, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/clickEat/ug/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "databaseDao", "Lcom/clickEat/ug/database/DatabaseDao;", "getDatabaseDao", "()Lcom/clickEat/ug/database/DatabaseDao;", "Companion", "app_release"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    private static volatile com.clickEat.ug.database.AppDataBase INSTANCE;
    public static final com.clickEat.ug.database.AppDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.clickEat.ug.database.DatabaseDao getDatabaseDao();
    
    public AppDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/clickEat/ug/database/AppDataBase$Companion;", "", "()V", "INSTANCE", "Lcom/clickEat/ug/database/AppDataBase;", "getInstance", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.clickEat.ug.database.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}