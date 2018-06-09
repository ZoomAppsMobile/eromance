package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.Notifications_Event_List_Model.Enemy





/**
 * Created by User on 17.08.2017.
 */
class GamePushModel {
    inner class Bet {

        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null

    }

    inner class Bet_ {

        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null

    }

    inner class Data {

        @SerializedName("bet")
        @Expose
        var bet: Bet? = null
        @SerializedName("enemy")
        @Expose
        var enemy: Enemy? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null

    }

    inner class Enemy {

        @SerializedName("bet")
        @Expose
        var bet: Bet_? = null
        @SerializedName("user")
        @Expose
        var user: User? = null

    }

    inner class ResponseData {

        @SerializedName("date")
        @Expose
        var date: String? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
        @SerializedName("type")
        @Expose
        var type: String? = null

    }

    inner class User {

        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("vip_at")
        @Expose
        var vipAt: Any? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Int? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("phone")
        @Expose
        var phone: Any? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("is_online")
        @Expose
        var isOnline: Int? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("username")
        @Expose
        var username: String? = null

    }
}