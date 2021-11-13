package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.fn;

final class ah implements Runnable {
    private /* synthetic */ aub a;
    private /* synthetic */ ac b;

    ah(ac acVar, aub aub) {
        this.b = acVar;
        this.a = aub;
    }

    public final void run() {
        try {
            if (this.b.e.r != null) {
                this.b.e.r.a(this.a);
            }
        } catch (RemoteException e) {
            fn.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
