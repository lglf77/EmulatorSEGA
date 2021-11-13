package com.google.android.gms.internal;

final class lk implements Runnable {
    private /* synthetic */ le a;

    lk(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.d();
            this.a.r.f();
        }
    }
}
