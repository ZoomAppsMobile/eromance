package com.zoomapps.eromance.Helpers

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Interfaces.IGiftsView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.GiftsModel

/**
 * Created by User on 11.07.2017.
 */
class GiftsPresenter(val mContext: Context , val viewInteface: IGiftsView):RequestMakerListener
{
    override fun <T> onError(out: T?) {
        when(out){
            is GiftsModel.UserGiftsResponse->{
                viewInteface.onLoadError()
            }
        }
    }

    override fun <T> onRequestSuccess(out: T) {
        when(out){
            is GiftsModel.UserGiftsResponse->{
                var data = out as GiftsModel.UserGiftsResponse
                viewInteface.onLoaded(data)
            }
        }
    }

    val rqstMkr = RequestMaker(this)

    fun getData(user_id:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
      //  val call = apiService.getGifts(user_id)
      //  val call = apiService.getGifts()
        val call = apiService.getGifts_()
        rqstMkr.makeRequest(call)
    }

    var alertD : AlertDialog?=null
    var selectedItem_ID = -1
    fun showAppoveSelectionAlert(giftId:String , giftName:String){
        var adb = AlertDialog.Builder(mContext)
        adb?.setTitle("Отправить")
        adb?.setMessage("Вы хотите отправить этот подарок \n Название: "+giftName+"\n")
        adb?.setNegativeButton("Отмета", object: DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                if(alertD!=null){
                    alertD?.cancel()
                }
            }

        })
        adb.setPositiveButton("Да",object: DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                viewInteface.giftSelected(giftId)
                alertD?.cancel()
            }

        })
        alertD = adb?.create()
        alertD?.setOnCancelListener {

        }
        alertD?.show()
    }
}