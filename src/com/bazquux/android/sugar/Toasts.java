package com.bazquux.android.sugar;

import android.content.Context;
import android.widget.Toast;

public class Toasts {

    static public void show( Context context, String fmt, Object ... objects ) {
        Toast.makeText( context, String.format( fmt, objects ), Toast.LENGTH_SHORT ).show();
    }

    static public void showLong( Context context, String fmt, Object ... objects ) {
        Toast.makeText( context, String.format( fmt, objects ), Toast.LENGTH_LONG ).show();
    }
}
