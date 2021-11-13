package com.google.android.gms.internal;

import java.nio.ByteBuffer;

public final class zm implements yn {
    private static final byte[] a = new byte[0];
    private final acf b;
    private final yn c;

    public zm(acf acf, yn ynVar) {
        this.b = acf;
        this.c = ynVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] k = zd.b(this.b).k();
        byte[] a2 = this.c.a(k, a);
        byte[] a3 = ((yn) zd.a(this.b.a(), k)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
