package com.zoomapps.eromance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zoomapps.eromance.Activities.AuthActivity
import com.zoomapps.eromance.Activities.ChatActivity
import com.zoomapps.eromance.Activities.FavoritesListActivity
import com.zoomapps.eromance.Activities.GameListActivity
import com.zoomapps.eromance.Helpers.GlobalStaticVariables

class LinkerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var act_name = intent.getStringExtra("ActivityName")
        var intent_data = intent.getStringExtra("data")
        openActivity(act_name,intent_data)
    }
    fun openActivity(activityName:String , data:String?){
        var parsedData = parseData(data)
        var intent = when(activityName){
            "ChatActivity"->{
                Intent(this,ChatActivity::class.java).putExtra(parsedData?.get(0)!!,parsedData?.get(1)!!)
            }
            "FavoritesListActivity"->{
                Intent(this, FavoritesListActivity::class.java).putExtra(parsedData?.get(0)!!,parsedData?.get(1)!!)

            }
            "GameActivity"->{
                Intent(this, GameListActivity::class.java).putExtra("from_notification",true)
            }
            else->{
                Intent(this, AuthActivity::class.java)
            }
        }
        startActivity(intent)
        finish()
    }
    fun parseData(data:String?):List<String>?
    {
        if(data != null)
        {
            return data.split('.')
        }
        return null
    }
    fun checkValues(){
        if(GlobalStaticVariables.myId==null || GlobalStaticVariables.myId==-1){

        }
    }
}
