package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.zoomapps.eromance.Adapters.SearchPairAdapter
import com.zoomapps.eromance.Controllers.deSerializeToJson
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Models.SearchPairModel
import com.zoomapps.eromance.R
import kotterknife.bindView
import java.util.*

class FoundPairUserList : AppCompatActivity() {
    val found_user_RV :RecyclerView by bindView(R.id.found_user_RV)
    var mLayoutManager :LinearLayoutManager?=null
    var mAdapter : RecyclerView.Adapter<*>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_found_pair_user_list)
        if(intent.getStringExtra("data")=="")
            return
        setToolbar(this ,
                getString(R.string.search_couples),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                true)
        var modelData = deSerializeToJson(intent.getStringExtra("data"), SearchPairModel.SearchPairResponse::class.java)
        if(modelData?.data!!.isNotEmpty()) {
            init_recyclerview(modelData?.data!!);
        }
        else{
            return
        }
    }
    fun init_recyclerview(setDataList:List<SearchPairModel.Datum>){
        mLayoutManager = LinearLayoutManager(this@FoundPairUserList)
        found_user_RV!!.layoutManager = mLayoutManager
        mAdapter = SearchPairAdapter(setDataList,this)
        found_user_RV!!.adapter = mAdapter
    }
}
