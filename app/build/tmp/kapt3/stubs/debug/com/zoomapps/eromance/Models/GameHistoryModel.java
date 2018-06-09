package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 14.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel;", "", "()V", "Bets", "Data", "Data_", "Datum", "Datum_", "Game", "ResponseData", "User", "app_debug"})
public final class GameHistoryModel {
    
    public GameHistoryModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Bets;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "data", "", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum_;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
    public final class Bets {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum_> data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum_> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum_> p0) {
        }
        
        public Bets() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Data;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "bets", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Bets;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getBets", "()Lcom/zoomapps/eromance/Models/GameHistoryModel$Bets;", "setBets", "(Lcom/zoomapps/eromance/Models/GameHistoryModel$Bets;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isPlayed", "", "()Ljava/lang/Boolean;", "setPlayed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "is_played")
        private java.lang.Boolean isPlayed;
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
        @com.google.gson.annotations.SerializedName(value = "bets")
        private com.zoomapps.eromance.Models.GameHistoryModel.Bets bets;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isPlayed() {
            return null;
        }
        
        public final void setPlayed(@org.jetbrains.annotations.Nullable()
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
        public final com.zoomapps.eromance.Models.GameHistoryModel.Bets getBets() {
            return null;
        }
        
        public final void setBets(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.GameHistoryModel.Bets p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR \u0010#\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR \u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR \u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000f\u00a8\u00061"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Data_;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "amount", "", "getAmount", "()Ljava/lang/Integer;", "setAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "email", "getEmail", "setEmail", "id", "getId", "setId", "isActive", "", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isBlocked", "setBlocked", "isVip", "setVip", "phone", "getPhone", "()Ljava/lang/Object;", "setPhone", "(Ljava/lang/Object;)V", "typeId", "getTypeId", "setTypeId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "username", "getUsername", "setUsername", "app_debug"})
    public final class Data_ {
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
        private java.lang.Object phone;
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
        @com.google.gson.annotations.SerializedName(value = "is_blocked")
        private java.lang.Boolean isBlocked;
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
        public final java.lang.Object getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
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
        public final java.lang.Boolean isBlocked() {
            return null;
        }
        
        public final void setBlocked(@org.jetbrains.annotations.Nullable()
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
        
        public Data_() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR \u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR\"\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "bet", "", "getBet", "()Ljava/lang/Integer;", "setBet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "game", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Game;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getGame", "()Lcom/zoomapps/eromance/Models/GameHistoryModel$Game;", "setGame", "(Lcom/zoomapps/eromance/Models/GameHistoryModel$Game;)V", "gameId", "getGameId", "setGameId", "id", "getId", "setId", "statusId", "getStatusId", "setStatusId", "thingId", "getThingId", "setThingId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Datum {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "bet")
        private java.lang.Integer bet;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "game_id")
        private java.lang.Integer gameId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "thing_id")
        private java.lang.Integer thingId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "status_id")
        private java.lang.Integer statusId;
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
        @com.google.gson.annotations.SerializedName(value = "game")
        private com.zoomapps.eromance.Models.GameHistoryModel.Game game;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getBet() {
            return null;
        }
        
        public final void setBet(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGameId() {
            return null;
        }
        
        public final void setGameId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getThingId() {
            return null;
        }
        
        public final void setThingId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUserId() {
            return null;
        }
        
        public final void setUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusId() {
            return null;
        }
        
        public final void setStatusId(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.GameHistoryModel.Game getGame() {
            return null;
        }
        
        public final void setGame(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.GameHistoryModel.Game p0) {
        }
        
        public Datum() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\b\u0018\u00010 R\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum_;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "bet", "", "getBet", "()Ljava/lang/Integer;", "setBet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "gameId", "getGameId", "setGameId", "id", "getId", "setId", "statusId", "getStatusId", "setStatusId", "thingId", "getThingId", "setThingId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "user", "Lcom/zoomapps/eromance/Models/GameHistoryModel$User;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getUser", "()Lcom/zoomapps/eromance/Models/GameHistoryModel$User;", "setUser", "(Lcom/zoomapps/eromance/Models/GameHistoryModel$User;)V", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Datum_ {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "bet")
        private java.lang.Integer bet;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "game_id")
        private java.lang.Integer gameId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "thing_id")
        private java.lang.Integer thingId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "status_id")
        private java.lang.Integer statusId;
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
        private com.zoomapps.eromance.Models.GameHistoryModel.User user;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getBet() {
            return null;
        }
        
        public final void setBet(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGameId() {
            return null;
        }
        
        public final void setGameId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getThingId() {
            return null;
        }
        
        public final void setThingId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUserId() {
            return null;
        }
        
        public final void setUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusId() {
            return null;
        }
        
        public final void setStatusId(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.GameHistoryModel.User getUser() {
            return null;
        }
        
        public final void setUser(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.GameHistoryModel.User p0) {
        }
        
        public Datum_() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$Game;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "data", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Data;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getData", "()Lcom/zoomapps/eromance/Models/GameHistoryModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/GameHistoryModel$Data;)V", "app_debug"})
    public final class Game {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.GameHistoryModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.GameHistoryModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.GameHistoryModel.Data p0) {
        }
        
        public Game() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$ResponseData;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
    public final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> p0) {
        }
        
        public ResponseData() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/GameHistoryModel$User;", "", "(Lcom/zoomapps/eromance/Models/GameHistoryModel;)V", "data", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Data_;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getData", "()Lcom/zoomapps/eromance/Models/GameHistoryModel$Data_;", "setData", "(Lcom/zoomapps/eromance/Models/GameHistoryModel$Data_;)V", "app_debug"})
    public final class User {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.GameHistoryModel.Data_ data;
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.GameHistoryModel.Data_ getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.GameHistoryModel.Data_ p0) {
        }
        
        public User() {
            super();
        }
    }
}