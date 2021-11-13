package com.google.android.gms.internal;

import java.security.SecureRandom;

public final class aem {
    private static final SecureRandom a = new SecureRandom();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        a.nextBytes(bArr);
        return bArr;
    }
}
