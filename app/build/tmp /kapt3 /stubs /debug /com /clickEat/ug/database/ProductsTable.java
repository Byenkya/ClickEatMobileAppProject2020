package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Entity(tableName = "products_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0010H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0010H\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\u00be\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001a\u00a8\u0006D"}, d2 = {"Lcom/clickEat/ug/database/ProductsTable;", "", "product_id", "", "productName", "", "productPicture", "description", "price", "restaurantId", "restaurantName", "brandId", "brandName", "sub_category_id", "sub_category", "promotional_price_set", "", "promotional_price", "headsup", "served_with", "free_delivery", "available", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAvailable", "()Z", "getBrandId", "()I", "getBrandName", "()Ljava/lang/String;", "getDescription", "getFree_delivery", "getHeadsup", "getPrice", "getProductName", "getProductPicture", "getProduct_id", "getPromotional_price", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromotional_price_set", "getRestaurantId", "getRestaurantName", "getServed_with", "getSub_category", "getSub_category_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/clickEat/ug/database/ProductsTable;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProductsTable {
    @androidx.room.ColumnInfo(name = "product_id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int product_id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_name")
    private final java.lang.String productName = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_picture")
    private final java.lang.String productPicture = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "price")
    private final java.lang.String price = null;
    @androidx.room.ColumnInfo(name = "restaurant_id")
    private final int restaurantId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "restaurant_name")
    private final java.lang.String restaurantName = null;
    @androidx.room.ColumnInfo(name = "brand_id")
    private final int brandId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "brand_name")
    private final java.lang.String brandName = null;
    @androidx.room.ColumnInfo(name = "sub_category_id")
    private final int sub_category_id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sub_category")
    private final java.lang.String sub_category = null;
    @androidx.room.ColumnInfo(name = "promotional_price_set")
    private final boolean promotional_price_set = false;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "promotional_price")
    private final java.lang.Integer promotional_price = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "headsup")
    private final java.lang.String headsup = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "served_with")
    private final java.lang.String served_with = null;
    @androidx.room.ColumnInfo(name = "free_delivery")
    private final boolean free_delivery = false;
    @androidx.room.ColumnInfo(name = "available")
    private final boolean available = false;
    
    public final int getProduct_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final int getRestaurantId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurantName() {
        return null;
    }
    
    public final int getBrandId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrandName() {
        return null;
    }
    
    public final int getSub_category_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSub_category() {
        return null;
    }
    
    public final boolean getPromotional_price_set() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPromotional_price() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeadsup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServed_with() {
        return null;
    }
    
    public final boolean getFree_delivery() {
        return false;
    }
    
    public final boolean getAvailable() {
        return false;
    }
    
    public ProductsTable(int product_id, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPicture, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String price, int restaurantId, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantName, int brandId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, int sub_category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String sub_category, boolean promotional_price_set, @org.jetbrains.annotations.Nullable()
    java.lang.Integer promotional_price, @org.jetbrains.annotations.Nullable()
    java.lang.String headsup, @org.jetbrains.annotations.NotNull()
    java.lang.String served_with, boolean free_delivery, boolean available) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.ProductsTable copy(int product_id, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPicture, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String price, int restaurantId, @org.jetbrains.annotations.NotNull()
    java.lang.String restaurantName, int brandId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, int sub_category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String sub_category, boolean promotional_price_set, @org.jetbrains.annotations.Nullable()
    java.lang.Integer promotional_price, @org.jetbrains.annotations.Nullable()
    java.lang.String headsup, @org.jetbrains.annotations.NotNull()
    java.lang.String served_with, boolean free_delivery, boolean available) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}