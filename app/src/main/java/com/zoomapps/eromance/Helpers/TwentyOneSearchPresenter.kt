package com.zoomapps.eromance.Helpers

import android.content.Context
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Interfaces.ITwentyOneSendRequestView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.TwentyOneRequestModel

/**
 * Created by User on 30.06.2017.
 */
class TwentyOneSearchPresenter(val mContext: Context, val interfaceView:ITwentyOneSendRequestView):RequestMakerListener {
    override fun <T> onError(out: T?) {
        interfaceView.onRequestSendError("Ошибка")
    }

    override fun <T> onRequestSuccess(out: T) {
        var result = out as TwentyOneRequestModel.RequestToTwentyProvidersResponse
        if(result!=null && result.code == 1 && result.data!=null)
            interfaceView.onRequestSendSuccessfully()
        interfaceView.onRequestSendError("Ошибка")
    }

    private val rqst_mkr = RequestMaker(this)

    fun sendRequset(serviceTypes_LIST:List<Int> , _desc:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.sendRequestToTwentyProviders(GlobalStaticVariables.myId!!,serviceTypes_LIST,_desc)
        rqst_mkr.makeRequest(call)
    }
}