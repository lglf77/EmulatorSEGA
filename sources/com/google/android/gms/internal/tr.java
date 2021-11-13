package com.google.android.gms.internal;

final class tr implements Runnable {
    private /* synthetic */ rh a;
    private /* synthetic */ re b;
    private /* synthetic */ tp c;

    tr(tp tpVar, rh rhVar, re reVar) {
        this.c = tpVar;
        this.a = rhVar;
        this.b = reVar;
    }

    public final void run() {
        this.c.a.G();
        this.c.a.b(this.a, this.b);
    }
}
