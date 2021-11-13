package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class vp implements Runnable {
    private /* synthetic */ boolean a = true;
    private /* synthetic */ boolean b;
    private /* synthetic */ rh c;
    private /* synthetic */ re d;
    private /* synthetic */ rh e;
    private /* synthetic */ vg f;

    vp(vg vgVar, boolean z, boolean z2, rh rhVar, re reVar, rh rhVar2) {
        this.f = vgVar;
        this.b = z2;
        this.c = rhVar;
        this.d = reVar;
        this.e = rhVar2;
    }

    public final void run() {
        sb d2 = this.f.b;
        if (d2 == null) {
            this.f.t().y().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            this.f.a(d2, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    d2.a(this.c, this.d);
                } else {
                    d2.a(this.c);
                }
            } catch (RemoteException e2) {
                this.f.t().y().a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f.F();
    }
}
