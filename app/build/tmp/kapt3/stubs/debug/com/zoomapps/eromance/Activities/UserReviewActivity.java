package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010A\u001a\u00020B2\n\u0010C\u001a\u00060\fR\u00020\rJ\u0012\u0010D\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\b\u0010G\u001a\u00020BH\u0016J\u001b\u0010H\u001a\u00020B\"\u0004\b\u0000\u0010I2\u0006\u0010J\u001a\u0002HIH\u0016\u00a2\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020BH\u0016J\u001b\u0010M\u001a\u00020B\"\u0004\b\u0000\u0010I2\u0006\u0010J\u001a\u0002HIH\u0016\u00a2\u0006\u0002\u0010KJ\u0018\u0010N\u001a\u00020B2\u0010\u0010O\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0PR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u0002058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b:\u00107R\u001b\u0010<\u001a\u00020=8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010%\u001a\u0004\b>\u0010?\u00a8\u0006Q"}, d2 = {"Lcom/zoomapps/eromance/Activities/UserReviewActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/IUserReviewsView;", "()V", "currentEntitiyId", "", "getCurrentEntitiyId", "()Ljava/lang/String;", "setCurrentEntitiyId", "(Ljava/lang/String;)V", "data_list", "", "Lcom/zoomapps/eromance/Models/ReviewModel$GetReviewResponseDatum;", "Lcom/zoomapps/eromance/Models/ReviewModel;", "getData_list", "()Ljava/util/List;", "setData_list", "(Ljava/util/List;)V", "isPlace", "", "()Z", "setPlace", "(Z)V", "listLoaded", "getListLoaded", "setListLoaded", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "main_user_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getMain_user_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "main_user_CIV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "main_username_TV", "Landroid/widget/TextView;", "getMain_username_TV", "()Landroid/widget/TextView;", "main_username_TV$delegate", "presenter", "Lcom/zoomapps/eromance/Helpers/UserReviewPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/UserReviewPresenter;", "send_review_ET", "Landroid/widget/EditText;", "getSend_review_ET", "()Landroid/widget/EditText;", "send_review_ET$delegate", "send_review_IV", "Landroid/widget/ImageView;", "getSend_review_IV", "()Landroid/widget/ImageView;", "send_review_IV$delegate", "user_rating_IV", "getUser_rating_IV", "user_rating_IV$delegate", "user_reviews_RV", "Landroid/support/v7/widget/RecyclerView;", "getUser_reviews_RV", "()Landroid/support/v7/widget/RecyclerView;", "user_reviews_RV$delegate", "addDataToRV", "", "item_data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onReviewLoadError", "onReviewSend", "T", "out", "(Ljava/lang/Object;)V", "onReviewSendError", "onReviewsLoaded", "setRV", "datalist", "", "app_debug"})
public final class UserReviewActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.IUserReviewsView {
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.UserReviewPresenter presenter = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentEntitiyId;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> data_list;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty main_user_CIV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty main_username_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_rating_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_reviews_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty send_review_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty send_review_ET$delegate = null;
    private boolean listLoaded;
    private boolean isPlace;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onReviewSend(T out) {
    }
    
    @java.lang.Override()
    public void onReviewSendError() {
    }
    
    @java.lang.Override()
    public void onReviewLoadError() {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onReviewsLoaded(T out) {
    }
    
    public final void addDataToRV(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum item_data) {
    }
    
    public final void setRV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> datalist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.UserReviewPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentEntitiyId() {
        return null;
    }
    
    public final void setCurrentEntitiyId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> getData_list() {
        return null;
    }
    
    public final void setData_list(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getMain_user_CIV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMain_username_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getUser_rating_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getUser_reviews_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getSend_review_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getSend_review_ET() {
        return null;
    }
    
    public final boolean getListLoaded() {
        return false;
    }
    
    public final void setListLoaded(boolean p0) {
    }
    
    public final boolean isPlace() {
        return false;
    }
    
    public final void setPlace(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public UserReviewActivity() {
        super();
    }
}