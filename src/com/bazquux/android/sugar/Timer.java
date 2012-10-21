package com.bazquux.android.sugar;

import android.os.SystemClock;

public class Timer {
    private double  mRate      = 1.0;
    private long    mStartTime;
    private long    mAggregateTime;
    private boolean mIsRunning = false;

    public void reset() {
        mIsRunning = false;
        mAggregateTime = 0;
    }

    public void run( double rate ) {
        mRate = rate;
        mStartTime = SystemClock.elapsedRealtime();
        mIsRunning = true;
    }

    public void pause() {
        if ( isRunning() ) {
            mIsRunning = false;
            mAggregateTime += elapsedSinceRun();
        }
    }

    public boolean isRunning() {
        return mIsRunning;
    }

    public long elapsedTime() {
        if ( isRunning() ) {
            return mAggregateTime + elapsedSinceRun();
        } else {
            return mAggregateTime;
        }
    }

    public void setElapsedTime( long mill ) {
        mAggregateTime = mill;
    }

    public double getRate() {
        return mRate;
    }

    private long elapsedSinceRun() {
        return (long) ( mRate * ( SystemClock.elapsedRealtime() - mStartTime ) );
    }
}
