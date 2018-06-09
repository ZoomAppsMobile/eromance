package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.PlaceInfoModel.City





/**
 * Created by User on 12.06.2017.
 */
class PlaceInfoModel{
    inner class City {

        @SerializedName("data")
        @Expose
        var data: Data__? = null

    }

    inner class Country {

        @SerializedName("data")
        @Expose
        var data: Data_? = null

    }

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("image")
        @Expose
        var image: String? = null
        @SerializedName("address")
        @Expose
        var address: String? = null
        @SerializedName("longitude")
        @Expose
        var longitude: Double? = null
        @SerializedName("latitude")
        @Expose
        var latitude: Double? = null
        @SerializedName("food")
        @Expose
        var food: String? = null
        @SerializedName("avereg_price")
        @Expose
        var averegPrice: Int? = null
        @SerializedName("hour_from")
        @Expose
        var hourFrom: Int? = null
        @SerializedName("hour_to")
        @Expose
        var hourTo: Int? = null
        @SerializedName("site")
        @Expose
        var site: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("country_id")
        @Expose
        var countryId: Int? = null
        @SerializedName("city_id")
        @Expose
        var cityId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("country")
        @Expose
        var country: Country? = null
        @SerializedName("city")
        @Expose
        var city: City? = null
        @SerializedName("photos")
        @Expose
        var photos: Photos? = null
        @SerializedName("user")
        @Expose
         var user: User? = null
    }

    inner class User {

        @SerializedName("data")
        @Expose
        var data: UserData? = null

    }
    inner class Data_ {

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

    inner class Data__ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("key")
        @Expose
        var key: String? = null
        @SerializedName("value")
        @Expose
        var value: String? = null
        @SerializedName("country_id")
        @Expose
        var countryId: Int? = null
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
        @SerializedName("image")
        @Expose
        var image: String? = null
        @SerializedName("position")
        @Expose
        var position: Int? = null
        @SerializedName("place_id")
        @Expose
        var placeId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Photos {

        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

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

    }
    inner class PlaceInfoResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}