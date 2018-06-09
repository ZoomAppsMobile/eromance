package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001pB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020RJ\u0006\u0010T\u001a\u00020RJ\b\u0010U\u001a\u00020RH\u0004J\"\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0006\u0010[\u001a\u00020RJ\u0012\u0010\\\u001a\u00020R2\b\u0010]\u001a\u0004\u0018\u00010^H\u0014J\u001a\u0010_\u001a\u00020R2\b\u0010`\u001a\u0004\u0018\u00010\u00072\u0006\u0010a\u001a\u00020\u0005H\u0016J-\u0010b\u001a\u00020R2\u0006\u0010W\u001a\u00020\u00052\u000e\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070d2\u0006\u0010e\u001a\u00020fH\u0016\u00a2\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020R2\b\u0010`\u001a\u0004\u0018\u00010\u0007J\u0010\u0010i\u001a\u00020R2\b\u0010j\u001a\u0004\u0018\u00010\u0007J\u0006\u0010k\u001a\u00020RJ\u0006\u0010l\u001a\u00020RJ\u000e\u0010m\u001a\u00020R2\u0006\u0010n\u001a\u00020oR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0011\u0010\u000bR\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001c\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u0016R\u001b\u0010!\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b\"\u0010\u0016R\u001b\u0010$\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b%\u0010\u0016R\u001b\u0010\'\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b(\u0010\u0016R\u001b\u0010*\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b+\u0010\u0016R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b/\u00100R\u001e\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b?\u0010\r\u001a\u0004\b>\u0010;R\u001b\u0010@\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\bA\u0010;R\u001b\u0010C\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010\r\u001a\u0004\bD\u0010;R\u001b\u0010F\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\r\u001a\u0004\bG\u0010\u0016R\u001c\u0010I\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001b\u0010N\u001a\u0002098FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bP\u0010\r\u001a\u0004\bO\u0010;\u00a8\u0006q"}, d2 = {"Lcom/zoomapps/eromance/Activities/MyProfileActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/DialogFragment/DialogFragmentInteraction;", "()V", "REQUEST_WRITE_STORAGE", "", "TAG", "", "become_vip_IV", "Landroid/widget/ImageView;", "getBecome_vip_IV", "()Landroid/widget/ImageView;", "become_vip_IV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "edit_status_IV", "getEdit_status_IV", "edit_status_IV$delegate", "is_vip_IV", "is_vip_IV$delegate", "my_balance_LL", "Landroid/widget/LinearLayout;", "getMy_balance_LL", "()Landroid/widget/LinearLayout;", "my_balance_LL$delegate", "my_chats_LL", "getMy_chats_LL", "my_chats_LL$delegate", "my_favorites_LL", "getMy_favorites_LL", "my_favorites_LL$delegate", "my_gifts_LL", "getMy_gifts_LL", "my_gifts_LL$delegate", "my_guests_LL", "getMy_guests_LL", "my_guests_LL$delegate", "my_likes_LL", "getMy_likes_LL", "my_likes_LL$delegate", "my_notifications_LL", "getMy_notifications_LL", "my_notifications_LL$delegate", "my_photoalbum_LL", "getMy_photoalbum_LL", "my_photoalbum_LL$delegate", "profile_image_IV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfile_image_IV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "profile_image_IV$delegate", "userStatus_ID", "getUserStatus_ID", "()Ljava/lang/Integer;", "setUserStatus_ID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "user_city_TV", "Landroid/widget/TextView;", "getUser_city_TV", "()Landroid/widget/TextView;", "user_city_TV$delegate", "user_coins_TV", "getUser_coins_TV", "user_coins_TV$delegate", "user_country_TV", "getUser_country_TV", "user_country_TV$delegate", "user_name_TV", "getUser_name_TV", "user_name_TV$delegate", "user_profile_LL", "getUser_profile_LL", "user_profile_LL$delegate", "user_status", "getUser_status", "()Ljava/lang/String;", "setUser_status", "(Ljava/lang/String;)V", "user_status_TV", "getUser_status_TV", "user_status_TV$delegate", "checkPermission", "", "editStatus", "getUserStatus", "makeRequest", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBecomeVip", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOkPressed", "content", "code", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStatusEdit", "setStatus", "new_status", "setUserData", "setVipStatus", "uploadAvatar", "imageUri", "Landroid/net/Uri;", "UploadService", "app_debug"})
public final class MyProfileActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.DialogFragment.DialogFragmentInteraction {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty profile_image_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_name_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_country_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_city_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_coins_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_profile_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_guests_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_favorites_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_notifications_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_photoalbum_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_gifts_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_chats_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_likes_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty my_balance_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty is_vip_IV$delegate = null;
    private final java.lang.String TAG = "PermissionDemo";
    private final int REQUEST_WRITE_STORAGE = 112;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_status_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty edit_status_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty become_vip_IV$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer userStatus_ID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_status;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onOkPressed(@org.jetbrains.annotations.Nullable()
    java.lang.String content, int code) {
    }
    
    public final void onBecomeVip() {
    }
    
    public final void onStatusEdit(@org.jetbrains.annotations.Nullable()
    java.lang.String content) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getProfile_image_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUser_name_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUser_country_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUser_city_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUser_coins_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getUser_profile_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_guests_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_favorites_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_notifications_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_photoalbum_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_gifts_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_chats_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_likes_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMy_balance_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView is_vip_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUser_status_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getEdit_status_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBecome_vip_IV() {
        return null;
    }
    
    public final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    protected final void makeRequest() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setUserData() {
    }
    
    public final void setVipStatus() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserStatus_ID() {
        return null;
    }
    
    public final void setUserStatus_ID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_status() {
        return null;
    }
    
    public final void setUser_status(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void getUserStatus() {
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String new_status) {
    }
    
    public final void editStatus() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void uploadAvatar(@org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri) {
    }
    
    public MyProfileActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/zoomapps/eromance/Activities/MyProfileActivity$UploadService;", "", "()V", "MEDIA_TYPE_PNG", "Lokhttp3/MediaType;", "uploadImage", "Lokhttp3/Call;", "image", "Ljava/io/File;", "imageName", "", "url_path", "callback", "Lokhttp3/Callback;", "app_debug"})
    public static final class UploadService {
        private final okhttp3.MediaType MEDIA_TYPE_PNG = null;
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.Call uploadImage(@org.jetbrains.annotations.NotNull()
        java.io.File image, @org.jetbrains.annotations.NotNull()
        java.lang.String imageName, @org.jetbrains.annotations.NotNull()
        java.lang.String url_path, @org.jetbrains.annotations.NotNull()
        okhttp3.Callback callback) {
            return null;
        }
        
        public UploadService() {
            super();
        }
    }
}