package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.TextView
import com.zoomapps.eromance.Adapters.GiftsAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.GiftsPresenter
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Interfaces.IGiftsView
import com.zoomapps.eromance.Models.GiftsModel
import com.zoomapps.eromance.R
import kotterknife.bindView
import java.util.*
import android.app.Activity
import android.content.Intent
import android.util.Log
import android.widget.ImageView


class GiftsActivity : AppCompatActivity(), IGiftsView {

    override fun giftSelected(giftId: String) {
        val returnIntent = Intent()
        returnIntent.putExtra("giftId", giftId.toInt())
        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }

    override fun onLoaded(data: GiftsModel.UserGiftsResponse?) {
        if(data != null && data.data!=null) {
            mListData.addAll(data.data!!)
            mAdapter?.notifyDataSetChanged()
        }
        else{
            showToast(this,getString(R.string.no_gift))
        }
    }

    override fun onLoadError() {
        showPreparedToast(this,getString(R.string.error))
    }
    fun onBack() {
        onBackPressed()
        showToast(this,getString(R.string.send_success_gift))

    }
    val user_gifts_RV : RecyclerView by bindView(R.id.user_gifts_RV)
    var mAdapter : RecyclerView.Adapter<*>?=null
    var mListData = ArrayList<GiftsModel.Data>()
    var presenter = GiftsPresenter(this,this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gifts)
        setToolbar(this ,
                "Подарки",
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) ,
                true)

        var isSelectable = false
        if(intent.getStringExtra("type")=="select"){
            isSelectable = true;
        }

        mAdapter= GiftsAdapter(mListData,this ,isSelectable)
        user_gifts_RV.layoutManager = GridLayoutManager(this,3)
        user_gifts_RV.adapter = mAdapter;
        presenter.getData(GlobalStaticVariables.myId.toString())
    }

    fun onElementSelected(gift_id:String?){

        Log.d("Id_gift",gift_id);

        if(gift_id!=null && gift_id !=""){
            var gift_data = mListData.firstOrNull { it->it.id == gift_id.toInt() }
            if(gift_data!=null){
                var gift_name = if(gift_data?.key!=null ) gift_data?.key else "";
                presenter.showAppoveSelectionAlert(gift_id,gift_name!!)
            }
        }
    }
}
