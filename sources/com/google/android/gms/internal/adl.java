package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class adl extends adj {
    private adl(ade ade) {
        super(ade);
    }

    /* access modifiers changed from: package-private */
    public final byte[] a(byte[] bArr, ByteBuffer byteBuffer) {
        int a = adj.b(bArr.length);
        int remaining = byteBuffer.remaining();
        int a2 = adj.b(remaining);
        ByteBuffer order = ByteBuffer.allocate(a + a2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(a);
        order.put(byteBuffer);
        order.position(a + a2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }
}
