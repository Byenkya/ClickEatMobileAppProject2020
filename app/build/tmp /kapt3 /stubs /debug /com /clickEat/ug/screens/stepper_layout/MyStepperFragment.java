package com.clickEat.ug.screens.stepper_layout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0014H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006+"}, d2 = {"Lcom/clickEat/ug/screens/stepper_layout/MyStepperFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/stepstone/stepper/StepperLayout$StepperListener;", "()V", "binding", "Lcom/clickEat/ug/databinding/FragmentMyStepperBinding;", "myStepperViewModal", "Lcom/clickEat/ug/screens/stepper_layout/MyStepperViewModal;", "getMyStepperViewModal", "()Lcom/clickEat/ug/screens/stepper_layout/MyStepperViewModal;", "myStepperViewModal$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/clickEat/ug/screens/login/CustomProgressDialog;", "userViewModel", "Lcom/clickEat/ug/MainActivityViewModel;", "getUserViewModel", "()Lcom/clickEat/ug/MainActivityViewModel;", "userViewModel$delegate", "onAlertDialog", "", "context", "Landroid/content/Context;", "title", "", "message", "onCompleted", "completeButton", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onError", "verificationError", "Lcom/stepstone/stepper/VerificationError;", "onReturn", "onStepSelected", "newStepPosition", "", "app_debug"})
public final class MyStepperFragment extends androidx.fragment.app.Fragment implements com.stepstone.stepper.StepperLayout.StepperListener {
    private final kotlin.Lazy userViewModel$delegate = null;
    private final kotlin.Lazy myStepperViewModal$delegate = null;
    private final com.clickEat.ug.screens.login.CustomProgressDialog progressDialog = null;
    private com.clickEat.ug.databinding.FragmentMyStepperBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.clickEat.ug.MainActivityViewModel getUserViewModel() {
        return null;
    }
    
    private final com.clickEat.ug.screens.stepper_layout.MyStepperViewModal getMyStepperViewModal() {
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
    
    @java.lang.Override()
    public void onCompleted(@org.jetbrains.annotations.Nullable()
    android.view.View completeButton) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.Nullable()
    com.stepstone.stepper.VerificationError verificationError) {
    }
    
    @java.lang.Override()
    public void onStepSelected(int newStepPosition) {
    }
    
    @java.lang.Override()
    public void onReturn() {
    }
    
    private final void onAlertDialog(android.content.Context context, java.lang.String title, java.lang.String message) {
    }
    
    public MyStepperFragment() {
        super();
    }
}