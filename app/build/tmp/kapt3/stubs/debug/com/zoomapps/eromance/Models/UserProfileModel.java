package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 20.04.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\f"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel;", "", "()V", "BornAt", "CreatedAt", "Data", "Datum", "ProfileFindResponse", "UpdatedAt", "User", "UserData", "UserProfileResponse", "app_debug"})
public final class UserProfileModel {
    
    public UserProfileModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$BornAt;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "timezone", "getTimezone", "setTimezone", "timezoneType", "", "getTimezoneType", "()Ljava/lang/Integer;", "setTimezoneType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
    public final class BornAt {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "date")
        private java.lang.String date;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone_type")
        private java.lang.Integer timezoneType;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone")
        private java.lang.String timezone;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTimezoneType() {
            return null;
        }
        
        public final void setTimezoneType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimezone() {
            return null;
        }
        
        public final void setTimezone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public BornAt() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$CreatedAt;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "timezone", "getTimezone", "setTimezone", "timezoneType", "", "getTimezoneType", "()Ljava/lang/Integer;", "setTimezoneType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
    public final class CreatedAt {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "date")
        private java.lang.String date;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone_type")
        private java.lang.Integer timezoneType;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone")
        private java.lang.String timezone;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTimezoneType() {
            return null;
        }
        
        public final void setTimezoneType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimezone() {
            return null;
        }
        
