package com.google.android.gms.internal;

import android.os.RemoteException;

final class vn implements Runnable {
    private /* synthetic */ re a;
    private /* synthetic */ vg b;

    vn(vg vgVar, re reVar) {
        this.b = vgVar;
        this.a = reVar;
    }

    public final void run() {
        sb d = this.b.b;
        if (d == null) {
            this.b.t().y().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.b(this.a);
            this.b.F();
        } catch (RemoteException e) {
            this.b.t().y().a("Failed to send measurementEnabled to the service", e);
        }
    }
}
