package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.au;
import java.util.concurrent.Callable;

final class gt implements Runnable {
    private /* synthetic */ ks a;
    private /* synthetic */ Callable b;

    gt(ks ksVar, Callable callable) {
        this.a = ksVar;
        this.b = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.a.b(this.b.call());
        } catch (Exception e) {
            au.i().a((Throwable) e, "AdThreadPool.submit");
            this.a.a(e);
        }
    }
}
