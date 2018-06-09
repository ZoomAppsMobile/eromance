package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 11.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001d\u0010\u001f\u001a\u00020\u001c\"\u0004\b\u0000\u0010 2\b\u0010!\u001a\u0004\u0018\u0001H H\u0016\u00a2\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\u001c\"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u0002H H\u0016\u00a2\u0006\u0002\u0010\"J\u0016\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\'"}, d2 = {"Lcom/zoomapps/eromance/Helpers/GiftsPresenter;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "mContext", "Landroid/content/Context;", "viewInteface", "Lcom/zoomapps/eromance/Interfaces/IGiftsView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/IGiftsView;)V", "alertD", "Landroid/app/AlertDialog;", "getAlertD", "()Landroid/app/AlertDialog;", "setAlertD", "(Landroid/app/AlertDialog;)V", "getMContext", "()Landroid/content/Context;", "rqstMkr", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getRqstMkr", "()Lcom/zoomapps/eromance/Controllers/RequestMaker;", "selectedItem_ID", "", "getSelectedItem_ID", "()I", "setSelectedItem_ID", "(I)V", "getViewInteface", "()Lcom/zoomapps/eromance/Interfaces/IGiftsView;", "getData", "", "user_id", "", "onError", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "showAppoveSelectionAlert", "giftId", "giftName", "app_debug"})
public final class GiftsPresenter implements com.zoomapps.eromance.Interfaces.RequestMakerListener {
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.RequestMaker rqstMkr = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.AlertDialog alertD;
    private int selectedItem_ID;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Interfaces.IGiftsView viewInteface = null;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.RequestMaker getRqstMkr() {
        return null;
    }
    
    public final void getData(@org.jetbrains.annotations.NotNull()
    java.lang.String user_id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.AlertDialog getAlertD() {
        return null;
    }
    
    public final void setAlertD(@org.jetbrains.annotations.Nullable()
    android.app.AlertDialog p0) {
    }
    
    public final int getSelectedItem_ID() {
        return 0;
    }
    
    public final void setSelectedItem_ID(int p0) {
    }
    
    public final void showAppoveSelectionAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String giftId, @org.jetbrains.annotations.NotNull()
    java.lang.String giftName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IGiftsView getViewInteface() {
        return null;
    }
    
    public GiftsPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IGiftsView viewInteface) {
        super();
    }
}