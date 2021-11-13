package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.awe;
import com.google.android.gms.internal.fn;

final class aj implements Runnable {
    private /* synthetic */ awe a;
    private /* synthetic */ ac b;

    aj(ac acVar, awe awe) {
        this.b = acVar;
        this.a = awe;
    }

    public final void run() {
        try {
            this.b.e.t.get(this.a.l()).a(this.a);
        } catch (RemoteException e) {
            fn.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
