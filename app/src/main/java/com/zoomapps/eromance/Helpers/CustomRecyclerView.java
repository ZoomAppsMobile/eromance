package com.zoomapps.eromance.Helpers;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.zoomapps.eromance.R;

/**
 * Created by User on 17.07.2017.
 */

public class CustomRecyclerView extends RecyclerView {

    private int maxHeight;
    private final int defaultHeight = 200;

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public CustomRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init(context, attrs);
        }
    }

    public CustomRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            init(context, attrs);
        }
    }



    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.CustomRecyclerView);
            //200 is a defualt value
            maxHeight = styledAttrs.getDimensionPixelSize(R.styleable.CustomRecyclerView_maxHeight, defaultHeight);

            styledAttrs.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(maxHeight, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}