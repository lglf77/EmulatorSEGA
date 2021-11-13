package com.google.android.gms.internal;

import java.nio.ByteBuffer;

public abstract class adj implements yn {
    private final ade a;

    private adj(ade ade) {
        this.a = ade;
    }

    public static adj a(byte[] bArr) {
        return new adl(ade.b(bArr));
    }

    /* access modifiers changed from: private */
    public static int b(int i) {
        return (((i + 16) - 1) / 16) << 4;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(byte[] bArr, ByteBuffer byteBuffer);

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(this.a.a() + bArr.length + 16);
        if (allocate.remaining() < bArr.length + this.a.a() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.a.a(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.a.a()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        byte[] a2 = ael.a(new adi(this.a, bArr3, 0).a(32), a(bArr2, allocate));
        allocate.limit(allocate.limit() + 16);
        allocate.put(a2);
        return allocate.array();
    }
}
