package com.google.android.gms.internal;

final class ub implements Runnable {
    private /* synthetic */ rx a;
    private /* synthetic */ re b;
    private /* synthetic */ tp c;

    ub(tp tpVar, rx rxVar, re reVar) {
        this.c = tpVar;
        this.a = rxVar;
        this.b = reVar;
    }

    public final void run() {
        this.c.a.G();
        this.c.a.a(this.a, this.b);
    }
}
