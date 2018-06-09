package com.zoomapps.eromance.Adapters;

import java.lang.System;

/**
 * * Created by User on 06.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B3\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016R$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/zoomapps/eromance/Adapters/UserPhotosAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/UserPhotosAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/UserPhotosModel$Data;", "Lcom/zoomapps/eromance/Models/UserPhotosModel;", "mContext", "Landroid/content/Context;", "ImageArr", "", "", "(Ljava/util/List;Landroid/content/Context;[Ljava/lang/String;)V", "getImageArr", "()[Ljava/lang/String;", "setImageArr", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "selectedItem_ID", "", "getSelectedItem_ID", "()I", "setSelectedItem_ID", "(I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class UserPhotosAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.UserPhotosAdapter.ViewHolder> {
    private int selectedItem_ID;
    private final java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> mDataset = null;
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] ImageArr;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.UserPhotosAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.UserPhotosAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final int getSelectedItem_ID() {
        return 0;
    }
    
    public final void setSelectedItem_ID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getImageArr() {
        return null;
    }
    
    public final void setImageArr(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    public UserPhotosAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.String[] ImageArr) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/zoomapps/eromance/Adapters/UserPhotosAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/UserPhotosAdapter;Landroid/view/View;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "user_image_frame_container", "Landroid/widget/FrameLayout;", "getUser_image_frame_container", "()Landroid/widget/FrameLayout;", "setUser_image_frame_container", "(Landroid/widget/FrameLayout;)V", "user_photo_IV", "Landroid/widget/ImageView;", "getUser_photo_IV", "()Landroid/widget/ImageView;", "setUser_photo_IV", "(Landroid/widget/ImageView;)V", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView user_photo_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.FrameLayout user_image_frame_container;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getUser_photo_IV() {
            return null;
        }
        
        public final void setUser_photo_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.FrameLayout getUser_image_frame_container() {
            return null;
        }
        
        public final void setUser_image_frame_container(@org.jetbrains.annotations.Nullable()
        android.widget.FrameLayout p0) {
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