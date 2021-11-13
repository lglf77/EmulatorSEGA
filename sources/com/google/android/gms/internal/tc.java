package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

final class tc implements Runnable {
    private /* synthetic */ tk a;
    private /* synthetic */ long b;
    private /* synthetic */ Bundle c;
    private /* synthetic */ Context d;
    private /* synthetic */ sj e;
    private /* synthetic */ BroadcastReceiver.PendingResult f;

    tc(tb tbVar, tk tkVar, long j, Bundle bundle, Context context, sj sjVar, BroadcastReceiver.PendingResult pendingResult) {
        this.a = tkVar;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = sjVar;
        this.f = pendingResult;
    }

    public final void run() {
        wq c2 = this.a.q().c(this.a.y().z(), "_fot");
        long longValue = (c2 == null || !(c2.e instanceof Long)) ? 0 : ((Long) c2.e).longValue();
        long j = this.b;
        long j2 = (longValue <= 0 || (j < longValue && j > 0)) ? j : longValue - 1;
        if (j2 > 0) {
            this.c.putLong("click_timestamp", j2);
        }
        AppMeasurement.getInstance(this.d).logEventInternal("auto", "_cmp", this.c);
        this.e.E().a("Install campaign recorded");
        if (this.f != null) {
            this.f.finish();
        }
    }
}
