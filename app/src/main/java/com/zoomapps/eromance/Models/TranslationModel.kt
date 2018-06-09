package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TranslationModel{
class Data {
    @SerializedName("location_countries")
    @Expose
    var locationCountries: List<IdValueModel>? = null
    @SerializedName("location_cities")
    @Expose
    var locationCities: List<IdValueModel>? = null
    @SerializedName("user_profile_sexes")
    @Expose
    var userProfileSexes: List<IdValueModel>? = null
}
class IdValueModel {
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("value")
        @Expose
        var value: String? = null
}
class LocationCity {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("value")
    @Expose
    var value: String? = null

}

class LocationCountry {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("value")
    @Expose
    var value: String? = null

}

class TranslationResponse {

    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: Data? = null

}

class UserProfileSex {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("value")
    @Expose
    var value: String? = null

}}