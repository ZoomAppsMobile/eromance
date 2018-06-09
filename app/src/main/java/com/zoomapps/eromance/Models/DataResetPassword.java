package com.zoomapps.eromance.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataResetPassword {
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("is_used")
    @Expose
    private Object isUsed;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Object isUsed) {
        this.isUsed = isUsed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public class MentionsModel {

        @SerializedName("code")
        @Expose
        private Integer code;
        @SerializedName("data")
        @Expose
        private Data data;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }
}
