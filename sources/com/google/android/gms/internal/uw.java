package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class uw implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ boolean b;
    private /* synthetic */ um c;

    uw(um umVar, AtomicReference atomicReference, boolean z) {
        this.c = umVar;
        this.a = atomicReference;
        this.b = z;
    }

    public final void run() {
        this.c.i().a((AtomicReference<List<wo>>) this.a, this.b);
    }
}
