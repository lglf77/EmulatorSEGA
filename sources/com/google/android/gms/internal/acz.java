package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class acz implements aej {
    private final SecretKeySpec a;
    private final int b;
    private final int c = adx.a.a("AES/CTR/NoPadding").getBlockSize();

    public acz(byte[] bArr, int i) {
        this.a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    public final byte[] a(byte[] bArr) {
        if (bArr.length > Integer.MAX_VALUE - this.b) {
            throw new GeneralSecurityException(new StringBuilder(43).append("plaintext length can not exceed ").append(Integer.MAX_VALUE - this.b).toString());
        }
        byte[] bArr2 = new byte[(this.b + bArr.length)];
        byte[] a2 = aem.a(this.b);
        System.arraycopy(a2, 0, bArr2, 0, this.b);
        int length = bArr.length;
        int i = this.b;
        Cipher a3 = adx.a.a("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.c];
        System.arraycopy(a2, 0, bArr3, 0, this.b);
        a3.init(1, this.a, new IvParameterSpec(bArr3));
        if (a3.doFinal(bArr, 0, length, bArr2, i) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
