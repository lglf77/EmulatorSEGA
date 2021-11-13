package com.google.android.gms.internal;

final class wk implements Runnable {
    private /* synthetic */ long a;
    private /* synthetic */ wg b;

    wk(wg wgVar, long j) {
        this.b = wgVar;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
