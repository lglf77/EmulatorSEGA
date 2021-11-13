package com.google.android.gms.internal;

public final class aei {
    private final byte[] a;

    private aei(byte[] bArr, int i, int i2) {
        this.a = new byte[i2];
        System.arraycopy(bArr, 0, this.a, 0, i2);
    }

    public static aei a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new aei(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = new byte[this.a.length];
        System.arraycopy(this.a, 0, bArr, 0, this.a.length);
        return bArr;
    }
}
