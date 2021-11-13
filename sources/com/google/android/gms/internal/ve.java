package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

final class ve implements Runnable {
    private /* synthetic */ vf a;
    private /* synthetic */ vc b;

    ve(vc vcVar, vf vfVar) {
        this.b = vcVar;
        this.a = vfVar;
    }

    public final void run() {
        this.b.a(this.a);
        this.b.a = null;
        this.b.i().a((AppMeasurement.g) null);
    }
}
