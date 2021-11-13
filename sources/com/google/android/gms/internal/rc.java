package com.google.android.gms.internal;

final class rc implements Runnable {
    private /* synthetic */ long a;
    private /* synthetic */ qz b;

    rc(qz qzVar, long j) {
        this.b = qzVar;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
