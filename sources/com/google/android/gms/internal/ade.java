package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public abstract class ade implements aej {
    static final int[] a = a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    private static final byte[] c = new byte[16];
    final aei b;

    ade(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        this.b = aei.a(bArr);
    }

    static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, adi adi) {
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer2.hasRemaining()) {
            int remaining = byteBuffer2.remaining() < 64 ? byteBuffer2.remaining() : 64;
            order.asIntBuffer().put(adi.a());
            for (int i = 0; i < remaining; i++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ order.get(i)));
            }
        }
    }

    static int[] a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    static ade b(byte[] bArr) {
        return new adg(bArr);
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr.length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        } else if (byteBuffer.remaining() < bArr.length + 12) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        } else {
            byte[] a2 = aem.a(12);
            byteBuffer.put(a2);
            a(byteBuffer, ByteBuffer.wrap(bArr), c(a2));
        }
    }

    public final byte[] a(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12);
        a(allocate, bArr);
        return allocate.array();
    }

    /* access modifiers changed from: package-private */
    public abstract int[] a(byte[] bArr, int i);

    /* access modifiers changed from: package-private */
    public final int[] a(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        b(copyOf);
        for (int i = 0; i < iArr.length; i++) {
            copyOf[i] = copyOf[i] + iArr[i];
        }
        return copyOf;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(int[] iArr);

    /* access modifiers changed from: package-private */
    public abstract adi c(byte[] bArr);

    /* access modifiers changed from: package-private */
    public abstract void c(int[] iArr);
}
