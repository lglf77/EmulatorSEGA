package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class uy implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ um b;

    uy(um umVar, AtomicReference atomicReference) {
        this.b = umVar;
        this.a = atomicReference;
    }

    public final void run() {
        this.b.i().a((AtomicReference<String>) this.a);
    }
}
