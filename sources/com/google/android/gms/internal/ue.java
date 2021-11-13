package com.google.android.gms.internal;

final class ue implements Runnable {
    private /* synthetic */ wo a;
    private /* synthetic */ re b;
    private /* synthetic */ tp c;

    ue(tp tpVar, wo woVar, re reVar) {
        this.c = tpVar;
        this.a = woVar;
        this.b = reVar;
    }

    public final void run() {
        this.c.a.G();
        this.c.a.b(this.a, this.b);
    }
}
