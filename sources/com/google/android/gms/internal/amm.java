package com.google.android.gms.internal;

public final class amm implements b {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public amm() {
        this(2500, 1, 1.0f);
    }

    private amm(int i, int i2, float f) {
        this.a = 2500;
        this.c = 1;
        this.d = 1.0f;
    }

    public final int a() {
        return this.a;
    }

    public final void a(ce ceVar) {
        this.b++;
        this.a = (int) (((float) this.a) + (((float) this.a) * this.d));
        if (!(this.b <= this.c)) {
            throw ceVar;
        }
    }

    public final int b() {
        return this.b;
    }
}
