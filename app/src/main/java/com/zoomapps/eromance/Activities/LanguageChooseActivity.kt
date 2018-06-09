package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

import com.zoomapps.eromance.R
import kotterknife.bindView

class LanguageChooseActivity : AppCompatActivity() , View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_next->{
                checkAndConfirm()
            }
            R.id.kazakh_lang_RB->{
                selected_lang = "kz"
                english_lang_RB.isChecked = false
                russian_lang_RB.isChecked = false
            }
            R.id.english_lang_RB->{
                selected_lang = "en"
                kazakh_lang_RB.isChecked = false
                russian_lang_RB.isChecked = false
            }
            R.id.russian_lang_RB->{
                selected_lang = "ru"
                kazakh_lang_RB.isChecked = false
                english_lang_RB.isChecked = false
            }
        }
    }

    fun checkAndConfirm(){
        if(selected_lang == ""){
            Toast.makeText(this@LanguageChooseActivity,getString(R.string.choice_language), Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@LanguageChooseActivity,getString(R.string.choice_language) + " :"+selected_lang, Toast.LENGTH_SHORT).show()
        }
    }

    var selected_lang = ""

    val btn_next : Button by bindView(R.id.btn_next)
    val kazakh_lang_RB : RadioButton by bindView(R.id.kazakh_lang_RB)
    val english_lang_RB : RadioButton by bindView(R.id.english_lang_RB)
    val russian_lang_RB : RadioButton by bindView(R.id.russian_lang_RB)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_choose)
        btn_next.setOnClickListener(this)
        kazakh_lang_RB.setOnClickListener(this)
        english_lang_RB.setOnClickListener(this)
        russian_lang_RB.setOnClickListener(this)
    }
}
