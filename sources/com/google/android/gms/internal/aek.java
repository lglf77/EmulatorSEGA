package com.google.android.gms.internal;

import java.security.Key;
import javax.crypto.Mac;

public final class aek implements yz {
    private Mac a;
    private final int b;
    private final String c;
    private final Key d;

    public aek(String str, Key key, int i) {
        this.c = str;
        this.b = i;
        this.d = key;
        this.a = adx.b.a(str);
        this.a.init(key);
    }

    public final byte[] a(byte[] bArr) {
        Mac a2;
        try {
            a2 = (Mac) this.a.clone();
        } catch (CloneNotSupportedException e) {
            a2 = adx.b.a(this.c);
            a2.init(this.d);
        }
        a2.update(bArr);
        byte[] bArr2 = new byte[this.b];
        System.arraycopy(a2.doFinal(), 0, bArr2, 0, this.b);
        return bArr2;
    }
}
