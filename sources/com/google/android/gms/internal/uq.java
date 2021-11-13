package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class uq implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ um e;

    uq(um umVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = umVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void run() {
        this.e.p.w().a(this.a, this.b, this.c, this.d);
    }
}
