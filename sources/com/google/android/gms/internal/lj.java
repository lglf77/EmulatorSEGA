package com.google.android.gms.internal;

final class lj implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ le c;

    lj(le leVar, int i, int i2) {
        this.c = leVar;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        if (this.c.r != null) {
            this.c.r.a(this.a, this.b);
        }
    }
}
