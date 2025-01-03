package com.clickEat.ug.data;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0016J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\t\u00107\u001a\u00020\u0010H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\u00bc\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c\u00a8\u0006M"}, d2 = {"Lcom/clickEat/ug/data/Product;", "Landroid/os/Parcelable;", "product_id", "", "product_name", "", "product_picture", "description", "price", "restaurant_id", "restaurant_name", "brand_id", "brand_name", "sub_category_id", "sub_category", "promotional_price_set", "", "promotional_price", "headsup", "served_with", "free_delivery", "available", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAvailable", "()Z", "setAvailable", "(Z)V", "getBrand_id", "()I", "getBrand_name", "()Ljava/lang/String;", "getDescription", "getFree_delivery", "getHeadsup", "getPrice", "getProduct_id", "getProduct_name", "getProduct_picture", "getPromotional_price", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromotional_price_set", "getRestaurant_id", "getRestaurant_name", "getServed_with", "getSub_category", "getSub_category_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/clickEat/ug/data/Product;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class Product implements android.os.Parcelable {
    private final int product_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String product_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String product_picture = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price = null;
    private final int restaurant_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String restaurant_name = null;
    private final int brand_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String brand_name = null;
    private final int sub_category_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sub_category = null;
    private final boolean promotional_price_set = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer promotional_price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String headsup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String served_with = null;
    private final boolean free_delivery = false;
    private boolean available;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final int getProduct_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct_picture() {
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
    
    public final int getRestaurant_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestaurant_name() {
        return null;
    }
    
    public final int getBrand_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrand_name() {
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
    
    public final void setAvailable(boolean p0) {
    }
    
    public Product(int product_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_picture, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @com.squareup.moshi.Json(name = "resturant_id")
    int restaurant_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "resturant")
    java.lang.String restaurant_name, int brand_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "brand")
    java.lang.String brand_name, int sub_category_id, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
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
    public final com.clickEat.ug.data.Product copy(int product_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_picture, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @com.squareup.moshi.Json(name = "resturant_id")
    int restaurant_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "resturant")
    java.lang.String restaurant_name, int brand_id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "brand")
    java.lang.String brand_name, int sub_category_id, @org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}