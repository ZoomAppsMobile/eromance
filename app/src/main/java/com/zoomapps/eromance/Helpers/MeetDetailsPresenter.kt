package com.zoomapps.eromance.Helpers

import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.Acception_TYPES
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment
import com.zoomapps.eromance.Interfaces.IMeetDetailsView
import com.zoomapps.eromance.Models.ConnectToMeetResponse
import com.zoomapps.eromance.Models.ConnectedToMeetResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

/**
 * Created by User on 14.09.2017.
 */

class MeetDetailsPresenter(var viewInterface: IMeetDetailsView, var mMeetId: Int , val type:String , val fragment: MeetDetailsDialogFragment) {




    private var isConnected = false
    private var interaction_id: Int ?=null

    public var isDialogDestroyed : Boolean = false

    public var isConnectionCheck = false
    val apiService = API_Client.client!!.create(API_Interface::class.java)

    fun checkConnection() {
        if ( mMeetId < 0)
            return
        var call = apiService.checkIfUserConnectedToMeet(GlobalStaticVariables.language_type!!,mMeetId.toString(),GlobalStaticVariables.myId.toString(),
                type)
        call.enqueue(object: retrofit2.Callback<ConnectedToMeetResponse> {
            override fun onResponse(_call: Call<ConnectedToMeetResponse>?, response: Response<ConnectedToMeetResponse>?) {
                isConnectionCheck = true;
                var isBlocked = false;
                if(response!=null){
                    if(response.body()!=null && response.body().data!=null && response.body().data!!.isNotEmpty() ){
                        var data = response?.body()?.data?.lastOrNull()
                        if(data!=null && data.id!=null){
                            interaction_id = data.id!!
                            if(data.isAcceptedType == Acception_TYPES.DECLINED){
                                isConnected = false
                                isBlocked = true
                            }
                            else
                                isConnected = true
                        }
                    }
                    else{
                        isConnected = false;
                    }

                }
                connectionCallback(isConnected,isBlocked)
            }

            override fun onFailure(_call: Call<ConnectedToMeetResponse>?, t: Throwable?) {
                if(!isDialogDestroyed)
                    viewInterface.onShowToast("Ошибка")
            }

        })
    }

    private fun connectionCallback(status: Boolean,isBlocked:Boolean=false){
        if(isDialogDestroyed)
            return
        if(status )
            viewInterface.onConnectedToMeet(isBlocked);
        else
            viewInterface.onUnconnectedToMeet();
    }

    fun makeAction() {
        if ( mMeetId < 0)
            return
        if (isConnected && interaction_id!=null && interaction_id!! > 0) {
            disConnectFromMeet()
        } else {
            connectToMeet()
        }
    }

    private fun connectToMeet() {
        if ( mMeetId < 0)
            return
        var call = apiService.connectToMeet(mMeetId.toString(),GlobalStaticVariables.myId.toString(),
                type)
        call.enqueue(object: retrofit2.Callback<ConnectToMeetResponse>{
            override fun onFailure(_call: Call<ConnectToMeetResponse>?, t: Throwable?) {
                if(!isDialogDestroyed)
                    viewInterface.onShowToast("Ошибка")
            }

            override fun onResponse(_call: Call<ConnectToMeetResponse>?, response: Response<ConnectToMeetResponse>?) {
               if(response!=null && response.body()!=null){
                   if(response.body().data!=null){
                       interaction_id = response.body()?.data?.get(0)!!.id
                       isConnected = true;
                       connectionCallback(true);
                   }
               }
                else{

                   isConnected = true;
                   connectionCallback(true);
                  if(!isDialogDestroyed)
                       viewInterface.onShowToast("Успешно присоединились")
               }

                fragment.dismiss()

            }

        })
    }

    private fun disConnectFromMeet() {
        if ( mMeetId < 0)
            return
        if(interaction_id==null)
            throw Exception("Impossible OutCome")

        var _call = apiService.removeMeetConnection(interaction_id.toString());
        _call.enqueue(object: retrofit2.Callback<ConnectedToMeetResponse>{
            override fun onResponse(call: Call<ConnectedToMeetResponse>?, response: Response<ConnectedToMeetResponse>?) {

                        interaction_id = null;
                        isConnected = false;
                        connectionCallback(false)
                        viewInterface.onShowToast("Встреча успешно отменена")

                        fragment.dismiss()

            }

            override fun onFailure(call: Call<ConnectedToMeetResponse>?, t: Throwable?) {
                if(!isDialogDestroyed)
                     viewInterface.onShowToast("Ошибка")
            }

        })
    }
}
