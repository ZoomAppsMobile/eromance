package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\b\u0010/\u001a\u000200H\u0002J\u0012\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u000200H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR&\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*\u00a8\u00065"}, d2 = {"Lcom/zoomapps/eromance/Activities/AddBalanceActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "btnOpenDrawer", "Landroid/widget/RelativeLayout;", "getBtnOpenDrawer$app_debug", "()Landroid/widget/RelativeLayout;", "btnOpenDrawer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "drawer_layout", "Landroid/support/v4/widget/DrawerLayout;", "getDrawer_layout$app_debug", "()Landroid/support/v4/widget/DrawerLayout;", "drawer_layout$delegate", "items", "", "Lcom/zoomapps/eromance/Models/ModelAddBalance;", "getItems$app_debug", "()[Lcom/zoomapps/eromance/Models/ModelAddBalance;", "setItems$app_debug", "([Lcom/zoomapps/eromance/Models/ModelAddBalance;)V", "[Lcom/zoomapps/eromance/Models/ModelAddBalance;", "mAdapter", "Lcom/zoomapps/eromance/Adapters/RecyclerViewAddBalance;", "getMAdapter$app_debug", "()Lcom/zoomapps/eromance/Adapters/RecyclerViewAddBalance;", "setMAdapter$app_debug", "(Lcom/zoomapps/eromance/Adapters/RecyclerViewAddBalance;)V", "menu_btn_sbsed", "", "getMenu_btn_sbsed$app_debug", "()Z", "setMenu_btn_sbsed$app_debug", "(Z)V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView$app_debug", "()Landroid/support/v7/widget/RecyclerView;", "recyclerView$delegate", "tv_map", "Landroid/widget/TextView;", "getTv_map$app_debug", "()Landroid/widget/TextView;", "tv_map$delegate", "getColorById", "", "id", "initButtonToolbar", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "textGradient", "app_debug"})
public final class AddBalanceActivity extends android.support.v7.app.AppCompatActivity {
    private boolean menu_btn_sbsed;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnOpenDrawer$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty drawer_layout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tv_map$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty recyclerView$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Adapters.RecyclerViewAddBalance mAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Models.ModelAddBalance[] items;
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
    public final android.support.v7.widget.RecyclerView getRecyclerView$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Adapters.RecyclerViewAddBalance getMAdapter$app_debug() {
        return null;
    }
    
    public final void setMAdapter$app_debug(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Adapters.RecyclerViewAddBalance p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.ModelAddBalance[] getItems$app_debug() {
        return null;
    }
    
    public final void setItems$app_debug(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.ModelAddBalance[] p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initButtonToolbar() {
    }
    
    public final int getColorById(int id) {
        return 0;
    }
    
    private final void textGradient() {
    }
    
    public AddBalanceActivity() {
        super();
    }
}