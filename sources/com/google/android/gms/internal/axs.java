package com.google.android.gms.internal;

import android.os.RemoteException;

final /* synthetic */ class axs implements Runnable {
    private final axq a;
    private final axh b;
    private final ks c;
    private final axi d;

    axs(axq axq, axh axh, ks ksVar, axi axi) {
        this.a = axq;
        this.b = axh;
        this.c = ksVar;
        this.d = axi;
    }

    public final void run() {
        axq axq = this.a;
        axh axh = this.b;
        ks ksVar = this.c;
        try {
            ksVar.b(axh.q().a(this.d));
        } catch (RemoteException e) {
            fn.b("Unable to obtain a cache service instance.", e);
            ksVar.a(e);
            axq.a.a();
        }
    }
}
