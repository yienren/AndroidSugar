package com.bazquux.android.sugar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

public class SystemInfo {
    public static String getScreenCategory( Context context ) {
        int screenSize  = context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK; 
        if ( screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE ) {
            return "xlarge";
        } else if ( screenSize == Configuration.SCREENLAYOUT_SIZE_LARGE ) {
            return "large";
        } else if ( screenSize == Configuration.SCREENLAYOUT_SIZE_NORMAL ) {
            return "normal";
        } else if ( screenSize == Configuration.SCREENLAYOUT_SIZE_SMALL ) {
            return "small";
        }
        return "unknown";
     }
    
    public static int getScreenWidth( Activity context ) {
        DisplayMetrics metrics = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics( metrics );
        return metrics.widthPixels;
    }
    
    public static int getScreenHeight( Activity context ) {
        DisplayMetrics metrics = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics( metrics );
        return metrics.heightPixels;
    }
}
