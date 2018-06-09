package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 30.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/zoomapps/eromance/Helpers/TwentyOneSearchPresenter;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "mContext", "Landroid/content/Context;", "interfaceView", "Lcom/zoomapps/eromance/Interfaces/ITwentyOneSendRequestView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/ITwentyOneSendRequestView;)V", "getInterfaceView", "()Lcom/zoomapps/eromance/Interfaces/ITwentyOneSendRequestView;", "getMContext", "()Landroid/content/Context;", "rqst_mkr", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "onError", "", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "sendRequset", "serviceTypes_LIST", "", "", "_desc", "", "app_debug"})
public final class TwentyOneSearchPresenter implements com.zoomapps.eromance.Interfaces.RequestMakerListener {
    private final com.zoomapps.eromance.Controllers.RequestMaker rqst_mkr = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Interfaces.ITwentyOneSendRequestView interfaceView = null;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    public final void sendRequset(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> serviceTypes_LIST, @org.jetbrains.annotations.NotNull()
    java.lang.String _desc) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.ITwentyOneSendRequestView getInterfaceView() {
        return null;
    }
    
    public TwentyOneSearchPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.ITwentyOneSendRequestView interfaceView) {
        super();
    }
}