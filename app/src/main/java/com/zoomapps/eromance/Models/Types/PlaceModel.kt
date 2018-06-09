package com.zoomapps.eromance.Models.Types

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


/**
 * Created by User on 15.06.2017.
 */
    open class PlaceTypesDatum : RealmObject(){
        @PrimaryKey
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

    open class PlaceTypes : RealmObject() {
        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: RealmList<PlaceTypesDatum>? = null
    }
