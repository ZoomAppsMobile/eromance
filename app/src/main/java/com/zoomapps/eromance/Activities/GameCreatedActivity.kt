package com.zoomapps.eromance.Activities


import android.app.Activity
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.GameModel

import com.zoomapps.eromance.R
import kotterknife.bindView
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.content.Intent
import android.content.DialogInterface
import android.support.v7.app.AlertDialog


class GameCreatedActivity : AppCompatActivity() {

    internal var menu_btn_sbsed = false
    internal val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    internal val drawer_layout: DrawerLayout by bindView(R.id.drawer_layout)
    internal val tv_map: TextView by bindView(R.id.tv_map)
    val create_btn_container_LL : LinearLayout by bindView(R.id.create_btn_container_LL)
    val game_variants_container : LinearLayout by bindView(R.id.game_variants_container)
    val rock_variant_container : LinearLayout by bindView(R.id.rock_variant_container)
    val scissors_variant_container : LinearLayout by bindView(R.id.scissors_variant_container)
    val paper_variant_container : LinearLayout by bindView(R.id.paper_variant_container)
    val rock_variant_IV : ImageView by bindView(R.id.rock_variant_IV)
    val scissors_variant_IV : ImageView by bindView(R.id.scissors_variant_IV)
    val paper_variant_IV : ImageView by bindView(R.id.paper_variant_IV)
    val create_btn : Button by bindView(R.id.create_btn)
    val coin_seekbar : SeekBar by bindView(R.id.coin_seekbar)
    val coin_value_TV : TextView by bindView(R.id.coin_value_TV)
    val filter_IV : ImageView by bindView(R.id.filter_IV)
    var setCoinValue = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_create)
        initThings();
        initButtonToolbar()
        setToolbar(this ,
                "Создать",
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) ,
                true)
        create_btn.setOnClickListener {
            checkAndSendRequest()
        }
        coin_seekbar.max=800
        coin_seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                coin_value_TV.text=p1.toString()
                //setCoinValue = p1

                setCoinValue = 1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        (findViewById<TextView>(R.id.overall_coins)).text = if(GlobalStaticVariables.myData?.amount!=null)GlobalStaticVariables.myData?.amount.toString() else "0"
    }
    fun checkAndSendRequest(){
        if(setCoinValue==0){
            Toast.makeText(this,getString(R.string.select_bid),Toast.LENGTH_SHORT).show()
            return
        }
        else if(selectedVariant ==0){
            Toast.makeText(this,getString(R.string.select_option),Toast.LENGTH_SHORT).show()
            return
        }
        else if(GlobalStaticVariables.myData?.amount==null||
                (GlobalStaticVariables.myData?.amount!=null && GlobalStaticVariables.myData?.amount!!<setCoinValue )){
            Toast.makeText(this,getString(R.string.no_money),Toast.LENGTH_SHORT).show()
            return
        }
        else {
            AlertDialog.Builder(this)
                    .setTitle(getString(R.string.create))
                    .setMessage(getString(R.string.confirm_choice))
                    .setPositiveButton(getString(R.string.yes), DialogInterface.OnClickListener { dialog, which ->
                        sendRequest();
                    }).setNegativeButton(getString(R.string.yes), null).show()
        }

    }
    fun sendRequest(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.createGame(setCoinValue.toString(),selectedVariant.toString(),GlobalStaticVariables.myId?.toString()!!)
        call.enqueue(object : Callback<GameModel.GameBetModel.GameAnswerRequest> {
            override fun onResponse(call: Call<GameModel.GameBetModel.GameAnswerRequest>,
                                    response: Response<GameModel.GameBetModel.GameAnswerRequest>) {
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.errors==null ) {
                    val statusCode = response.body().code
                    if(statusCode==1){
                        val returnIntent = Intent()
                        setResult(Activity.RESULT_OK,returnIntent);
                        finish()
                        Toast.makeText(this@GameCreatedActivity,getString(R.string.success), Toast.LENGTH_SHORT).show()
                    }
                }
                else {
                    val returnIntent = Intent()
                    setResult(Activity.RESULT_CANCELED, returnIntent);
                    finish()
                    Toast.makeText(this@GameCreatedActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }
            override fun onFailure(call: Call<GameModel.GameBetModel.GameAnswerRequest>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@GameCreatedActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    fun setImageToUnCheck(){
        rock_variant_IV.setImageResource(R.drawable.icon_game_rock_uncheck)
        scissors_variant_IV.setImageResource(R.drawable.icon_game_scissors_uncheck)
        paper_variant_IV.setImageResource(R.drawable.icon_game_paper_uncheck)
    }
    var selectedVariant = 0;
    fun initThings(){
        rock_variant_IV.setOnClickListener{
            if(selectedVariant!=1) {
                setImageToUnCheck()
                rock_variant_IV.setImageResource(R.drawable.icon_game_rock)
                selectedVariant=1
            }
        }
        scissors_variant_IV.setOnClickListener {
            if(selectedVariant!=2) {
                setImageToUnCheck()
                scissors_variant_IV.setImageResource(R.drawable.icon_game_scissors)
                selectedVariant=2
            }
        }
        paper_variant_IV.setOnClickListener {
            if(selectedVariant!=3) {
                setImageToUnCheck()
                paper_variant_IV.setImageResource(R.drawable.icon_game_paper)
                selectedVariant=3
            }
        }
    }
    private fun initButtonToolbar() {
        if (!menu_btn_sbsed) {
            menu_btn_sbsed = true
            btnOpenDrawer.setOnClickListener { drawer_layout.openDrawer(GravityCompat.START) }
        }
    }

    fun getColorById(id: Int): Int {
        val version = Build.VERSION.SDK_INT
        if (version >= 23) {
            return ContextCompat.getColor(this, id)
        } else {
            return resources.getColor(id)
        }
    }


    private fun textGradient() {
        tv_map.measure(0, 0)       //must call measure!
        val x_end = tv_map.measuredWidth.toFloat()  //get width
        val y_end = tv_map.measuredHeight.toFloat() //get height
        val test = tv_map.width
        val textShader = LinearGradient(0f, 0f, 0f, y_end,
                intArrayOf(getColorById(R.color.golden_gradient3), getColorById(R.color.golden_gradient4), getColorById(R.color.golden_gradient3)),
                floatArrayOf(0.43f, 0.65f, 0.75f),
                Shader.TileMode.MIRROR)

        tv_map.paint.shader = textShader
    }
}
