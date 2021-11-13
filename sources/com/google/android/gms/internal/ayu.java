package com.google.android.gms.internal;

import android.os.RemoteException;

final class ayu implements Runnable {
    private /* synthetic */ ayv a;
    private /* synthetic */ ayw b;

    ayu(axw axw, ayv ayv, ayw ayw) {
        this.a = ayv;
        this.b = ayw;
    }

    public final void run() {
        try {
            this.a.a(this.b);
        } catch (RemoteException e) {
            fn.c("Could not propagate interstitial ad event.", e);
        }
    }
}
