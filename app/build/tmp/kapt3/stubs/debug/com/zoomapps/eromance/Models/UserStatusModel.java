package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 05.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Models/UserStatusModel;", "", "()V", "Data", "GetUserStatusResponse", "PostUserStatusResponse", "app_debug"})
public final class UserStatusModel {
    
    public UserStatusModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/zoomapps/eromance/Models/UserStatusModel$Data;", "", "(Lcom/zoomapps/eromance/Models/UserStatusModel;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "content")
        private java.lang.String content;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
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
        public final java.lang.String getContent() {
            return null;
        }
        
        public final void setContent(@org.jetbrains.annotations.Nullable()
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
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/UserStatusModel$PostUserStatusResponse;", "", "(Lcom/zoomapps/eromance/Models/UserStatusModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/UserStatusModel$Data;", "Lcom/zoomapps/eromance/Models/UserStatusModel;", "getData", "()Lcom/zoomapps/eromance/Models/UserStatusModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/UserStatusModel$Data;)V", "app_debug"})
    public final class PostUserStatusResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.UserStatusModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.UserStatusModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.UserStatusModel.Data p0) {
        }
        
        public PostUserStatusResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Models/UserStatusModel$GetUserStatusResponse;", "", "(Lcom/zoomapps/eromance/Models/UserStatusModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "", "Lcom/zoomapps/eromance/Models/UserStatusModel$Data;", "Lcom/zoomapps/eromance/Models/UserStatusModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "app_debug"})
    public final class GetUserStatusResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private java.util.List<com.zoomapps.eromance.Models.UserStatusModel.Data> data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.zoomapps.eromance.Models.UserStatusModel.Data> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.util.List<com.zoomapps.eromance.Models.UserStatusModel.Data> p0) {
        }
        
        public GetUserStatusResponse() {
            super();
        }
    }
}