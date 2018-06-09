package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 04.08.2017.
 */
class Update_Profile_Model {
    inner class Data {

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
        var aboutPerson: String? = null
        @SerializedName("about_interests")
        @Expose
        var aboutInterests: String? = null
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
        @SerializedName("user")
        @Expose
        var user: User? = null

    }

    inner class Data_ {

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
        var avatar: Any? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Boolean? = null
        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Boolean? = null
        @SerializedName("is_online")
        @Expose
        var isOnline: Boolean? = null
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
        @SerializedName("questionnaires")
        @Expose
        var questionnaires: Questionnaires? = null

    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("group_id")
        @Expose
        var groupId: Int? = null
        @SerializedName("questionnaire_id")
        @Expose
        var questionnaireId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Questionnaires {

        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class ResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class User {

        @SerializedName("data")
        @Expose
        var data: Data_? = null

    }
}