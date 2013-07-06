package com.bazquux.android.sugar;

import android.os.Looper;

public class Threads {
    static public boolean isUIThread() {
        return ( Looper.getMainLooper().getThread() == Thread.currentThread() );
    }
}
