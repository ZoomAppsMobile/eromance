package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ThirdPartyApiModel{
inner class VK_Models{
    inner class City {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("title")
        @Expose
        var title: String? = null

    }

    inner class Counters {

        @SerializedName("albums")
        @Expose
        var albums: Int? = null
        @SerializedName("videos")
        @Expose
        var videos: Int? = null
        @SerializedName("audios")
        @Expose
        var audios: Int? = null
        @SerializedName("notes")
        @Expose
        var notes: Int? = null
        @SerializedName("photos")
        @Expose
        var photos: Int? = null
        @SerializedName("groups")
        @Expose
        var groups: Int? = null
        @SerializedName("gifts")
        @Expose
        var gifts: Int? = null
        @SerializedName("friends")
        @Expose
        var friends: Int? = null
        @SerializedName("online_friends")
        @Expose
        var onlineFriends: Int? = null
        @SerializedName("user_photos")
        @Expose
        var userPhotos: Int? = null
        @SerializedName("followers")
        @Expose
        var followers: Int? = null
        @SerializedName("subscriptions")
        @Expose
        var subscriptions: Int? = null
        @SerializedName("pages")
        @Expose
        var pages: Int? = null

    }

    inner class Country {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("title")
        @Expose
        var title: String? = null

    }

    inner class LastSeen {

        @SerializedName("time")
        @Expose
        var time: Int? = null
        @SerializedName("platform")
        @Expose
        var platform: Int? = null

    }

    inner class Response {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("first_name")
        @Expose
        var firstName: String? = null
        @SerializedName("last_name")
        @Expose
        var lastName: String? = null
        @SerializedName("sex")
        @Expose
        var sex: Int? = null
        @SerializedName("domain")
        @Expose
        var domain: String? = null
        @SerializedName("city")
        @Expose
        var city: City? = null
        @SerializedName("country")
        @Expose
        var country: Country? = null
        @SerializedName("photo_50")
        @Expose
        var photo50: String? = null
        @SerializedName("photo_100")
        @Expose
        var photo100: String? = null
        @SerializedName("photo_200")
        @Expose
        var photo200: String? = null
        @SerializedName("photo_max")
        @Expose
        var photoMax: String? = null
        @SerializedName("photo_200_orig")
        @Expose
        var photo200Orig: String? = null
        @SerializedName("photo_400_orig")
        @Expose
        var photo400Orig: String? = null
        @SerializedName("photo_max_orig")
        @Expose
        var photoMaxOrig: String? = null
        @SerializedName("has_mobile")
        @Expose
        var hasMobile: Int? = null
        @SerializedName("online")
        @Expose
        var online: Int? = null
        @SerializedName("can_post")
        @Expose
        var canPost: Int? = null
        @SerializedName("can_see_all_posts")
        @Expose
        var canSeeAllPosts: Int? = null
        @SerializedName("can_see_audio")
        @Expose
        var canSeeAudio: Int? = null
        @SerializedName("can_write_private_message")
        @Expose
        var canWritePrivateMessage: Int? = null
        @SerializedName("mobile_phone")
        @Expose
        var mobilePhone: String? = null
        @SerializedName("home_phone")
        @Expose
        var homePhone: String? = null
        @SerializedName("site")
        @Expose
        var site: String? = null
        @SerializedName("status_audio")
        @Expose
        var statusAudio: StatusAudio? = null
        @SerializedName("status")
        @Expose
        var status: String? = null
        @SerializedName("last_seen")
        @Expose
        var lastSeen: LastSeen? = null
        @SerializedName("common_count")
        @Expose
        var commonCount: Int? = null
        @SerializedName("counters")
        @Expose
        var counters: Counters? = null
        @SerializedName("university")
        @Expose
        var university: Int? = null
        @SerializedName("university_name")
        @Expose
        var universityName: String? = null
        @SerializedName("faculty")
        @Expose
        var faculty: Int? = null
        @SerializedName("faculty_name")
        @Expose
        var facultyName: String? = null
        @SerializedName("graduation")
        @Expose
        var graduation: Int? = null
        @SerializedName("relation")
        @Expose
        var relation: Int? = null
        @SerializedName("universities")
        @Expose
        var universities: List<Any>? = null
        @SerializedName("schools")
        @Expose
        var schools: List<Any>? = null
        @SerializedName("relatives")
        @Expose
        var relatives: List<Any>? = null

    }

    inner class StatusAudio {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("owner_id")
        @Expose
        var ownerId: Int? = null
        @SerializedName("artist")
        @Expose
        var artist: String? = null
        @SerializedName("title")
        @Expose
        var title: String? = null
        @SerializedName("duration")
        @Expose
        var duration: Int? = null
        @SerializedName("date")
        @Expose
        var date: Int? = null
        @SerializedName("url")
        @Expose
        var url: String? = null
        @SerializedName("lyrics_id")
        @Expose
        var lyricsId: Int? = null
        @SerializedName("genre_id")
        @Expose
        var genreId: Int? = null

    }

    inner class VkProfileResponse {

        @SerializedName("response")
        @Expose
        var response: List<Response>? = null

    }
}

}