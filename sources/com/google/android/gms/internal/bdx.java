package com.google.android.gms.internal;

final class bdx implements Runnable {
    private /* synthetic */ ev a;
    private /* synthetic */ bdw b;

    bdx(bdw bdw, ev evVar) {
        this.b = bdw;
        this.a = evVar;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}
