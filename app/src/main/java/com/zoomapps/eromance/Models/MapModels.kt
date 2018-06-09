package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.MapModels.User





/**
 * Created by User on 04.05.2017.
 */
class MapModels{
    inner class User {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class MapPointsResponse {

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
        @SerializedName("longitude")
        @Expose
        var longitude: Double? = null
        @SerializedName("latitude")
        @Expose
        var latitude: Double? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("types_id")
        @Expose
        var typesId: Any? = null
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
        var profile: LoginModel.Profile? = null
        @SerializedName("is_online")
        @Expose
        var is_online: Boolean? = null
    }
    class MapAddModel{
        inner class MapAddPointsResponse {

            @SerializedName("code")
            @Expose
            var code: Int? = null
            @SerializedName("data")
            @Expose
            var data: Data? = null
        }

        inner class Data {

            @SerializedName("id")
            @Expose
            var id: Int? = null
            @SerializedName("longitude")
            @Expose
            var longitude: Double? = null
            @SerializedName("latitude")
            @Expose
            var latitude: Double? = null
            @SerializedName("user_id")
            @Expose
            var userId: Int? = null
            @SerializedName("types_id")
            @Expose
            var typesId: Any? = null
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

            @SerializedName("longitude")
            @Expose
            var longitude: List<String>? = null
            @SerializedName("latitude")
            @Expose
            var latitude: List<String>? = null
            @SerializedName("types_id")
            @Expose
            var typesId: List<String>? = null
            @SerializedName("user_id")
            @Expose
            var userId: List<String>? = null

        }


    }
}