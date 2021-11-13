package com.google.android.gms.internal;

final class bdk implements Runnable {
    private /* synthetic */ bdj a;

    bdk(bdj bdj) {
        this.a = bdj;
    }

    public final void run() {
        this.a.b();
    }
}
