package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 01.05.2017.
 */
class UserProfileEditModel{

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("real_name")
        @Expose
        var realName: String? = null
        @SerializedName("about_person")
        @Expose
        var aboutPerson: Any? = null
        @SerializedName("about_interests")
        @Expose
        var aboutInterests: Any? = null
        @SerializedName("born_at")
        @Expose
        var bornAt: String? = null
        @SerializedName("phone")
        @Expose
        var phone: Any? = null
        @SerializedName("avatar")
        @Expose
        var avatar: Any? = null
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
        var rating: Any? = null
        @SerializedName("is_adult")
        @Expose
        var isAdult: Any? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Any? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("errors")
        @Expose
        var errors: Errors? = null

    }
    inner class Errors {

        @SerializedName("real_name")
        @Expose
        var realName: List<String>? = null
        @SerializedName("born_at")
        @Expose
        var bornAt: List<String>? = null
        @SerializedName("user_id")
        @Expose
        var userId: List<String>? = null
        @SerializedName("sex_id")
        @Expose
        var sexId: List<String>? = null
        @SerializedName("search_for")
        @Expose
        var searchFor: List<String>? = null
        @SerializedName("country_id")
        @Expose
        var countryId: List<String>? = null
        @SerializedName("city_id")
        @Expose
        var cityId: List<String>? = null
        @SerializedName("language_id")
        @Expose
        var languageId: List<String>? = null

    }

    inner class UserProfileEditResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}