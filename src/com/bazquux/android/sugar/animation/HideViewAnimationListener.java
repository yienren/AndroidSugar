package com.bazquux.android.sugar.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class HideViewAnimationListener implements AnimationListener {
    View mView;
    public HideViewAnimationListener( View v )              { mView = v;                        }
    public void onAnimationEnd( Animation animation )       { mView.setVisibility( View.GONE ); }
    public void onAnimationRepeat( Animation animation )    {}
    public void onAnimationStart( Animation animation )     {}
}