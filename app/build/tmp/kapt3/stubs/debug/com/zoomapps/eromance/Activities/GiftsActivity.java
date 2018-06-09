package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u001fJ\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010!J\b\u0010(\u001a\u00020\u001fH\u0016J\u0016\u0010)\u001a\u00020\u001f2\f\u0010*\u001a\b\u0018\u00010+R\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/zoomapps/eromance/Activities/GiftsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/IGiftsView;", "()V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mListData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/GiftsModel$Data;", "Lcom/zoomapps/eromance/Models/GiftsModel;", "getMListData", "()Ljava/util/ArrayList;", "setMListData", "(Ljava/util/ArrayList;)V", "presenter", "Lcom/zoomapps/eromance/Helpers/GiftsPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/GiftsPresenter;", "setPresenter", "(Lcom/zoomapps/eromance/Helpers/GiftsPresenter;)V", "user_gifts_RV", "Landroid/support/v7/widget/RecyclerView;", "getUser_gifts_RV", "()Landroid/support/v7/widget/RecyclerView;", "user_gifts_RV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "giftSelected", "", "giftId", "", "onBack", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onElementSelected", "gift_id", "onLoadError", "onLoaded", "data", "Lcom/zoomapps/eromance/Models/GiftsModel$UserGiftsResponse;", "app_debug"})
public final class GiftsActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.IGiftsView {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_gifts_RV$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.GiftsModel.Data> mListData;
    @org.jetbrains.annotations.NotNull()
    private com.zoomapps.eromance.Helpers.GiftsPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void giftSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String giftId) {
    }
    
    @java.lang.Override()
    public void onLoaded(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.GiftsModel.UserGiftsResponse data) {
    }
    
    @java.lang.Override()
    public void onLoadError() {
    }
    
    public final void onBack() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getUser_gifts_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.GiftsModel.Data> getMListData() {
        return null;
    }
    
    public final void setMListData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.GiftsModel.Data> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.GiftsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Helpers.GiftsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onElementSelected(@org.jetbrains.annotations.Nullable()
    java.lang.String gift_id) {
    }
    
    public GiftsActivity() {
        super();
    }
}