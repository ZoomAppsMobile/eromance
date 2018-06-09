package com.zoomapps.eromance.DialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.zoomapps.eromance.R

/**
 * Created by User on 05.09.2017.
 */
class EditStatusDialogFragment  : BaseDialogFragment()  {

    lateinit var title_TV: TextView;
    lateinit var report_text_ED: EditText;
    lateinit var cancel_btn: Button;
    lateinit var send_btn: Button;

    private val old_content: String
        get() = arguments?.getString(ARG_PARAM1)!!

    var defaultClickAction = object: View.OnClickListener{
        override fun onClick(p0: View?) {
            dismiss();
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.dialog_report_image, null);
        //return super.onCreateView(inflater, container, savedInstanceState)
        removeTitle()
        title_TV = v?.findViewById<TextView>(R.id.title_TV) as TextView;
        report_text_ED = v?.findViewById<EditText>(R.id.report_text_ED) as EditText;
        cancel_btn = v?.findViewById<Button>(R.id.cancel_btn) as Button;
        send_btn = v?.findViewById<Button>(R.id.send_btn) as Button;

        title_TV.setText(getString(R.string.change_status));
        report_text_ED.setHint(getString(R.string.you_news_status))
        report_text_ED.setText(old_content);
        send_btn.setOnClickListener {
            (context as DialogFragmentInteraction).onOkPressed(report_text_ED.text.toString(),2)
            dismiss();
        }
        cancel_btn.setOnClickListener (defaultClickAction)

        return v
    }
    companion object {
        private val ARG_PARAM1 = "old_content"

        fun newInstance(old_content:String?) : EditStatusDialogFragment{
            val fragment = EditStatusDialogFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, old_content)
            fragment.arguments = args
            return fragment
        }
    }
}