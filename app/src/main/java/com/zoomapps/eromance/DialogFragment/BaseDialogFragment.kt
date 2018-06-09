package com.zoomapps.eromance.DialogFragment

import android.graphics.Color
import android.view.Window.FEATURE_NO_TITLE
import android.graphics.drawable.ColorDrawable
import android.support.v4.app.DialogFragment
import android.view.ViewGroup
import android.view.Window
import com.zoomapps.eromance.Controllers.getScreenWidth

/**
 * Created by User on 18.08.2017.
 */
open class BaseDialogFragment : DialogFragment() {
    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.window.setLayout((getScreenWidth(this!!.activity!!) * .9).toInt() , ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
    }
    fun removeTitle() {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE)
    }
}