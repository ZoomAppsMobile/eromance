package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 02.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel;", "", "()V", "GameActivateModel", "GameBetModel", "GamesListModel", "GamesModel", "app_debug"})
public final class GameModel {
    
    public GameModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel;", "", "()V", "Data", "Datum", "GamePlayRequest", "app_debug"})
    public static final class GameActivateModel {
        
        public GameActivateModel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$Data;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel;)V", "bets", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "getBets", "()Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;", "setBets", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isPlayed", "", "()Ljava/lang/Boolean;", "setPlayed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
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
            private com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets bets;
            
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
            public final com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets getBets() {
                return null;
            }
            
            public final void setBets(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets p0) {
            }
            
            public Data() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$Datum;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel;)V", "bet", "", "getBet", "()Ljava/lang/Integer;", "setBet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "gameId", "getGameId", "setGameId", "id", "getId", "setId", "statusId", "getStatusId", "setStatusId", "thingId", "getThingId", "setThingId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
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
            
            public Datum() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$GamePlayRequest;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$Data;", "Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel;", "getData", "()Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/GameModel$GameActivateModel$Data;)V", "app_debug"})
        public final class GamePlayRequest {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "code")
            private java.lang.Integer code;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "data")
            private com.zoomapps.eromance.Models.GameModel.GameActivateModel.Data data;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.GameModel.GameActivateModel.Data getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GameActivateModel.Data p0) {
            }
            
            public GamePlayRequest() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "", "()V", "Bets", "Datum", "Datum_", "GameListResponse", "app_debug"})
    public static final class GamesListModel {
        
        public GamesListModel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;)V", "data", "", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Datum_;", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
        public final class Bets {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "data")
            private java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum_> data;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum_> getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.Nullable()
            java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum_> p0) {
            }
            
            public Bets() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Datum;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;)V", "bets", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "getBets", "()Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;", "setBets", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Bets;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isPlayed", "", "()Ljava/lang/Boolean;", "setPlayed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
        public final class Datum {
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
            private com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets bets;
            
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
            public final com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets getBets() {
                return null;
            }
            
            public final void setBets(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets p0) {
            }
            
            public Datum() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Datum_;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;)V", "bet", "", "getBet", "()Ljava/lang/Integer;", "setBet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "gameId", "getGameId", "setGameId", "id", "getId", "setId", "statusId", "getStatusId", "setStatusId", "thingId", "getThingId", "setThingId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
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
            
            public Datum_() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$GameListResponse;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Datum;", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
        public final class GameListResponse {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "code")
            private java.lang.Integer code;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "data")
            private java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum> data;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum> getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.Nullable()
            java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum> p0) {
            }
            
            public GameListResponse() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesModel;", "", "()V", "Data", "Errors", "GamesCreateResponse", "app_debug"})
    public static final class GamesModel {
        
        public GamesModel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0018\u00010\nR\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R \u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Data;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesModel;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "errors", "Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Errors;", "Lcom/zoomapps/eromance/Models/GameModel$GamesModel;", "getErrors", "()Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Errors;", "setErrors", "(Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Errors;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "statusId", "getStatusId", "setStatusId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
        public final class Data {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "id")
            private java.lang.Integer id;
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
            @com.google.gson.annotations.SerializedName(value = "errors")
            private com.zoomapps.eromance.Models.GameModel.GamesModel.Errors errors;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
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
            public final com.zoomapps.eromance.Models.GameModel.GamesModel.Errors getErrors() {
                return null;
            }
            
            public final void setErrors(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GamesModel.Errors p0) {
            }
            
            public Data() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesModel$GamesCreateResponse;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Data;", "Lcom/zoomapps/eromance/Models/GameModel$GamesModel;", "getData", "()Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Data;)V", "app_debug"})
        public final class GamesCreateResponse {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "code")
            private java.lang.Integer code;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "data")
            private com.zoomapps.eromance.Models.GameModel.GamesModel.Data data;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.GameModel.GamesModel.Data getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GamesModel.Data p0) {
            }
            
            public GamesCreateResponse() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GamesModel$Errors;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GamesModel;)V", "statusId", "", "", "getStatusId", "()Ljava/util/List;", "setStatusId", "(Ljava/util/List;)V", "app_debug"})
        public final class Errors {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "status_id")
            private java.util.List<java.lang.String> statusId;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getStatusId() {
                return null;
            }
            
            public final void setStatusId(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
            
            public Errors() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;", "", "()V", "Data", "Errors", "GameAnswerRequest", "app_debug"})
    public static final class GameBetModel {
        
        public GameBetModel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR \u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR \u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000fR\"\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b\u00a8\u0006+"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Data;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;)V", "bet", "", "getBet", "()Ljava/lang/Integer;", "setBet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "errors", "Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Errors;", "Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;", "getErrors", "()Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Errors;", "setErrors", "(Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Errors;)V", "gameId", "getGameId", "setGameId", "id", "getId", "setId", "statusId", "getStatusId", "()Ljava/lang/Object;", "setStatusId", "(Ljava/lang/Object;)V", "thingId", "getThingId", "setThingId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
        public final class Data {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "errors")
            private com.zoomapps.eromance.Models.GameModel.GameBetModel.Errors errors;
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
            private java.lang.Object statusId;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "created_at")
            private java.lang.String createdAt;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "updated_at")
            private java.lang.String updatedAt;
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.GameModel.GameBetModel.Errors getErrors() {
                return null;
            }
            
            public final void setErrors(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GameBetModel.Errors p0) {
            }
            
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
            public final java.lang.Object getStatusId() {
                return null;
            }
            
            public final void setStatusId(@org.jetbrains.annotations.Nullable()
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
            
            public Data() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Errors;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;)V", "bet", "", "", "getBet", "()Ljava/util/List;", "setBet", "(Ljava/util/List;)V", "thingId", "getThingId", "setThingId", "userId", "getUserId", "setUserId", "app_debug"})
        public final class Errors {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "bet")
            private java.util.List<java.lang.String> bet;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "thing_id")
            private java.util.List<java.lang.String> thingId;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "user_id")
            private java.util.List<java.lang.String> userId;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getBet() {
                return null;
            }
            
            public final void setBet(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getThingId() {
                return null;
            }
            
            public final void setThingId(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getUserId() {
                return null;
            }
            
            public final void setUserId(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
            
            public Errors() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$GameAnswerRequest;", "", "(Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Data;", "Lcom/zoomapps/eromance/Models/GameModel$GameBetModel;", "getData", "()Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/GameModel$GameBetModel$Data;)V", "app_debug"})
        public final class GameAnswerRequest {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "code")
            private java.lang.Integer code;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.Expose()
            @com.google.gson.annotations.SerializedName(value = "data")
            private com.zoomapps.eromance.Models.GameModel.GameBetModel.Data data;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCode() {
                return null;
            }
            
            public final void setCode(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.zoomapps.eromance.Models.GameModel.GameBetModel.Data getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.Nullable()
            com.zoomapps.eromance.Models.GameModel.GameBetModel.Data p0) {
            }
            
            public GameAnswerRequest() {
                super();
            }
        }
    }
}