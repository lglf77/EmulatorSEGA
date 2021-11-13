package com.google.android.gms.internal;

import java.security.interfaces.ECPrivateKey;

public final class adn implements ys {
    private static final byte[] a = new byte[0];
    private final ECPrivateKey b;
    private final adp c;
    private final String d;
    private final byte[] e;
    private final adv f;
    private final adm g;

    public adn(ECPrivateKey eCPrivateKey, byte[] bArr, String str, adv adv, adm adm) {
        this.b = eCPrivateKey;
        this.c = new adp(eCPrivateKey);
        this.e = bArr;
        this.d = str;
        this.f = adv;
        this.g = adm;
    }
}
