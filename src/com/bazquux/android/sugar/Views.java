package com.bazquux.android.sugar;

import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class Views {

    static public void setVisibilitySafe( View v, int visibility ) {
        if ( v != null ) {
            v.setVisibility( visibility );
        }
    }
    
    static public void setEnabledSafe( View v, boolean enabled ) {
        if ( v != null ) {
            v.setEnabled( enabled );
        }
    }

    static public void setTextSafe( Button v, CharSequence text ) {
        if ( v != null ) {
            v.setText( text );
        }
    }

    static public void setCheckedSafe( ToggleButton button, boolean checked ) {
        if ( button != null ) {
            button.setChecked( checked );
        }
    }
}
