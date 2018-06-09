package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 25.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J%\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0007J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020 J\'\u0010!\u001a\u00020\u001c\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\u0006\u0010\"\u001a\u0002H\u000bH\u0002\u00a2\u0006\u0002\u0010#J+\u0010$\u001a\u00020\u001c\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u001d\u001a\u0002H\u000b\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\'\u001a\u0002H\u000b\u00a2\u0006\u0002\u0010(\u00a8\u0006)"}, d2 = {"Lcom/zoomapps/eromance/Helpers/DB_Helper;", "", "()V", "getEveningsTypes", "", "Lcom/zoomapps/eromance/Models/EveningTypesDatum;", "_rlm", "Lio/realm/Realm;", "getMeetTypes", "Lcom/zoomapps/eromance/Models/MeetTypesDatum;", "getSavedData", "T", "Lio/realm/RealmModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lio/realm/RealmModel;", "getSavedEveningTypes", "rlm", "getSavedMeetTypes", "getSavedPlaceTypes", "Lcom/zoomapps/eromance/Models/Types/PlaceTypesDatum;", "mapEveningToSimple", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/SimpleTypeDatum;", "mD", "mapMeetToSimple", "mapPlacesToSimple", "saveEveningTypes", "", "saveData", "Lcom/zoomapps/eromance/Models/EveningTypesResponse;", "saveMeetTypes", "Lcom/zoomapps/eromance/Models/MeetTypesResponse;", "saveType_by_ClassName", "table", "(Lio/realm/RealmModel;Lio/realm/RealmModel;)V", "saveTypes", "(Ljava/lang/Class;Lio/realm/RealmModel;)V", "setDataToGlobal", "savedData", "(Ljava/lang/Object;)V", "app_debug"})
public final class DB_Helper {
    public static final com.zoomapps.eromance.Helpers.DB_Helper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> mapMeetToSimple(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zoomapps.eromance.Models.MeetTypesDatum> mD) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> mapEveningToSimple(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zoomapps.eromance.Models.EveningTypesDatum> mD) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> mapPlacesToSimple(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zoomapps.eromance.Models.Types.PlaceTypesDatum> mD) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.MeetTypesDatum> getMeetTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm _rlm) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.MeetTypesDatum> getSavedMeetTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm rlm) {
        return null;
    }
    
    public final void saveMeetTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm rlm, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.MeetTypesResponse saveData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.EveningTypesDatum> getEveningsTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm _rlm) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.EveningTypesDatum> getSavedEveningTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm rlm) {
        return null;
    }
    
    public final void saveEveningTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm rlm, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.EveningTypesResponse saveData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> getSavedPlaceTypes(@org.jetbrains.annotations.NotNull()
    io.realm.Realm rlm) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> getSavedPlaceTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends io.realm.RealmModel>T getSavedData(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public final <T extends java.lang.Object>void setDataToGlobal(T savedData) {
    }
    
    public final <T extends io.realm.RealmModel>void saveTypes(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    T saveData) {
    }
    
    private final <T extends io.realm.RealmModel>void saveType_by_ClassName(T saveData, T table) {
    }
    
    private DB_Helper() {
        super();
    }
}