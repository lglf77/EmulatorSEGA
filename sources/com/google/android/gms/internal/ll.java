package com.google.android.gms.internal;

final class ll implements Runnable {
    private /* synthetic */ le a;

    ll(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.c();
        }
    }
}
