package com.bazquux.android.sugar;

import android.content.Context;
import android.content.SharedPreferences;

public class SugarPreferences {

    public static void putLong( Context context, String id, String key, long value ) {
        SharedPreferences settings      = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong( key, value );
        editor.apply();
    }
    
    public static void putInt( Context context, String id, String key, int value ) {
        SharedPreferences settings      = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt( key, value );
        editor.apply();
    }
    
    public static int getInt( Context context, String id, String key, int defaultValue ) {
        SharedPreferences settings = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        return settings.getInt( key, defaultValue );
    }

    public static void putBoolean( Context context, String id, String key, boolean value ) {
        SharedPreferences settings      = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean( key, value );
        editor.apply();
    }
    
    public static boolean getBoolean( Context context, String id, String key, boolean defaultValue ) {
        SharedPreferences settings = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        return settings.getBoolean( key, defaultValue );
    }

    public static void putString( Context context, String id, String key, String value ) {
        SharedPreferences settings      = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = settings.edit();
        editor.putString( key, value );
        editor.apply();
    }
    
    public static String getString( Context context, String id, String key, String defaultValue ) {
        SharedPreferences settings = context.getSharedPreferences( id, Context.MODE_PRIVATE );
        return settings.getString( key, defaultValue );
    }
}
