package com.bazquux.android.sugar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

public class SystemInfo {

    public static int getScreenCategory( Context context ) {
        return context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK; 
     }

    public static String getScreenCategoryString( Context context ) {
        switch ( getScreenCategory( context ) ) {
        case Configuration.SCREENLAYOUT_SIZE_XLARGE:
            return "xlarge";
        case Configuration.SCREENLAYOUT_SIZE_LARGE:
            return "large";
        case Configuration.SCREENLAYOUT_SIZE_NORMAL:
            return "normal";
        case Configuration.SCREENLAYOUT_SIZE_SMALL:
            return "small";
        default:
            return "unknown";
        }
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
    
    static public boolean isInLandscape( Context context ) {
        return ( context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE );
    }
}
