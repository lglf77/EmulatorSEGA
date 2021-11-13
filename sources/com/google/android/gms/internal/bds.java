package com.google.android.gms.internal;

final class bds implements Runnable {
    private /* synthetic */ ev a;
    private /* synthetic */ bdr b;

    bds(bdr bdr, ev evVar) {
        this.b = bdr;
        this.a = evVar;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}
