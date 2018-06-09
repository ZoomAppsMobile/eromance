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
 * Created by User on 07.09.2017.
 */
class PaymentDialogFragment : BaseDialogFragment()  {

    lateinit var title_TV: TextView;
    lateinit var payment_text_TV: TextView;
    lateinit var cancel_btn: Button;
    lateinit var send_btn: Button;

    private val dialog_text: String
        get() = arguments!!.getString(ARG_PARAM1)

    var defaultClickAction = object: View.OnClickListener{
        override fun onClick(p0: View?) {
            dismiss();
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.dialog_payment, null);
        //return super.onCreateView(inflater, container, savedInstanceState)
        removeTitle()
        title_TV = v?.findViewById<TextView>(R.id.title_TV) as TextView;
        payment_text_TV = v?.findViewById<TextView>(R.id.payment_text_TV) as TextView;
        cancel_btn = v?.findViewById<Button>(R.id.cancel_btn) as Button;
        send_btn = v?.findViewById<Button>(R.id.send_btn) as Button;

        title_TV.setText(getString(R.string.payment));
        payment_text_TV.setText(dialog_text);
        send_btn.setOnClickListener {
            (context as DialogFragmentInteraction).onOkPressed("",3)
            dismiss();
        }
        cancel_btn.setOnClickListener (defaultClickAction)

        return v
    }
    companion object {
        private val ARG_PARAM1 = "dialog_text"

        fun newInstance(dialog_text:String?) : PaymentDialogFragment{
            val fragment = PaymentDialogFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, dialog_text)
            fragment.arguments = args
            return fragment
        }
    }
}