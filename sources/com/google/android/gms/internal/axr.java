package com.google.android.gms.internal;

final class axr implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ long b;
    private /* synthetic */ aws c;

    axr(aws aws, String str, long j) {
        this.c = aws;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
        this.c.a.a(toString());
    }
}
