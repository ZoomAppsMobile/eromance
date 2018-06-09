package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020,2\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u000f0/J\"\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0012\u00106\u001a\u00020,2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u001a\u00109\u001a\u00020,2\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u000202H\u0016J\b\u0010=\u001a\u00020,H\u0014J\b\u0010>\u001a\u00020,H\u0014J%\u0010?\u001a\b\u0012\u0004\u0012\u00020;0@2\u0012\u0010.\u001a\u000e\u0012\b\u0012\u00060\u000eR\u00020\u000f\u0018\u00010/\u00a2\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020DJ(\u0010E\u001a\u00020,2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u000eR\u00020\u000f\u0018\u00010/2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010;J\u000e\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020DR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u000eR\u00020\u000f\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006I"}, d2 = {"Lcom/zoomapps/eromance/Activities/AddAlbumActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/DialogFragment/DialogFragmentInteraction;", "()V", "album_images_RV", "Landroid/support/v7/widget/RecyclerView;", "getAlbum_images_RV", "()Landroid/support/v7/widget/RecyclerView;", "album_images_RV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cropImageView", "Lcom/theartofdev/edmodo/cropper/CropImageView;", "dataList", "", "Lcom/zoomapps/eromance/Models/UserPhotosModel$Data;", "Lcom/zoomapps/eromance/Models/UserPhotosModel;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "feedBack_result_TV", "Landroid/widget/TextView;", "getFeedBack_result_TV", "()Landroid/widget/TextView;", "feedBack_result_TV$delegate", "isStopped", "", "()Z", "setStopped", "(Z)V", "loading_PG", "Landroid/widget/ProgressBar;", "getLoading_PG", "()Landroid/widget/ProgressBar;", "loading_PG$delegate", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "mTopFilterLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "getMTopFilterLayoutManager", "()Landroid/support/v7/widget/GridLayoutManager;", "setMTopFilterLayoutManager", "(Landroid/support/v7/widget/GridLayoutManager;)V", "getData", "", "init_rv", "dataForList", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOkPressed", "content", "", "code", "onResume", "onStop", "prepareImageList", "", "(Ljava/util/List;)[Ljava/lang/String;", "processImage", "image_uri", "Landroid/net/Uri;", "processViews", "status", "uploadAvatar", "imageUri", "app_debug"})
public final class AddAlbumActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.DialogFragment.DialogFragmentInteraction {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> dataList;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.GridLayoutManager mTopFilterLayoutManager;
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    private com.theartofdev.edmodo.cropper.CropImageView cropImageView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty album_images_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty feedBack_result_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty loading_PG$delegate = null;
    private boolean isStopped;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onOkPressed(@org.jetbrains.annotations.Nullable()
    java.lang.String content, int code) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.GridLayoutManager getMTopFilterLayoutManager() {
        return null;
    }
    
    public final void setMTopFilterLayoutManager(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.GridLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getAlbum_images_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getFeedBack_result_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getLoading_PG() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void processViews(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> dataList, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
    
    public final void init_rv(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> dataForList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] prepareImageList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> dataForList) {
        return null;
    }
    
    public final boolean isStopped() {
        return false;
    }
    
    public final void setStopped(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void getData() {
    }
    
    public final void processImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri image_uri) {
    }
    
    public final void uploadAvatar(@org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public AddAlbumActivity() {
        super();
    }
}