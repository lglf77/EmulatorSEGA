package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class aeh {
    public static byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac a = adx.b.a(str);
        if (i > a.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            a.init(new SecretKeySpec(new byte[a.getMacLength()], str));
        } else {
            a.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        a.init(new SecretKeySpec(a.doFinal(bArr), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            a.update(bArr5);
            a.update(bArr3);
            a.update((byte) i2);
            bArr5 = a.doFinal();
            if (bArr5.length + i3 < i) {
                System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
            } else {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
        }
    }
}
