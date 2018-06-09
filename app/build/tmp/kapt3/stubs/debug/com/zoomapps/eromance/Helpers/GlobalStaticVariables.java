package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 27.04.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R \u0010:\u001a\b\u0018\u00010;R\u00020<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\"\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0014\"\u0004\bE\u0010\u0016R\u001e\u0010F\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\"\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0014\"\u0004\bL\u0010\u0016R-\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0Nj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#`O\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\"\u0010R\u001a\n T*\u0004\u0018\u00010S0SX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010\'R\"\u0010\\\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0014\"\u0004\b_\u0010\u0016\u00a8\u0006`"}, d2 = {"Lcom/zoomapps/eromance/Helpers/GlobalStaticVariables;", "", "()V", "allTranslations", "Lcom/zoomapps/eromance/Models/TranslationModel$Data;", "getAllTranslations", "()Lcom/zoomapps/eromance/Models/TranslationModel$Data;", "setAllTranslations", "(Lcom/zoomapps/eromance/Models/TranslationModel$Data;)V", "current_intercular_id", "", "getCurrent_intercular_id", "()Ljava/lang/Integer;", "setCurrent_intercular_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "eveningTypes_LIST", "", "Lcom/zoomapps/eromance/Models/EveningTypesDatum;", "getEveningTypes_LIST", "()Ljava/util/List;", "setEveningTypes_LIST", "(Ljava/util/List;)V", "isMessageIsSubscribed", "", "()Z", "setMessageIsSubscribed", "(Z)V", "isSocketServiceActive", "isUser_Twenty_One_Provider", "()Ljava/lang/Boolean;", "setUser_Twenty_One_Provider", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "language_type", "", "getLanguage_type", "()Ljava/lang/String;", "setLanguage_type", "(Ljava/lang/String;)V", "mAppInstance", "Lcom/zoomapps/eromance/MyApplication;", "getMAppInstance", "()Lcom/zoomapps/eromance/MyApplication;", "setMAppInstance", "(Lcom/zoomapps/eromance/MyApplication;)V", "maxUserHeight", "getMaxUserHeight", "()I", "setMaxUserHeight", "(I)V", "maxUserWeight", "getMaxUserWeight", "setMaxUserWeight", "meetTypes_LIST", "Lcom/zoomapps/eromance/Models/MeetTypesDatum;", "getMeetTypes_LIST", "setMeetTypes_LIST", "myData", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel;", "getMyData", "()Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;", "setMyData", "(Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;)V", "myId", "placeTypes_LIST", "Lcom/zoomapps/eromance/Models/Types/PlaceTypesDatum;", "getPlaceTypes_LIST", "setPlaceTypes_LIST", "providing_service_id", "getProviding_service_id", "setProviding_service_id", "quessionaryValues_List", "Lcom/zoomapps/eromance/Models/QuessionariesValuesDatum;", "getQuessionaryValues_List", "setQuessionaryValues_List", "questions_with_keys_group_id_list", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getQuestions_with_keys_group_id_list", "()Ljava/util/HashMap;", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "testVirablies", "getTestVirablies", "setTestVirablies", "userServicesTypes_LIST", "Lcom/zoomapps/eromance/Models/Types/UserServiceTypesDatum;", "getUserServicesTypes_LIST", "setUserServicesTypes_LIST", "app_debug"})
public final class GlobalStaticVariables {
    @org.jetbrains.annotations.Nullable()
    private static com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum myData;
    @org.jetbrains.annotations.Nullable()
    private static com.zoomapps.eromance.Models.TranslationModel.Data allTranslations;
    @org.jetbrains.annotations.Nullable()
    public static java.lang.Integer myId;
    private static android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.zoomapps.eromance.Models.MeetTypesDatum> meetTypes_LIST;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.zoomapps.eromance.Models.EveningTypesDatum> eveningTypes_LIST;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.zoomapps.eromance.Models.Types.PlaceTypesDatum> placeTypes_LIST;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> userServicesTypes_LIST;
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<? extends com.zoomapps.eromance.Models.QuessionariesValuesDatum> quessionaryValues_List;
    @org.jetbrains.annotations.Nullable()
    private static com.zoomapps.eromance.MyApplication mAppInstance;
    private static int maxUserWeight;
    private static int maxUserHeight;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String testVirablies;
    private static boolean isMessageIsSubscribed;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer current_intercular_id;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Boolean isUser_Twenty_One_Provider;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String language_type;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer providing_service_id;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> questions_with_keys_group_id_list = null;
    public static boolean isSocketServiceActive;
    public static final com.zoomapps.eromance.Helpers.GlobalStaticVariables INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum getMyData() {
        return null;
    }
    
    public final void setMyData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.TranslationModel.Data getAllTranslations() {
        return null;
    }
    
    public final void setAllTranslations(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.TranslationModel.Data p0) {
    }
    
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.MeetTypesDatum> getMeetTypes_LIST() {
        return null;
    }
    
    public final void setMeetTypes_LIST(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.MeetTypesDatum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.EveningTypesDatum> getEveningTypes_LIST() {
        return null;
    }
    
    public final void setEveningTypes_LIST(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.EveningTypesDatum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> getPlaceTypes_LIST() {
        return null;
    }
    
    public final void setPlaceTypes_LIST(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.Types.PlaceTypesDatum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> getUserServicesTypes_LIST() {
        return null;
    }
    
    public final void setUserServicesTypes_LIST(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.QuessionariesValuesDatum> getQuessionaryValues_List() {
        return null;
    }
    
    public final void setQuessionaryValues_List(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.QuessionariesValuesDatum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.MyApplication getMAppInstance() {
        return null;
    }
    
    public final void setMAppInstance(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.MyApplication p0) {
    }
    
    public final int getMaxUserWeight() {
        return 0;
    }
    
    public final void setMaxUserWeight(int p0) {
    }
    
    public final int getMaxUserHeight() {
        return 0;
    }
    
    public final void setMaxUserHeight(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTestVirablies() {
        return null;
    }
    
    public final void setTestVirablies(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isMessageIsSubscribed() {
        return false;
    }
    
    public final void setMessageIsSubscribed(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrent_intercular_id() {
        return null;
    }
    
    public final void setCurrent_intercular_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isUser_Twenty_One_Provider() {
        return null;
    }
    
    public final void setUser_Twenty_One_Provider(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage_type() {
        return null;
    }
    
    public final void setLanguage_type(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getProviding_service_id() {
        return null;
    }
    
    public final void setProviding_service_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, java.lang.String> getQuestions_with_keys_group_id_list() {
        return null;
    }
    
    private GlobalStaticVariables() {
        super();
    }
}