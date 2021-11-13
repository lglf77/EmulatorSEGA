package com.google.android.gms.internal;

final class lt implements Runnable {
    private /* synthetic */ lr a;

    lt(lr lrVar) {
        this.a = lrVar;
    }

    public final void run() {
        this.a.a("surfaceDestroyed", new String[0]);
    }
}
