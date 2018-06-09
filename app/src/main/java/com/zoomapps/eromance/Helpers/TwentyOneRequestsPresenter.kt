package com.zoomapps.eromance.Helpers

import android.content.Context
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Interfaces.ITwentyOneRequestView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.AdultRequestsModel

/**
 * Created by User on 04.07.2017.
 */
class TwentyOneRequestsPresenter(val mContext:Context,val viewInterface: ITwentyOneRequestView):RequestMakerListener{

    override fun <T> onError(out: T?) {
        viewInterface.onDataLoadError()
    }

    override fun <T> onRequestSuccess(out: T) {
        var data = out as AdultRequestsModel.AdultRequestsListResponse
        viewInterface.onDataLoaded(data)
    }

    val rqst_mkr= RequestMaker(this)
    fun getData(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getAdultRequestsList(GlobalStaticVariables.language_type!!)
        rqst_mkr.makeRequest(call)
    }
}