package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by User on 15.08.2017.
 */
class SocialDataModel {
    @SerializedName("social_type")
    @Expose
    var social_type: String? = null
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("username")
    @Expose
    var username: String? = null
    @SerializedName("email")
    @Expose
    var email_str: String? = null
    @SerializedName("phone")
    @Expose
    var phone_str: String? = null
    @SerializedName("birthday")
    @Expose
    var birthday_str: String? = null
    @SerializedName("sex")
    @Expose
    var sex: String? = null
}