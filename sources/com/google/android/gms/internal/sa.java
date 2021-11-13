package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;

public final class sa<V> {
    private final V a;
    private final pi<V> b;
    private final String c;

    private sa(String str, pi<V> piVar, V v) {
        y.a(piVar);
        this.b = piVar;
        this.a = v;
        this.c = str;
    }

    static sa<Integer> a(String str, int i, int i2) {
        return new sa<>(str, pi.a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    static sa<Long> a(String str, long j, long j2) {
        return new sa<>(str, pi.a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    static sa<String> a(String str, String str2, String str3) {
        return new sa<>(str, pi.a(str, str3), str2);
    }

    static sa<Boolean> a(String str, boolean z, boolean z2) {
        return new sa<>(str, pi.a(str, z2), Boolean.valueOf(z));
    }

    public final V a(V v) {
        return v != null ? v : this.a;
    }

    public final String a() {
        return this.c;
    }

    public final V b() {
        return this.a;
    }
}
