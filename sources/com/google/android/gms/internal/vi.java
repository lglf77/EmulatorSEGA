package com.google.android.gms.internal;

import android.os.RemoteException;

final class vi implements Runnable {
    private /* synthetic */ re a;
    private /* synthetic */ vg b;

    vi(vg vgVar, re reVar) {
        this.b = vgVar;
        this.a = reVar;
    }

    public final void run() {
        sb d = this.b.b;
        if (d == null) {
            this.b.t().y().a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d.d(this.a);
        } catch (RemoteException e) {
            this.b.t().y().a("Failed to reset data on the service", e);
        }
        this.b.F();
    }
}
