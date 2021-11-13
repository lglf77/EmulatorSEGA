package com.google.android.gms.internal;

final class dq implements Runnable {
    private /* synthetic */ ev a;
    private /* synthetic */ Cdo b;

    dq(Cdo doVar, ev evVar) {
        this.b = doVar;
        this.a = evVar;
    }

    public final void run() {
        this.b.i.b(this.a);
    }
}
