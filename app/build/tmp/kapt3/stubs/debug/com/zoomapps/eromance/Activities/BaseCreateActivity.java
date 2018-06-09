package com.zoomapps.eromance.Activities;

import java.lang.System;

/**
 * * Created by User on 26.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\"\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0006\u0010\u001f\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/zoomapps/eromance/Activities/BaseCreateActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "selectedUser_ID", "", "getSelectedUser_ID", "()Ljava/lang/Integer;", "setSelectedUser_ID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectedUser_TV", "Landroid/widget/TextView;", "getSelectedUser_TV", "()Landroid/widget/TextView;", "setSelectedUser_TV", "(Landroid/widget/TextView;)V", "notAloneRB_Clicked", "", "notAloneUnChecked", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onActivitySuccessResult", "onSelectedUserTV_Click", "app_debug"})
public class BaseCreateActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedUser_ID;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView selectedUser_TV;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public void onActivitySuccessResult() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedUser_ID() {
        return null;
    }
    
    public final void setSelectedUser_ID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSelectedUser_TV() {
        return null;
    }
    
    public final void setSelectedUser_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    public final void onSelectedUserTV_Click() {
    }
    
    public final void notAloneRB_Clicked() {
    }
    
    public final void notAloneUnChecked() {
    }
    
    public BaseCreateActivity() {
        super();
    }
}