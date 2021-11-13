package com.google.android.gms.internal;

final class rb implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ long b;
    private /* synthetic */ qz c;

    rb(qz qzVar, String str, long j) {
        this.c = qzVar;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
