package com.clickEat.ug.screens.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J \u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J&\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0010\u0010Q\u001a\u00020C2\u0006\u0010R\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020CH\u0016J\"\u0010W\u001a\u00020C2\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\b\u0010\\\u001a\u00020CH\u0002J\b\u0010]\u001a\u000205H\u0002J\n\u0010^\u001a\u0004\u0018\u00010UH\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001a\u0010(\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u000e\u0010@\u001a\u00020AX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"}, d2 = {"Lcom/clickEat/ug/screens/checkout/CheckoutFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/clickEat/ug/screens/checkout/AddressDialog$AddressSelectedListener;", "Lcom/stepstone/stepper/Step;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "()V", "addressId", "", "Ljava/lang/Integer;", "binding", "Lcom/clickEat/ug/databinding/FragmentCheckoutBinding;", "cal", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "checkOutViewModel", "Lcom/clickEat/ug/screens/checkout/CheckOutViewModel;", "customerId", "deliveryAddress", "Lcom/clickEat/ug/data/CustomerNewAddress;", "hour", "getHour", "()I", "setHour", "(I)V", "minute", "getMinute", "setMinute", "myDay", "getMyDay", "setMyDay", "myHour", "getMyHour", "setMyHour", "myMinute", "getMyMinute", "setMyMinute", "myMonth", "getMyMonth", "setMyMonth", "myYear", "getMyYear", "setMyYear", "order", "Lcom/clickEat/ug/data/CustomerOrder;", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "sharedModel", "Lcom/clickEat/ug/screens/cart/CartViewModel;", "status", "", "getStatus", "()Z", "setStatus", "(Z)V", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/clickEat/ug/screens/checkout/CheckOutModelFactory;", "onAlertDialog", "", "context", "Landroid/content/Context;", "title", "", "message", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogClickListener", "id", "onError", "error", "Lcom/stepstone/stepper/VerificationError;", "onSelected", "onTimeSet", "p0", "Landroid/widget/TimePicker;", "p1", "p2", "showOrderSummary", "validateInputs", "verifyStep", "app_debug"})
public final class CheckoutFragment extends androidx.fragment.app.Fragment implements com.clickEat.ug.screens.checkout.AddressDialog.AddressSelectedListener, com.stepstone.stepper.Step, android.app.TimePickerDialog.OnTimeSetListener {
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private com.clickEat.ug.screens.checkout.CheckOutModelFactory viewModelFactory;
    private com.clickEat.ug.screens.checkout.CheckOutViewModel checkOutViewModel;
    private final kotlin.Lazy userViewModel$delegate = null;
    private com.clickEat.ug.databinding.FragmentCheckoutBinding binding;
    private com.clickEat.ug.screens.cart.CartViewModel sharedModel;
    private java.lang.Integer customerId;
    private java.lang.Integer addressId;
    private com.clickEat.ug.data.CustomerNewAddress deliveryAddress;
    private com.clickEat.ug.data.CustomerOrder order;
    private java.util.Calendar cal;
    private int hour = 0;
    private int minute = 0;
    private int myDay = 0;
    private int myMonth = 0;
    private int myYear = 0;
    private int myHour = 0;
    private int myMinute = 0;
    private boolean status = false;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    public final java.util.Calendar getCal() {
        return null;
    }
    
    public final void setCal(java.util.Calendar p0) {
    }
    
    public final int getHour() {
        return 0;
    }
    
    public final void setHour(int p0) {
    }
    
    public final int getMinute() {
        return 0;
    }
    
    public final void setMinute(int p0) {
    }
    
    public final int getMyDay() {
        return 0;
    }
    
    public final void setMyDay(int p0) {
    }
    
    public final int getMyMonth() {
        return 0;
    }
    
    public final void setMyMonth(int p0) {
    }
    
    public final int getMyYear() {
        return 0;
    }
    
    public final void setMyYear(int p0) {
    }
    
    public final int getMyHour() {
        return 0;
    }
    
    public final void setMyHour(int p0) {
    }
    
    public final int getMyMinute() {
        return 0;
    }
    
    public final void setMyMinute(int p0) {
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    @java.lang.Override()
    public void onDialogClickListener(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    android.widget.TimePicker p0, int p1, int p2) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stepstone.stepper.VerificationError verifyStep() {
        return null;
    }
    
    @java.lang.Override()
    public void onSelected() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    com.stepstone.stepper.VerificationError error) {
    }
    
    private final boolean validateInputs() {
        return false;
    }
    
    private final void showOrderSummary() {
    }
    
    private final void onAlertDialog(android.content.Context context, java.lang.String title, java.lang.String message) {
    }
    
    public CheckoutFragment() {
        super();
    }
}