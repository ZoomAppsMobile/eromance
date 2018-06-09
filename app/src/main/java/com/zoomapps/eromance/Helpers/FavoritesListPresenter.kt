package com.zoomapps.eromance.Helpers

import android.content.Context
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Interfaces.IFavoritesView
import com.zoomapps.eromance.Models.UserRateModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 13.06.2017.
 */
class FavoritesListPresenter (val mContext: Context, var viewInterface: IFavoritesView) {

    fun getFavoritesData(ownerId : String?=null, actedId:String?=null){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getFavoritesList(GlobalStaticVariables.language_type!!,ownerId,actedId)
        call.enqueue(object : Callback<UserRateModel.LikesListResponse> {
            override fun onResponse(call: Call<UserRateModel.LikesListResponse>,
                                    response: Response<UserRateModel.LikesListResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null) {
                        if(mainPageDataList.isEmpty())
                            viewInterface.onEmpty()
                        else
                            viewInterface.onLoaded(mainPageDataList)
                    } else {
                        viewInterface.onLoadError()
                    }
                } else {
                    viewInterface.onLoadError()
                }
            }

            override fun onFailure(call: Call<UserRateModel.LikesListResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onLoadError()
            }
        })
    }
    fun getLikesData(ownerId : String?=null, actedId:String?=null ) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getLikesList(GlobalStaticVariables.language_type!!,ownerId,actedId)
        call.enqueue(object : Callback<UserRateModel.LikesListResponse> {
            override fun onResponse(call: Call<UserRateModel.LikesListResponse>,
                                    response: Response<UserRateModel.LikesListResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null) {
                        if(mainPageDataList.isEmpty())
                            viewInterface.onEmpty()
                        else
                            viewInterface.onLoaded(mainPageDataList)
                    } else {
                        viewInterface.onLoadError()
                    }
                } else {
                    viewInterface.onLoadError()
                }
            }

            override fun onFailure(call: Call<UserRateModel.LikesListResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onLoadError()
            }
        })
    }

}