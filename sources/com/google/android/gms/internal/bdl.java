package com.google.android.gms.internal;

final class bdl implements Runnable {
    private /* synthetic */ ev a;
    private /* synthetic */ bdj b;

    bdl(bdj bdj, ev evVar) {
        this.b = bdj;
        this.a = evVar;
    }

    public final void run() {
        synchronized (this.b.c) {
            bdj bdj = this.b;
            bdj.a.b(this.a);
        }
    }
}
