package com.zoomapps.eromance.DialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.zoomapps.eromance.Controllers.API_Controller
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Fragments.AllGamesFragment
import com.zoomapps.eromance.Models.ReportModel
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

/**
 * Created by User on 18.08.2017.
 */
class ReportDialogFragment : BaseDialogFragment()  {

    lateinit var title_TV:TextView;
    lateinit var report_text_ED:EditText;
    lateinit var cancel_btn:Button;
    lateinit var send_btn:Button;

    private val image_id: String
        get() = arguments!!.getString(ARG_PARAM1)
    private val type: String
        get() = arguments!!.getString(ARG_PARAM2)

    var defaultClickAction = object:View.OnClickListener{
        override fun onClick(p0: View?) {
            dismiss();
        }
    }
    fun getTitleByType():String{
        var type_title = when(type){
            "photo"-> getString(R.string.in_drawing)
            "user"-> getString(R.string.in_user)
            "place"-> getString(R.string.in_establishments)
            else->""
        }

        return String.format(getString(R.string.complaint) + " %s" , type_title)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.dialog_report_image, null);
        //return super.onCreateView(inflater, container, savedInstanceState)
        removeTitle()
        title_TV = v?.findViewById<TextView>(R.id.title_TV) as TextView;
        report_text_ED = v?.findViewById<EditText>(R.id.report_text_ED) as EditText;
        cancel_btn = v?.findViewById<Button>(R.id.cancel_btn) as Button;
        send_btn = v?.findViewById<Button>(R.id.send_btn) as Button;

        title_TV.setText(getTitleByType());

        send_btn.setOnClickListener {
            API_Controller().report(type,image_id,report_text_ED.text.toString())?.enqueue(object:retrofit2.Callback<ReportModel.ReportCheckResponseData> {
                override fun onFailure(call: Call<ReportModel.ReportCheckResponseData>?, t: Throwable?) {
                   // showToast(context,"Не удалось отправить запрос")
                }

                override fun onResponse(call: Call<ReportModel.ReportCheckResponseData>?, response: Response<ReportModel.ReportCheckResponseData>?) {
                    //showPreparedToast(context,"Success")
                }

            });
            dismiss();
        }
        cancel_btn.setOnClickListener (defaultClickAction)

        return v
    }
    companion object {
        private val ARG_PARAM1 = "image_id"
        private val ARG_PARAM2 = "type"

        fun newInstance(image_id:String?  ,type:String?) : ReportDialogFragment{
            val fragment = ReportDialogFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, image_id)
            args.putString(ARG_PARAM2, type)
            fragment.arguments = args
            return fragment
        }
    }
}