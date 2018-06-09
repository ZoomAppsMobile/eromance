package com.zoomapps.eromance.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u0002012\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000104J\u0006\u00107\u001a\u000201J\u0016\u00108\u001a\u0002012\u0006\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000e\u00a8\u0006<"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ViewDialog;", "", "()V", "PD_Loading", "Landroid/app/ProgressDialog;", "getPD_Loading", "()Landroid/app/ProgressDialog;", "setPD_Loading", "(Landroid/app/ProgressDialog;)V", "betValue", "", "getBetValue", "()I", "setBetValue", "(I)V", "cancel_btn", "Landroid/widget/Button;", "getCancel_btn", "()Landroid/widget/Button;", "setCancel_btn", "(Landroid/widget/Button;)V", "game_id", "getGame_id", "setGame_id", "mainDialog", "Landroid/app/Dialog;", "getMainDialog", "()Landroid/app/Dialog;", "setMainDialog", "(Landroid/app/Dialog;)V", "ok_btn", "getOk_btn", "setOk_btn", "paper_variant_IV", "Landroid/widget/ImageView;", "getPaper_variant_IV", "()Landroid/widget/ImageView;", "setPaper_variant_IV", "(Landroid/widget/ImageView;)V", "rock_variant_IV", "getRock_variant_IV", "setRock_variant_IV", "scissors_variant_IV", "getScissors_variant_IV", "setScissors_variant_IV", "selectedVariant", "getSelectedVariant", "setSelectedVariant", "initThings", "", "init_btns", "_context", "Landroid/content/Context;", "sendRequest", "mContext", "setImageToUnCheck", "showDialog", "activity", "tagData", "", "app_debug"})
public final class ViewDialog {
    private int selectedVariant;
    private int betValue;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog PD_Loading;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button cancel_btn;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button ok_btn;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView rock_variant_IV;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView scissors_variant_IV;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView paper_variant_IV;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog mainDialog;
    private int game_id;
    
    public final void setImageToUnCheck() {
    }
    
    public final int getSelectedVariant() {
        return 0;
    }
    
    public final void setSelectedVariant(int p0) {
    }
    
    public final int getBetValue() {
        return 0;
    }
    
    public final void setBetValue(int p0) {
    }
    
    public final void initThings() {
    }
    
    public final void init_btns(@org.jetbrains.annotations.NotNull()
    android.content.Context _context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getPD_Loading() {
        return null;
    }
    
    public final void setPD_Loading(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    public final void sendRequest(@org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getCancel_btn() {
        return null;
    }
    
    public final void setCancel_btn(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getOk_btn() {
        return null;
    }
    
    public final void setOk_btn(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getRock_variant_IV() {
        return null;
    }
    
    public final void setRock_variant_IV(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getScissors_variant_IV() {
        return null;
    }
    
    public final void setScissors_variant_IV(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getPaper_variant_IV() {
        return null;
    }
    
    public final void setPaper_variant_IV(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getMainDialog() {
        return null;
    }
    
    public final void setMainDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final int getGame_id() {
        return 0;
    }
    
    public final void setGame_id(int p0) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.String tagData) {
    }
    
    public ViewDialog() {
        super();
    }
}