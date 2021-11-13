package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class adw implements yn {
    private final aej a;
    private final yz b;
    private final int c;

    public adw(aej aej, yz yzVar, int i) {
        this.a = aej;
        this.b = yzVar;
        this.c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8 * ((long) bArr2.length)).array(), 8);
        return add.a(a2, this.b.a(add.a(bArr2, a2, copyOf)));
    }
}
