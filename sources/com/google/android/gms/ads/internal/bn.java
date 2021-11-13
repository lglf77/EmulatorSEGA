package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.fn;

final class bn implements Runnable {
    private /* synthetic */ atz a;
    private /* synthetic */ bl b;

    bn(bl blVar, atz atz) {
        this.b = blVar;
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
