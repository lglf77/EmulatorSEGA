package com.google.android.gms.internal;

import android.content.ComponentName;

final class vy implements Runnable {
    private /* synthetic */ vu a;

    vy(vu vuVar) {
        this.a = vuVar;
    }

    public final void run() {
        this.a.a.a(new ComponentName(this.a.a.l(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
