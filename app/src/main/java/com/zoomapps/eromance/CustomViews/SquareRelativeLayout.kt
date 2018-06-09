package com.zoomapps.eromance.CustomViews

import android.os.Build.VERSION_CODES
import android.annotation.TargetApi
import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout



/**
 * Created by User on 22.05.2017.
 */
class SquareRelativeLayout : RelativeLayout {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @TargetApi(VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Set a square layout.
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }

}