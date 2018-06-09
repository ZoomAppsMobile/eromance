package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010,J\u0012\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0012\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010,H\u0016J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\u0006\u00106\u001a\u00020)R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001f\u0010\u0012R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00067"}, d2 = {"Lcom/zoomapps/eromance/Activities/PasswordInteractionActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/IPasswordInteractionView;", "()V", "change_password_container", "Landroid/widget/LinearLayout;", "getChange_password_container", "()Landroid/widget/LinearLayout;", "change_password_container$delegate", "Lkotlin/properties/ReadOnlyProperty;", "confirm_btn", "Landroid/widget/Button;", "getConfirm_btn", "()Landroid/widget/Button;", "confirm_btn$delegate", "current_password_ED", "Landroid/widget/EditText;", "getCurrent_password_ED", "()Landroid/widget/EditText;", "current_password_ED$delegate", "presenter", "Lcom/zoomapps/eromance/Helpers/PasswordInteractionPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/PasswordInteractionPresenter;", "restore_password_container", "getRestore_password_container", "restore_password_container$delegate", "retype_new_password_ED", "getRetype_new_password_ED", "retype_new_password_ED$delegate", "user_email_for_restore_ED", "getUser_email_for_restore_ED", "user_email_for_restore_ED$delegate", "view_type", "", "getView_type", "()Ljava/lang/Integer;", "setView_type", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "cp_OnError", "", "cp_OnSuccess", "getDataToSend", "", "init_mainview", "type", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "on_CheckError", "msg", "rp_OnError", "rp_OnSuccess", "setBtn", "app_debug"})
public final class PasswordInteractionActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.IPasswordInteractionView {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty change_password_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty current_password_ED$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty retype_new_password_ED$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty restore_password_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_email_for_restore_ED$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty confirm_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.PasswordInteractionPresenter presenter = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer view_type;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void on_CheckError(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void cp_OnSuccess() {
    }
    
    @java.lang.Override()
    public void cp_OnError() {
    }
    
    @java.lang.Override()
    public void rp_OnSuccess() {
    }
    
    @java.lang.Override()
    public void rp_OnError() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getChange_password_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getCurrent_password_ED() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getRetype_new_password_ED() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getRestore_password_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getUser_email_for_restore_ED() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getConfirm_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.PasswordInteractionPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getView_type() {
        return null;
    }
    
    public final void setView_type(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDataToSend() {
        return null;
    }
    
    public final void setBtn() {
    }
    
    public final void init_mainview(@org.jetbrains.annotations.Nullable()
    java.lang.String type) {
    }
    
    public PasswordInteractionActivity() {
        super();
    }
}