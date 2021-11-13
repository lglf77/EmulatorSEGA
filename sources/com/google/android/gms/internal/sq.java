package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.List;
import java.util.Map;

final class sq implements Runnable {
    private final sp a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private sq(String str, sp spVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        y.a(spVar);
        this.a = spVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
