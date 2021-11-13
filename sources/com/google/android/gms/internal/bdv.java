package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.r;
import java.util.concurrent.CountDownLatch;

final class bdv implements Runnable {
    private /* synthetic */ CountDownLatch a;
    private /* synthetic */ bdu b;

    bdv(bdu bdu, CountDownLatch countDownLatch) {
        this.b = bdu;
        this.a = countDownLatch;
    }

    public final void run() {
        synchronized (this.b.d) {
            boolean unused = this.b.m = r.a(this.b.l, this.b.g, this.a);
        }
    }
}
