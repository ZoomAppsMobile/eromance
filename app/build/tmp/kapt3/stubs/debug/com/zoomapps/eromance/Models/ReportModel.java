package com.zoomapps.eromance.Models;

import java.lang.System;

/**
 * * Created by User on 05.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/zoomapps/eromance/Models/ReportModel;", "", "()V", "Data", "ReportCheckResponseData", "app_debug"})
public final class ReportModel {
    
    public ReportModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/zoomapps/eromance/Models/ReportModel$Data;", "", "(Lcom/zoomapps/eromance/Models/ReportModel;)V", "comment", "getComment", "()Ljava/lang/Object;", "setComment", "(Ljava/lang/Object;)V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "entityClass", "getEntityClass", "setEntityClass", "entityId", "", "getEntityId", "()Ljava/lang/Integer;", "setEntityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "id", "getId", "setId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "userId", "getUserId", "setUserId", "app_debug"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "entity_class")
        private java.lang.String entityClass;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "entity_id")
        private java.lang.Integer entityId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private java.lang.Integer userId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "comment")
        private java.lang.Object comment;
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
        public final java.lang.String getEntityClass() {
            return null;
        }
        
        public final void setEntityClass(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getEntityId() {
            return null;
        }
        
        public final void setEntityId(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getComment() {
            return null;
        }
        
        public final void setComment(@org.jetbrains.annotations.Nullable()
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
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/zoomapps/eromance/Models/ReportModel$ReportCheckResponseData;", "", "(Lcom/zoomapps/eromance/Models/ReportModel;)V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "Lcom/zoomapps/eromance/Models/ReportModel$Data;", "Lcom/zoomapps/eromance/Models/ReportModel;", "getData", "()Lcom/zoomapps/eromance/Models/ReportModel$Data;", "setData", "(Lcom/zoomapps/eromance/Models/ReportModel$Data;)V", "app_debug"})
    public final class ReportCheckResponseData {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "code")
        private java.lang.Integer code;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "data")
        private com.zoomapps.eromance.Models.ReportModel.Data data;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        public final void setCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.zoomapps.eromance.Models.ReportModel.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.zoomapps.eromance.Models.ReportModel.Data p0) {
        }
        
        public ReportCheckResponseData() {
            super();
        }
    }
}