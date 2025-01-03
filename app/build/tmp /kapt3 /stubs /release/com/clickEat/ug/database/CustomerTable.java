package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Entity(tableName = "customer_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014Jp\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001b\u00a8\u00067"}, d2 = {"Lcom/clickEat/ug/database/CustomerTable;", "", "customer_id", "", "names", "", "email", "contact", "second_contact", "date_of_reg", "account_active", "", "token", "cart_size", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getAccount_active", "()Z", "setAccount_active", "(Z)V", "getCart_size", "()Ljava/lang/Integer;", "setCart_size", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getContact", "()Ljava/lang/String;", "setContact", "(Ljava/lang/String;)V", "getCustomer_id", "()I", "getDate_of_reg", "setDate_of_reg", "getEmail", "setEmail", "getNames", "setNames", "getSecond_contact", "setSecond_contact", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/clickEat/ug/database/CustomerTable;", "equals", "other", "hashCode", "toString", "app_release"})
public final class CustomerTable {
    @androidx.room.ColumnInfo(name = "customer_id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int customer_id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "customer_names")
    private java.lang.String names;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "contact")
    private java.lang.String contact;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "second_contact")
    private java.lang.String second_contact;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "date_of_reg")
    private java.lang.String date_of_reg;
    @androidx.room.ColumnInfo(name = "account_active")
    private boolean account_active;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "token")
    private java.lang.String token;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cart_size")
    private java.lang.Integer cart_size;
    
    public final int getCustomer_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNames() {
        return null;
    }
    
    public final void setNames(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecond_contact() {
        return null;
    }
    
    public final void setSecond_contact(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_of_reg() {
        return null;
    }
    
    public final void setDate_of_reg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getAccount_active() {
        return false;
    }
    
    public final void setAccount_active(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCart_size() {
        return null;
    }
    
    public final void setCart_size(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public CustomerTable(int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String names, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.Nullable()
    java.lang.String second_contact, @org.jetbrains.annotations.NotNull()
    java.lang.String date_of_reg, boolean account_active, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cart_size) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.CustomerTable copy(int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String names, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.Nullable()
    java.lang.String second_contact, @org.jetbrains.annotations.NotNull()
    java.lang.String date_of_reg, boolean account_active, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cart_size) {
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