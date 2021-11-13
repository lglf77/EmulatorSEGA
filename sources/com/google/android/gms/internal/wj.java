package com.google.android.gms.internal;

final class wj implements Runnable {
    private /* synthetic */ long a;
    private /* synthetic */ wg b;

    wj(wg wgVar, long j) {
        this.b = wgVar;
        this.a = j;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
