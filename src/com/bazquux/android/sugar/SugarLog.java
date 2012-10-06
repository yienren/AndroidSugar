package com.bazquux.android.sugar;

import android.util.Log;

public class SugarLog {
    
    public static void d( Object o, String fmt, Object ... params ) {
        Log.d( o.getClass().getSimpleName(), String.format( fmt, params ) );
    }
}
