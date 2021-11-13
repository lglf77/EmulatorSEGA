package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.au;

@bfk
public final class fo extends Handler {
    public fo(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            au.i().a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
