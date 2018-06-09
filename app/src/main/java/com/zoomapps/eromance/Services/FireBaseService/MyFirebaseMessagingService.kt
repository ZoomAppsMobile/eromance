package com.zoomapps.eromance.Services.FireBaseService

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.text.BoringLayout
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Activities.ChatActivity
import com.zoomapps.eromance.Activities.FavoritesListActivity
import com.zoomapps.eromance.Controllers.Server_Entities
import com.zoomapps.eromance.Controllers.calculateGameOutcome
import com.zoomapps.eromance.Controllers.checkNotificationStatus
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.isMessageIsSubscribed
import com.zoomapps.eromance.LinkerActivity
import com.zoomapps.eromance.Models.GamePushModel
import com.zoomapps.eromance.Models.PushModels.MessageModel
import com.zoomapps.eromance.R
import org.greenrobot.eventbus.EventBus
import com.zoomapps.eromance.R.mipmap.ic_launcher
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Color.parseColor
import com.zoomapps.eromance.Activities.MainActivity


/**
 * Created by User on 18.05.2017.
 */

class PushDataModel {
    @SerializedName("section")
    @Expose
    var section: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("message_body")
    @Expose
    var message_body: MessageBody? = null
}

class MessageBody {
    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("content")
    @Expose
    var content: String? = null
}

class MyFirebaseMessagingService : FirebaseMessagingService() {

    @SuppressLint("WrongConstant")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        Log.d(TAG, "From: " + remoteMessage!!.from)
        //Log.d(TAG, "Notification Message Body: " + remoteMessage.notification.body)
        var message_data = remoteMessage.data["message"]
        var push_data = Gson().fromJson(message_data, MessageModel.MessageData::class.java)
        var mBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.splash_logo) // notification icon
                .setContentTitle(push_data.data!!.from!!.username.toString()) // title for notification
                .setContentText(push_data.data!!.content.toString()) // message for notification\
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setAutoCancel(true); // clear notification after click
        var intent = Intent(this, MainActivity::class.java);
        var pi = PendingIntent.getActivity(this, 0, intent, Intent.FLAG_ACTIVITY_NEW_TASK);
        mBuilder.setContentIntent(pi);
        var mNotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(0, mBuilder.build());

        if (message_data == "")
            return
       // var push_data = Gson().fromJson(message_data, MessageModel.MessageData::class.java)

        //Calling method to generate notification
        if (push_data != null) {
            handleMessage(push_data, message_data);
        }
    }

    //This method is only generating push notification
    //It is same as we did in earlier posts
    val push_notif_id_start = 200;

    private fun handleMessage(messageBody: MessageModel.MessageData, raw_message: String?) {
        var isNeedToNotify = false;
        when (messageBody.type) {
            Server_Entities.Gift -> return//5
            Server_Entities.Game -> processGamePush(messageBody, raw_message) //6
            Server_Entities.Message -> processChatMessage(messageBody) //8
            Server_Entities.Rating -> simplePushProcess(messageBody, "rating")//7
            Server_Entities.Interaction -> processInteractionPush(messageBody)
            else -> 0
        }
    }

    fun processInteractionPush(messageBody: MessageModel.MessageData) {
        //TODO: SEPARATION LOGIC ***
        simplePushProcess(messageBody, "rating")
    }


    fun processGamePush(messageBody: MessageModel.MessageData, raw_data: String?) {
        if (raw_data == null)
            return
        var data = Gson().fromJson(raw_data, GamePushModel.ResponseData::class.java)
        var my_thing: Int?;
        var opponent_thing: Int?
        if (data.data?.bet?.userId == GlobalStaticVariables.myId) {
            my_thing = data.data?.bet?.thingId
            opponent_thing = data.data?.enemy?.bet?.thingId
        } else {
            opponent_thing = data.data?.bet?.thingId
            my_thing = data.data?.enemy?.bet?.thingId
        }
        var gameBetAmount = data.data?.bet?.bet.toString()
        var gameRes = when (calculateGameOutcome(my_thing, opponent_thing)) {
            "unknown" -> "не известно"
            "lose" -> "вашим проигрышем"
            "win" -> "вашим выигрышем"
            "draw" -> "ничьей"
            else -> "не известно"
        }
        if (gameRes != null) {
            var push_content = String.format("Игра со стоимостью %s монет, закончилась %s", gameBetAmount.toString(),
                    gameRes.toString())
            sendBigTextNotification("Eromance", push_content, "Игра закончилась", 6, messageBody)
        }
    }

    fun simplePushProcess(msg_data: MessageModel.MessageData?, type: String) {
        when (type) {
            "rating" -> {
                if (msg_data?.data?.is_liked != null) {
                    sendNotification("Eromance",
                            if (msg_data?.data?.is_liked!!) "Вы понравились пользователю: " + msg_data?.data?.from?.username
                            else "Вас заблокировал пользователь: " + msg_data?.data?.from?.username,
                            7,
                            msg_data)
                }
                return;
            }
        }
    }

    fun checkCurrentConversation(uid: Int?): Boolean {
        if (GlobalStaticVariables.current_intercular_id == uid)
            return true
        return false
    }

    fun processChatMessage(msg_data: MessageModel.MessageData?) {
        if (isMessageIsSubscribed && checkCurrentConversation(msg_data?.data?.from?.id)) {
            EventBus.getDefault().post(msg_data)
            return
        } else {
            var msg_title = msg_data?.data?.from?.username;
            var msg_content = msg_data?.data?.content
            sendNotification("Новое сообщение", msg_title!! + ": " + msg_content, 8, msg_data)
            return;
        }
    }


    fun getIntentByType(pid: Int?, data: MessageModel.MessageData?): PendingIntent {
        val intent = when (pid) {
            6 -> Intent(this, LinkerActivity::class.java).putExtra("ActivityName", "GameActivity")
            8 -> Intent(this, LinkerActivity::class.java).putExtra("ActivityName", "ChatActivity").putExtra("data", "intercular_id." + data?.data?.from?.id)
            7 -> Intent(this, LinkerActivity::class.java).putExtra("ActivityName", "FavoritesListActivity").putExtra("data", "type.likes")
            else -> Intent(this, LinkerActivity::class.java).putExtra("ActivityName", "AuthActivity")
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT)
        return pendingIntent
    }

    private fun sendNotification(title: String,
                                 content: String?,
                                 push_id: Int,
                                 data: MessageModel.MessageData?) {

        val pendingIntent = getIntentByType(push_id, data)

        if (!checkNotificationStatus()) {
            return
        }
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_eromance_notif)
                .setContentTitle(title)
                .setContentText(content)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent)


        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(push_id, notificationBuilder.build())
    }

    fun sendBigTextNotification(title: String,
                                content: String?,
                                smallText: String?,
                                push_id: Int,
                                data: MessageModel.MessageData?) {

        val pendingIntent = getIntentByType(push_id, data)

        if (!checkNotificationStatus()) {
            return
        }
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_eromance_notif)
                .setContentTitle(title)
                .setContentText(smallText)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)

        val notification = NotificationCompat.BigTextStyle(notificationBuilder)
                .bigText(content).build()

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, notification)
    }


    companion object {
        private val TAG = "MyFirebaseMsgService"
    }
}