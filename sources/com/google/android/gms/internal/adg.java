package com.google.android.gms.internal;

import java.nio.ByteBuffer;

final class adg extends adh {
    private adg(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    public final int[] a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        adh.e(iArr);
        adh.b(iArr, this.b.a());
        iArr[12] = i;
        System.arraycopy(a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public final adi c(byte[] bArr) {
        return new adi(this, bArr, 1);
    }

    /* access modifiers changed from: package-private */
    public final void c(int[] iArr) {
        iArr[12] = iArr[12] + 1;
    }
}
