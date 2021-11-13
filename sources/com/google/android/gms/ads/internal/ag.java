package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.fn;

final class ag implements Runnable {
    private /* synthetic */ atz a;
    private /* synthetic */ ac b;

    ag(ac acVar, atz atz) {
        this.b = acVar;
        this.a = atz;
    }

    public final void run() {
        try {
            if (this.b.e.q != null) {
                this.b.e.q.a(this.a);
            }
        } catch (RemoteException e) {
            fn.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
