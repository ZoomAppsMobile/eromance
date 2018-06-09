package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 17.08.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel;", "", "()V", "Location", "ResponseData", "app_debug"})
public final class OdnoklassnikiResponseModel {
    
    public OdnoklassnikiResponseModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel$Location;", "", "(Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel;)V", "city", "", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "country", "getCountry", "setCountry", "countryCode", "getCountryCode", "setCountryCode", "countryName", "getCountryName", "setCountryName", "app_debug"})
    public final class Location {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city")
        private java.lang.String city;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country")
        private java.lang.String country;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "countryCode")
        private java.lang.String countryCode;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "countryName")
        private java.lang.String countryName;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        public final void setCountryCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryName() {
            return null;
        }
        
        public final void setCountryName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Location() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR \u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR$\u0010#\u001a\b\u0018\u00010$R\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR \u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR \u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000fR \u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR \u00106\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000fR \u00109\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000f\u00a8\u0006<"}, d2 = {"Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel$ResponseData;", "", "(Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel;)V", "age", "", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "birthday", "", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "gender", "getGender", "setGender", "hasEmail", "", "getHasEmail", "()Ljava/lang/Boolean;", "setHasEmail", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lastName", "getLastName", "setLastName", "locale", "getLocale", "setLocale", "location", "Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel$Location;", "Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel;", "getLocation", "()Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel$Location;", "setLocation", "(Lcom/zoomapps/eromance/Models/OdnoklassnikiResponseModel$Location;)V", "name", "getName", "setName", "online", "getOnline", "setOnline", "pic1", "getPic1", "setPic1", "pic2", "getPic2", "setPic2", "pic3", "getPic3", "setPic3", "uid", "getUid", "setUid", "app_debug"})
    public final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "uid")
        private java.lang.String uid;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "birthday")
        private java.lang.String birthday;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "age")
        private java.lang.Integer age;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "name")
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "locale")
        private java.lang.String locale;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "gender")
        private java.lang.String gender;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "location")
        private com.zoomapps.eromance.Models.OdnoklassnikiResponseModel.Location location;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "online")
        private java.lang.String online;
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
        @com.google.gson.annotations.SerializedName(value = "has_email")
        private java.lang.Boolean hasEmail;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "pic_1")
        private java.lang.String pic1;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "pic_2")
        private java.lang.String pic2;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "pic_3")
        private java.lang.String pic3;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUid() {
            return null;
        }
        
        public final void setUid(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBirthday() {
            return null;
        }
        
        public final void setBirthday(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAge() {
            return null;
        }
        
        public final void setAge(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLocale() {
            return null;
        }
        
        public final void setLocale(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGender() {
            return null;
        }
        
        public final void setGender(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.OdnoklassnikiResponseModel.Location getLocation() {
            return null;
        }
        
        public final void setLocation(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.OdnoklassnikiResponseModel.Location p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOnline() {
            return null;
        }
        
        public final void setOnline(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        public final java.lang.Boolean getHasEmail() {
            return null;
        }
        
        public final void setHasEmail(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPic1() {
            return null;
        }
        
        public final void setPic1(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPic2() {
            return null;
        }
        
        public final void setPic2(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPic3() {
            return null;
        }
        
        public final void setPic3(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public ResponseData() {
            super();
        }
    }
}