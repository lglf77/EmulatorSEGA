package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.fn;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class ab extends TimerTask {
    private /* synthetic */ CountDownLatch a;
    private /* synthetic */ Timer b;
    private /* synthetic */ a c;

    ab(a aVar, CountDownLatch countDownLatch, Timer timer) {
        this.c = aVar;
        this.a = countDownLatch;
        this.b = timer;
    }

    public final void run() {
        if (((long) ((Integer) app.f().a(asw.bZ)).intValue()) != this.a.getCount()) {
            fn.b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.a.getCount() == 0) {
                this.b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.c.e.c.getPackageName()).concat("_adsTrace_");
        try {
            fn.b("Starting method tracing");
            this.a.countDown();
            Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(au.k().a()).toString(), ((Integer) app.f().a(asw.ca)).intValue());
        } catch (Exception e) {
            fn.c("Exception occurred while starting method tracing.", e);
        }
    }
}
