package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\u001a\u0010-\u001a\u00020(2\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\nR\u00020\u000b0\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\b\u0012\u00060\nR\u00020\u000b\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b$\u0010%\u00a8\u0006/"}, d2 = {"Lcom/zoomapps/eromance/Activities/FavoritesListActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/IFavoritesView;", "()V", "FavoritesHelper", "Lcom/zoomapps/eromance/Helpers/FavoritesListPresenter;", "getFavoritesHelper", "()Lcom/zoomapps/eromance/Helpers/FavoritesListPresenter;", "dataList", "", "Lcom/zoomapps/eromance/Models/UserRateModel$Datum;", "Lcom/zoomapps/eromance/Models/UserRateModel;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "favorites_rv", "Landroid/support/v7/widget/RecyclerView;", "getFavorites_rv", "()Landroid/support/v7/widget/RecyclerView;", "favorites_rv$delegate", "Lkotlin/properties/ReadOnlyProperty;", "list_type", "", "getList_type", "()Ljava/lang/String;", "setList_type", "(Ljava/lang/String;)V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "tv_map", "Landroid/widget/TextView;", "getTv_map", "()Landroid/widget/TextView;", "tv_map$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEmpty", "onLoadError", "onLoaded", "likelist", "app_debug"})
public final class FavoritesListActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.IFavoritesView {
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tv_map$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty favorites_rv$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> dataList;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.FavoritesListPresenter FavoritesHelper = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String list_type;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onEmpty() {
    }
    
    @java.lang.Override()
    public void onLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> likelist) {
    }
    
    @java.lang.Override()
    public void onLoadError() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_map() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getFavorites_rv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.FavoritesListPresenter getFavoritesHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getList_type() {
        return null;
    }
    
    public final void setList_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public FavoritesListActivity() {
        super();
    }
}