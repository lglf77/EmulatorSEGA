package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class bef implements Runnable {
    private /* synthetic */ AtomicInteger a;
    private /* synthetic */ int b;
    private /* synthetic */ ks c;
    private /* synthetic */ List d;

    bef(AtomicInteger atomicInteger, int i, ks ksVar, List list) {
        this.a = atomicInteger;
        this.b = i;
        this.c = ksVar;
        this.d = list;
    }

    public final void run() {
        if (this.a.incrementAndGet() >= this.b) {
            try {
                this.c.b(bea.c(this.d));
            } catch (InterruptedException | ExecutionException e) {
                fn.c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
