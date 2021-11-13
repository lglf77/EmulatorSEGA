package com.google.android.gms.internal;

final class us implements Runnable {
    private /* synthetic */ long a;
    private /* synthetic */ um b;

    us(um umVar, long j) {
        this.b = umVar;
        this.a = j;
    }

    public final void run() {
        this.b.u().j.a(this.a);
        this.b.t().D().a("Minimum session duration set", Long.valueOf(this.a));
    }
}
