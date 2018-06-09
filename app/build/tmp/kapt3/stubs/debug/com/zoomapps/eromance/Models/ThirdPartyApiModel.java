package com.zoomapps.eromance.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel;", "", "()V", "VK_Models", "app_debug"})
public final class ThirdPartyApiModel {
    
    public ThirdPartyApiModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel;)V", "City", "Counters", "Country", "LastSeen", "Response", "StatusAudio", "VkProfileResponse", "app_debug"})
    public final class VK_Models {
        
        public VK_Models() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$City;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
        public final class City {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "id")
            private java.lang.Integer id;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "title")
            private java.lang.String title;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public final void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public City() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\"\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\"\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\"\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\b\u00a8\u0006."}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Counters;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "albums", "", "getAlbums", "()Ljava/lang/Integer;", "setAlbums", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "audios", "getAudios", "setAudios", "followers", "getFollowers", "setFollowers", "friends", "getFriends", "setFriends", "gifts", "getGifts", "setGifts", "groups", "getGroups", "setGroups", "notes", "getNotes", "setNotes", "onlineFriends", "getOnlineFriends", "setOnlineFriends", "pages", "getPages", "setPages", "photos", "getPhotos", "setPhotos", "subscriptions", "getSubscriptions", "setSubscriptions", "userPhotos", "getUserPhotos", "setUserPhotos", "videos", "getVideos", "setVideos", "app_debug"})
        public final class Counters {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "albums")
            private java.lang.Integer albums;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "videos")
            private java.lang.Integer videos;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "audios")
            private java.lang.Integer audios;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "notes")
            private java.lang.Integer notes;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photos")
            private java.lang.Integer photos;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "groups")
            private java.lang.Integer groups;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "gifts")
            private java.lang.Integer gifts;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "friends")
            private java.lang.Integer friends;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "online_friends")
            private java.lang.Integer onlineFriends;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "user_photos")
            private java.lang.Integer userPhotos;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "followers")
            private java.lang.Integer followers;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "subscriptions")
            private java.lang.Integer subscriptions;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "pages")
            private java.lang.Integer pages;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getAlbums() {
                return null;
            }
            
            public final void setAlbums(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getVideos() {
                return null;
            }
            
            public final void setVideos(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getAudios() {
                return null;
            }
            
            public final void setAudios(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getNotes() {
                return null;
            }
            
            public final void setNotes(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPhotos() {
                return null;
            }
            
            public final void setPhotos(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGroups() {
                return null;
            }
            
            public final void setGroups(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGifts() {
                return null;
            }
            
            public final void setGifts(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getFriends() {
                return null;
            }
            
            public final void setFriends(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getOnlineFriends() {
                return null;
            }
            
            public final void setOnlineFriends(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUserPhotos() {
                return null;
            }
            
            public final void setUserPhotos(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getFollowers() {
                return null;
            }
            
            public final void setFollowers(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getSubscriptions() {
                return null;
            }
            
            public final void setSubscriptions(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPages() {
                return null;
            }
            
            public final void setPages(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            public Counters() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Country;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
        public final class Country {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "id")
            private java.lang.Integer id;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "title")
            private java.lang.String title;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public final void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public Country() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$LastSeen;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "platform", "", "getPlatform", "()Ljava/lang/Integer;", "setPlatform", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "time", "getTime", "setTime", "app_debug"})
        public final class LastSeen {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "time")
            private java.lang.Integer time;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "platform")
            private java.lang.Integer platform;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getTime() {
                return null;
            }
            
            public final void setTime(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPlatform() {
                return null;
            }
            
            public final void setPlatform(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            public LastSeen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR(\u0010\u0013\u001a\f\u0018\u00010\u0014R\u00060\u0015R\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR(\u0010\u001e\u001a\f\u0018\u00010\u001fR\u00060\u0015R\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\f\u0018\u00010%R\u00060\u0015R\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R \u00106\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\"\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\"\u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR \u0010?\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\"\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR \u0010E\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R(\u0010H\u001a\f\u0018\u00010IR\u00060\u0015R\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR \u0010N\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R\"\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR \u0010T\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010-\"\u0004\bV\u0010/R \u0010W\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R \u0010Z\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010-\"\u0004\b\\\u0010/R \u0010]\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010-\"\u0004\b_\u0010/R \u0010`\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R \u0010c\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010-\"\u0004\be\u0010/R \u0010f\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010-\"\u0004\bh\u0010/R\"\u0010i\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR&\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010m8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR&\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010m8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR\"\u0010u\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR \u0010x\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010-\"\u0004\bz\u0010/R \u0010{\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010-\"\u0004\b}\u0010/R,\u0010~\u001a\f\u0018\u00010\u007fR\u00060\u0015R\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010m8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010o\"\u0005\b\u0086\u0001\u0010qR%\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\t\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR#\u0010\u008a\u0001\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010-\"\u0005\b\u008c\u0001\u0010/\u00a8\u0006\u008d\u0001"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Response;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "canPost", "", "getCanPost", "()Ljava/lang/Integer;", "setCanPost", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "canSeeAllPosts", "getCanSeeAllPosts", "setCanSeeAllPosts", "canSeeAudio", "getCanSeeAudio", "setCanSeeAudio", "canWritePrivateMessage", "getCanWritePrivateMessage", "setCanWritePrivateMessage", "city", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$City;", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel;", "getCity", "()Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$City;", "setCity", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$City;)V", "commonCount", "getCommonCount", "setCommonCount", "counters", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Counters;", "getCounters", "()Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Counters;", "setCounters", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Counters;)V", "country", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Country;", "getCountry", "()Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Country;", "setCountry", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Country;)V", "domain", "", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "faculty", "getFaculty", "setFaculty", "facultyName", "getFacultyName", "setFacultyName", "firstName", "getFirstName", "setFirstName", "graduation", "getGraduation", "setGraduation", "hasMobile", "getHasMobile", "setHasMobile", "homePhone", "getHomePhone", "setHomePhone", "id", "getId", "setId", "lastName", "getLastName", "setLastName", "lastSeen", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$LastSeen;", "getLastSeen", "()Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$LastSeen;", "setLastSeen", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$LastSeen;)V", "mobilePhone", "getMobilePhone", "setMobilePhone", "online", "getOnline", "setOnline", "photo100", "getPhoto100", "setPhoto100", "photo200", "getPhoto200", "setPhoto200", "photo200Orig", "getPhoto200Orig", "setPhoto200Orig", "photo400Orig", "getPhoto400Orig", "setPhoto400Orig", "photo50", "getPhoto50", "setPhoto50", "photoMax", "getPhotoMax", "setPhotoMax", "photoMaxOrig", "getPhotoMaxOrig", "setPhotoMaxOrig", "relation", "getRelation", "setRelation", "relatives", "", "getRelatives", "()Ljava/util/List;", "setRelatives", "(Ljava/util/List;)V", "schools", "getSchools", "setSchools", "sex", "getSex", "setSex", "site", "getSite", "setSite", "status", "getStatus", "setStatus", "statusAudio", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$StatusAudio;", "getStatusAudio", "()Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$StatusAudio;", "setStatusAudio", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$StatusAudio;)V", "universities", "getUniversities", "setUniversities", "university", "getUniversity", "setUniversity", "universityName", "getUniversityName", "setUniversityName", "app_debug"})
        public final class Response {
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
            @com.google.gson.annotations.SerializedName(value = "sex")
            private java.lang.Integer sex;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "domain")
            private java.lang.String domain;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "city")
            private com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.City city;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "country")
            private com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Country country;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_50")
            private java.lang.String photo50;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_100")
            private java.lang.String photo100;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_200")
            private java.lang.String photo200;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_max")
            private java.lang.String photoMax;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_200_orig")
            private java.lang.String photo200Orig;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_400_orig")
            private java.lang.String photo400Orig;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "photo_max_orig")
            private java.lang.String photoMaxOrig;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "has_mobile")
            private java.lang.Integer hasMobile;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "online")
            private java.lang.Integer online;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "can_post")
            private java.lang.Integer canPost;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "can_see_all_posts")
            private java.lang.Integer canSeeAllPosts;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "can_see_audio")
            private java.lang.Integer canSeeAudio;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "can_write_private_message")
            private java.lang.Integer canWritePrivateMessage;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "mobile_phone")
            private java.lang.String mobilePhone;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "home_phone")
            private java.lang.String homePhone;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "site")
            private java.lang.String site;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "status_audio")
            private com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.StatusAudio statusAudio;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "status")
            private java.lang.String status;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "last_seen")
            private com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.LastSeen lastSeen;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "common_count")
            private java.lang.Integer commonCount;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "counters")
            private com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Counters counters;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "university")
            private java.lang.Integer university;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "university_name")
            private java.lang.String universityName;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "faculty")
            private java.lang.Integer faculty;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "faculty_name")
            private java.lang.String facultyName;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "graduation")
            private java.lang.Integer graduation;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "relation")
            private java.lang.Integer relation;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "universities")
            private java.util.List<? extends java.lang.Object> universities;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "schools")
            private java.util.List<? extends java.lang.Object> schools;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "relatives")
            private java.util.List<? extends java.lang.Object> relatives;
            
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
            public final java.lang.Integer getSex() {
                return null;
            }
            
            public final void setSex(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getDomain() {
                return null;
            }
            
            public final void setDomain(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.City getCity() {
                return null;
            }
            
            public final void setCity(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.City p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Country getCountry() {
                return null;
            }
            
            public final void setCountry(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Country p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhoto50() {
                return null;
            }
            
            public final void setPhoto50(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhoto100() {
                return null;
            }
            
            public final void setPhoto100(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhoto200() {
                return null;
            }
            
            public final void setPhoto200(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhotoMax() {
                return null;
            }
            
            public final void setPhotoMax(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhoto200Orig() {
                return null;
            }
            
            public final void setPhoto200Orig(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhoto400Orig() {
                return null;
            }
            
            public final void setPhoto400Orig(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhotoMaxOrig() {
                return null;
            }
            
            public final void setPhotoMaxOrig(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getHasMobile() {
                return null;
            }
            
            public final void setHasMobile(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getOnline() {
                return null;
            }
            
            public final void setOnline(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCanPost() {
                return null;
            }
            
            public final void setCanPost(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCanSeeAllPosts() {
                return null;
            }
            
            public final void setCanSeeAllPosts(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCanSeeAudio() {
                return null;
            }
            
            public final void setCanSeeAudio(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCanWritePrivateMessage() {
                return null;
            }
            
            public final void setCanWritePrivateMessage(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMobilePhone() {
                return null;
            }
            
            public final void setMobilePhone(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getHomePhone() {
                return null;
            }
            
            public final void setHomePhone(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSite() {
                return null;
            }
            
            public final void setSite(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.StatusAudio getStatusAudio() {
                return null;
            }
            
            public final void setStatusAudio(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.StatusAudio p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatus() {
                return null;
            }
            
            public final void setStatus(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.LastSeen getLastSeen() {
                return null;
            }
            
            public final void setLastSeen(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.LastSeen p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCommonCount() {
                return null;
            }
            
            public final void setCommonCount(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Counters getCounters() {
                return null;
            }
            
            public final void setCounters(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Counters p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUniversity() {
                return null;
            }
            
            public final void setUniversity(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUniversityName() {
                return null;
            }
            
            public final void setUniversityName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getFaculty() {
                return null;
            }
            
            public final void setFaculty(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFacultyName() {
                return null;
            }
            
            public final void setFacultyName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGraduation() {
                return null;
            }
            
            public final void setGraduation(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getRelation() {
                return null;
            }
            
            public final void setRelation(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.Object> getUniversities() {
                return null;
            }
            
            public final void setUniversities(@org.jetbrains.annotations.Nullable()
            java.util.List<? extends java.lang.Object> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.Object> getSchools() {
                return null;
            }
            
            public final void setSchools(@org.jetbrains.annotations.Nullable()
            java.util.List<? extends java.lang.Object> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.Object> getRelatives() {
                return null;
            }
            
            public final void setRelatives(@org.jetbrains.annotations.Nullable()
            java.util.List<? extends java.lang.Object> p0) {
            }
            
            public Response() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\"\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR \u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b\u00a8\u0006%"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$StatusAudio;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "artist", "", "getArtist", "()Ljava/lang/String;", "setArtist", "(Ljava/lang/String;)V", "date", "", "getDate", "()Ljava/lang/Integer;", "setDate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "duration", "getDuration", "setDuration", "genreId", "getGenreId", "setGenreId", "id", "getId", "setId", "lyricsId", "getLyricsId", "setLyricsId", "ownerId", "getOwnerId", "setOwnerId", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "app_debug"})
        public final class StatusAudio {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "id")
            private java.lang.Integer id;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "owner_id")
            private java.lang.Integer ownerId;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "artist")
            private java.lang.String artist;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "title")
            private java.lang.String title;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "duration")
            private java.lang.Integer duration;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "date")
            private java.lang.Integer date;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "url")
            private java.lang.String url;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "lyrics_id")
            private java.lang.Integer lyricsId;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "genre_id")
            private java.lang.Integer genreId;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getOwnerId() {
                return null;
            }
            
            public final void setOwnerId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getArtist() {
                return null;
            }
            
            public final void setArtist(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public final void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getDuration() {
                return null;
            }
            
            public final void setDuration(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getDate() {
                return null;
            }
            
            public final void setDate(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUrl() {
                return null;
            }
            
            public final void setUrl(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getLyricsId() {
                return null;
            }
            
            public final void setLyricsId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getGenreId() {
                return null;
            }
            
            public final void setGenreId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            public StatusAudio() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0012\u0012\f\u0012\n0\u0005R\u00060\u0006R\u00020\u0007\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$VkProfileResponse;", "", "(Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;)V", "response", "", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models$Response;", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel$VK_Models;", "Lcom/zoomapps/eromance/Models/ThirdPartyApiModel;", "getResponse", "()Ljava/util/List;", "setResponse", "(Ljava/util/List;)V", "app_debug"})
        public final class VkProfileResponse {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "response")
            private java.util.List<com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Response> response;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Response> getResponse() {
                return null;
            }
            
            public final void setResponse(@org.jetbrains.annotations.Nullable()
            java.util.List<com.zoomapps.eromance.Models.ThirdPartyApiModel.VK_Models.Response> p0) {
            }
            
            public VkProfileResponse() {
                super();
            }
        }
    }
}