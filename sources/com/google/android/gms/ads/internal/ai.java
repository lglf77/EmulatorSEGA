package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.aud;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fn;

final class ai implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ ev b;
    private /* synthetic */ ac c;

    ai(ac acVar, String str, ev evVar) {
        this.c = acVar;
        this.a = str;
        this.b = evVar;
    }

    public final void run() {
        try {
            this.c.e.t.get(this.a).a((aud) this.b.B);
        } catch (RemoteException e) {
            fn.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
