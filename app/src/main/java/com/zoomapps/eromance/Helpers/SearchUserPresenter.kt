package com.zoomapps.eromance.Helpers

import android.content.Context
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Interfaces.ISearchUserView
import com.zoomapps.eromance.Models.PlacesModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.Models.UserRateModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

/**
 * Created by User on 26.07.2017.
 */
class SearchUserPresenter(val mContext: Context, val viewInterface: ISearchUserView) {
//    fun getUsers(sex:String?=null, name:String?=null)
//    {
//        val apiService = API_Client.client!!.create(API_Interface::class.java)
//        var call = apiService.searchUsers(sex_id = sex , real_name = name)
//        call.enqueue(object : Callback<UserProfileModel.ProfileFindResponse> {
//            override fun onResponse(call: Call<UserProfileModel.ProfileFindResponse>,
//                                    response: Response<UserProfileModel.ProfileFindResponse>) {
//                val mainPageDataList = response.body().data
//                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
//                    viewInterface.onDataLoaded(mainPageDataList)
//                }
//                else {
//                    viewInterface.onLoadError("Список пуст")
//                }
//            }
//
//            override fun onFailure(call: Call<UserProfileModel.ProfileFindResponse>, t: Throwable) {
//                // Log error here since request failed
//                viewInterface.onLoadError("Не удалось получить данные")
//            }
//
//        })
//
//    }
    fun getUsers(sex_id:String?=null,real_name:String?=null){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.searchFavoritesList(GlobalStaticVariables.language_type!!,owner_user_id = null,
                acted_user_id= GlobalStaticVariables.myId.toString(),
                sex_id = sex_id,
                real_name = real_name)
        call.enqueue(object : Callback<UserRateModel.LikesListResponse> {
            override fun onResponse(call: Call<UserRateModel.LikesListResponse>,
                                    response: Response<UserRateModel.LikesListResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null) {
                        if(mainPageDataList.isEmpty())
                            viewInterface.onDataLoaded(ArrayList<UserRateModel.Datum>())
                        else
                            viewInterface.onDataLoaded(mainPageDataList)
                    } else {
                        viewInterface.onLoadError("Список пуст")
                    }
                } else {
                    viewInterface.onLoadError("Не удалось получить данные")
                }
            }

            override fun onFailure(call: Call<UserRateModel.LikesListResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onLoadError("Не удалось получить данные")
            }
        })
    }
}