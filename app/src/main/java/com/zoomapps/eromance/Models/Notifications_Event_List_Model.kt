package com.zoomapps.eromance.Models

import com.zoomapps.eromance.Models.PushModels.MessageModel.From
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.GiftsModel.Gift
import com.zoomapps.eromance.Models.Notifications_Event_List_Model.Bet_

/**
 * Created by User on 19.06.2017.
 */
class Notifications_Event_List_Model{
    inner class Bet {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null

    }

    inner class Bet_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null

    }
    inner class Data {

        @SerializedName("from")
        @Expose
        var from: From? = null
        @SerializedName("is_liked")
        @Expose
        var isLiked: Boolean? = null
        @SerializedName("content")
        @Expose
        var content: String? = null

        @SerializedName("gift")
        @Expose
        var gift: Gift? = null
        @SerializedName("is_accepted")
        @Expose
        var isAccepted: Any? = null
        @SerializedName("entity")
        @Expose
        var entity: Entity? = null
        @SerializedName("bet")
        @Expose
        var bet: Bet? = null
        @SerializedName("enemy")
        @Expose
        var enemy: Enemy? = null
        @SerializedName("entity_class")
        @Expose
        var entity_class: String? = null

    }



    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
        @SerializedName("entity_class")
        @Expose
        var entityClass: String? = null
        @SerializedName("entity_id")
        @Expose
        var entityId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Enemy {

        @SerializedName("user")
        @Expose
        var user: User? = null
        @SerializedName("bet")
        @Expose
        var bet: Bet_? = null

    }

    inner class Entity {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("time_id")
        @Expose
        var timeId: Int? = null
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
        @SerializedName("types_id")
        @Expose
        var typesId: List<String>? = null
        @SerializedName("services_id")
        @Expose
        var servicesId: List<String>? = null
        @SerializedName("description")
        @Expose
        var description: Any? = null

    }



    inner class NotifiactionsListResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class From {

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
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Int? = null
        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Int? = null
        @SerializedName("vip_at")
        @Expose
        var vipAt: Any? = null

        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Int? = null

    }

    inner class Gift {

        @SerializedName("gift_id")
        @Expose
        var giftId: String? = null
        @SerializedName("owner_user_id")
        @Expose
        var ownerUserId: String? = null
        @SerializedName("acted_user_id")
        @Expose
        var actedUserId: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("id")
        @Expose
        var id: Int? = null

    }

    inner class User {

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
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Int? = null
        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Int? = null
        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Int? = null
        @SerializedName("vip_at")
        @Expose
        var vipAt: Any? = null

    }
}