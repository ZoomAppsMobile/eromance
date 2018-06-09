package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 19.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001eJ\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u001eJ\u001d\u0010$\u001a\u00020\u001c\"\u0004\b\u0000\u0010%2\b\u0010&\u001a\u0004\u0018\u0001H%H\u0016\u00a2\u0006\u0002\u0010\'J\u001b\u0010(\u001a\u00020\u001c\"\u0004\b\u0000\u0010%2\u0006\u0010&\u001a\u0002H%H\u0016\u00a2\u0006\u0002\u0010\'J\u0010\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/zoomapps/eromance/Helpers/PasswordInteractionPresenter;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "mContext", "Landroid/content/Context;", "viewInteraction", "Lcom/zoomapps/eromance/Interfaces/IPasswordInteractionView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/IPasswordInteractionView;)V", "checking_status", "", "getChecking_status", "()Z", "setChecking_status", "(Z)V", "getMContext", "()Landroid/content/Context;", "requestMaker", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getRequestMaker", "()Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getViewInteraction", "()Lcom/zoomapps/eromance/Interfaces/IPasswordInteractionView;", "view_type", "", "getView_type", "()I", "setView_type", "(I)V", "changePassword", "", "new_password", "", "isStringContainsLatinCharactersOnly", "iStringToCheck", "makeAction", "type", "data", "onError", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "restorePassword", "user_email", "checkPasswordTypes", "app_debug"})
public final class PasswordInteractionPresenter implements com.zoomapps.eromance.Interfaces.RequestMakerListener {
    private int view_type;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.RequestMaker requestMaker = null;
    private boolean checking_status;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Interfaces.IPasswordInteractionView viewInteraction = null;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    public final int getView_type() {
        return 0;
    }
    
    public final void setView_type(int p0) {
    }
    
    public final void makeAction(int type, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.RequestMaker getRequestMaker() {
        return null;
    }
    
    public final void changePassword(@org.jetbrains.annotations.Nullable()
    java.lang.String new_password) {
    }
    
    public final boolean isStringContainsLatinCharactersOnly(@org.jetbrains.annotations.Nullable()
    java.lang.String iStringToCheck) {
        return false;
    }
    
    public final void restorePassword(@org.jetbrains.annotations.Nullable()
    java.lang.String user_email) {
    }
    
    public final boolean getChecking_status() {
        return false;
    }
    
    public final void setChecking_status(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IPasswordInteractionView getViewInteraction() {
        return null;
    }
    
    public PasswordInteractionPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IPasswordInteractionView viewInteraction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J*\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/zoomapps/eromance/Helpers/PasswordInteractionPresenter$checkPasswordTypes;", "Landroid/text/TextWatcher;", "new_password_ED", "Landroid/widget/EditText;", "obserable_ED", "(Lcom/zoomapps/eromance/Helpers/PasswordInteractionPresenter;Landroid/widget/EditText;Landroid/widget/EditText;)V", "getNew_password_ED", "()Landroid/widget/EditText;", "getObserable_ED", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "", "p2", "p3", "onTextChanged", "app_debug"})
    public final class checkPasswordTypes implements android.text.TextWatcher {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText new_password_ED = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText obserable_ED = null;
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.Nullable()
        android.text.Editable p0) {
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence p0, int p1, int p2, int p3) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence p0, int p1, int p2, int p3) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getNew_password_ED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getObserable_ED() {
            return null;
        }
        
        public checkPasswordTypes(@org.jetbrains.annotations.NotNull()
        android.widget.EditText new_password_ED, @org.jetbrains.annotations.NotNull()
        android.widget.EditText obserable_ED) {
            super();
        }
    }
}