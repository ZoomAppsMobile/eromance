package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 13.06.2017.
 */

class DialogsModel{
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
        var profile: Profile? = null
        @SerializedName("is_online")
        @Expose
        var is_online: Boolean? = null

    }

    inner class Data_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("real_name")
        @Expose
        var realName: String? = null
        @SerializedName("born_at")
        @Expose
        var bornAt: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("sex_id")
        @Expose
        var sexId: Int? = null
        @SerializedName("search_for")
        @Expose
        var searchFor: Int? = null
        @SerializedName("country_id")
        @Expose
        var countryId: Int? = null
        @SerializedName("city_id")
        @Expose
        var cityId: Int? = null
        @SerializedName("language_id")
        @Expose
        var languageId: Int? = null
        @SerializedName("rating")
        @Expose
        var rating: Double? = null
        @SerializedName("is_adult")
        @Expose
        var isAdult: Boolean? = null
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

    }

    inner class DialogsResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class Joined {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class Profile {

        @SerializedName("data")
        @Expose
        var data: Data_? = null

    }
}