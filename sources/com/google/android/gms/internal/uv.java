package com.google.android.gms.internal;

final class uv implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ Object c;
    private /* synthetic */ long d;
    private /* synthetic */ um e;

    uv(um umVar, String str, String str2, Object obj, long j) {
        this.e = umVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
