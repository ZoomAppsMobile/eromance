package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/zoomapps/eromance/Activities/ImageCropActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "cropImageView", "Lcom/theartofdev/edmodo/cropper/CropImageView;", "getCropImageView", "()Lcom/theartofdev/edmodo/cropper/CropImageView;", "setCropImageView", "(Lcom/theartofdev/edmodo/cropper/CropImageView;)V", "cropView", "Lcom/steelkiwi/cropiwa/CropIwaView;", "getCropView", "()Lcom/steelkiwi/cropiwa/CropIwaView;", "cropView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "needToCrop", "", "getNeedToCrop", "()Z", "setNeedToCrop", "(Z)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ImageCropActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.theartofdev.edmodo.cropper.CropImageView cropImageView;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cropView$delegate = null;
    private boolean needToCrop;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.theartofdev.edmodo.cropper.CropImageView getCropImageView() {
        return null;
    }
    
    public final void setCropImageView(@org.jetbrains.annotations.NotNull()
    com.theartofdev.edmodo.cropper.CropImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.steelkiwi.cropiwa.CropIwaView getCropView() {
        return null;
    }
    
    public final boolean getNeedToCrop() {
        return false;
    }
    
    public final void setNeedToCrop(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    public ImageCropActivity() {
        super();
    }
}