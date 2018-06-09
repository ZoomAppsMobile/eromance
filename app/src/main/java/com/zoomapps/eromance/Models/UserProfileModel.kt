package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.AccountModel.LoginModel.UpdatedAt
import com.zoomapps.eromance.Models.UserProfileModel.BornAt





/**
 * Created by User on 20.04.2017.
 */
class UserProfileModel{
    inner class BornAt {

        @SerializedName("date")
        @Expose
        var date: String? = null
        @SerializedName("timezone_type")
        @Expose
        var timezoneType: Int? = null
        @SerializedName("timezone")
        @Expose
        var timezone: String? = null

    }

    inner class CreatedAt {

        @SerializedName("date")
        @Expose
        var date: String? = null
        @SerializedName("timezone_type")
        @Expose
        var timezoneType: Int? = null
        @SerializedName("timezone")
        @Expose
        var timezone: String? = null

    }

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("first_name")
        @Expose
        var firstName: String? = null
        @SerializedName("last_name")
        @Expose
        var lastName: String? = null
        @SerializedName("about_person")
        @Expose
        var aboutPerson: Any? = null
        @SerializedName("about_interests")
        @Expose
        var aboutInterests: Any? = null
        @SerializedName("born_at")
        @Expose
        var bornAt: BornAt? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("sex_id")
        @Expose
        var sexId: Int? = null
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
        var rating: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: CreatedAt? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: UpdatedAt? = null

    }

    inner class UpdatedAt {

        @SerializedName("date")
        @Expose
        var date: String? = null
        @SerializedName("timezone_type")
        @Expose
        var timezoneType: Int? = null
        @SerializedName("timezone")
        @Expose
        var timezone: String? = null

    }

    inner class UserProfileResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class ProfileFindResponse {

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
        @SerializedName("user")
        @Expose
        var user: User? = null

    }

    inner class User {

        @SerializedName("data")
        @Expose
        var data: UserData? = null

    }

    inner class UserData {

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
        var phone: String? = null
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
        @SerializedName("is_online")
        @Expose
        var is_online: Boolean? = null

    }
}