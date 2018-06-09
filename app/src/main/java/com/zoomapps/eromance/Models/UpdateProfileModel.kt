package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 03.07.2017.
 */
class UpdateProfileModel {
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
        var rating: Int? = null
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

    inner class UpdateProfileResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}