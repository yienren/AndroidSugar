package com.bazquux.android.sugar.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareRelativeLayout extends RelativeLayout {

    public SquareRelativeLayout( Context context ) {
        super( context );
    }

    public SquareRelativeLayout( Context context, AttributeSet attrs ) {
        super( context, attrs );
    }

    @Override
    protected void onMeasure( int widthMeasureSpec, int heightMeasureSpec ) {
        super.onMeasure( widthMeasureSpec, heightMeasureSpec );
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int size = Math.min( width, height );
        super.onMeasure(
            MeasureSpec.makeMeasureSpec( size, MeasureSpec.EXACTLY ),
            MeasureSpec.makeMeasureSpec( size, MeasureSpec.EXACTLY ) );
    }
}