package com.zoomapps.eromance.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0017\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u001bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/zoomapps/eromance/Adapters/PlacesListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/PlacesListAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/PlacesModel$Datum;", "Lcom/zoomapps/eromance/Models/PlacesModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getColorValue", "", "ci", "getItemCount", "onBindViewHolder", "", "h", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "openPlace", "place_id", "", "placeTypeConverter", "type_id_val", "(Ljava/lang/Integer;)Ljava/lang/String;", "ViewHolder", "app_debug"})
public final class PlacesListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.PlacesListAdapter.ViewHolder> {
    private final java.util.List<com.zoomapps.eromance.Models.PlacesModel.Datum> mDataset = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.PlacesListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String placeTypeConverter(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type_id_val) {
        return null;
    }
    
    public final int getColorValue(int ci) {
        return 0;
    }
    
    public final void openPlace(@org.jetbrains.annotations.Nullable()
    java.lang.String place_id) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.PlacesListAdapter.ViewHolder h, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PlacesListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.PlacesModel.Datum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\u001c\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001c\u0010*\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R\u001c\u0010-\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR\u001c\u00100\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\u001c\u00103\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019\u00a8\u00066"}, d2 = {"Lcom/zoomapps/eromance/Adapters/PlacesListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/PlacesListAdapter;Landroid/view/View;)V", "adressRecreationTV", "Landroid/widget/TextView;", "getAdressRecreationTV", "()Landroid/widget/TextView;", "setAdressRecreationTV", "(Landroid/widget/TextView;)V", "average_check_TV", "getAverage_check_TV", "setAverage_check_TV", "callToPlace_IV", "Landroid/widget/ImageView;", "getCallToPlace_IV", "()Landroid/widget/ImageView;", "setCallToPlace_IV", "(Landroid/widget/ImageView;)V", "main_item_container", "Landroid/widget/LinearLayout;", "getMain_item_container", "()Landroid/widget/LinearLayout;", "setMain_item_container", "(Landroid/widget/LinearLayout;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "opening_hourTV", "getOpening_hourTV", "setOpening_hourTV", "place_menu_TV", "getPlace_menu_TV", "setPlace_menu_TV", "place_title_TV", "getPlace_title_TV", "setPlace_title_TV", "place_type_TV", "getPlace_type_TV", "setPlace_type_TV", "showPlaceOnMap_IV", "getShowPlaceOnMap_IV", "setShowPlaceOnMap_IV", "siteRecreationTV", "getSiteRecreationTV", "setSiteRecreationTV", "telephoneTV", "getTelephoneTV", "setTelephoneTV", "vip_image_container", "getVip_image_container", "setVip_image_container", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout main_item_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout vip_image_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView place_title_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView place_type_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView place_menu_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView average_check_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView opening_hourTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView telephoneTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView siteRecreationTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView adressRecreationTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView callToPlace_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView showPlaceOnMap_IV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getMain_item_container() {
            return null;
        }
        
        public final void setMain_item_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getVip_image_container() {
            return null;
        }
        
        public final void setVip_image_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getPlace_title_TV() {
            return null;
        }
        
        public final void setPlace_title_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getPlace_type_TV() {
            return null;
        }
        
        public final void setPlace_type_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getPlace_menu_TV() {
            return null;
        }
        
        public final void setPlace_menu_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getAverage_check_TV() {
            return null;
        }
        
        public final void setAverage_check_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getOpening_hourTV() {
            return null;
        }
        
        public final void setOpening_hourTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTelephoneTV() {
            return null;
        }
        
        public final void setTelephoneTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getSiteRecreationTV() {
            return null;
        }
        
        public final void setSiteRecreationTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getAdressRecreationTV() {
            return null;
        }
        
        public final void setAdressRecreationTV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getCallToPlace_IV() {
            return null;
        }
        
        public final void setCallToPlace_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getShowPlaceOnMap_IV() {
            return null;
        }
        
        public final void setShowPlaceOnMap_IV(@org.jetbrains.annotations.Nullable()
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