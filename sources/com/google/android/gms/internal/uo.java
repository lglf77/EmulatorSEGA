package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

final class uo implements Runnable {
    private /* synthetic */ AppMeasurement.ConditionalUserProperty a;
    private /* synthetic */ um b;

    uo(um umVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.b = umVar;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        this.b.d(this.a);
    }
}
