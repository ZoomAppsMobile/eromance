package com.zoomapps.eromance.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel;", "", "()V", "Data", "IdValueModel", "LocationCity", "LocationCountry", "TranslationResponse", "UserProfileSex", "app_debug"})
public final class TranslationModel {
    
    public TranslationModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$Data;", "", "()V", "locationCities", "", "Lcom/zoomapps/eromance/Models/TranslationModel$IdValueModel;", "getLocationCities", "()Ljava/util/List;", "setLocationCities", "(Ljava/util/List;)V", "locationCountries", "getLocationCountries", "setLocationCountries", "userProfileSexes", "getUserProfileSexes", "setUserProfileSexes", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "location_countries")
        private java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> locationCountries;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "location_cities")
        private java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> locationCities;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_profile_sexes")
        private java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> userProfileSexes;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> getLocationCountries() {
            return null;
        }
        
        public final void setLocationCountries(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> getLocationCities() {
            return null;
        }
        
        public final void setLocationCities(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> getUserProfileSexes() {
            return null;
        }
        
        public final void setUserProfileSexes(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$IdValueModel;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_debug"})
    public static final class IdValueModel {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public IdValueModel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$LocationCity;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_debug"})
    public static final class LocationCity {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public LocationCity() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$LocationCountry;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_debug"})
    public static final class LocationCountry {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public LocationCountry() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$TranslationResponse;", "", "()V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/TranslationModel$Data;", "getData", "()Lcom/zoomapps/eromance/Models/TranslationModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/TranslationModel$Data;)V", "app_debug"})
    public static final class TranslationResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.TranslationModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.TranslationModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.TranslationModel.Data p0) {
        }
        
        public TranslationResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/TranslationModel$UserProfileSex;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_debug"})
    public static final class UserProfileSex {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public UserProfileSex() {
            super();
        }
    }
}