package com.zoomapps.eromance.CustomViews;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by User on 04.09.2017.
 */

public class FullScreenImageSliderRecyclerView extends RecyclerView {
    public FullScreenImageSliderRecyclerView(Context context) {
        super(context);
    }

    public FullScreenImageSliderRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FullScreenImageSliderRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    Float start_x;
    Float start_y;
    Integer CHECK_ITERATION = 2;
    Integer current_check = 0;
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        switch (e.getAction()){
            case MotionEvent.ACTION_DOWN:{
                current_check=0;
                start_x = e.getX();
                start_y = e.getY();
            }
            case MotionEvent.ACTION_MOVE:{
                if(current_check<CHECK_ITERATION){
                    current_check++;
                    Float curValue_X = e.getX();
                    Float curValue_Y = e.getY();
                    if(curValue_X!=null &&curValue_Y!=null &&start_x!=null&&start_y!=null )
                        if(Math.abs(start_x - curValue_X ) > Math.abs(curValue_Y)){
                            return super.onTouchEvent(e);
                        }
                        else{
                            return onInterceptTouchEvent(e);
                        }
                }
            }
        }
        return onInterceptTouchEvent(e);

    }
}
