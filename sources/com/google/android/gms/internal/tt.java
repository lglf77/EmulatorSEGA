package com.google.android.gms.internal;

final class tt implements Runnable {
    private /* synthetic */ rh a;
    private /* synthetic */ tp b;

    tt(tp tpVar, rh rhVar) {
        this.b = tpVar;
        this.a = rhVar;
    }

    public final void run() {
        this.b.a.G();
        this.b.a.b(this.a);
    }
}
