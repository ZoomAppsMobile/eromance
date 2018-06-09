package com.zoomapps.eromance.Models.AccountModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.AccountModel.LoginModel.CreatedAt
import com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.Models.AccountModel.RegisterModel.Data_
import com.zoomapps.eromance.Models.UserProfileModel.BornAt








/**
 * Created by User on 18.04.2017.
 */
class LoginModel{
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

    inner class UserListData {

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
        var rating: Double? = null
        @SerializedName("is_adult")
        @Expose
        var isAdult: Boolean? = null
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

    inner class Profile {

        @SerializedName("data")
        @Expose
        var data: DataProfile? = null

    }

    inner class DataProfile {

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

        @SerializedName("is_adult_confirmed")
        @Expose
        var isAdultConfirmed: Boolean? = false
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("photos_count")
        @Expose
        var photos_count: Int? = null

    }

    inner class Example {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Datum? = null



    }
    inner class UserLoginResponse {

        @SerializedName("code")
        @Expose
        private var code: Int? = null
        @SerializedName("data")
        @Expose
        private var data: List<Datum>? = null









        fun getCode(): Int? {
            return code
        }

        fun setCode(code: Int?) {
            this.code = code
        }

        fun getData(): List<Datum>? {
            return data
        }

        fun setData(data: List<Datum>) {
            this.data = data
        }
    }

    inner class ImageLoadedResponse {
        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Datum? = null

    }
    inner class UsersFindData {

        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

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
}

class RegisterModel{
    class RegisterRequest{
        @SerializedName("data")
        @Expose
        var data: RegisterRequestData? = null
    }
    class RegisterRequestData{
        @SerializedName("username")
        @Expose
        var username: String? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("phone")
        @Expose
        var phone: String? = null
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("tyoe_id")
        @Expose
        var type_id: Int? = null
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
        @SerializedName("is_active")
        @Expose
        var isActive: Boolean? = null
        @SerializedName("amount")
        @Expose
        var amount: Any? = null
        @SerializedName("type_id")
        @Expose
        var typeId: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("errors")
        @Expose
        var errors: RegisterErrors? = null
    }

    inner class RegisterResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
    }

    inner class RegisterErrors {

        @SerializedName("username")
        @Expose
        var username: List<String>? = null
        @SerializedName("email")
        @Expose
        var email: List<String>? = null
        @SerializedName("password")
        @Expose
        var password: List<String>? = null
        @SerializedName("type_id")
        @Expose
        var typeId: List<String>? = null

    }
    inner class ActivateKeyResponse {
        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: AuthKeyData? = null
    }

    inner class AuthKeyData {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("data")
        @Expose
        var data: Data_? = null
        @SerializedName("hash")
        @Expose
        var hash: String? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_used")
        @Expose
        var isUsed: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }


    inner class Data_ {

        @SerializedName("user_id")
        @Expose
        var userId: Int? = null

    }
}