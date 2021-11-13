package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.d;

final class na implements Runnable {
    private /* synthetic */ mx a;

    na(mx mxVar) {
        this.a = mxVar;
    }

    public final void run() {
        this.a.a.G();
        d s = this.a.a.s();
        if (s != null) {
            s.m();
        }
        if (this.a.l != null) {
            this.a.l.a();
            nd unused = this.a.l = null;
        }
    }
}
