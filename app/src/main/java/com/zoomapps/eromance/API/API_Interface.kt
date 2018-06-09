package com.zoomapps.eromance.API

import com.google.gson.JsonObject
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.AccountModel.RegisterModel
import com.zoomapps.eromance.Models.paymentTypes.PaymentTypesModel
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.http.Multipart


/**
 * Created by User on 25.02.2017.
 */
interface API_Interface {


    @GET("{language}/translations/pluck")
    fun getDictionary(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<TranslationModel.TranslationResponse>

    @GET("{language}/users/find")
    fun getLogin(
            @Path("language") language: String,
            @Query("email") email: String,
            @Query("password") password: String,
            @Query("include") includeentity: String = "profile"
    ): Call<LoginModel.UserLoginResponse>

    @GET("{language}/users/{user_id}")
    fun getUserInfo(@Path(value = "user_id", encoded = true) user_id: String,
                    @Path("language") language: String,
                    @Query("include") includeentity: String = "profile"

    ): Call<LoginModel.Example>

    @GET("{language}/user_socials/find")
    fun getSocialInfo(@Path("language") language: String, @Query("uid") uid: String, @Query("type_id") type: String
    ): Call<SocialAuthModel.CheckSocialResponseData>


    @GET("{language}/user_profiles/find?order_column=rating&order_type=desc&include=user")
    fun getMainProfileList(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<UserProfileModel.ProfileFindResponse>


    @GET("{language}/user_profiles/find")
    fun getUserProfile_By_UID(
            @Path("language") language: String,
            @Query("user_id") user_id: String,
            @Query("include") include: String = "user"
    )
            : Call<UserProfileModel.ProfileFindResponse>

    //http://eromance.life/api/v1/ru/profiles/find?user_id=1&include=user
    @FormUrlEncoded
    @POST("{language}/users")
    fun register(@Field("username") username: String,
                 @Field("phone") phone: String,
                 @Field("email") email: String,
                 @Field("password") password: String,
                 @Field("type_id") type_id: Int,
                 @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<RegisterModel.RegisterResponse>

    @POST("{language}/user_socials")
    fun setSocialNode(
            @Path("language") language: String,
            @Query("uid") uid: String,
            @Query("type_id") type_id: String,
            @Query("user_id") user_id: String
    ): Call<SocialAuthModel.SocialResponseData>//TODO:RESPONSE

    @POST("{language}/user_profiles")
    @FormUrlEncoded
    fun editProfile(@Field("real_name") real_name: String,
                    @Field("born_at") born_at: String,
                    @Field("user_id") user_id: String,
                    @Field("sex_id") sex_id: Int,
                    @Field("search_for") search_for: Int,
                    @Field("country_id") country_id: Int,
                    @Field("city_id") city_id: Int,
                    @Field("language_id") language_id: Int,
                    @Field("weight") weight: Int,
                    @Field("height") height: Int,
                    @Field("visability_id") visability: Int,
                    @Path("language") language: String = GlobalStaticVariables.language_type!!

    ): Call<UserProfileEditModel.UserProfileEditResponse>


    @Headers("{language}/Content-Type: application/json")
    @PUT("{language}/user_profiles/{profile_id}")
    fun updateProfile(
            @Path("language") language: String,
            @Path(value = "profile_id", encoded = true) profile_id: String,
            @Body sendData: JsonObject
    ): Call<UserProfileEditModel.UserProfileEditResponse>

    @POST("{language}/tokens/{token}/use")
    fun acivateToken(@Path(value = "token", encoded = true) token: String,
                     @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<RegisterModel.ActivateKeyResponse>

    @PUT("{language}/users/{user_id}")
    fun changePassword(@Path(value = "user_id", encoded = true) user_id: String,
                       @Path("language") language: String,
                       @Query("username") username: String,
                       @Query("email") email: String,
                       @Query("type_id") type_id: Int?,
                       @Query("password") password: String
    ): Call<PasswordModel.ChangePasswordResponse> //TODO:MODEL NEEDED

    @POST("{language}/tokens")
    fun askKeyAgain(@Path("language") language: String, @Query("email") user_email: String, @Query("type_id") type_id: Int = 1
    ): Call<RegisterModel.RegisterResponse>

    @GET("{language}/user_questionnaires/find")
    fun getUserQuesionnaries(
            @Path("language") language: String,
            @Query("user_id") user_id: String
    ): Call<UserQuessionary.UserAdditionalResponse>

    //    @GET("user_photos")
//    fun getUserPhotos(@Query("user_id")user_id: String) : Call<UserPhotosModel.UserGetPhotosResponse>
    @GET("{language}/user_photos/find")
    fun getUserPhotos(
            @Path("language") language: String,
            @Query("user_id") user_id: String
    ): Call<UserPhotosModel.UserGetPhotosResponse>

    @DELETE("{language}/user_photos/{image_id}")
    fun deleteUserPhoto(@Path(value = "image_id", encoded = true) image_id: String, @Query("user_id") user_id: String,
                        @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<UserPhotosModel.UserGetPhotosResponse>


    @GET("{language}/guests/find")
    fun getGuestList(
            @Path("language") language: String,
            @Query("entity_id") owner_user_id: String? = GlobalStaticVariables.myId.toString(),
            @Query("include") include_types: String? = "user.profile"
    ): Call<GuestModel.GuestListResponse>

    @POST("{language}/guests")
    fun setGuest(
            @Path("language") language: String,
            @Query("entity_id") owner_user_id: String?,
            @Query("entity_class") entity_class: String? = "App\\Member\\User",
            @Query("user_id") acted_user_id:
            String? = GlobalStaticVariables.myId.toString()
    ): Call<UserRateModel.UserLikeResponse>

    //http://eromance.life/api/v1/ru/user_gifts/find?owner_user_id=1&include=gift

    @GET("{language}/user_gifts/find")
    fun getGifts(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String?,
            @Query("include") include: String = "gift"

    ): Call<GiftsModel.UserGiftsResponse2>


    @GET("{language}/gifts")
    fun getGifts(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String?
    ): Call<GiftsModel.UserGiftsResponse2>

    @GET("{language}/gifts")
    fun getGifts_(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<GiftsModel.UserGiftsResponse>


    @POST("{language}/user_gifts")
    fun sendGifts(
            @Path("language") language: String,
            @Query("gift_id") gift_id: Int,
            @Query("owner_user_id") to_user_id: String?,
            @Query("acted_user_id") my_id: String
    ): Call<GiftsModel.UserGiftsSendResponse>
    // fun register (@Query("data") data: RegisterModel.RegisterRequestData): Call<RegisterModel.RegisterResponse>


    @GET("{language}/user_profiles/{profile_id}")
    fun getMyProfileData(
            @Path("language") language: String,
            @Path(value = "profile_id", encoded = true) profile_id: String,
            @Query("include") include: String = "user.questionnaires"
    ): Call<Update_Profile_Model.ResponseData>

    @GET("{language}/questionnaires")
    fun getQuessionaryVariants(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<QuessionariesValues>


    @GET("{language}/user_ratings/find")
    fun checkIfLiked(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String?,
            @Query("acted_user_id") acted_user_id: String?
    ): Call<UserRateModel.UserLikeCheckResponse>

    @GET("{language}/user_ratings/find")
    fun checkIfUserBlockedMe(
            @Path("language") language: String,
            @Query("acted_user_id") my_id: String?,
            @Query("owner_user_id") shown_user: String?
    ): Call<UserRateModel.UserLikeCheckResponse>

    @POST("{language}/user_ratings/send")
    fun rateUser(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String?,
            @Query("acted_user_id") acted_user_id: String?,
            @Query("is_liked") is_liked: Int? = null
    ): Call<UserRateModel.UserLikeResponse>


    @GET("{language}/user_ratings/find")
    fun getLikesList(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String? = null,
            @Query("acted_user_id") acted_user_id: String? = null,
            @Query("include") include_types: String? = "owner.profile"

    ): Call<UserRateModel.LikesListResponse>

    @GET("{language}/user_favorites/find")
    fun checkFavorite(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String? = null,
            @Query("acted_user_id") acted_user_id: String? = null,
            @Query("include") include_types: String? = "owner"
    ): Call<UserRateModel.LikesListResponse>

    @POST("{language}/user_favorites")
    fun addToFavorites(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String? = null,
            @Query("acted_user_id") acted_user_id: String? = null,
            @Query("include") include_types: String? = "owner"
    ): Call<UserRateModel.UserLikeResponse>

    @DELETE("{language}/user_favorites/{fav_id}")
    fun removeFromFavorites(@Path(value = "fav_id", encoded = true) fav_id: String,
                            @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<UserRateModel.LikesListResponse>

    @GET("{language}/user_favorites/find")
    fun getFavoritesList(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String? = null,
            @Query("acted_user_id") acted_user_id: String? = null,
            @Query("include") include_types: String? = "owner.profile"

    ): Call<UserRateModel.LikesListResponse>

    @POST("{language}/user_favorites/search")
    fun searchFavoritesList(
            @Path("language") language: String,
            @Query("owner_user_id") owner_user_id: String? = null,
            @Query("acted_user_id") acted_user_id: String? = null,
            @Query("sex_id") sex_id: String? = null,
            @Query("real_name") real_name: String? = null,
            @Query("include") include_types: String? = "owner.profile"
    ): Call<UserRateModel.LikesListResponse>
    //TODO:: REVIEW ||eromance.life/api/v1/ru/reviews?entity_class=App\Member\Profile\Profile&entity_id=1&content=mytext&user_id=2

    @GET("{language}/reviews/find")
    fun getUserReviewList(
            @Path("language") language: String,
            @Query("entity_id") profile_id_of_user: String,
            @Query("entity_class") entity_class: String = "App\\Member\\Profile\\Profile",
            @Query("include") include: String = "user"
    ): Call<ReviewModel.GetReviewResponse>

    @POST("{language}/reviews")
    fun sendReviewToUser(
            @Path("language") language: String,
            @Query("user_id") my_user_id: String,
            @Query("content") content: String,
            @Query("entity_id") profile_id_of_user: String,
            @Query("entity_class") entity_class: String = "App\\Member\\Profile\\Profile"
    ): Call<ReviewModel.SendReviewResponse>

    //GAMES-------------------
    @POST("{language}/games/{game_id}/play")
    fun runGame(@Path(value = "game_id", encoded = true) game_id: String,
                @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<GameModel.GameActivateModel.GamePlayRequest>

    @POST("{language}/games/{game_id}/join")
    @FormUrlEncoded
    fun answerToGame(@Path(value = "game_id", encoded = true) game_id: String,
                     @Field("bet") bet: String,
                     @Field("thing_id") thing_id: String,
                     @Field("user_id") user_id: String,
                     @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<GameModel.GameBetModel.GameAnswerRequest>

    @POST("{language}/games/init")
    @FormUrlEncoded
    fun createGame(@Field("bet") bet: String,
                   @Field("thing_id") thing_id: String,
                   @Field("user_id") user_id: String,
                   @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<GameModel.GameBetModel.GameAnswerRequest>

    @GET("{language}/games/find")
    fun getGameList(
            @Path("language") language: String,
            @Query("is_played") is_played: Boolean = false,
            @Query("include") include: String = "bets"
    ): Call<GameModel.GamesListModel.GameListResponse>

    @GET("{language}/game_bets/find")
    fun getGameHistoryList(
            @Path("language") language: String,
            @Query("user_id") user_id: String,
            @Query("game.is_played") is_played: Boolean = true,
            @Query("include") include: String = "game.bets.user"
    ): Call<GameHistoryModel.ResponseData>

    @Multipart
    @POST("{language}/users/{user_id}/avatar")
    fun uploadAvatar(@Path(value = "user_id", encoded = true) userID: String,
                     @Part("image") file: RequestBody,
                     @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<ResponseBody>
    //  @Part("image ") file: RequestBody): Call<ResponseBody>

    //MAP
    @GET("{language}/user_locations?include=user.profile")
    fun getMapPoints(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<MapModels.MapPointsResponse>

    @GET("{language}/user_locations/find")
    fun filterPoints(@Path("language") language: String, @Query("types_id[]") types_id: List<Int>, @Query("sex_id") sex_id: Int? = null, @Query("include") include_type: String = "user.profile"
    ): Call<MapModels.MapPointsResponse>

    @GET("{language}/user_locations/find")
    fun checkMyPoints(@Path("language") language: String, @Query("user_id") user_id: Int
    ): Call<MapModels.MapPointsResponse>

    @POST("{language}/user_locations")
    @FormUrlEncoded
    fun postMapPoint(
            @Path("language") language: String,
            @Field("longitude") longitude: String,
            @Field("latitude") latitude: String,
            @Field("types_id[]") types_id: List<Int>,
            @Field("user_id") user_id: String
    ): Call<MapModels.MapAddModel.MapAddPointsResponse>

    @PUT("{language}/user_locations/{id}")
    @FormUrlEncoded
    fun updateMapPoint(@Path(value = "id", encoded = true) id: String,
                       @Field("longitude") longitude: String,
                       @Field("latitude") latitude: String,
                       @Field("types_id[]") types_id: List<Int>,
                       @Field("user_id") user_id: String,
                       @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<MapModels.MapAddModel.MapAddPointsResponse>

    @DELETE("{language}/user_locations/{id}")
    fun removeMapPoint(@Path(value = "id", encoded = true) id: String,
                       @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<Code>

    //    @POST("profiles/search")
//    @FormUrlEncoded
//    fun  searchPair(@Field("age[from]") age_from :Int?=null ,
//                     @Field("age[to]") age_to :Int?=null  ,
//                     @Field("height[from]") height_from : Int?=null,
//                     @Field("height[to]") height_to : Int?=null ,
////                     @Field("questionnaire[5]") complection : String?=null ,
//                     @Field("sex_id") sex : String?=null ,
//                     @Field("country_id") country_id : String?=null,
//                     @Field("city_id") city_id : String?=null,
//                    @Query("include") include_type:String = "user") : Call<SearchPairModel.SearchPairResponse>
    @POST("{language}/user_profiles/search")
    fun searchPair(
            @Path("language") language: String,
            @Query("age[from]") age_from: Int? = null,
            @Query("age[to]") age_to: Int? = null,
            @Query("height[from]") height_from: Int? = null,
            @Query("height[to]") height_to: Int? = null,
            @Query("questionnaire[5]") complection: Int? = null,
            @Query("sex_id") sex: Int? = null,
            @Query("country_id") country_id: Int? = null,
            @Query("city_id") city_id: Int? = null,
            @Query("relation[user.is_online]") is_online: Int? = null,
            @Query("include") include_type: String = "user"
    ): Call<SearchPairModel.SearchPairResponse>

    //Types
    @GET("{language}/meet_types")
    fun getMeetTypes(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<MeetTypesResponse>


    @GET("{language}/meets")
    fun getMeets(@Path("language") language: String, @Query("include") incl: String = "joined.profile,user.profile,types"
    ): Call<MeetsModel.MeetsResponse>

    @GET("{language}/meets/find")
    fun getFilteredMeets(
            @Path("language") language: String,
            @Query("time_id") time_id: String? = null,
            @Query("types_id[]") meet_types: List<Int>? = null,
            @Query("include") incl: String = "joined.profile,user.profile,types"
    ): Call<MeetsModel.MeetsResponse>

    @POST("{language}/meets")
    @FormUrlEncoded
    fun postMeets(@Field("time_id") time_id: String,
                  @Field("payment_id") payment_id: String,
                  @Field("types_id[]") types_id: List<Int>,
                  @Field("user_id") user_id: String,
                  @Field("joined_user_id") joined_user_id: String,
                  @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<MeetsModel.MeetsCreateResponse>

    @POST("{language}/meets")
    @FormUrlEncoded
    fun postMeets(@Field("time_id") time_id: String,
                  @Field("payment_id") payment_id: String,
                  @Field("types_id[]") types_id: List<Int>,
                  @Field("user_id") user_id: String,
                  @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<MeetsModel.MeetsCreateResponse>

    @GET("{language}/meets/{id}")
    fun getMeetById(
            @Path("language") language: String,
            @Path(value = "id", encoded = true)
            id: String,
            @Query("include")
            include: String = "joined.profile,types"
    ): Call<MeetsModel.MeetResponse>


    @POST("{language}/user_interactions")
    fun connectToMeet(
            @Path("language") language: String,
            @Query("entity_id") meet_id: String,
            @Query("user_id") user_id: String,
            @Query("entity_class") entity_class: String = "App\\Meet\\Meet"
    ): Call<ConnectToMeetResponse>

    @PUT("{language}/user_interactions/{id}")
    fun updateConnectionToMeet(
            @Path("language") language: String,
            @Path("id") interaction_id: String,
            @Query("entity_id") meet_id: String,
            @Query("user_id") user_id: String,
            @Query("is_accepted") status: Int,
            @Query("entity_class") entity_class: String
    ): Call<ConnectToMeetResponse>

    @GET("{language}/user_interactions/find")
    fun checkIfUserConnectedToMeet(
            @Path("language") language: String,
            @Query("entity_id") meet_id: String,
            @Query("user_id") user_id: String,
            @Query("entity_class") entity_class: String
    ): Call<ConnectedToMeetResponse>


    @GET("{language}/user_interactions/find")
    fun checkSubscribe(
            @Path("language") language: String,
            @Query("user_id") user_id: String, @Query("entity_id") meet_id: Int
    ): Call<ConnectedToMeetResponse>


    @GET("{language}/user_interactions/find")
    fun preSubscribe(
            @Path("language") language: String,
            @Query("entity_class") entity_class: String, @Query("entity_id") entity_id: Int
    ): Call<ConnectedToMeetResponse>


    @DELETE("{language}/user_interactions/{id}")
    fun removeMeetConnection(@Path("id") interaction_id: String,
                             @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<ConnectedToMeetResponse>

    @GET("{language}/user_interactions/{id}")
    fun getMeetConnection(@Path("id") interaction_id: String,
                          @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<ConnectedToOneMeetResponse>


    //EVENINGS

    @POST("{language}/evenings")
    @FormUrlEncoded
    fun postEvening(
            @Path("language") language: String,
            @Field("types_id[]") types_id: List<Int>,
            @Field("payment_id") payment_id: String,
            @Field("started_at") started_at: String,
            @Field("finished_at") finished_at: String,
            @Field("user_id") user_id: String,
            @Field("joined_user_id") joined_user_id: String
    ): Call<EveningsModel.EveningCreateResponse>

    @POST("{language}/evenings")
    @FormUrlEncoded
    fun postEvening(@Field("types_id[]") types_id: List<Int>,
                    @Field("payment_id") payment_id: String,
                    @Field("started_at") started_at: String,
                    @Field("finished_at") finished_at: String,
                    @Field("user_id") user_id: String,
                    @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<EveningsModel.EveningCreateResponse>

    @GET("{language}/evenings/{id}")
    fun getEveningById(
            @Path("language") language: String,
            @Path(value = "id", encoded = true)
            id: String,
            @Query("include")
            include: String = "joined.profile,types"
    ): Call<EveningsModel.EveningResponse>

    @GET("{language}/evenings")
    fun getEvening(@Path("language") language: String, @Query("include") include: String = "joined.profile,user.profile,types"
    ): Call<EveningsModel.EveningListResponse>

    @GET("{language}/evenings/find")
    fun getFilteredEvenings(@Path("language") language: String, @Query("include") include: String = "joined.profile,user.profile,types",
                            @Query("types_id[]") evening_types: List<Int>? = null,
                            @Query("started_at") started_at: String? = null,
                            @Query("finished_at") finished_at: String? = null
    ): Call<EveningsModel.EveningListResponse>

    @GET("{language}/evening_types")
    fun getEveningTypes(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<EveningTypesResponse>
    //Places
    // @GET("places")
    // fun getPlaceList(@Query("include") include:String="user"):Call<PlacesModel.PlacesListResponse>


    @GET("{language}/places")
    fun getPlaceList(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<PlacesModel.PlacesListResponse>


    @GET("{language}/places/find")
    fun getFilteredPlaceList(@Path("language") language: String, @Query("type_id[]") plaesTypes: List<Int>? = null,
                             @Query("name") name: String? = null,
                             @Query("include") include: String = "user"
    ): Call<PlacesModel.PlacesListResponse>

    @GET("{language}/places/{place_id}")
    fun getPlaceInfo(@Path("language") language: String, @Path(value = "place_id", encoded = true) place_id: String,
                     @Query("include") includes: String? = "photos,city,country"
    ): Call<PlaceInfoModel.PlaceInfoResponse>

    //TYPE
    @GET("{language}/place_types")
    fun getPlaceTypes(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<com.zoomapps.eromance.Models.Types.PlaceTypes>

    //
    @POST("{language}/user_device_tokens")
    @FormUrlEncoded
    fun sendFCMtoken(@Field("type_id") type_id: String? = "2",
                     @Field("user_id") user_id: String,
                     @Field("token") token: String,
                     @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<DeviceTokenModel.UserDeviceResponse>


    //Messages
    @GET("{language}/conversations/find")
    fun getMyDialogs(@Path("language") language: String, @Query("owner_user_id") my_id: String,
                     @Query("include") include: String? = "joined.profile"
    ): Call<DialogsModel.DialogsResponse>


    //Open chat by ids
    @GET("{language}/conversations/find")
    fun getMessagesByUserIds(@Path("language") language: String, @Query("owner_user_id") my_id: String,
                             @Query("joined_user_id") interocular: String,
                             @Query("include") include: String? = "messages,joined.profile"
    ): Call<ChatMessageModel.DialogWithChatResponse>


    @POST("{language}/conversation_message/send")
    @Headers("Content-Type: application/json")
    fun sendMessage(@Path("language") language: String, @Body sendData: JsonObject
    ): Call<ChatMessageModel.MessageSendResponse>


    //--------------------------- +21 --------------------------

    @POST("{language}/user_services")
    @FormUrlEncoded
    fun become_twentyOne_Provider(@Field("user_id") user_id: String, @Field("type_id") type_id: Int?,
                                  @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<TwentyOneModel.UserBecomeProviderResponse>

    //TYPE
    @GET("{language}/user_service_types")
    fun getTwentyOneServiceTypes(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<com.zoomapps.eromance.Models.Types.UserServiceTypes>

    @PUT("{language}/user_profiles/{profile_id}")
    fun becomeAdult(@Path("language") language: String, @Path(value = "profile_id", encoded = true) profile_id: Int,
                    @Query("is_adult") is_adult: Int? = 1,
                    @Query("real_name") real_name: String,
                    @Query("born_at") born_at: String,
                    @Query("user_id") user_id: Int,
                    @Query("sex_id") sex_id: Int,
                    @Query("search_for") search_for: Int,
                    @Query("country_id") country_id: Int,
                    @Query("city_id") city_id: Int,
                    @Query("language_id") language_id: Int
    ): Call<UpdateProfileModel.UpdateProfileResponse>

    @POST("{language}/adult_requests")
    fun sendRequestToTwentyProviders(@Query("user_id") user_id: Int, @Query("services_id[]") services_id: List<Int>,
                                     @Query("description") description: String,
                                     @Path("language") language: String = GlobalStaticVariables.language_type!!
    )
            : Call<TwentyOneRequestModel.RequestToTwentyProvidersResponse>

    //---------------------FOR +21 PROVIDER
    @GET("{language}/user_services/find")
    fun getUserProvidingServiceType(@Path("language") language: String, @Query("user_id") user_id: Int
    )
            : Call<TwentyOneModel.UserProvidingServiceResponse>

    @GET("{language}/adult_requests/find")
    fun getAdultRequestsList(@Path("language") language: String, @Query("include") include: String = "user.profile"
    )
            : Call<AdultRequestsModel.AdultRequestsListResponse>

    //-------------------Notifications ----------------------
    @GET("{language}/user_notifications/find")
    fun getUserNotifications(@Path("language") language: String, @Query("user_id") user_ID: String?
    ): Call<Notifications_Event_List_Model.NotifiactionsListResponse>

//    @Query("order_column") order_column :String= "id",
//    @Query("order_type") order_type :String = "asc"

    // Report
    @POST("{language}/reports")
    fun postReport(@Path("language") language: String, @Query("entity_class") entity_class: String? = null,
                   @Query("entity_id") entity_id: String? = null,
                   @Query("comment") comment: String? = null,
                   @Query("user_id") user_id: String? = null
    ): Call<ReportModel.ReportCheckResponseData>


    //Status
    @GET("{language}/user_statuses/find")
    fun getUserStatus(@Path("language") language: String, @Query("user_id") user_id: String
    ): Call<UserStatusModel.GetUserStatusResponse>

    @POST("{language}/user_statuses")
    fun postUserStatus(@Path("language") language: String, @Query("user_id") user_id: String, @Query("content") content: String?
    ): Call<UserStatusModel.PostUserStatusResponse>

    @PUT("{language}/user_statuses/{id}")
    fun updateUserStatus(@Path("language") language: String, @Path("id") status_id: String, @Query("user_id") user_id: String, @Query("content") content: String?
    ): Call<UserStatusModel.PostUserStatusResponse>


    //Payment
    @POST("{language}/payments/pay")
    fun makePayment(@Path("language") language: String, @Query("user_id") user_id: String,
                    @Query("type_id") payment_type: Int
    ): Call<PaymentModel.PaymentResponseData>

    @GET("{language}/payment_types")
    fun getPaymentsData(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<PaymentTypesModel>


    @POST("{language}/users/change_password")
    @FormUrlEncoded
    fun chanchePassword(@Path("language") language: String, @Field("user_id") user_id: Int,
                        @Field("current_password") current_password: String,
                        @Field("new_password") new_passwordtest: String
    ): Call<DataResetPassword>


    @POST("{language}/users/{email_user}/password")
    fun resetPassword(@Path("email_user") email_user: String,
                      @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<DataResetPassword>

    @DELETE("{language}/users/{id}")
    fun deleteUser(@Path("id") id_user: Int,
                   @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<Void>

    @GET("{language}/user_bans/find")
    fun cheUserBands(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<CheckUserBands>

    @POST("{language}/user_bans")
    @FormUrlEncoded

    //onwer кому
    // acted кто блокирует
    fun blockUser(@Field("owner_user_id") owner_user_id: Int, @Field("acted_user_id") acted_user_id: Int,
                  @Path("language") language: String = GlobalStaticVariables.language_type!!
    ): Call<Code>

    @GET("{language}/user_location_types")
    fun getLocationType(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<LocationTypes>

    @GET("{language}/location_countries")
    fun getListCountries(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<GetListCountriesModel>

    @GET("{language}/location_cities")
    fun getListCities(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<GetListCitiesModel>

    @GET("{language}/user_profile_sexes")
    fun getManAndWoman(@Path("language") language: String = GlobalStaticVariables.language_type!!): Call<ManAndWoman>

}