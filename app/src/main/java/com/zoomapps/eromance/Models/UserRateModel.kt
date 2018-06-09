package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 12.06.2017.
 */
class UserRateModel{
    //LIKE DISLIKE MODEL
    inner class UserRateData {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("owner_user_id")
        @Expose
        var ownerUserId: Int? = null
        @SerializedName("acted_user_id")
        @Expose
        var actedUserId: Int? = null
        @SerializedName("is_liked")
        @Expose
        var isLiked: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class UserLikeResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: UserRateData? = null

    }
    //CHECK LIKE AND DISLIKE MODEL


    inner class UserLikeCheckResponse {
        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<UserRateData>? = null
    }

    inner class Profile {

        @SerializedName("data")
        @Expose
        var data: Data_? = null

    }
    inner class LikesListResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

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
        @SerializedName("is_liked")
        @Expose
        var isLiked: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("owner")
        @Expose
        var owner: Owner? = null

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
        @SerializedName("about_person")
        @Expose
        var aboutPerson: Any? = null
        @SerializedName("about_interests")
        @Expose
        var aboutInterests: Any? = null
        @SerializedName("weight")
        @Expose
        var weight: Int? = null
        @SerializedName("height")
        @Expose
        var height: Int? = null
        @SerializedName("sex_id")
        @Expose
        var sexId: Int? = null
        @SerializedName("search_for")
        @Expose
        var searchFor: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
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
        @SerializedName("is_vip")
        @Expose
        var isVip: Any? = null
        @SerializedName("is_adult")
        @Expose
        var isAdult: Boolean? = null
        @SerializedName("is_adult_confirmed")
        @Expose
        var isAdultConfirmed: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Owner {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

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
    }
}