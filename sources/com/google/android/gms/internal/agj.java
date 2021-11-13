package com.google.android.gms.internal;

final class agj {
    private final agq a;
    private final byte[] b;

    private agj(int i) {
        this.b = new byte[i];
        this.a = agq.a(this.b);
    }

    /* synthetic */ agj(int i, agf agf) {
        this(i);
    }

    public final age a() {
        this.a.b();
        return new agl(this.b);
    }

    public final agq b() {
        return this.a;
    }
}
