package com.zoomapps.eromance.Helpers

import android.content.Context
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Interfaces.DialogsView
import com.zoomapps.eromance.Interfaces.IUserInteractionView
import com.zoomapps.eromance.Models.ChatMessageModel
import com.zoomapps.eromance.Models.DialogsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 15.06.2017.
 */

class DialogsPresenter(val mContext: Context,private var viewInterface: DialogsView) {
    fun getData(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getMyDialogs(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<DialogsModel.DialogsResponse> {
            override fun onResponse(call: Call<DialogsModel.DialogsResponse>,
                                    response: Response<DialogsModel.DialogsResponse>) {
                val test = response.body()
                if(test != null ) {
                val mainPageDataList = response.body().data
                    if(mainPageDataList!=null && mainPageDataList.isNotEmpty()) {
                        viewInterface.onLoaded(mainPageDataList)
                    }
                    else{
                        viewInterface.onDataEmpty();
                    }
                }
                else {
                    viewInterface.onLoadingError()
                }
            }

            override fun onFailure(call: Call<DialogsModel.DialogsResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.onLoadingError()
            }
        })
    }
}