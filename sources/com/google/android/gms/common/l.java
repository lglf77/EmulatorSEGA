package com.google.android.gms.common;

import java.util.Arrays;

final class l extends k {
    private final byte[] a;

    l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] c() {
        return this.a;
    }
}
