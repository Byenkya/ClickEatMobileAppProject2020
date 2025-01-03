package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Entity(tableName = "cart_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/clickEat/ug/database/CartTable;", "", "product_id", "", "customer_id", "product_name", "", "product_image", "unit_price", "quantity", "served_with", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomer_id", "()I", "getProduct_id", "getProduct_image", "()Ljava/lang/String;", "getProduct_name", "getQuantity", "setQuantity", "(Ljava/lang/String;)V", "getServed_with", "setServed_with", "getUnit_price", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class CartTable {
    @androidx.room.ColumnInfo(name = "product_id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int product_id = 0;
    @androidx.room.ColumnInfo(name = "customer_id")
    private final int customer_id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_name")
    private final java.lang.String product_name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_image")
    private final java.lang.String product_image = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "unit_price")
    private final java.lang.String unit_price = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "quantity")
    private java.lang.String quantity;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "served_with")
    private java.lang.String served_with;
    
    public final int getProduct_id() {
        return 0;
    }
    
    public final int getCustomer_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct_image() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServed_with() {
        return null;
    }
    
    public final void setServed_with(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CartTable(int product_id, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_image, @org.jetbrains.annotations.NotNull()
    java.lang.String unit_price, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String served_with) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.CartTable copy(int product_id, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_image, @org.jetbrains.annotations.NotNull()
    java.lang.String unit_price, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String served_with) {
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