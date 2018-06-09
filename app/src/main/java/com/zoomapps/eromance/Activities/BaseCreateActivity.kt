package com.zoomapps.eromance.Activities

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.zoomapps.eromance.R

/**
 * Created by User on 26.07.2017.
 */
open class BaseCreateActivity : AppCompatActivity() {

    lateinit var mContext: Context
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK && data!=null) {
                selectedUser_ID = data?.getIntExtra("uid",-1)
                val name = data?.getStringExtra("name")
                selectedUser_TV.visibility = View.VISIBLE
                selectedUser_TV.text = getString(R.string.noted) + ": " + name
                onActivitySuccessResult()
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                onActivitySuccessResult()
                //Write your code if there's no result
            }
        }
    }

    open fun onActivitySuccessResult(){}


    var selectedUser_ID:Int?=null
    lateinit var selectedUser_TV:TextView

    fun onSelectedUserTV_Click(){
        AlertDialog.Builder(mContext)
                .setTitle(getString(R.string.delete_noted))
                .setMessage(getString(R.string.delete_noted_user))
                .setPositiveButton(getString(R.string.yes),
                        DialogInterface.OnClickListener { dialog, which ->
                            selectedUser_ID = null
                            selectedUser_TV.visibility = View.GONE
                        })
                .setNegativeButton(getString(R.string.no), null).show()
    }
    fun notAloneRB_Clicked(){
        AlertDialog.Builder(mContext)
                .setTitle(getString(R.string.selection_user))
                .setMessage(R.string.selection_user_width_you)
                .setPositiveButton(getString(R.string.yes),
                        DialogInterface.OnClickListener { dialog, which ->
                            val i = Intent(this, SearchUserActivity::class.java)
                            startActivityForResult(i, 1)
                        })
                .setNegativeButton(getString(R.string.no), null).show()
    }
    fun notAloneUnChecked(){
        selectedUser_ID = null
        selectedUser_TV.visibility = View.VISIBLE
        selectedUser_TV.text = ""
    }
}