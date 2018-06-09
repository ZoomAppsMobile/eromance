package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020CJ\b\u0010R\u001a\u00020OH\u0002J\u0006\u0010S\u001a\u00020OJ\u0012\u0010T\u001a\u00020O2\b\u0010U\u001a\u0004\u0018\u00010VH\u0014J\u0006\u0010W\u001a\u00020OJ\u0006\u0010X\u001a\u00020OJ\b\u0010Y\u001a\u00020OH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u001bR\u001a\u0010*\u001a\u00020+X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00100\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b1\u0010%R\u001b\u00103\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b4\u0010\u001bR\u001b\u00106\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\b\u001a\u0004\b7\u0010%R\u001b\u00109\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u001bR\u001b\u0010<\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b=\u0010%R\u001b\u0010?\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\b@\u0010\u001bR\u001a\u0010B\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\u001b\u0010K\u001a\u00020\u000f8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bM\u0010\b\u001a\u0004\bL\u0010\u0011\u00a8\u0006Z"}, d2 = {"Lcom/zoomapps/eromance/Activities/GameCreatedActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "btnOpenDrawer", "Landroid/widget/RelativeLayout;", "getBtnOpenDrawer$app_debug", "()Landroid/widget/RelativeLayout;", "btnOpenDrawer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "coin_seekbar", "Landroid/widget/SeekBar;", "getCoin_seekbar", "()Landroid/widget/SeekBar;", "coin_seekbar$delegate", "coin_value_TV", "Landroid/widget/TextView;", "getCoin_value_TV", "()Landroid/widget/TextView;", "coin_value_TV$delegate", "create_btn", "Landroid/widget/Button;", "getCreate_btn", "()Landroid/widget/Button;", "create_btn$delegate", "create_btn_container_LL", "Landroid/widget/LinearLayout;", "getCreate_btn_container_LL", "()Landroid/widget/LinearLayout;", "create_btn_container_LL$delegate", "drawer_layout", "Landroid/support/v4/widget/DrawerLayout;", "getDrawer_layout$app_debug", "()Landroid/support/v4/widget/DrawerLayout;", "drawer_layout$delegate", "filter_IV", "Landroid/widget/ImageView;", "getFilter_IV", "()Landroid/widget/ImageView;", "filter_IV$delegate", "game_variants_container", "getGame_variants_container", "game_variants_container$delegate", "menu_btn_sbsed", "", "getMenu_btn_sbsed$app_debug", "()Z", "setMenu_btn_sbsed$app_debug", "(Z)V", "paper_variant_IV", "getPaper_variant_IV", "paper_variant_IV$delegate", "paper_variant_container", "getPaper_variant_container", "paper_variant_container$delegate", "rock_variant_IV", "getRock_variant_IV", "rock_variant_IV$delegate", "rock_variant_container", "getRock_variant_container", "rock_variant_container$delegate", "scissors_variant_IV", "getScissors_variant_IV", "scissors_variant_IV$delegate", "scissors_variant_container", "getScissors_variant_container", "scissors_variant_container$delegate", "selectedVariant", "", "getSelectedVariant", "()I", "setSelectedVariant", "(I)V", "setCoinValue", "getSetCoinValue", "setSetCoinValue", "tv_map", "getTv_map$app_debug", "tv_map$delegate", "checkAndSendRequest", "", "getColorById", "id", "initButtonToolbar", "initThings", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendRequest", "setImageToUnCheck", "textGradient", "app_debug"})
public final class GameCreatedActivity extends android.support.v7.app.AppCompatActivity {
    private boolean menu_btn_sbsed;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnOpenDrawer$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty drawer_layout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tv_map$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty create_btn_container_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty game_variants_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rock_variant_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty scissors_variant_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty paper_variant_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rock_variant_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty scissors_variant_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty paper_variant_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty create_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty coin_seekbar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty coin_value_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty filter_IV$delegate = null;
    private int setCoinValue;
    private int selectedVariant;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getMenu_btn_sbsed$app_debug() {
        return false;
    }
    
    public final void setMenu_btn_sbsed$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getBtnOpenDrawer$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.widget.DrawerLayout getDrawer_layout$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_map$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCreate_btn_container_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getGame_variants_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getRock_variant_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getScissors_variant_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getPaper_variant_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getRock_variant_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getScissors_variant_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPaper_variant_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getCreate_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.SeekBar getCoin_seekbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCoin_value_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getFilter_IV() {
        return null;
    }
    
    public final int getSetCoinValue() {
        return 0;
    }
    
    public final void setSetCoinValue(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void checkAndSendRequest() {
    }
    
    public final void sendRequest() {
    }
    
    public final void setImageToUnCheck() {
    }
    
    public final int getSelectedVariant() {
        return 0;
    }
    
    public final void setSelectedVariant(int p0) {
    }
    
    public final void initThings() {
    }
    
    private final void initButtonToolbar() {
    }
    
    public final int getColorById(int id) {
        return 0;
    }
    
    private final void textGradient() {
    }
    
    public GameCreatedActivity() {
        super();
    }
}