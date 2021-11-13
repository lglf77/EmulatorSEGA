package com.google.android.gms.internal;

import android.content.Intent;

final class wn extends ro {
    private /* synthetic */ wm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wn(wm wmVar, tk tkVar) {
        super(tkVar);
        this.a = wmVar;
    }

    public final void a() {
        this.a.y();
        this.a.t().E().a("Sending upload intent from DelayedRunnable");
        Intent className = new Intent().setClassName(this.a.l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        this.a.l().sendBroadcast(className);
    }
}
