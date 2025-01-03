package com.clickEat.ug.database;

import java.lang.System;

@androidx.room.Entity(tableName = "restaurants_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0014H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\u00ab\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0013\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017\u00a8\u0006>"}, d2 = {"Lcom/clickEat/ug/database/RestaurantsTable;", "", "restaurant_id", "", "businessName", "", "businessProfilePicture", "address", "email", "contact", "secondContact", "location", "description", "admin_names", "admin_username", "admin_email", "admin_telephone", "operation_start_time", "operation_stop_time", "operational_status", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddress", "()Ljava/lang/String;", "getAdmin_email", "getAdmin_names", "getAdmin_telephone", "getAdmin_username", "getBusinessName", "getBusinessProfilePicture", "getContact", "getDescription", "getEmail", "getLocation", "getOperation_start_time", "getOperation_stop_time", "getOperational_status", "()Z", "getRestaurant_id", "()I", "getSecondContact", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"})
public final class RestaurantsTable {
    @androidx.room.ColumnInfo(name = "restuarant_id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int restaurant_id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "business_name")
    private final java.lang.String businessName = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "business_profile_picture")
    private final java.lang.String businessProfilePicture = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "address")
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "contact")
    private final java.lang.String contact = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "second_contact")
    private final java.lang.String secondContact = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location")
    private final java.lang.String location = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "admin_names")
    private final java.lang.String admin_names = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "admin_username")
    private final java.lang.String admin_username = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "admin_email")
    private final java.lang.String admin_email = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "admin_telephone")
    private final java.lang.String admin_telephone = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "operation_start_time")
    private final java.lang.String operation_start_time = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "operation_stop_time")
    private final java.lang.String operation_stop_time = null;
    @androidx.room.ColumnInfo(name = "operation_status")
    private final boolean operational_status = false;
    
    public final int getRestaurant_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBusinessName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBusinessProfilePicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecondContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdmin_names() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdmin_username() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdmin_email() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdmin_telephone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOperation_start_time() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOperation_stop_time() {
        return null;
    }
    
    public final boolean getOperational_status() {
        return false;
    }
    
    public RestaurantsTable(int restaurant_id, @org.jetbrains.annotations.NotNull()
    java.lang.String businessName, @org.jetbrains.annotations.Nullable()
    java.lang.String businessProfilePicture, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.NotNull()
    java.lang.String secondContact, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_names, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_username, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_email, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_telephone, @org.jetbrains.annotations.NotNull()
    java.lang.String operation_start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String operation_stop_time, boolean operational_status) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.RestaurantsTable copy(int restaurant_id, @org.jetbrains.annotations.NotNull()
    java.lang.String businessName, @org.jetbrains.annotations.Nullable()
    java.lang.String businessProfilePicture, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.NotNull()
    java.lang.String secondContact, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_names, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_username, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_email, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_telephone, @org.jetbrains.annotations.NotNull()
    java.lang.String operation_start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String operation_stop_time, boolean operational_status) {
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