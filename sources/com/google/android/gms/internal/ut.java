package com.google.android.gms.internal;

final class ut implements Runnable {
    private /* synthetic */ long a;
    private /* synthetic */ um b;

    ut(um umVar, long j) {
        this.b = umVar;
        this.a = j;
    }

    public final void run() {
        this.b.u().k.a(this.a);
        this.b.t().D().a("Session timeout duration set", Long.valueOf(this.a));
    }
}
