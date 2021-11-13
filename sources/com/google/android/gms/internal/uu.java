package com.google.android.gms.internal;

import android.os.Bundle;

final class uu implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ long c;
    private /* synthetic */ Bundle d;
    private /* synthetic */ boolean e;
    private /* synthetic */ boolean f;
    private /* synthetic */ boolean g;
    private /* synthetic */ String h;
    private /* synthetic */ um i;

    uu(um umVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.i = umVar;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
    }

    public final void run() {
        this.i.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
