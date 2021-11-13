package com.google.android.gms.internal;

final class uf implements Runnable {
    private /* synthetic */ wo a;
    private /* synthetic */ re b;
    private /* synthetic */ tp c;

    uf(tp tpVar, wo woVar, re reVar) {
        this.c = tpVar;
        this.a = woVar;
        this.b = reVar;
    }

    public final void run() {
        this.c.a.G();
        this.c.a.a(this.a, this.b);
    }
}
