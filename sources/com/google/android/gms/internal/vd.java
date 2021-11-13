package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

final class vd implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ AppMeasurement.g b;
    private /* synthetic */ vf c;
    private /* synthetic */ vc d;

    vd(vc vcVar, boolean z, AppMeasurement.g gVar, vf vfVar) {
        this.d = vcVar;
        this.a = z;
        this.b = gVar;
        this.c = vfVar;
    }

    public final void run() {
        if (this.a && this.d.a != null) {
            this.d.a(this.d.a);
        }
        if (this.b == null || this.b.d != this.c.d || !wr.a(this.b.c, this.c.c) || !wr.a(this.b.b, this.c.b)) {
            Bundle bundle = new Bundle();
            vc.a((AppMeasurement.g) this.c, bundle);
            if (this.b != null) {
                if (this.b.b != null) {
                    bundle.putString("_pn", this.b.b);
                }
                bundle.putString("_pc", this.b.c);
                bundle.putLong("_pi", this.b.d);
            }
            this.d.f().a("auto", "_vs", bundle);
        }
        this.d.a = this.c;
        this.d.i().a((AppMeasurement.g) this.c);
    }
}
