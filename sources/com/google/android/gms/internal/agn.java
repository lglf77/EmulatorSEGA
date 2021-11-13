package com.google.android.gms.internal;

public abstract class agn {
    private static volatile boolean e = true;
    int a;
    int b;
    int c;
    private boolean d;

    private agn() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.d = false;
    }

    public static agn a(byte[] bArr) {
        return a(bArr, 0, bArr.length, false);
    }

    static agn a(byte[] bArr, int i, int i2, boolean z) {
        agp agp = new agp(bArr, i, i2, z);
        try {
            agp.b(i2);
            return agp;
        } catch (ahi e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int a();

    public abstract <T extends ahc<T, ?>> T a(T t, agu agu);

    public abstract void a(int i);

    public abstract int b(int i);

    public abstract long b();

    public abstract long c();

    public abstract void c(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract String f();

    public abstract age g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    /* access modifiers changed from: package-private */
    public abstract long k();

    public abstract boolean l();

    public abstract int m();
}
