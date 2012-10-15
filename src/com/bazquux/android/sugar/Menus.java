package com.bazquux.android.sugar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;

public class Menus {
    static public void setEnabledSafe( MenuItem item, boolean enabled ) {
        if ( item != null ) {
            item.setEnabled( enabled );
        }
    }
    
    static public void setIconSafe( MenuItem item, int resId ) {
        if ( item != null ) {
            item.setIcon( resId );
        }
    }
    
    static public void setIconColorFilterSafe( Context context, MenuItem menuItem, int resId, int color, PorterDuff.Mode filterMode ) {
        if( menuItem != null ) {
            Drawable d = context.getResources().getDrawable( resId );
            d.mutate();
            d.setColorFilter( color, filterMode );
            menuItem.setIcon( d );
        }
    }
    
    static public void setTitleSafe( MenuItem item, CharSequence title ) {
        if ( item != null ) {
            item.setTitle( title );
        }
    }
    
    static public void setVisibleSafe( MenuItem menuItem, boolean visible ) {
        if ( menuItem != null ) {
            menuItem.setVisible( visible );
        }
    }
    
    static public void setCheckedSafe( MenuItem menuItem, boolean checked ) {
        if ( menuItem != null ) {
            menuItem.setChecked( checked );
        }
    }
}
