package com.google.android.gms.internal;

import java.nio.ByteBuffer;

abstract class adh extends ade {
    private adh(byte[] bArr) {
        super(bArr);
    }

    private static void a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i4] ^ iArr[i], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 7);
    }

    /* access modifiers changed from: private */
    public static void b(int[] iArr, byte[] bArr) {
        int[] a = a(ByteBuffer.wrap(bArr));
        System.arraycopy(a, 0, iArr, 4, a.length);
    }

    /* access modifiers changed from: private */
    public static void e(int[] iArr) {
        System.arraycopy(a, 0, iArr, 0, a.length);
    }

    /* access modifiers changed from: package-private */
    public final void b(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }
}
