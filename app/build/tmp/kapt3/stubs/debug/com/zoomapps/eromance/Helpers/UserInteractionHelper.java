package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 12.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J&\u0010\u0019\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\"\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016J!\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/zoomapps/eromance/Helpers/UserInteractionHelper;", "", "mContext", "Landroid/content/Context;", "viewInterface", "Lcom/zoomapps/eromance/Interfaces/IUserInteractionView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/IUserInteractionView;)V", "add_to_fav", "", "getAdd_to_fav", "()I", "getMContext", "()Landroid/content/Context;", "remove_from_fav", "getRemove_from_fav", "getViewInterface", "()Lcom/zoomapps/eromance/Interfaces/IUserInteractionView;", "setViewInterface", "(Lcom/zoomapps/eromance/Interfaces/IUserInteractionView;)V", "addToFavorites", "", "uid", "", "checkFavorites", "to_user", "favorite_action", "isNeedToRemove", "", "fav_id", "getActionResult", "newType", "oldType", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "removeFromFavorites", "setRateToUser", "rateState", "setRating", "type", "(Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public final class UserInteractionHelper {
    private final int add_to_fav = 0;
    private final int remove_from_fav = 1;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private com.zoomapps.eromance.Interfaces.IUserInteractionView viewInterface;
    
    public final int getAdd_to_fav() {
        return 0;
    }
    
    public final int getRemove_from_fav() {
        return 0;
    }
    
    public final void setRateToUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, boolean isNeedToRemove, @org.jetbrains.annotations.Nullable()
    java.lang.String rateState) {
    }
    
    public final void getActionResult(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean newType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer oldType) {
    }
    
    private final void setRating(java.lang.String uid, java.lang.Integer type) {
    }
    
    public final void favorite_action(@org.jetbrains.annotations.Nullable()
    java.lang.String uid, boolean isNeedToRemove, @org.jetbrains.annotations.Nullable()
    java.lang.String fav_id) {
    }
    
    private final void removeFromFavorites(java.lang.String fav_id) {
    }
    
    private final void addToFavorites(java.lang.String uid) {
    }
    
    public final void checkFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.String to_user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IUserInteractionView getViewInterface() {
        return null;
    }
    
    public final void setViewInterface(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IUserInteractionView p0) {
    }
    
    public UserInteractionHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IUserInteractionView viewInterface) {
        super();
    }
}