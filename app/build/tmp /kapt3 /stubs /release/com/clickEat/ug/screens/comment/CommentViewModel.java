package com.clickEat.ug.screens.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/clickEat/ug/screens/comment/CommentViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "productID", "", "application", "Landroid/app/Application;", "(ILandroid/app/Application;)V", "_comments", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/clickEat/ug/data/ServerComment;", "comments", "Landroidx/lifecycle/LiveData;", "getComments", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addComment", "customerID", "comment", "Lcom/clickEat/ug/data/Comment;", "(ILcom/clickEat/ug/data/Comment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addProductComment", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductComments", "onCleared", "app_release"})
public final class CommentViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.data.ServerComment>> _comments;
    private final int productID = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.ServerComment>> getComments() {
        return null;
    }
    
    private final void getProductComments(int productID) {
    }
    
    public final void addProductComment(int customerID, @org.jetbrains.annotations.NotNull()
    com.clickEat.ug.data.Comment comment) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CommentViewModel(int productID, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}