package com.bazquux.android.sugar.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class ShowViewAnimationListener implements AnimationListener {
    View mView;
    public ShowViewAnimationListener( View v )              { mView = v; }
    public void onAnimationEnd( Animation animation )       { mView.setVisibility( View.VISIBLE ); }
    public void onAnimationRepeat( Animation animation )    { }
    public void onAnimationStart( Animation animation )     { }
}