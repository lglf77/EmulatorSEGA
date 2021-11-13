package com.google.android.gms.internal;

final class bdi implements Runnable {
    private /* synthetic */ bdh a;

    bdi(bdh bdh) {
        this.a = bdh;
    }

    public final void run() {
        if (this.a.h.get()) {
            fn.c("Timed out waiting for WebView to finish loading.");
            this.a.c();
        }
    }
}
