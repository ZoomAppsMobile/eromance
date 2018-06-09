package com.zoomapps.eromance.Helpers

import android.content.Context
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Interfaces.ITwentyOneUsersMain
import com.zoomapps.eromance.Models.UserProfileModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 04.07.2017.
 */
class TwentyOneUsersMainPresenter(val mContext: Context, val viewInterface: ITwentyOneUsersMain)
{
    fun getData(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getMainProfileList()
        call.enqueue(object : Callback<UserProfileModel.ProfileFindResponse> {
            override fun onResponse(call: Call<UserProfileModel.ProfileFindResponse>, response: Response<UserProfileModel.ProfileFindResponse>) {
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    viewInterface.onDataLoaded(response.body())
                }
                else {
                    Toast.makeText(mContext,"Не удалось получить данные", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<UserProfileModel.ProfileFindResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(mContext,"Не удалось получить данные", Toast.LENGTH_SHORT).show()
            }

        })
    }
}