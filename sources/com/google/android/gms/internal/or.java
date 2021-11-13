package com.google.android.gms.internal;

@bfk
public final class or {
    public final int a;
    public final int b;
    private final int c;

    private or(int i, int i2, int i3) {
        this.c = i;
        this.b = i2;
        this.a = i3;
    }

    public static or a() {
        return new or(0, 0, 0);
    }

    public static or a(int i, int i2) {
        return new or(1, i, i2);
    }

    public static or a(apc apc) {
        return apc.d ? new or(3, 0, 0) : apc.i ? new or(2, 0, 0) : apc.h ? a() : a(apc.f, apc.c);
    }

    public static or b() {
        return new or(4, 0, 0);
    }

    public final boolean c() {
        return this.c == 2;
    }

    public final boolean d() {
        return this.c == 3;
    }

    public final boolean e() {
        return this.c == 0;
    }

    public final boolean f() {
        return this.c == 4;
    }
}
