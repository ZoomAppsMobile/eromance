package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001J\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001J\u0016\u0010\u009a\u0001\u001a\u00030\u0097\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0014J\n\u0010\u009d\u0001\u001a\u00030\u0097\u0001H\u0014J\n\u0010\u009e\u0001\u001a\u00030\u0097\u0001H\u0014J\u001c\u0010\u009f\u0001\u001a\u00030\u0097\u00012\u0012\u0010\u00a0\u0001\u001a\r\u0012\b\u0012\u00060\u0005R\u00020\u00060\u00a1\u0001J\b\u0010\u00a2\u0001\u001a\u00030\u0097\u0001J\b\u0010\u00a3\u0001\u001a\u00030\u0097\u0001J\u001c\u0010\u00a4\u0001\u001a\u00030\u0097\u00012\u0012\u0010\u00a5\u0001\u001a\r\u0012\b\u0012\u00060\u0005R\u00020\u00060\u00a1\u0001J\u001c\u0010\u00a6\u0001\u001a\u00030\u0097\u00012\u0012\u0010\u00a0\u0001\u001a\r\u0012\b\u0012\u00060\u0005R\u00020\u00060\u00a1\u0001J\n\u0010\u00a7\u0001\u001a\u00030\u0097\u0001H\u0014J\b\u0010\u00a8\u0001\u001a\u00030\u0097\u0001J\b\u0010\u00a9\u0001\u001a\u00030\u0097\u0001R$\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0017R\u001b\u0010\u001f\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b \u0010\u0017R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b(\u0010%R\u001b\u0010*\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b+\u0010%R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00104\"\u0004\b5\u00106R\u001b\u00107\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b8\u0010%R\u0014\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010>\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\u0013\u001a\u0004\b?\u0010%R\u001b\u0010A\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\u0013\u001a\u0004\bB\u0010%R\u001b\u0010D\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\u0013\u001a\u0004\bE\u0010%R\u001b\u0010G\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010\u0013\u001a\u0004\bH\u0010%R\u001b\u0010J\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\u0013\u001a\u0004\bK\u0010\u0011R\u001b\u0010M\u001a\u00020N8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bQ\u0010\u0013\u001a\u0004\bO\u0010PR\u001b\u0010R\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bT\u0010\u0013\u001a\u0004\bS\u0010%R\u001b\u0010U\u001a\u00020V8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\u0013\u001a\u0004\bW\u0010XR\u001b\u0010Z\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\\\u0010\u0013\u001a\u0004\b[\u0010%R\u001b\u0010]\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010\u0013\u001a\u0004\b^\u0010%R\u001b\u0010`\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bb\u0010\u0013\u001a\u0004\ba\u0010%R\u001c\u0010c\u001a\u0004\u0018\u00010dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001b\u0010i\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bk\u0010\u0013\u001a\u0004\bj\u0010%R\u001b\u0010l\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bn\u0010\u0013\u001a\u0004\bm\u00100R\u001b\u0010o\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bq\u0010\u0013\u001a\u0004\bp\u00100R\u001b\u0010r\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bt\u0010\u0013\u001a\u0004\bs\u00100R\u001b\u0010u\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bw\u0010\u0013\u001a\u0004\bv\u00100R\u001b\u0010x\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bz\u0010\u0013\u001a\u0004\by\u00100R\u001b\u0010{\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b}\u0010\u0013\u001a\u0004\b|\u00100R\u001c\u0010~\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\r\n\u0005\b\u0080\u0001\u0010\u0013\u001a\u0004\b\u007f\u00100R\u001e\u0010\u0081\u0001\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0013\u001a\u0005\b\u0082\u0001\u00100R\u001e\u0010\u0084\u0001\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0013\u001a\u0005\b\u0085\u0001\u00100R\u001e\u0010\u0087\u0001\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0013\u001a\u0005\b\u0088\u0001\u0010%R\u001e\u0010\u008a\u0001\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0013\u001a\u0005\b\u008b\u0001\u0010%R\u001e\u0010\u008d\u0001\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0013\u001a\u0005\b\u008e\u0001\u0010%R\u001e\u0010\u0090\u0001\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0013\u001a\u0005\b\u0091\u0001\u0010%R\u001e\u0010\u0093\u0001\u001a\u00020N8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0013\u001a\u0005\b\u0094\u0001\u0010P\u00a8\u0006\u00aa\u0001"}, d2 = {"Lcom/zoomapps/eromance/Activities/MainActivity;", "Lcom/zoomapps/eromance/Helpers/BaseMainActivity;", "()V", "adapterData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getAdapterData", "()Ljava/util/ArrayList;", "setAdapterData", "(Ljava/util/ArrayList;)V", "allUserData", "getAllUserData", "setAllUserData", "all_cities_RB", "Landroid/widget/RadioButton;", "getAll_cities_RB", "()Landroid/widget/RadioButton;", "all_cities_RB$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cur_city_NAV_TV", "Landroid/widget/TextView;", "getCur_city_NAV_TV", "()Landroid/widget/TextView;", "cur_city_NAV_TV$delegate", "cur_coins_NAV_TV", "getCur_coins_NAV_TV", "cur_coins_NAV_TV$delegate", "cur_country_NAV_TV", "getCur_country_NAV_TV", "cur_country_NAV_TV$delegate", "cur_username_NAV_TV", "getCur_username_NAV_TV", "cur_username_NAV_TV$delegate", "eveningPlans_NAV_LL", "Landroid/widget/LinearLayout;", "getEveningPlans_NAV_LL", "()Landroid/widget/LinearLayout;", "eveningPlans_NAV_LL$delegate", "games_NAV_LL", "getGames_NAV_LL", "games_NAV_LL$delegate", "home_NAV_LL", "getHome_NAV_LL", "home_NAV_LL$delegate", "imageView17", "Landroid/widget/ImageView;", "getImageView17", "()Landroid/widget/ImageView;", "imageView17$delegate", "isStoped", "", "()Z", "setStoped", "(Z)V", "lu_user_container", "getLu_user_container", "lu_user_container$delegate", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "mLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "map_NAV_LL", "getMap_NAV_LL", "map_NAV_LL$delegate", "mid_user_container", "getMid_user_container", "mid_user_container$delegate", "momentMeets_NAV_LL", "getMomentMeets_NAV_LL", "momentMeets_NAV_LL$delegate", "myProfile_NAV_LL", "getMyProfile_NAV_LL", "myProfile_NAV_LL$delegate", "my_city_RB", "getMy_city_RB", "my_city_RB$delegate", "nav_recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getNav_recyclerView", "()Landroid/support/v7/widget/RecyclerView;", "nav_recyclerView$delegate", "placesForRest_NAV_LL", "getPlacesForRest_NAV_LL", "placesForRest_NAV_LL$delegate", "profile_image_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfile_image_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "profile_image_CIV$delegate", "ru_user_container", "getRu_user_container", "ru_user_container$delegate", "searchPair_NAV_LL", "getSearchPair_NAV_LL", "searchPair_NAV_LL$delegate", "settings_NAV_LL", "getSettings_NAV_LL", "settings_NAV_LL$delegate", "topRow_clickListener", "Landroid/view/View$OnClickListener;", "getTopRow_clickListener", "()Landroid/view/View$OnClickListener;", "setTopRow_clickListener", "(Landroid/view/View$OnClickListener;)V", "top_users_container", "getTop_users_container", "top_users_container$delegate", "tu_fs_avatar_IV", "getTu_fs_avatar_IV", "tu_fs_avatar_IV$delegate", "tu_fs_stars_IV", "getTu_fs_stars_IV", "tu_fs_stars_IV$delegate", "tu_fs_status_IV", "getTu_fs_status_IV", "tu_fs_status_IV$delegate", "tu_sn_avatar_IV", "getTu_sn_avatar_IV", "tu_sn_avatar_IV$delegate", "tu_sn_stars_IV", "getTu_sn_stars_IV", "tu_sn_stars_IV$delegate", "tu_sn_status_IV", "getTu_sn_status_IV", "tu_sn_status_IV$delegate", "tu_td_avatar_IV", "getTu_td_avatar_IV", "tu_td_avatar_IV$delegate", "tu_td_stars_IV", "getTu_td_stars_IV", "tu_td_stars_IV$delegate", "tu_td_status_IV", "getTu_td_status_IV", "tu_td_status_IV$delegate", "twentyOne_NAV_LL", "getTwentyOne_NAV_LL", "twentyOne_NAV_LL$delegate", "user_status_container_left", "getUser_status_container_left", "user_status_container_left$delegate", "user_status_container_mid", "getUser_status_container_mid", "user_status_container_mid$delegate", "user_status_container_right", "getUser_status_container_right", "user_status_container_right$delegate", "usersListRV", "getUsersListRV", "usersListRV$delegate", "getData", "", "getPushToken", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "processViews", "dataList", "", "registerPush", "setMenuClicks", "setRecyclerView", "data", "setTopElements", "setupBase", "startSocketService", "updateViewElemets", "app_debug"})
public final class MainActivity extends com.zoomapps.eromance.Helpers.BaseMainActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty usersListRV$delegate = null;
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    private android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager;
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
    private final kotlin.properties.ReadOnlyProperty searchPair_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty momentMeets_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty placesForRest_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty eveningPlans_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty map_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty games_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty imageView17$delegate = null;
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
    private final kotlin.properties.ReadOnlyProperty nav_recyclerView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty profile_image_CIV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty home_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> allUserData;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty all_cities_RB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_city_RB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> adapterData;
    private boolean isStoped;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void setupBase() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPushToken() {
        return null;
    }
    
    public final void registerPush() {
    }
    
    public final void startSocketService() {
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
    public final android.widget.LinearLayout getSearchPair_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMomentMeets_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getPlacesForRest_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getEveningPlans_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMap_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getGames_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageView17() {
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
    public final android.support.v7.widget.RecyclerView getNav_recyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getProfile_image_CIV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getHome_NAV_LL() {
        return null;
    }
    
    public final void setMenuClicks() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> getAllUserData() {
        return null;
    }
    
    public final void setAllUserData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> p0) {
    }
    
    public final void getData() {
    }
    
    public final void setTopElements(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> dataList) {
    }
    
    public final void processViews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> dataList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getAll_cities_RB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getMy_city_RB() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateViewElemets() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> getAdapterData() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.UserProfileModel.Datum> p0) {
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> data) {
    }
    
    public final boolean isStoped() {
        return false;
    }
    
    public final void setStoped(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
}