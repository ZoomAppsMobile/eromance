package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.*
import com.zoomapps.eromance.Adapters.SearchUserAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.SearchUserPresenter
import com.zoomapps.eromance.Interfaces.ISearchUserView
import com.zoomapps.eromance.Models.UserProfileModel

import com.zoomapps.eromance.R
import kotterknife.bindView
import java.util.*
import android.app.Activity
import android.content.Intent
import com.zoomapps.eromance.Models.UserRateModel


class SearchUserActivity : AppCompatActivity() , ISearchUserView {
    override fun onDataLoaded(datum: List<UserRateModel.Datum>) {
        setRV(datum)
    }

    override fun onLoadError(msg: String) {
        Toast.makeText(this@SearchUserActivity,msg, Toast.LENGTH_SHORT).show()
    }

    val search_result_RV : RecyclerView by bindView(R.id.search_result_RV)
    val male_RB : RadioButton by bindView(R.id.male_RB)
    val female_RB : RadioButton by bindView(R.id.female_RB)
    val startSearching_BTN : Button by bindView(R.id.startSearching_BTN)
    val search_ED : EditText by bindView(R.id.search_ED)

    var adapterData = ArrayList<UserRateModel.Datum>()
    var mAdapter :RecyclerView.Adapter<*>?=null

    val presenter = SearchUserPresenter(this,this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_user)
        setToolbar(this ,
                getString(R.string.create),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
                true)
        search_result_RV.layoutManager = LinearLayoutManager(this@SearchUserActivity)
        startSearching_BTN.setOnClickListener {
            var name_param :String?=null
            var sex_param : String?=null
            if(search_ED.text.isNotEmpty()){
                name_param = if(search_ED.text.isNullOrEmpty()) search_ED.text.toString() else null
            }
            else{
                sex_param= if(male_RB.isChecked) "1" else if(female_RB.isChecked) "2" else null
            }
//            presenter.getUsers(name = name_param , sex = sex_param)
            presenter.getUsers(real_name =  name_param , sex_id =  sex_param)
        }
        presenter.getUsers()
    }
    fun setRV(datum:  List<UserRateModel.Datum>){
        if(adapterData.isNotEmpty())
            adapterData.clear()
        adapterData.addAll(datum)
        if(mAdapter==null){
            mAdapter = SearchUserAdapter(adapterData ,this@SearchUserActivity)
            search_result_RV.adapter = mAdapter
        }
        else{
            mAdapter?.notifyDataSetChanged()
        }
    }
    fun selectUserAndFinish(uid:Int , name:String) {
        val returnIntent = Intent()
        returnIntent.putExtra("uid", uid)
        returnIntent.putExtra("name", name)
        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }

}
