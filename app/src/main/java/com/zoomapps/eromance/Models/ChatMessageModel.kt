package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.DialogsModel.Joined





/**
 * Created by User on 06.06.2017.
 */
class ChatMessageModel{

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("username")
        @Expose
        var username: String? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("phone")
        @Expose
        var phone: Any? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Boolean? = null
        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("profile")
        @Expose
        var profile: DialogsModel.Profile? = null
    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("owner_user_id")
        @Expose
        var ownerUserId: Int? = null
        @SerializedName("joined_user_id")
        @Expose
        var joinedUserId: Int? = null
        @SerializedName("count_total")
        @Expose
        var countTotal: Int? = null
        @SerializedName("count_unread")
        @Expose
        var countUnread: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("joined")
        @Expose
        var joined: Joined? = null
        @SerializedName("messages")
        @Expose
        var messages: Messages? = null

    }

    inner class DialogWithChatResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class Messages {

        @SerializedName("data")
        @Expose
        var data: List<Datum_>? = null

    }

    inner class Datum_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("content")
        @Expose
        var content: String? = null
        @SerializedName("conversation_id")
        @Expose
        var conversationId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("is_attachment")
        @Expose
        var isAttachment: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class MessageSendResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Datum_? = null

    }
}