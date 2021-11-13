package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;

final class rs {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final Long g;
    final Long h;
    final Boolean i;

    rs(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Boolean bool) {
        y.a(str);
        y.a(str2);
        y.b(j >= 0);
        y.b(j2 >= 0);
        y.b(j4 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = l;
        this.h = l2;
        this.i = bool;
    }

    /* access modifiers changed from: package-private */
    public final rs a() {
        return new rs(this.a, this.b, this.c + 1, this.d + 1, this.e, this.f, this.g, this.h, this.i);
    }

    /* access modifiers changed from: package-private */
    public final rs a(long j) {
        return new rs(this.a, this.b, this.c, this.d, j, this.f, this.g, this.h, this.i);
    }

    /* access modifiers changed from: package-private */
    public final rs a(Long l, Long l2, Boolean bool) {
        return new rs(this.a, this.b, this.c, this.d, this.e, this.f, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    public final rs b(long j) {
        return new rs(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i);
    }
}
