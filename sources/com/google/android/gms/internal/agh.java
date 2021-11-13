package com.google.android.gms.internal;

final class agh extends agl {
    private final int c;
    private final int d;

    agh(byte[] bArr, int i, int i2) {
        super(bArr);
        b(i, i + i2, bArr.length);
        this.c = i;
        this.d = i2;
    }

    public final byte a(int i) {
        b(i, a());
        return this.b[this.c + i];
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, f() + i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.c;
    }
}
