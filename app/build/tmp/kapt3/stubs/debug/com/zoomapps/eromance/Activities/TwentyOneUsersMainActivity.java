package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010u\u001a\u0004\u0018\u00010vJ\u0012\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010zH\u0014J\b\u0010{\u001a\u00020xH\u0016J\u0014\u0010|\u001a\u00020x2\n\u0010}\u001a\u00060~R\u000206H\u0016J\u001a\u0010\u007f\u001a\u00020x2\u0012\u0010\u0080\u0001\u001a\r\u0012\b\u0012\u000605R\u0002060\u0081\u0001J\u0007\u0010\u0082\u0001\u001a\u00020xJ\u0007\u0010\u0083\u0001\u001a\u00020xJ\u001b\u0010\u0084\u0001\u001a\u00020x2\u0012\u0010\u0080\u0001\u001a\r\u0012\b\u0012\u000605R\u0002060\u0081\u0001J\u001b\u0010\u0085\u0001\u001a\u00020x2\u0012\u0010\u0080\u0001\u001a\r\u0012\b\u0012\u000605R\u0002060\u0081\u0001J\u0007\u0010\u0086\u0001\u001a\u00020xR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\"\u0010\u0016R\u001b\u0010$\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b%\u0010\u0016R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b1\u0010\u0016R&\u00103\u001a\u000e\u0012\b\u0012\u000605R\u000206\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001b\u0010;\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b<\u0010\u0016R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010D\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\t\u001a\u0004\bE\u0010\u0016R\u001b\u0010G\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bI\u0010JR\u001b\u0010L\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010\t\u001a\u0004\bM\u0010JR\u001b\u0010O\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bQ\u0010\t\u001a\u0004\bP\u0010JR\u001b\u0010R\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bT\u0010\t\u001a\u0004\bS\u0010JR\u001b\u0010U\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bW\u0010\t\u001a\u0004\bV\u0010JR\u001b\u0010X\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bZ\u0010\t\u001a\u0004\bY\u0010JR\u001b\u0010[\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b]\u0010\t\u001a\u0004\b\\\u0010JR\u001b\u0010^\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b`\u0010\t\u001a\u0004\b_\u0010JR\u001b\u0010a\u001a\u00020H8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010\t\u001a\u0004\bb\u0010JR\u001b\u0010d\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bf\u0010\t\u001a\u0004\be\u0010\u0016R\u001b\u0010g\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bi\u0010\t\u001a\u0004\bh\u0010\u0016R\u001b\u0010j\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bl\u0010\t\u001a\u0004\bk\u0010\u0016R\u001b\u0010m\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bo\u0010\t\u001a\u0004\bn\u0010\u0016R\u001b\u0010p\u001a\u00020q8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bt\u0010\t\u001a\u0004\br\u0010s\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/zoomapps/eromance/Activities/TwentyOneUsersMainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/ITwentyOneUsersMain;", "()V", "cur_city_NAV_TV", "Landroid/widget/TextView;", "getCur_city_NAV_TV", "()Landroid/widget/TextView;", "cur_city_NAV_TV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cur_coins_NAV_TV", "getCur_coins_NAV_TV", "cur_coins_NAV_TV$delegate", "cur_country_NAV_TV", "getCur_country_NAV_TV", "cur_country_NAV_TV$delegate", "cur_username_NAV_TV", "getCur_username_NAV_TV", "cur_username_NAV_TV$delegate", "games_NAV_LL", "Landroid/widget/LinearLayout;", "getGames_NAV_LL", "()Landroid/widget/LinearLayout;", "games_NAV_LL$delegate", "lu_user_container", "getLu_user_container", "lu_user_container$delegate", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mid_user_container", "getMid_user_container", "mid_user_container$delegate", "myProfile_NAV_LL", "getMyProfile_NAV_LL", "myProfile_NAV_LL$delegate", "presenter", "Lcom/zoomapps/eromance/Helpers/TwentyOneUsersMainPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/TwentyOneUsersMainPresenter;", "profile_image_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfile_image_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "profile_image_CIV$delegate", "ru_user_container", "getRu_user_container", "ru_user_container$delegate", "rv_dataList", "", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getRv_dataList", "()Ljava/util/List;", "setRv_dataList", "(Ljava/util/List;)V", "settings_NAV_LL", "getSettings_NAV_LL", "settings_NAV_LL$delegate", "topRow_clickListener", "Landroid/view/View$OnClickListener;", "getTopRow_clickListener", "()Landroid/view/View$OnClickListener;", "setTopRow_clickListener", "(Landroid/view/View$OnClickListener;)V", "top_users_container", "getTop_users_container", "top_users_container$delegate", "tu_fs_avatar_IV", "Landroid/widget/ImageView;", "getTu_fs_avatar_IV", "()Landroid/widget/ImageView;", "tu_fs_avatar_IV$delegate", "tu_fs_stars_IV", "getTu_fs_stars_IV", "tu_fs_stars_IV$delegate", "tu_fs_status_IV", "getTu_fs_status_IV", "tu_fs_status_IV$delegate", "tu_sn_avatar_IV", "getTu_sn_avatar_IV", "tu_sn_avatar_IV$delegate", "tu_sn_stars_IV", "getTu_sn_stars_IV", "tu_sn_stars_IV$delegate", "tu_sn_status_IV", "getTu_sn_status_IV", "tu_sn_status_IV$delegate", "tu_td_avatar_IV", "getTu_td_avatar_IV", "tu_td_avatar_IV$delegate", "tu_td_stars_IV", "getTu_td_stars_IV", "tu_td_stars_IV$delegate", "tu_td_status_IV", "getTu_td_status_IV", "tu_td_status_IV$delegate", "twentyOne_NAV_LL", "getTwentyOne_NAV_LL", "twentyOne_NAV_LL$delegate", "user_status_container_left", "getUser_status_container_left", "user_status_container_left$delegate", "user_status_container_mid", "getUser_status_container_mid", "user_status_container_mid$delegate", "user_status_container_right", "getUser_status_container_right", "user_status_container_right$delegate", "usersListRV", "Landroid/support/v7/widget/RecyclerView;", "getUsersListRV", "()Landroid/support/v7/widget/RecyclerView;", "usersListRV$delegate", "getPushToken", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDataLoadError", "onDataLoaded", "out", "Lcom/zoomapps/eromance/Models/UserProfileModel$ProfileFindResponse;", "processViews", "dataList", "", "registerPush", "setMenuClicks", "setRV", "setTopElements", "startSocketService", "app_debug"})
public final class TwentyOneUsersMainActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.ITwentyOneUsersMain {
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> rv_dataList;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.TwentyOneUsersMainPresenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty usersListRV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty top_users_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_sn_avatar_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_status_container_left$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_sn_status_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_sn_stars_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_fs_avatar_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_status_container_mid$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_fs_status_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_fs_stars_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_td_avatar_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_status_container_right$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_td_status_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tu_td_stars_IV$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener topRow_clickListener;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty lu_user_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty mid_user_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ru_user_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty myProfile_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty games_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty twentyOne_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty settings_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_username_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_country_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_city_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_coins_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty profile_image_CIV$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onDataLoadError() {
    }
    
    @java.lang.Override()
    public void onDataLoaded(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.UserProfileModel.ProfileFindResponse out) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> getRv_dataList() {
        return null;
    }
    
    public final void setRv_dataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.TwentyOneUsersMainPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getUsersListRV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getTop_users_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_sn_avatar_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getUser_status_container_left() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_sn_status_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_sn_stars_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_fs_avatar_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getUser_status_container_mid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_fs_status_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_fs_stars_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_td_avatar_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getUser_status_container_right() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_td_status_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getTu_td_stars_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getTopRow_clickListener() {
        return null;
    }
    
    public final void setTopRow_clickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLu_user_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMid_user_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getRu_user_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMyProfile_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getGames_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getTwentyOne_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSettings_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_username_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_country_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_city_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_coins_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getProfile_image_CIV() {
        return null;
    }
    
    public final void setMenuClicks() {
    }
    
    public final void registerPush() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPushToken() {
        return null;
    }
    
    public final void startSocketService() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setRV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> dataList) {
    }
    
    public final void processViews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> dataList) {
    }
    
    public final void setTopElements(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> dataList) {
    }
    
    public TwentyOneUsersMainActivity() {
        super();
    }
}