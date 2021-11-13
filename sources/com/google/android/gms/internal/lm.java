package com.google.android.gms.internal;

final class lm implements Runnable {
    private /* synthetic */ le a;

    lm(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.d();
        }
    }
}
