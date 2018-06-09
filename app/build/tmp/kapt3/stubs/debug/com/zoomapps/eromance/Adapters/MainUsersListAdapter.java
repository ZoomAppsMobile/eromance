package com.zoomapps.eromance.Adapters;

import java.lang.System;

/**
 * * Created by User on 04.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001a\u0010\u001b\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bJA\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\'R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/zoomapps/eromance/Adapters/MainUsersListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/MainUsersListAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "getUserRatingImage", "star_amount", "(Ljava/lang/Integer;)I", "getUserStatusImage", "status_id", "", "(Ljava/lang/Boolean;)I", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUserData", "posi", "setUserView", "IV_status", "Landroid/widget/ImageView;", "IV_stars", "IV_Avatar", "rating", "", "img_url", "", "is_online", "(Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;)V", "ViewHolder", "app_debug"})
public final class MainUsersListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.MainUsersListAdapter.ViewHolder> {
    private final java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> mDataset = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.MainUsersListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final int getUserRatingImage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer star_amount) {
        return 0;
    }
    
    public final int getUserStatusImage(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean status_id) {
        return 0;
    }
    
    public final void setUserView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView IV_status, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView IV_stars, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView IV_Avatar, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating, @org.jetbrains.annotations.Nullable()
    java.lang.String img_url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_online) {
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.MainUsersListAdapter.ViewHolder holder, int posi) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.MainUsersListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MainUsersListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/zoomapps/eromance/Adapters/MainUsersListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/MainUsersListAdapter;Landroid/view/View;)V", "element_avatar_IV", "Landroid/widget/ImageView;", "getElement_avatar_IV", "()Landroid/widget/ImageView;", "setElement_avatar_IV", "(Landroid/widget/ImageView;)V", "element_stars_IV", "getElement_stars_IV", "setElement_stars_IV", "element_status_IV", "getElement_status_IV", "setElement_status_IV", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "users_row_container", "Landroid/widget/LinearLayout;", "getUsers_row_container", "()Landroid/widget/LinearLayout;", "setUsers_row_container", "(Landroid/widget/LinearLayout;)V", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout users_row_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView element_avatar_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView element_status_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView element_stars_IV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getUsers_row_container() {
            return null;
        }
        
        public final void setUsers_row_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getElement_avatar_IV() {
            return null;
        }
        
        public final void setElement_avatar_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getElement_status_IV() {
            return null;
        }
        
        public final void setElement_status_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getElement_stars_IV() {
            return null;
        }
        
        public final void setElement_stars_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMyView() {
            return null;
        }
        
        public final void setMyView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View myView) {
            super(null);
        }
    }
}