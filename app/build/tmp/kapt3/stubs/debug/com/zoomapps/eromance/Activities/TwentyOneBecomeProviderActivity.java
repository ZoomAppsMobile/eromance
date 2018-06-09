package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u001d\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010.2\b\u0010/\u001a\u0004\u0018\u0001H.H\u0016\u00a2\u0006\u0002\u00100J\u001b\u00101\u001a\u00020*\"\u0004\b\u0000\u0010.2\u0006\u0010/\u001a\u0002H.H\u0016\u00a2\u0006\u0002\u00100J\u0006\u00102\u001a\u00020*R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00063"}, d2 = {"Lcom/zoomapps/eromance/Activities/TwentyOneBecomeProviderActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "()V", "btn_cancel", "Landroid/widget/Button;", "getBtn_cancel", "()Landroid/widget/Button;", "btn_cancel$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btn_send_request", "getBtn_send_request", "btn_send_request$delegate", "convertorHelper", "Lcom/zoomapps/eromance/Controllers/TypeConvertor;", "getConvertorHelper", "()Lcom/zoomapps/eromance/Controllers/TypeConvertor;", "ms_service_types", "Lfr/ganfra/materialspinner/MaterialSpinner;", "getMs_service_types", "()Lfr/ganfra/materialspinner/MaterialSpinner;", "ms_service_types$delegate", "rqstMkr", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getRqstMkr", "()Lcom/zoomapps/eromance/Controllers/RequestMaker;", "selectedType", "", "getSelectedType", "()Ljava/lang/Integer;", "setSelectedType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "successfullRequest", "getSuccessfullRequest", "()I", "setSuccessfullRequest", "(I)V", "getList", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onError", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "setBtnsAction", "app_debug"})
public final class TwentyOneBecomeProviderActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.RequestMakerListener {
    private int successfullRequest;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.RequestMaker rqstMkr = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_cancel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_send_request$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_service_types$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedType;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.TypeConvertor convertorHelper = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    public final int getSuccessfullRequest() {
        return 0;
    }
    
    public final void setSuccessfullRequest(int p0) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.RequestMaker getRqstMkr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_cancel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_send_request() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_service_types() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedType() {
        return null;
    }
    
    public final void setSelectedType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.TypeConvertor getConvertorHelper() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getList() {
        return null;
    }
    
    public final void setBtnsAction() {
    }
    
    public TwentyOneBecomeProviderActivity() {
        super();
    }
}