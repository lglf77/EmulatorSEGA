package com.google.android.gms.internal;

final class aua implements Runnable {
    private /* synthetic */ atz a;

    aua(atz atz) {
        this.a = atz;
    }

    public final void run() {
        if (this.a.p != null) {
            this.a.p.g();
            this.a.p.f();
        }
        aui unused = this.a.p = null;
    }
}
