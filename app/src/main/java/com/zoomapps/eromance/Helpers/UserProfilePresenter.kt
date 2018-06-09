package com.zoomapps.eromance.Helpers

import android.content.Context
import android.util.Log
import android.view.ViewGroup
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Interfaces.IUserProfileView
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.GiftsModel
import com.zoomapps.eromance.Models.UserPhotosModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.Models.UserRateModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 06.07.2017.
 */
class UserProfilePresenter(val mContext: Context, val viewInterface: IUserProfileView) {

    fun getDataBy_UID(uid: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getUserProfile_By_UID(GlobalStaticVariables.language_type!!, uid)
        call.enqueue(object : Callback<UserProfileModel.ProfileFindResponse> {
            override fun onResponse(call: Call<UserProfileModel.ProfileFindResponse>,
                                    response: Response<UserProfileModel.ProfileFindResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    if (mainPageDataList != null) {
                        //setUserProfileData(mainPageDataList)
                        viewInterface.onUserProfileDataLoaded(mainPageDataList?.firstOrNull())
                    }
                } else {
                    showToast(mContext, "Не удалось получить данные")
                }
            }

            override fun onFailure(call: Call<UserProfileModel.ProfileFindResponse>, t: Throwable) {
                // Log error here since request failed
                showPreparedToast(mContext, "Error")
            }
        })
    }

    fun getUserPhotos(user_id: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getUserPhotos(GlobalStaticVariables.language_type!!, user_id)
        call.enqueue(object : Callback<UserPhotosModel.UserGetPhotosResponse> {
            override fun onResponse(call: Call<UserPhotosModel.UserGetPhotosResponse>,
                                    response: Response<UserPhotosModel.UserGetPhotosResponse>) {



                try {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null) {
                        viewInterface.onUserPhotosLoaded(mainPageDataList)
                    } else {
                    }
                }catch (ex:Exception){

                }






            }

            override fun onFailure(call: Call<UserPhotosModel.UserGetPhotosResponse>, t: Throwable) {
                // Log error here since request failed
            }

        })
    }

    fun getUserGifts(user_id: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        //val call = apiService.getGifts(user_id)
        val call = apiService.getGifts(GlobalStaticVariables.language_type!!, user_id)
        call.enqueue(object : Callback<GiftsModel.UserGiftsResponse2> {
            override fun onResponse(call: Call<GiftsModel.UserGiftsResponse2>,
                                    response: Response<GiftsModel.UserGiftsResponse2>) {



                try {
                    val mainPageDataList = response.body().data
                    viewInterface.onUserGiftsLoaded2(mainPageDataList!!)
                    if (mainPageDataList != null) {
                        viewInterface.onUserGiftsLoaded2(mainPageDataList)
                    } else {
                    }

                }catch (ex : Exception){
                     Log.e("error", "UserProfilePresenter")
                }








            }

            override fun onFailure(call: Call<GiftsModel.UserGiftsResponse2>, t: Throwable) {
                // Log error here since request failed
            }

        })
    }

    fun sendGift(giftID: Int, to_user: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.sendGifts(GlobalStaticVariables.language_type!!,giftID, to_user, GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<GiftsModel.UserGiftsSendResponse> {
            override fun onResponse(call: Call<GiftsModel.UserGiftsSendResponse>,
                                    response: Response<GiftsModel.UserGiftsSendResponse>) {
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && response.body().code == 1) {
                    viewInterface.onGiftSendSuccesfully()
                } else {
                    viewInterface.onGiftSendError()
                }
            }

            override fun onFailure(call: Call<GiftsModel.UserGiftsSendResponse>, t: Throwable) {
                // Log error here since request failed
              //  viewInterface.onGiftSendError()
            }

        })

    }

    fun checkIfThisUserBlocedMe(this_user_id: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.checkIfUserBlockedMe(GlobalStaticVariables.language_type!!,this_user_id, GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserRateModel.UserLikeCheckResponse> {
            override fun onResponse(call: Call<UserRateModel.UserLikeCheckResponse>,
                                    response: Response<UserRateModel.UserLikeCheckResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null && mainPageDataList.isNotEmpty()) {
                        var lastAction = mainPageDataList.lastOrNull();
                        if (lastAction?.isLiked != null) {
                            if (lastAction?.isLiked == false) {
                                viewInterface.onUserAreBlocked()
                            }
                        }
                    }
                } else {

                }
            }

            override fun onFailure(call: Call<UserRateModel.UserLikeCheckResponse>, t: Throwable) {
                // Log error here since request failed

            }
        })
    }
}