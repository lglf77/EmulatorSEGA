package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

final class vl implements Runnable {
    private /* synthetic */ AppMeasurement.g a;
    private /* synthetic */ vg b;

    vl(vg vgVar, AppMeasurement.g gVar) {
        this.b = vgVar;
        this.a = gVar;
    }

    public final void run() {
        sb d = this.b.b;
        if (d == null) {
            this.b.t().y().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.a == null) {
                d.a(0, (String) null, (String) null, this.b.l().getPackageName());
            } else {
                d.a(this.a.d, this.a.b, this.a.c, this.b.l().getPackageName());
            }
            this.b.F();
        } catch (RemoteException e) {
            this.b.t().y().a("Failed to send current screen to the service", e);
        }
    }
}
