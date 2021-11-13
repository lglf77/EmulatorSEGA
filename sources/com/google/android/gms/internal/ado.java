package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class ado implements yt {
    private static final byte[] a = new byte[0];
    private final adq b;
    private final String c;
    private final byte[] d;
    private final adv e;
    private final adm f;

    public ado(ECPublicKey eCPublicKey, byte[] bArr, String str, adv adv, adm adm) {
        ads.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.b = new adq(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.e = adv;
        this.f = adm;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        adr a2 = this.b.a(this.c, this.d, bArr2, this.f.a(), this.e);
        byte[] a3 = this.f.a(a2.b()).a(bArr, a);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
