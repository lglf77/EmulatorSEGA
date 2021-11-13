package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

final class up implements Runnable {
    private /* synthetic */ AppMeasurement.ConditionalUserProperty a;
    private /* synthetic */ um b;

    up(um umVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.b = umVar;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        this.b.e(this.a);
    }
}
