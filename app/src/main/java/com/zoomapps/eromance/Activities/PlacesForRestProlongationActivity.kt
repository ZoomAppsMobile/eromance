package com.zoomapps.eromance.Activities

import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.zoomapps.eromance.Controllers.setToolbar

import com.zoomapps.eromance.R
import kotterknife.bindView


class PlacesForRestProlongationActivity : AppCompatActivity() {

    internal val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    internal val drawer_layout: DrawerLayout by bindView(R.id.drawer_layout)
    internal val tv_map: TextView by bindView(R.id.tv_map)
    internal var menu_btn_sbsed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places_for_rest_prolongation)

        setToolbar(this ,
                getString(R.string.couples),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                false,
                (R.id.drawer_layout) as DrawerLayout)
        initButtonToolbar()
        textGradient()
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
