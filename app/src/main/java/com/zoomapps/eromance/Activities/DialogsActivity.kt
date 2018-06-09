package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.ImageView
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import com.zoomapps.eromance.Adapters.DialogsAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.DialogsPresenter
import com.zoomapps.eromance.Interfaces.DialogsView
import com.zoomapps.eromance.Models.DialogsModel
import com.zoomapps.eromance.R
import kotterknife.bindView

class DialogsActivity : AppCompatActivity() , DialogsView{
    override fun onLoaded(datalist: List<DialogsModel.Datum>) {
       init_RV(datalist)
    }
    val presenter  = DialogsPresenter(this, this)

        var mainDataList : MutableList<DialogsModel.Datum>?=null
    fun init_RV(datalist: List<DialogsModel.Datum>){
        mainDataList = datalist.toMutableList()
        mAdapter = DialogsAdapter(  mainDataList, this@DialogsActivity )
        dialogs_list_RV.adapter = mAdapter;
    }
    override fun onLoadingError() {
        showPreparedToast(this,getString(R.string.error))
    }

    override fun onDataEmpty() {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val dialogs_list_RV : RecyclerView by bindView(R.id.dialogs_list_RV)
    var ll_manager = LinearLayoutManager(this);
    var mAdapter : RecyclerView.Adapter<*>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)
        setToolbar(this ,
                getString(R.string.message),
                findViewById<TextView>(R.id.tv_map) ,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn)  ,
                true)
        dialogs_list_RV.layoutManager = ll_manager
        presenter.getData()
    }
}
