package com.google.android.gms.internal;

final class lf implements Runnable {
    private /* synthetic */ le a;

    lf(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.b();
        }
    }
}
