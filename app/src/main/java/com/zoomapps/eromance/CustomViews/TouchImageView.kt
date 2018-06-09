package com.zoomapps.eromance.CustomViews

import android.content.Context
import android.graphics.Matrix
import android.util.AttributeSet
import android.widget.ImageView
import android.view.ScaleGestureDetector
import android.graphics.PointF
import android.view.MotionEvent
import android.view.View
import android.R.attr.mode
import android.graphics.drawable.Drawable
import android.util.Log

/**
 * Created by User on 07.06.2017.
 */

class TouchImageView : ImageView {

    internal var matrix: Matrix?=null
    internal var mode = NONE

    // Remember some things for zooming
    internal var last = PointF()
    internal var start = PointF()
    internal var minScale = 1f
    internal var maxScale = 3f
    internal var m: FloatArray?=null


    internal var viewWidth: Int = 0
    internal var viewHeight: Int = 0
    internal var saveScale = 1f
    protected var origWidth: Float = 0.toFloat()
    protected var origHeight: Float = 0.toFloat()
    internal var oldMeasuredWidth: Int = 0
    internal var oldMeasuredHeight: Int = 0


    internal var mScaleDetector: ScaleGestureDetector?=null

    internal var context: Context?=null

    constructor(context: Context) : super(context) {
        sharedConstructing(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        sharedConstructing(context)
    }

    private fun stopInterceptEvent() {
        getParent().requestDisallowInterceptTouchEvent(true)
    }

    private fun startInterceptEvent() {
        getParent().requestDisallowInterceptTouchEvent(false)
    }

    private fun sharedConstructing(context: Context) {
        super.setClickable(true)
        this.context = context
        mScaleDetector = ScaleGestureDetector(context, ScaleListener())
        matrix = Matrix()
        m = FloatArray(9)
        setImageMatrix(matrix)
        setScaleType(ScaleType.MATRIX)

        setOnTouchListener(object : OnTouchListener {

            override fun onTouch(v: View, event: MotionEvent): Boolean {
                mScaleDetector?.onTouchEvent(event)
                val curr = PointF(event.x, event.y)

                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        last.set(curr)
                        start.set(last)
                        mode = DRAG
                        stopInterceptEvent()
                    }

                    MotionEvent.ACTION_MOVE -> if (mode == DRAG) {
                        val deltaX = curr.x - last.x
                        val deltaY = curr.y - last.y
                        val fixTransX = getFixDragTrans(deltaX, viewWidth.toFloat(), origWidth * saveScale)
                        val fixTransY = getFixDragTrans(deltaY, viewHeight.toFloat(), origHeight * saveScale)
                        matrix?.postTranslate(fixTransX, fixTransY)
                        fixTrans()
                        last.set(curr.x, curr.y)

                        val transX = m?.get(Matrix.MTRANS_X)

                        if ((getFixTrans(transX!!, viewWidth.toFloat(), origWidth * saveScale) + fixTransX).toInt() == 0)
                            startInterceptEvent()
                        else
                            stopInterceptEvent()
                    }

                    MotionEvent.ACTION_UP -> {
                        mode = NONE
                        val xDiff = Math.abs(curr.x - start.x).toInt()
                        val yDiff = Math.abs(curr.y - start.y).toInt()
                        if (xDiff < CLICK && yDiff < CLICK)
                            performClick()
                        startInterceptEvent()
                    }

                    MotionEvent.ACTION_POINTER_UP -> mode = NONE
                }

                setImageMatrix(matrix)
                invalidate()
                return true // indicate event was handled
            }

        })
    }

    fun setMaxZoom(x: Float) {
        maxScale = x
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScaleBegin(detector: ScaleGestureDetector): Boolean {
            mode = ZOOM
            return true
        }

        override fun onScale(detector: ScaleGestureDetector): Boolean {
            var mScaleFactor = detector.scaleFactor
            val origScale = saveScale
            saveScale *= mScaleFactor
            if (saveScale > maxScale) {
                saveScale = maxScale
                mScaleFactor = maxScale / origScale
            } else if (saveScale < minScale) {
                saveScale = minScale
                mScaleFactor = minScale / origScale
            }

            if (origWidth * saveScale <= viewWidth || origHeight * saveScale <= viewHeight)
                matrix?.postScale(mScaleFactor, mScaleFactor, (viewWidth / 2f), (viewHeight / 2f))
            else
                matrix?.postScale(mScaleFactor, mScaleFactor, detector.focusX, detector.focusY)

            fixTrans()
            return true
        }
    }

    internal fun fixTrans() {
        matrix?.getValues(m)
        val transX = m?.get(Matrix.MTRANS_X)
        val transY = m?.get(Matrix.MTRANS_Y)

        val fixTransX = getFixTrans(transX!!, viewWidth.toFloat(), origWidth * saveScale)
        val fixTransY = getFixTrans(transY!!, viewHeight.toFloat(), origHeight * saveScale)

        if (fixTransX != 0f || fixTransY != 0f)
            matrix?.postTranslate(fixTransX, fixTransY)
    }

    internal fun getFixTrans(trans: Float, viewSize: Float, contentSize: Float): Float {
        val minTrans: Float
        val maxTrans: Float

        if (contentSize <= viewSize) {
            minTrans = 0f
            maxTrans = viewSize - contentSize
        } else {
            minTrans = viewSize - contentSize
            maxTrans = 0f
        }

        if (trans < minTrans)
            return -trans + minTrans
        if (trans > maxTrans)
            return -trans + maxTrans
        return 0f
    }

    internal fun getFixDragTrans(delta: Float, viewSize: Float, contentSize: Float): Float {
        if (contentSize <= viewSize) {
            return 0f
        }
        return delta
    }

     override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        viewWidth = MeasureSpec.getSize(widthMeasureSpec)
        viewHeight = MeasureSpec.getSize(heightMeasureSpec)

        //
        // Rescales image on rotation
        //
        if (oldMeasuredHeight == viewWidth && oldMeasuredHeight == viewHeight
                || viewWidth == 0 || viewHeight == 0)
            return
        oldMeasuredHeight = viewHeight
        oldMeasuredWidth = viewWidth

        if (saveScale == 1f) {
            //Fit to screen.
            val scale: Float

            val drawable = getDrawable()
            if (drawable == null || drawable!!.getIntrinsicWidth() == 0 || drawable!!.getIntrinsicHeight() == 0)
                return
            val bmWidth = drawable!!.getIntrinsicWidth()
            val bmHeight = drawable!!.getIntrinsicHeight()

            Log.d("bmSize", "bmWidth: $bmWidth bmHeight : $bmHeight")

            val scaleX = viewWidth.toFloat() / bmWidth.toFloat()
            val scaleY = viewHeight.toFloat() / bmHeight.toFloat()
            scale = Math.min(scaleX, scaleY)
            matrix?.setScale(scale, scale)

            // Center the image
            var redundantYSpace = viewHeight.toFloat() - scale * bmHeight.toFloat()
            var redundantXSpace = viewWidth.toFloat() - scale * bmWidth.toFloat()
            redundantYSpace /= 2.toFloat()
            redundantXSpace /= 2.toFloat()

            matrix?.postTranslate(redundantXSpace, redundantYSpace)

            origWidth = viewWidth - 2 * redundantXSpace
            origHeight = viewHeight - 2 * redundantYSpace
            setImageMatrix(matrix)
        }


        fixTrans()
    }

    companion object {

        // We can be in one of these 3 states
        internal val NONE = 0
        internal val DRAG = 1
        internal val ZOOM = 2
        internal val CLICK = 3
    }
}
