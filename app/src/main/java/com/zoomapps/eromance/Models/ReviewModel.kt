package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 03.07.2017.
 */
class ReviewModel{

    inner class SendReviewResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: GetReviewResponseDatum? = null

    }
    /////////////

    inner class GetReviewResponseUser {

        @SerializedName("data")
        @Expose
        var data: GetReviewResponseUserData? = null

    }

    inner class GetReviewResponseUserData {

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
        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Boolean? = null
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

    }
    inner class GetReviewResponseDatum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("content")
        @Expose
        var content: String? = null
        @SerializedName("entity_class")
        @Expose
        var entityClass: String? = null
        @SerializedName("entity_id")
        @Expose
        var entityId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("user")
        @Expose
        var user: GetReviewResponseUser? = null
    }

    inner class GetReviewResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<GetReviewResponseDatum>? = null

    }
}