        public final void setTimezone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public CreatedAt() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\"\u001a\b\u0018\u00010#R\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\"\u0010+\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\"\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR \u00107\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000e\"\u0004\b9\u0010\u0010R\"\u0010:\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010\u001dR\"\u0010=\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR$\u0010@\u001a\b\u0018\u00010AR\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001d\u00a8\u0006I"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$Data;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "aboutInterests", "getAboutInterests", "()Ljava/lang/Object;", "setAboutInterests", "(Ljava/lang/Object;)V", "aboutPerson", "getAboutPerson", "setAboutPerson", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "bornAt", "Lcom/zoomapps/eromance/Models/UserProfileModel$BornAt;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getBornAt", "()Lcom/zoomapps/eromance/Models/UserProfileModel$BornAt;", "setBornAt", "(Lcom/zoomapps/eromance/Models/UserProfileModel$BornAt;)V", "cityId", "", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "countryId", "getCountryId", "setCountryId", "createdAt", "Lcom/zoomapps/eromance/Models/UserProfileModel$CreatedAt;", "getCreatedAt", "()Lcom/zoomapps/eromance/Models/UserProfileModel$CreatedAt;", "setCreatedAt", "(Lcom/zoomapps/eromance/Models/UserProfileModel$CreatedAt;)V", "firstName", "getFirstName", "setFirstName", "id", "getId", "setId", "isVip", "", "()Ljava/lang/Boolean;", "setVip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "languageId", "getLanguageId", "setLanguageId", "lastName", "getLastName", "setLastName", "rating", "getRating", "setRating", "sexId", "getSexId", "setSexId", "updatedAt", "Lcom/zoomapps/eromance/Models/UserProfileModel$UpdatedAt;", "getUpdatedAt", "()Lcom/zoomapps/eromance/Models/UserProfileModel$UpdatedAt;", "setUpdatedAt", "(Lcom/zoomapps/eromance/Models/UserProfileModel$UpdatedAt;)V", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "first_name")
        private java.lang.String firstName;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "last_name")
        private java.lang.String lastName;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "about_person")
        private java.lang.Object aboutPerson;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "about_interests")
        private java.lang.Object aboutInterests;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "born_at")
        private com.zoomapps.eromance.Models.UserProfileModel.BornAt bornAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "avatar")
        private java.lang.String avatar;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "sex_id")
        private java.lang.Integer sexId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country_id")
        private java.lang.Integer countryId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city_id")
        private java.lang.Integer cityId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "language_id")
        private java.lang.Integer languageId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "rating")
        private java.lang.Integer rating;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_vip")
        private java.lang.Boolean isVip;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private com.zoomapps.eromance.Models.UserProfileModel.CreatedAt createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private com.zoomapps.eromance.Models.UserProfileModel.UpdatedAt updatedAt;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFirstName() {
            return null;
        }
        
        public final void setFirstName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastName() {
            return null;
        }
        
        public final void setLastName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAboutPerson() {
            return null;
        }
        
        public final void setAboutPerson(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAboutInterests() {
            return null;
        }
        
        public final void setAboutInterests(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.BornAt getBornAt() {
            return null;
        }
        
        public final void setBornAt(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.BornAt p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvatar() {
            return null;
        }
        
        public final void setAvatar(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUserId() {
            return null;
        }
        
        public final void setUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSexId() {
            return null;
        }
        
        public final void setSexId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountryId() {
            return null;
        }
        
        public final void setCountryId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCityId() {
            return null;
        }
        
        public final void setCityId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLanguageId() {
            return null;
        }
        
        public final void setLanguageId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getRating() {
            return null;
        }
        
        public final void setRating(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isVip() {
            return null;
        }
        
        public final void setVip(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.CreatedAt getCreatedAt() {
            return null;
        }
        
        public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.CreatedAt p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.UpdatedAt getUpdatedAt() {
            return null;
        }
        
        public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.UpdatedAt p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$UpdatedAt;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "timezone", "getTimezone", "setTimezone", "timezoneType", "", "getTimezoneType", "()Ljava/lang/Integer;", "setTimezoneType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
    public final class UpdatedAt {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "date")
        private java.lang.String date;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone_type")
        private java.lang.Integer timezoneType;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "timezone")
        private java.lang.String timezone;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTimezoneType() {
            return null;
        }
        
        public final void setTimezoneType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimezone() {
            return null;
        }
        
        public final void setTimezone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public UpdatedAt() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$UserProfileResponse;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/UserProfileModel$Data;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getData", "()Lcom/zoomapps/eromance/Models/UserProfileModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/UserProfileModel$Data;)V", "app_debug"})
    public final class UserProfileResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.UserProfileModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.Data p0) {
        }
        
        public UserProfileResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$ProfileFindResponse;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
    public final class ProfileFindResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.UserProfileModel.Datum> p0) {
        }
        
        public ProfileFindResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\"\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\"\u0010,\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\"\u0010/\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR \u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR$\u00105\u001a\b\u0018\u000106R\u0002078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000e\u00a8\u0006?"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "bornAt", "", "getBornAt", "()Ljava/lang/String;", "setBornAt", "(Ljava/lang/String;)V", "cityId", "", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "countryId", "getCountryId", "setCountryId", "createdAt", "getCreatedAt", "setCreatedAt", "id", "getId", "setId", "isAdult", "", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "languageId", "getLanguageId", "setLanguageId", "rating", "", "getRating", "()Ljava/lang/Double;", "setRating", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "realName", "getRealName", "setRealName", "searchFor", "getSearchFor", "setSearchFor", "sexId", "getSexId", "setSexId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "user", "Lcom/zoomapps/eromance/Models/UserProfileModel$User;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getUser", "()Lcom/zoomapps/eromance/Models/UserProfileModel$User;", "setUser", "(Lcom/zoomapps/eromance/Models/UserProfileModel$User;)V", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Datum {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "real_name")
        private java.lang.String realName;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "born_at")
        private java.lang.String bornAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "sex_id")
        private java.lang.Integer sexId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "search_for")
        private java.lang.Integer searchFor;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country_id")
        private java.lang.Integer countryId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city_id")
        private java.lang.Integer cityId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "language_id")
        private java.lang.Integer languageId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "rating")
        private java.lang.Double rating;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_adult")
        private java.lang.Boolean isAdult;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private java.lang.String createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private java.lang.String updatedAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user")
        private com.zoomapps.eromance.Models.UserProfileModel.User user;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBornAt() {
            return null;
        }
        
        public final void setBornAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUserId() {
            return null;
        }
        
        public final void setUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSexId() {
            return null;
        }
        
        public final void setSexId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSearchFor() {
            return null;
        }
        
        public final void setSearchFor(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountryId() {
            return null;
        }
        
        public final void setCountryId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCityId() {
            return null;
        }
        
        public final void setCityId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLanguageId() {
            return null;
        }
        
        public final void setLanguageId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getRating() {
            return null;
        }
        
        public final void setRating(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isAdult() {
            return null;
        }
        
        public final void setAdult(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.User getUser() {
            return null;
        }
        
        public final void setUser(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.User p0) {
        }
        
        public Datum() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$User;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "data", "Lcom/zoomapps/eromance/Models/UserProfileModel$UserData;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "getData", "()Lcom/zoomapps/eromance/Models/UserProfileModel$UserData;", "setData", "(Lcom/zoomapps/eromance/Models/UserProfileModel$UserData;)V", "app_debug"})
    public final class User {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.UserProfileModel.UserData data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileModel.UserData getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileModel.UserData p0) {
        }
        
        public User() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR \u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR\"\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR \u0010)\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR \u0010,\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000f\u00a8\u0006/"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileModel$UserData;", "", "(Lcom/zoomapps/eromance/Models/UserProfileModel;)V", "amount", "", "getAmount", "()Ljava/lang/Integer;", "setAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "email", "getEmail", "setEmail", "id", "getId", "setId", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isVip", "setVip", "is_online", "set_online", "phone", "getPhone", "setPhone", "typeId", "getTypeId", "setTypeId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "username", "getUsername", "setUsername", "app_debug"})
    public final class UserData {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "username")
        private java.lang.String username;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "email")
        private java.lang.String email;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "phone")
        private java.lang.String phone;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "avatar")
        private java.lang.String avatar;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_active")
        private java.lang.Boolean isActive;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "amount")
        private java.lang.Integer amount;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "type_id")
        private java.lang.Integer typeId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_vip")
        private java.lang.Boolean isVip;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private java.lang.String createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private java.lang.String updatedAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_online")
        private java.lang.Boolean is_online;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsername() {
            return null;
        }
        
        public final void setUsername(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvatar() {
            return null;
        }
        
        public final void setAvatar(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isActive() {
            return null;
        }
        
        public final void setActive(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAmount() {
            return null;
        }
        
        public final void setAmount(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTypeId() {
            return null;
        }
        
        public final void setTypeId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isVip() {
            return null;
        }
        
        public final void setVip(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean is_online() {
            return null;
        }
        
        public final void set_online(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public UserData() {
            super();
        }
    }
}