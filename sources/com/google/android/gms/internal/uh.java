package com.google.android.gms.internal;

final class uh implements Runnable {
    private /* synthetic */ re a;
    private /* synthetic */ tp b;

    uh(tp tpVar, re reVar) {
        this.b = tpVar;
        this.a = reVar;
    }

    public final void run() {
        this.b.a.G();
        this.b.a.c(this.a);
    }
}
