package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class vo implements Runnable {
    private /* synthetic */ boolean a = true;
    private /* synthetic */ boolean b;
    private /* synthetic */ rx c;
    private /* synthetic */ re d;
    private /* synthetic */ String e;
    private /* synthetic */ vg f;

    vo(vg vgVar, boolean z, boolean z2, rx rxVar, re reVar, String str) {
        this.f = vgVar;
        this.b = z2;
        this.c = rxVar;
        this.d = reVar;
        this.e = str;
    }

    public final void run() {
        sb d2 = this.f.b;
        if (d2 == null) {
            this.f.t().y().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            this.f.a(d2, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    d2.a(this.c, this.d);
                } else {
                    d2.a(this.c, this.e, this.f.t().F());
                }
            } catch (RemoteException e2) {
                this.f.t().y().a("Failed to send event to the service", e2);
            }
        }
        this.f.F();
    }
}
