package com.bazquux.android.sugar;

import android.util.Log;

public class SugarLog {
    
    @SuppressWarnings( "rawtypes" )
    private static String getTag( Object o ) {
        if ( o == null ) {
            return "null";
        } else if ( o instanceof Class ) {
            return ( (Class) o ).getSimpleName();
        } else {
            return o.getClass().getSimpleName();
        }
    }

    public static void e( Object o, String fmt, Object ... params ) {
        Log.e( getTag( o ), String.format( fmt, params ) );
    }

    public static void d( Object o, String fmt, Object ... params ) {
        Log.d( getTag( o ), String.format( fmt, params ) );
    }
    
    public static void x( Object o, String fmt, Object ... params ) {
//        if ( BuildConfig.DEBUG ) {
            Log.d( getTag( o ), String.format( fmt, params ) );
//        }
    }
}
