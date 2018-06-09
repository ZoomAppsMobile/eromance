package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 03.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u001d\u0010\u0015\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00162\b\u0010\u0017\u001a\u0004\u0018\u0001H\u0016H\u0016\u00a2\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u0002H\u0016H\u0016\u00a2\u0006\u0002\u0010\u0018J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/zoomapps/eromance/Helpers/UserReviewPresenter;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "mContext", "Landroid/content/Context;", "viewInterface", "Lcom/zoomapps/eromance/Interfaces/IUserReviewsView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/IUserReviewsView;)V", "getMContext", "()Landroid/content/Context;", "rqstMkr", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getRqstMkr", "()Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getViewInterface", "()Lcom/zoomapps/eromance/Interfaces/IUserReviewsView;", "loadReviews", "", "entity_id", "", "isPlace", "", "onError", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "sendReview", "content_text", "setUserDataToView", "avatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "userName", "Landroid/widget/TextView;", "rating", "Landroid/widget/ImageView;", "data", "Landroid/content/Intent;", "app_debug"})
public final class UserReviewPresenter implements com.zoomapps.eromance.Interfaces.RequestMakerListener {
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.RequestMaker rqstMkr = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Interfaces.IUserReviewsView viewInterface = null;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.RequestMaker getRqstMkr() {
        return null;
    }
    
    public final void loadReviews(@org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, boolean isPlace) {
    }
    
    public final void setUserDataToView(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView avatar, @org.jetbrains.annotations.NotNull()
    android.widget.TextView userName, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView rating, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void sendReview(@org.jetbrains.annotations.NotNull()
    java.lang.String content_text, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, boolean isPlace) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IUserReviewsView getViewInterface() {
        return null;
    }
    
    public UserReviewPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IUserReviewsView viewInterface) {
        super();
    }
}