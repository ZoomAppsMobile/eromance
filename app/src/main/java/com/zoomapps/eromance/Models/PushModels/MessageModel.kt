package com.zoomapps.eromance.Models.PushModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 14.06.2017.
 */
class MessageModel{
    inner class Data {

        @SerializedName("from")
        @Expose
        var from: From? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("content")
        @Expose
        var content: String? = null

        @SerializedName("is_liked")
        @Expose
        var is_liked: Boolean? = null
    }

    inner class MessageData {

        @SerializedName("date")
        @Expose
        var date: String? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
        @SerializedName("type")
        @Expose
        var type: String? = null

        @SerializedName("content")
        @Expose
        var content_mes: Data? = null
    }

    inner class From {

        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("vip_at")
        @Expose
        var vipAt: Any? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("phone")
        @Expose
        var phone: Any? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("username")
        @Expose
        var username: String? = null

    }
}