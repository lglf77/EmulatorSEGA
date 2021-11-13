package com.google.android.gms.internal;

public final class adr {
    private final aei a;
    private final aei b;

    public adr(byte[] bArr, byte[] bArr2) {
        this.a = aei.a(bArr);
        this.b = aei.a(bArr2);
    }

    public final byte[] a() {
        if (this.a == null) {
            return null;
        }
        return this.a.a();
    }

    public final byte[] b() {
        if (this.b == null) {
            return null;
        }
        return this.b.a();
    }
}
