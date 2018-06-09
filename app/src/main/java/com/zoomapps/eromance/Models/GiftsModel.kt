package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 11.07.2017.
 */
class GiftsModel {
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("key")
        @Expose
        var key: String? = null
        @SerializedName("value")
        @Expose
        var value: String? = null
        @SerializedName("image")
        @Expose
        var image: String? = null
        @SerializedName("group_id")
        @Expose
        var groupId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("owner_user_id")
        @Expose
        var ownerUserId: Int? = null
        @SerializedName("acted_user_id")
        @Expose
        var actedUserId: Int? = null
        @SerializedName("gift_id")
        @Expose
        var giftId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("gift")
        @Expose
        var gift: Gift? = null

    }

    inner class Gift {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
    inner class UserGiftsResponse2 {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }
    inner class UserGiftsResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Data>? = null

    }

    inner class UserGiftsSendResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Datum? = null

    }
}