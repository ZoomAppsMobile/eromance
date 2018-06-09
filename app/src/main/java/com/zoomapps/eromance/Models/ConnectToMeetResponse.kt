package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 05.07.2017.
 */
class ConnectedToOneMeetResponse {

    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: Data? = null

}

class ConnectedToMeetResponse {

    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: List<Data>? = null

}

class ConnectToMeetResponse {

    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: List<Data>? = null

}

class Data {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("entity_class")
    @Expose
    var entityClass: String? = null
    @SerializedName("entity_id")
    @Expose
    var entityId: Int? = null
    @SerializedName("user_id")
    @Expose
    var userId: Int? = null
//    @SerializedName("is_accepted")
//    @Expose
//    var isAccepted: Boolean? = null
    @SerializedName("accept_type_id")
    @Expose
    var isAcceptedType: Int? = null
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

}