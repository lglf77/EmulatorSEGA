package com.google.android.gms.internal;

import android.os.RemoteException;

final class vk implements Runnable {
    private /* synthetic */ re a;
    private /* synthetic */ vg b;

    vk(vg vgVar, re reVar) {
        this.b = vgVar;
        this.a = reVar;
    }

    public final void run() {
        sb d = this.b.b;
        if (d == null) {
            this.b.t().y().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.a(this.a);
            this.b.a(d, (pp) null, this.a);
            this.b.F();
        } catch (RemoteException e) {
            this.b.t().y().a("Failed to send app launch to the service", e);
        }
    }
}
