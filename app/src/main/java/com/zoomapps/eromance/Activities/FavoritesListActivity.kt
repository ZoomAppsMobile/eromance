package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import com.zoomapps.eromance.Adapters.LikesListAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.FavoritesListPresenter
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Interfaces.IFavoritesView
import com.zoomapps.eromance.Models.UserRateModel
import com.zoomapps.eromance.R
import kotterknife.bindView

class FavoritesListActivity : AppCompatActivity() ,IFavoritesView {
    override fun onEmpty() {
        showPreparedToast(this,"List_Empty")
    }

    override fun onLoaded(likelist: List<UserRateModel.Datum>) {
        dataList = likelist;
        if(mAdapter==null)
            mAdapter = LikesListAdapter(dataList,this , if(list_type=="likes") 0 else 1)
        favorites_rv.adapter = mAdapter;
    }

    override fun onLoadError() {
        showPreparedToast(this,"Error")
    }

    var mAdapter: RecyclerView.Adapter<*>?=null
    val tv_map : TextView by bindView(R.id.tv_map )
    val favorites_rv : RecyclerView by bindView(R.id.favorites_rv )

    var dataList : List<UserRateModel.Datum>?=null
    val FavoritesHelper = FavoritesListPresenter(this,this)
    var list_type=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites_list)

        list_type= intent.getStringExtra("type")
        setToolbar(this ,
                if(list_type == "likes") getString(R.string.likes) else getString(R.string.favorites),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                true)
        if (list_type == ""){
            showToast(this,getString(R.string.error))
            return
        }

        favorites_rv.layoutManager = LinearLayoutManager(this)
        if(list_type == "likes")
            FavoritesHelper.getLikesData(null,GlobalStaticVariables.myId.toString())
        else if(list_type == "favorites")
            FavoritesHelper.getFavoritesData(null,GlobalStaticVariables.myId.toString())

    }
}
