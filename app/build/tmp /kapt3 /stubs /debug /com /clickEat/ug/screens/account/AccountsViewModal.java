package com.clickEat.ug.screens.account;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010$\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001eH\u0002J\b\u0010\'\u001a\u00020#H\u0014J!\u0010(\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020)R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/clickEat/ug/screens/account/AccountsViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "customer", "Lcom/clickEat/ug/data/Customer;", "app", "Landroid/app/Application;", "(Lcom/clickEat/ug/data/Customer;Landroid/app/Application;)V", "_accountInformation", "Landroidx/lifecycle/MutableLiveData;", "_addresses", "", "Lcom/clickEat/ug/data/CustomerAddress;", "accountInformation", "Landroidx/lifecycle/LiveData;", "getAccountInformation", "()Landroidx/lifecycle/LiveData;", "addresses", "getAddresses", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/clickEat/ug/database/DatabaseDao;", "getDatabase", "()Lcom/clickEat/ug/database/DatabaseDao;", "setDatabase", "(Lcom/clickEat/ug/database/DatabaseDao;)V", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addAddress", "customerID", "", "customerNewAddress", "Lcom/clickEat/ug/data/CustomerNewAddress;", "(ILcom/clickEat/ug/data/CustomerNewAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAddress", "", "customer_id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerAddresses", "onCleared", "updateCustomer", "Lcom/clickEat/ug/data/UpdateCustomer;", "(ILcom/clickEat/ug/data/UpdateCustomer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCustomerInformation", "app_debug"})
public final class AccountsViewModal extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private com.clickEat.ug.database.DatabaseDao database;
    private androidx.lifecycle.MutableLiveData<com.clickEat.ug.data.Customer> _accountInformation;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.CustomerAddress>> _addresses;
    
    @org.jetbrains.annotations.NotNull()
    public final com.clickEat.ug.database.DatabaseDao getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.database.DatabaseDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.clickEat.ug.data.Customer> getAccountInformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.CustomerAddress>> getAddresses() {
        return null;
    }
    
    private final void getCustomerAddresses(int customer_id) {
    }
    
    public final void updateCustomerInformation(int customerID, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.UpdateCustomer customer) {
    }
    
    public final void addNewAddress(int customerID, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.CustomerNewAddress customerNewAddress) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public AccountsViewModal(@org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Customer customer, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}