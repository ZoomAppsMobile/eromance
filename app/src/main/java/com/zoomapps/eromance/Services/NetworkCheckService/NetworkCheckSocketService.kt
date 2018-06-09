package com.zoomapps.eromance.Services.NetworkCheckService

import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Binder
import android.os.IBinder
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.zoomapps.eromance.Controllers.checkNotificationStatus
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.LinkerActivity
import com.zoomapps.eromance.Models.PushModels.MessageModel
import com.zoomapps.eromance.R
import io.socket.client.IO
import io.socket.client.Socket
import io.socket.emitter.Emitter
import org.json.JSONObject





/**
 * Created by User on 03.08.2017.
 */
 class NetworkCheckSocketService : Service() {

    private val appConnectedToService: Boolean? = null
    private var mSocket: Socket? = null
    private val serviceBinded = false
//    private val mBinder = LocalBinder()

//    inner class LocalBinder : Binder() {
//        val service: NetworkCheckSocketService
//            get() = this@NetworkCheckSocketService
//    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        GlobalStaticVariables.isSocketServiceActive = true
        initializeSocket()
        addSocketHandlers()
    }

    override fun onDestroy() {
        super.onDestroy()
        GlobalStaticVariables.isSocketServiceActive = false
        closeSocketSession()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return serviceBinded
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return Service.START_STICKY
    }

    private fun initializeSocket() {
        try {
            val options = IO.Options()
            options.forceNew = true
            mSocket = IO.socket("http://82.196.12.95:8181", options)
        } catch (e: Exception) {
            Log.e("Error", "Exception in socket creation")
            throw RuntimeException(e)
        }
    }

    private fun closeSocketSession() {
        mSocket?.disconnect()
        mSocket?.off()
    }

    var is_socket_connected = false
    var is_server_active = false

    fun registerUser(){
        mSocket?.emit("connect_user",GlobalStaticVariables.myId);
    }

    private fun addSocketHandlers(){
        mSocket?.on(Socket.EVENT_CONNECT, Emitter.Listener {
            is_socket_connected = true;
            registerUser()
        })

        mSocket?.on("connection_status",object:Emitter.Listener {
            override fun call(vararg args: Any?) {
                val data = args[0] as JSONObject
                is_server_active = data.getBoolean("is_succesfull");
            }
        })

        mSocket?.on(Socket.EVENT_DISCONNECT, Emitter.Listener {
            is_socket_connected = false;
        })


        mSocket?.on(Socket.EVENT_CONNECT_ERROR, Emitter.Listener {
            is_socket_connected = false;
        })

        mSocket?.on(Socket.EVENT_CONNECT_TIMEOUT, Emitter.Listener {
            is_socket_connected = false;
        })

        mSocket?.connect();

    }

    fun connect() {
        mSocket?.connect()
    }

    fun disconnect() {
        mSocket?.disconnect()
    }

    fun restartSocket() {
        mSocket?.off()
        mSocket?.disconnect()
        addSocketHandlers()
    }

    fun off(event: String) {
        mSocket?.off(event)
    }

    fun isSocketConnected(): Boolean {
        if (mSocket == null) {
            return false
        }
        return if(mSocket?.connected() != null) mSocket?.connected()!! else false
    }
    fun sendBigTextNotification(title:String ,
                                content:String?,
                                smallText:String?,
                                push_id:Int ,
                                data: MessageModel.MessageData? ) {

        var intent = Intent(this, LinkerActivity::class.java).putExtra("ActivityName","GameActivity")
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT)

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


}