package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.AccountModel.LoginModel


/**
 * Created by User on 11.05.2017.
 */
class MeetsModel{
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
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

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

    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("time_id")
        @Expose
        var timeId: Int? = null
        @SerializedName("types_id")
        @Expose
        var typesId: List<String>? = null
        @SerializedName("payment_id")
        @Expose
        var paymentId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("joined_user_id")
        @Expose
        var joinedUserId: Int? = null
        @SerializedName("started_at")
        @Expose
        var startedAt: String? = null
        @SerializedName("finished_at")
        @Expose
        var finishedAt: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("time")
        @Expose
        var time: Time? = null
        @SerializedName("types")
        @Expose
        var types: Types? = null
        @SerializedName("user")
        @Expose
        var user: User? = null
        @SerializedName("joined")
        @Expose
        var joined: Joined? = null

    }

    inner class Datum_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("key")
        @Expose
        var key: String? = null
        @SerializedName("value")
        @Expose
        var value: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }
    inner class MeetResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Datum? = null

    }
    inner class MeetsResponse {

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
        var data: LoginModel.Datum? = null

    }

    inner class Time {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class Types {

        @SerializedName("data")
        @Expose
        var data: List<Datum_>? = null

    }

    inner class User {

        @SerializedName("data")
        @Expose
        var data: LoginModel.Datum? = null

    }

    //----------------------------------------------------

    inner class Data_c {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("time_id")
        @Expose
        var timeId: Int? = null
        @SerializedName("types_id")
        @Expose
        var typesId: List<String>? = null
        @SerializedName("payment_id")
        @Expose
        var paymentId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("joined_user_id")
        @Expose
        var joinedUserId: Any? = null
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

        @SerializedName("types_id")
        @Expose
        var typesId: List<String>? = null

    }
    inner class MeetsCreateResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data_c? = null

    }
}