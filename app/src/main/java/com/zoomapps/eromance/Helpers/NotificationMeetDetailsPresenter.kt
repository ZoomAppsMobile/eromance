package com.zoomapps.eromance.Helpers

import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.Acception_TYPES
import com.zoomapps.eromance.Controllers.Server_Entities
import com.zoomapps.eromance.Interfaces.IMeetDetailsView
import com.zoomapps.eromance.Interfaces.IMeetNotificationDetailsView
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 14.09.2017.
 */
class NotificationMeetDetailsPresenter (var viewInterface: IMeetNotificationDetailsView,
                                        var interaction_id: Int,
                                        val desiredToConnectUserId:Int,
                                        val entityClass:String) {
    private var isConnected = false

    public var isDialogDestroyed : Boolean = false

    public var isConnectionCheck = false
    val apiService = API_Client.client!!.create(API_Interface::class.java)

    var mCurrentMeetData: Data?=null
    var isUserDataLoaded:Boolean = false
    var isMeetDataLoaded:Boolean = false
    var isCurrentUserAccepted : Boolean? = false

    fun fetchDatum(){
    //    handleUserDataCall(apiService.getUserInfo(desiredToConnectUserId.toString()))
        handleMeetConnectionCall(apiService.getMeetConnection(interaction_id.toString()))
    }

    private fun handleUserDataCall(_call:Call<LoginModel.UserLoginResponse>){
        _call.enqueue(object: Callback<LoginModel.UserLoginResponse>
        {
            override fun onResponse(call: Call<LoginModel.UserLoginResponse>?,
                                    response: Response<LoginModel.UserLoginResponse>?) {
                if(response==null || response.body() == null || response.body().getData()?.get(0)==null)
                {
                    viewInterface.onShowToast("Не удаслось получить данные пользователя")
                    return
                }
                isUserDataLoaded = true
                viewInterface.onLoadDesiredUserData(response.body().getData()!!.get(0))
            }

            override fun onFailure(call: Call<LoginModel.UserLoginResponse>?, t: Throwable?) {
                viewInterface.onShowToast("Не удаслось получить данные пользователя")
            }
        })
    }
    private fun handleMeetConnectionCall(_call:Call<ConnectedToOneMeetResponse>){
        _call.enqueue(object: Callback<ConnectedToOneMeetResponse>
        {
            override fun onResponse(call: Call<ConnectedToOneMeetResponse>?, response: Response<ConnectedToOneMeetResponse>?)
            {
                if(response==null || response.body() == null || response.body().data==null)
                {
                    viewInterface.onShowToast("Не удаслось получить данные встречи")
                    return
                }
                isCurrentUserAccepted = if(response.body()?.data?.isAcceptedType==Acception_TYPES.ACCEPTED) true else false
                mCurrentMeetData = response.body()?.data;
                onChangedStatus(isCurrentUserAccepted!!)
               getMeetData(response.body()?.data?.entityClass ,response.body()?.data?.entityId)
            }

            override fun onFailure(call: Call<ConnectedToOneMeetResponse>?, t: Throwable?) {
                viewInterface.onShowToast("Не удаслось получить данные встречи")
            }
        })
    }
    private fun getMeetData(type:String? , enitity_id:Int? ){
        if(enitity_id==null)
            return
        if(type == Server_Entities.Meet)
            handleMeetData(apiService.getMeetById(GlobalStaticVariables.language_type!!,enitity_id.toString()))
        else if(type == Server_Entities.Evening)
            handleEveningData(apiService.getEveningById(GlobalStaticVariables.language_type!!,enitity_id.toString()))
        else
            viewInterface.close();
    }

    private fun handleMeetData(_call :Call<MeetsModel.MeetResponse>){
        _call.enqueue(object : Callback<MeetsModel.MeetResponse>{
            override fun onFailure(call: Call<MeetsModel.MeetResponse>?, t: Throwable?) {
                viewInterface.onShowToast("Не удаслось получить данные встречи")
            }

            override fun onResponse(call: Call<MeetsModel.MeetResponse>?, response: Response<MeetsModel.MeetResponse>?) {
                if(response==null || response.body() == null || response.body().data==null)
                {
                    viewInterface.onShowToast("Не удаслось получить данные встречи")
                    return
                }
                handleSameMeetData(response.body()?.data)
            }

        })
    }
    private fun handleEveningData(_call: Call<EveningsModel.EveningResponse>){
        _call.enqueue(object: Callback<EveningsModel.EveningResponse>{
            override fun onFailure(call: Call<EveningsModel.EveningResponse>?, t: Throwable?) {
                viewInterface.onShowToast("Не удаслось получить данные встречи")
            }

            override fun onResponse(call: Call<EveningsModel.EveningResponse>?, response: Response<EveningsModel.EveningResponse>?) {
                if(response==null || response.body() == null || response.body().data==null)
                {
                    viewInterface.onShowToast("Не удаслось получить данные встречи")
                    return
                }
                handleSameMeetData(response.body()?.data)
            }

        })
    }

    private fun handleSameMeetData(_data: MeetsModel.Datum?){
        isMeetDataLoaded = true
        viewInterface.onLoadMeetData(_data)
    }

    public fun makeAction(){
        if(mCurrentMeetData==null || !isUserDataLoaded || isCurrentUserAccepted == null)
            return;

        changeStatus(!isCurrentUserAccepted!!)
    }

    var isChangingStatus:Boolean = false

    private fun changeStatus(newStatus:Boolean){
        if(isChangingStatus||mCurrentMeetData==null)
            throw Exception("Imposible outcome")
        isChangingStatus = true;
        apiService.updateConnectionToMeet(GlobalStaticVariables.language_type!!,mCurrentMeetData?.id.toString(),
                                        mCurrentMeetData?.entityId.toString(),
                                        mCurrentMeetData?.userId.toString(),
                                        if(newStatus) Acception_TYPES.ACCEPTED else Acception_TYPES.DECLINED,
                                        mCurrentMeetData?.entityClass!!)
                .enqueue(object : Callback<ConnectToMeetResponse>{
                    override fun onFailure(call: Call<ConnectToMeetResponse>?, t: Throwable?) {
                        isChangingStatus = false;
                        viewInterface.onShowToast("Не удалось отправить запрос")
                    }

                    override fun onResponse(call: Call<ConnectToMeetResponse>?, response: Response<ConnectToMeetResponse>?) {
                        isChangingStatus = false;
                        if(response==null || response.body() == null || response.body().data==null)
                        {
                            viewInterface.onShowToast("Не удалось отправить запрос")
                            return
                        }
                        mCurrentMeetData = response.body().data?.get(0)
                        isCurrentUserAccepted = if(response.body()?.data?.get(0)!!.isAcceptedType==Acception_TYPES.ACCEPTED) true else false
                        onChangedStatus(isCurrentUserAccepted )
                    }

                })

    }

    private fun onChangedStatus(status:Boolean?){
        if(status==null)
            throw Exception("RETURNED NULL STATUS")
        if(status){
            viewInterface.onAcceptedUserToMeet()
        }
        else
            viewInterface.onDeclinedUserFromMeet()
    }
}
