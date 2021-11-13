package com.google.android.gms.internal;

import java.util.Arrays;

public final class zc<P> {
    private final P a;
    private final byte[] b;
    private final acd c;
    private final acv d;

    public zc(P p, byte[] bArr, acd acd, acv acv) {
        this.a = p;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = acd;
        this.d = acv;
    }

    public final P a() {
        return this.a;
    }

    public final byte[] b() {
        if (this.b == null) {
            return null;
        }
        return Arrays.copyOf(this.b, this.b.length);
    }
}
