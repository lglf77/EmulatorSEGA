package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class adb implements yn {
    private final SecretKey a;

    public adb(byte[] bArr) {
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
        byte[] a2 = aem.a(12);
        System.arraycopy(a2, 0, bArr3, 0, 12);
        Cipher a3 = adx.a.a("AES/GCM/NoPadding");
        a3.init(1, this.a, new GCMParameterSpec(128, a2));
        a3.updateAAD(bArr2);
        a3.doFinal(bArr, 0, bArr.length, bArr3, 12);
        return bArr3;
    }
}
