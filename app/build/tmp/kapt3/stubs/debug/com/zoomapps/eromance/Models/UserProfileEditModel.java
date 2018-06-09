package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 01.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileEditModel;", "", "()V", "Data", "Errors", "UserProfileEditResponse", "app_debug"})
public final class UserProfileEditModel {
    
    public UserProfileEditModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R \u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R$\u0010!\u001a\b\u0018\u00010\"R\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010(\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R \u0010+\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0005\"\u0004\b,\u0010\u0007R \u0010-\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\"\u0010/\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R \u00102\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R \u00105\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R \u00108\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0011\"\u0004\b:\u0010\u0013R\"\u0010;\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R\"\u0010>\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R \u0010A\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R\"\u0010D\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019\u00a8\u0006G"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileEditModel$Data;", "", "(Lcom/zoomapps/eromance/Models/UserProfileEditModel;)V", "aboutInterests", "getAboutInterests", "()Ljava/lang/Object;", "setAboutInterests", "(Ljava/lang/Object;)V", "aboutPerson", "getAboutPerson", "setAboutPerson", "avatar", "getAvatar", "setAvatar", "bornAt", "", "getBornAt", "()Ljava/lang/String;", "setBornAt", "(Ljava/lang/String;)V", "cityId", "", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "countryId", "getCountryId", "setCountryId", "createdAt", "getCreatedAt", "setCreatedAt", "errors", "Lcom/zoomapps/eromance/Models/UserProfileEditModel$Errors;", "Lcom/zoomapps/eromance/Models/UserProfileEditModel;", "getErrors", "()Lcom/zoomapps/eromance/Models/UserProfileEditModel$Errors;", "setErrors", "(Lcom/zoomapps/eromance/Models/UserProfileEditModel$Errors;)V", "id", "getId", "setId", "isAdult", "setAdult", "isVip", "setVip", "languageId", "getLanguageId", "setLanguageId", "phone", "getPhone", "setPhone", "rating", "getRating", "setRating", "realName", "getRealName", "setRealName", "searchFor", "getSearchFor", "setSearchFor", "sexId", "getSexId", "setSexId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Data {
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
        @com.google.gson.annotations.SerializedName(value = "about_person")
        private java.lang.Object aboutPerson;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "about_interests")
        private java.lang.Object aboutInterests;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "born_at")
        private java.lang.String bornAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "phone")
        private java.lang.Object phone;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "avatar")
        private java.lang.Object avatar;
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
        private java.lang.Object rating;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_adult")
        private java.lang.Object isAdult;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_vip")
        private java.lang.Object isVip;
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
        @com.google.gson.annotations.SerializedName(value = "errors")
        private com.zoomapps.eromance.Models.UserProfileEditModel.Errors errors;
        
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
        public final java.lang.String getBornAt() {
            return null;
        }
        
        public final void setBornAt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAvatar() {
            return null;
        }
        
        public final void setAvatar(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        public final java.lang.Object getRating() {
            return null;
        }
        
        public final void setRating(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object isAdult() {
            return null;
        }
        
        public final void setAdult(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object isVip() {
            return null;
        }
        
        public final void setVip(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        public final com.zoomapps.eromance.Models.UserProfileEditModel.Errors getErrors() {
            return null;
        }
        
        public final void setErrors(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileEditModel.Errors p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR&\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileEditModel$Errors;", "", "(Lcom/zoomapps/eromance/Models/UserProfileEditModel;)V", "bornAt", "", "", "getBornAt", "()Ljava/util/List;", "setBornAt", "(Ljava/util/List;)V", "cityId", "getCityId", "setCityId", "countryId", "getCountryId", "setCountryId", "languageId", "getLanguageId", "setLanguageId", "realName", "getRealName", "setRealName", "searchFor", "getSearchFor", "setSearchFor", "sexId", "getSexId", "setSexId", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Errors {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "real_name")
        private java.util.List<java.lang.String> realName;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "born_at")
        private java.util.List<java.lang.String> bornAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.util.List<java.lang.String> userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "sex_id")
        private java.util.List<java.lang.String> sexId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "search_for")
        private java.util.List<java.lang.String> searchFor;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country_id")
        private java.util.List<java.lang.String> countryId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city_id")
        private java.util.List<java.lang.String> cityId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "language_id")
        private java.util.List<java.lang.String> languageId;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getRealName() {
            return null;
        }
        
        public final void setRealName(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getBornAt() {
            return null;
        }
        
        public final void setBornAt(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getUserId() {
            return null;
        }
        
        public final void setUserId(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getSexId() {
            return null;
        }
        
        public final void setSexId(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getSearchFor() {
            return null;
        }
        
        public final void setSearchFor(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getCountryId() {
            return null;
        }
        
        public final void setCountryId(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getCityId() {
            return null;
        }
        
        public final void setCityId(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getLanguageId() {
            return null;
        }
        
        public final void setLanguageId(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        public Errors() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/UserProfileEditModel$UserProfileEditResponse;", "", "(Lcom/zoomapps/eromance/Models/UserProfileEditModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/UserProfileEditModel$Data;", "Lcom/zoomapps/eromance/Models/UserProfileEditModel;", "getData", "()Lcom/zoomapps/eromance/Models/UserProfileEditModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/UserProfileEditModel$Data;)V", "app_debug"})
    public final class UserProfileEditResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.UserProfileEditModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserProfileEditModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserProfileEditModel.Data p0) {
        }
        
        public UserProfileEditResponse() {
            super();
        }
    }
}