package com.bazquux.android.sugar;

public class Asserts {
    static public void assertTrue( boolean assertion, String msg ) {
        if ( BuildConfig.DEBUG && !assertion ) {
            throw new RuntimeException(
                    String.format( "assertTrue failed: %s", msg ) );
        }
    }
}
