package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class adi {
    private ade a;
    private int[] b;
    private int[] c;
    private int[] d = new int[16];
    private int e = 0;
    private boolean f;

    adi(ade ade, byte[] bArr, int i) {
        this.a = ade;
        this.b = ade.a(bArr, i);
        this.c = ade.a(this.b);
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public final byte[] a(int i) {
        if (this.f) {
            throw new IllegalStateException("first can only be called once and before next().");
        }
        this.f = true;
        this.e = 8;
        ByteBuffer order = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(this.c, 0, 8);
        return order.array();
    }

    /* access modifiers changed from: package-private */
    public final int[] a() {
        this.f = true;
        System.arraycopy(this.c, this.e, this.d, 0, 16 - this.e);
        this.a.c(this.b);
        this.c = this.a.a(this.b);
        System.arraycopy(this.c, 0, this.d, 16 - this.e, this.e);
        return this.d;
    }
}
