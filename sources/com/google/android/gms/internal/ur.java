package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class ur implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ boolean e;
    private /* synthetic */ um f;

    ur(um umVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = umVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final void run() {
        this.f.p.w().a(this.a, this.b, this.c, this.d, this.e);
    }
}
