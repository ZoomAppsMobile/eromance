package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 17.08.2017.
 */
class OdnoklassnikiResponseModel{
    inner class Location {

        @SerializedName("city")
        @Expose
        var city: String? = null
        @SerializedName("country")
        @Expose
        var country: String? = null
        @SerializedName("countryCode")
        @Expose
        var countryCode: String? = null
        @SerializedName("countryName")
        @Expose
        var countryName: String? = null

    }

    inner class ResponseData {

        @SerializedName("uid")
        @Expose
        var uid: String? = null
        @SerializedName("birthday")
        @Expose
        var birthday: String? = null
        @SerializedName("age")
        @Expose
        var age: Int? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("locale")
        @Expose
        var locale: String? = null
        @SerializedName("gender")
        @Expose
        var gender: String? = null
        @SerializedName("location")
        @Expose
        var location: Location? = null
        @SerializedName("online")
        @Expose
        var online: String? = null
        @SerializedName("first_name")
        @Expose
        var firstName: String? = null
        @SerializedName("last_name")
        @Expose
        var lastName: String? = null
        @SerializedName("has_email")
        @Expose
        var hasEmail: Boolean? = null
        @SerializedName("pic_1")
        @Expose
        var pic1: String? = null
        @SerializedName("pic_2")
        @Expose
        var pic2: String? = null
        @SerializedName("pic_3")
        @Expose
        var pic3: String? = null

    }
}