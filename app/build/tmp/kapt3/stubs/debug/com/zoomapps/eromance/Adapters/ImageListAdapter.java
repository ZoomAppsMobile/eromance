package com.zoomapps.eromance.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B3\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019J\b\u0010!\u001a\u00020\u0019H\u0016J\u001c\u0010\"\u001a\u00020\u001f2\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u0019H\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0019H\u0016R$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ImageListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/ImageListAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/UserPhotosModel$Data;", "Lcom/zoomapps/eromance/Models/UserPhotosModel;", "mContext", "Landroid/content/Context;", "ImageArr", "", "", "(Ljava/util/List;Landroid/content/Context;[Ljava/lang/String;)V", "getImageArr", "()[Ljava/lang/String;", "setImageArr", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "alertD", "Landroid/app/AlertDialog;", "getAlertD", "()Landroid/app/AlertDialog;", "setAlertD", "(Landroid/app/AlertDialog;)V", "selectedItem_ID", "", "getSelectedItem_ID", "()I", "setSelectedItem_ID", "(I)V", "deleteImageRequest", "", "img_ID", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ImageListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.ImageListAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private android.app.AlertDialog alertD;
    private int selectedItem_ID;
    private final java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> mDataset = null;
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] ImageArr;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.ImageListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.AlertDialog getAlertD() {
        return null;
    }
    
    public final void setAlertD(@org.jetbrains.annotations.Nullable()
    android.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.ImageListAdapter.ViewHolder holder, int position) {
    }
    
    public final void deleteImageRequest(int img_ID) {
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
    
    public ImageListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.String[] ImageArr) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ImageListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/ImageListAdapter;Landroid/view/View;)V", "elementRootView", "Lcom/zoomapps/eromance/CustomViews/SquareRelativeLayout;", "getElementRootView", "()Lcom/zoomapps/eromance/CustomViews/SquareRelativeLayout;", "setElementRootView", "(Lcom/zoomapps/eromance/CustomViews/SquareRelativeLayout;)V", "item_image_IV", "Landroid/widget/ImageView;", "getItem_image_IV", "()Landroid/widget/ImageView;", "setItem_image_IV", "(Landroid/widget/ImageView;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_image_IV;
        @org.jetbrains.annotations.Nullable()
        private com.zoomapps.eromance.CustomViews.SquareRelativeLayout elementRootView;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_image_IV() {
            return null;
        }
        
        public final void setItem_image_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.CustomViews.SquareRelativeLayout getElementRootView() {
            return null;
        }
        
        public final void setElementRootView(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.CustomViews.SquareRelativeLayout p0) {
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