package com.zoomapps.eromance.Helpers

import android.content.Context
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Interfaces.IUserInteractionView
import com.zoomapps.eromance.Models.UserRateModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 12.06.2017.
 */
class UserInteractionHelper(val mContext:Context ,var viewInterface: IUserInteractionView) {

    val add_to_fav = 0;
    val remove_from_fav = 1


    fun setRateToUser(  uid:String, isNeedToRemove:Boolean ,
                       rateState:String?=null){
        if(!isNeedToRemove){
            setRating(uid,rateState?.toInt())
        }
         else{
            //Remove
            setRating(uid)
        }
    }

    fun getActionResult(newType:Boolean? , oldType:Int?=null){
        if(oldType==null){
            viewInterface.onRemoved()
        }
        else{
            if(newType!!){
                viewInterface.onLiked()
            }
            else{
                viewInterface.onDisliked()
            }
        }
    }

    private fun setRating(uid:String ,type:Int?=null){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.rateUser(GlobalStaticVariables.language_type!!,uid,GlobalStaticVariables.myId.toString(),type)
        call.enqueue(object : Callback<UserRateModel.UserLikeResponse> {
            override fun onResponse(call: Call<UserRateModel.UserLikeResponse>,
                                    response: Response<UserRateModel.UserLikeResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    if(mainPageDataList!=null) {
                        getActionResult(mainPageDataList.isLiked ,type )
                    }
                }
                else {
                   showPreparedToast(mContext,"Error")
                }
            }
            override fun onFailure(call: Call<UserRateModel.UserLikeResponse>, t: Throwable) {
                // Log error here since request failed{
                showPreparedToast(mContext,"Error")
            }
        })
    }


    fun favorite_action(uid:String?=null ,isNeedToRemove: Boolean , fav_id:String?=null){
        if(!isNeedToRemove){
            addToFavorites(uid!!)
        }
        else{
            removeFromFavorites(fav_id!!)
        }
    }

    private fun removeFromFavorites(fav_id:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.removeFromFavorites( fav_id)
        call.enqueue(object : Callback<UserRateModel.LikesListResponse> {
            override fun onResponse(call: Call<UserRateModel.LikesListResponse>,
                                    response: Response<UserRateModel.LikesListResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body()
                    if(mainPageDataList!=null && mainPageDataList.code==1) {
                        viewInterface.onUnfavorited()
                    }
                }
                else {
                    viewInterface.onFavoriteError()
                }
            }
            override fun onFailure(call: Call<UserRateModel.LikesListResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onFavoriteError()
            }
        })
    }

    private fun addToFavorites(uid:String ){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.addToFavorites(uid,GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserRateModel.UserLikeResponse> {
            override fun onResponse(call: Call<UserRateModel.UserLikeResponse>,
                                    response: Response<UserRateModel.UserLikeResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    if(mainPageDataList!=null ) {
                        viewInterface.onFavorited(mainPageDataList.id)
                    }
                }
                else {
                    viewInterface.onFavoriteError()
                }
            }
            override fun onFailure(call: Call<UserRateModel.UserLikeResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onFavoriteError()
            }
        })
    }

     fun checkFavorites(to_user:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.checkFavorite(to_user,GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserRateModel.LikesListResponse> {
            override fun onResponse(call: Call<UserRateModel.LikesListResponse>,
                                    response: Response<UserRateModel.LikesListResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    if(mainPageDataList!=null && mainPageDataList.isNotEmpty()) {
                        var dataelement = mainPageDataList.firstOrNull()
                        if(dataelement!=null)
                             viewInterface.onFavoritesChecked(true,dataelement.id )
                    }
                    else{
                        viewInterface.onFavoritesChecked(false)
                    }
                }
                else {
                    viewInterface.onFavoriteError()
                }
            }
            override fun onFailure(call: Call<UserRateModel.LikesListResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onFavoriteError()
            }
        })
    }
}