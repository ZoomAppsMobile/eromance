package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 12.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\r"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "", "()V", "City", "Country", "Data", "Data_", "Data__", "Datum", "Photos", "PlaceInfoResponse", "User", "UserData", "app_debug"})
public final class PlaceInfoModel {
    
    public PlaceInfoModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$City;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "data", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data__;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getData", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data__;", "setData", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data__;)V", "app_debug"})
    public final class City {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.PlaceInfoModel.Data__ data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.Data__ getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.Data__ p0) {
        }
        
        public City() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Country;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "data", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data_;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getData", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data_;", "setData", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data_;)V", "app_debug"})
    public final class Country {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.PlaceInfoModel.Data_ data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.Data_ getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.Data_ p0) {
        }
        
        public Country() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\u001a\u001a\b\u0018\u00010\u001bR\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR \u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR \u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\"\u0010,\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\"\u0010/\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR \u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\"\u00105\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R \u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR$\u0010H\u001a\b\u0018\u00010IR\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR \u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\"\u0010Q\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR \u0010T\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR$\u0010W\u001a\b\u0018\u00010XR\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000e\u00a8\u0006`"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "averegPrice", "", "getAveregPrice", "()Ljava/lang/Integer;", "setAveregPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "city", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$City;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getCity", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$City;", "setCity", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$City;)V", "cityId", "getCityId", "setCityId", "country", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Country;", "getCountry", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$Country;", "setCountry", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$Country;)V", "countryId", "getCountryId", "setCountryId", "createdAt", "getCreatedAt", "setCreatedAt", "food", "getFood", "setFood", "hourFrom", "getHourFrom", "setHourFrom", "hourTo", "getHourTo", "setHourTo", "id", "getId", "setId", "image", "getImage", "setImage", "isVip", "", "()Ljava/lang/Boolean;", "setVip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "latitude", "", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "longitude", "getLongitude", "setLongitude", "name", "getName", "setName", "photos", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Photos;", "getPhotos", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$Photos;", "setPhotos", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$Photos;)V", "site", "getSite", "setSite", "typeId", "getTypeId", "setTypeId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "user", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$User;", "getUser", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$User;", "setUser", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$User;)V", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "name")
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "image")
        private java.lang.String image;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "address")
        private java.lang.String address;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "longitude")
        private java.lang.Double longitude;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "latitude")
        private java.lang.Double latitude;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "food")
        private java.lang.String food;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "avereg_price")
        private java.lang.Integer averegPrice;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "hour_from")
        private java.lang.Integer hourFrom;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "hour_to")
        private java.lang.Integer hourTo;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "site")
        private java.lang.String site;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "type_id")
        private java.lang.Integer typeId;
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
        @com.google.gson.annotations.SerializedName(value = "country")
        private com.zoomapps.eromance.Models.PlaceInfoModel.Country country;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city")
        private com.zoomapps.eromance.Models.PlaceInfoModel.City city;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "photos")
        private com.zoomapps.eromance.Models.PlaceInfoModel.Photos photos;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user")
        private com.zoomapps.eromance.Models.PlaceInfoModel.User user;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.String getImage() {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getLongitude() {
            return null;
        }
        
        public final void setLongitude(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getLatitude() {
            return null;
        }
        
        public final void setLatitude(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFood() {
            return null;
        }
        
        public final void setFood(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAveregPrice() {
            return null;
        }
        
        public final void setAveregPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHourFrom() {
            return null;
        }
        
        public final void setHourFrom(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHourTo() {
            return null;
        }
        
        public final void setHourTo(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSite() {
            return null;
        }
        
        public final void setSite(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Integer getTypeId() {
            return null;
        }
        
        public final void setTypeId(@org.jetbrains.annotations.Nullable()
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
        public final com.zoomapps.eromance.Models.PlaceInfoModel.Country getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.Country p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.City getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.City p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.Photos getPhotos() {
            return null;
        }
        
        public final void setPhotos(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.Photos p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.User getUser() {
            return null;
        }
        
        public final void setUser(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.User p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$User;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "data", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$UserData;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getData", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$UserData;", "setData", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$UserData;)V", "app_debug"})
    public final class User {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.PlaceInfoModel.UserData data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.UserData getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.UserData p0) {
        }
        
        public User() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data_;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "key", "getKey", "setKey", "updatedAt", "getUpdatedAt", "setUpdatedAt", "value", "getValue", "setValue", "app_debug"})
    public final class Data_ {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "key")
        private java.lang.String key;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private java.lang.String createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private java.lang.String updatedAt;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final void setKey(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        
        public Data_() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR \u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data__;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "countryId", "", "getCountryId", "()Ljava/lang/Integer;", "setCountryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "getId", "setId", "key", "getKey", "setKey", "updatedAt", "getUpdatedAt", "setUpdatedAt", "value", "getValue", "setValue", "app_debug"})
    public final class Data__ {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "key")
        private java.lang.String key;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "value")
        private java.lang.String value;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country_id")
        private java.lang.Integer countryId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private java.lang.String createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private java.lang.String updatedAt;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final void setKey(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCountryId() {
            return null;
        }
        
        public final void setCountryId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        
        public Data__() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Datum;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "image", "getImage", "setImage", "placeId", "getPlaceId", "setPlaceId", "position", "getPosition", "setPosition", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
    public final class Datum {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "image")
        private java.lang.String image;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "position")
        private java.lang.Integer position;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "place_id")
        private java.lang.Integer placeId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private java.lang.String createdAt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "updated_at")
        private java.lang.String updatedAt;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPosition() {
            return null;
        }
        
        public final void setPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPlaceId() {
            return null;
        }
        
        public final void setPlaceId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
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
        
        public Datum() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$Photos;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "data", "", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Datum;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
    public final class Photos {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private java.util.List<com.zoomapps.eromance.Models.PlaceInfoModel.Datum> data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.PlaceInfoModel.Datum> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.PlaceInfoModel.Datum> p0) {
        }
        
        public Photos() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\"\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010\'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000f\u00a8\u0006-"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$UserData;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "amount", "", "getAmount", "()Ljava/lang/Integer;", "setAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "email", "getEmail", "setEmail", "id", "getId", "setId", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isVip", "setVip", "phone", "getPhone", "setPhone", "typeId", "getTypeId", "setTypeId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "username", "getUsername", "setUsername", "app_debug"})
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
        
        public UserData() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/PlaceInfoModel$PlaceInfoResponse;", "", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "getData", "()Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data;)V", "app_debug"})
    public final class PlaceInfoResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.PlaceInfoModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.PlaceInfoModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.PlaceInfoModel.Data p0) {
        }
        
        public PlaceInfoResponse() {
            super();
        }
    }
}