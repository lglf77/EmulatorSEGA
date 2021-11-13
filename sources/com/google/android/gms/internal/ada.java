package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ada implements yn {
    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;
    private final int d;

    public ada(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.d = i;
            this.c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            this.a = a(instance.doFinal(new byte[16]));
            this.b = a(this.a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(b(bArr3, this.a));
        }
        int i4 = 0;
        byte[] doFinal = cipher.doFinal(bArr3);
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2 + i4, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = b(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(b(doFinal, bArr2));
    }

    private static byte[] a(byte[] bArr) {
        int i = 0;
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 15; i2++) {
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i2 + 1] & 255) >>> 7));
        }
        int i3 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i ^ i3);
        return bArr2;
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > (Integer.MAX_VALUE - this.d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[(this.d + bArr.length + 16)];
        byte[] a2 = aem.a(this.d);
        System.arraycopy(a2, 0, bArr3, 0, this.d);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, this.c);
        byte[] a3 = a(instance, 0, a2, 0, a2.length);
        byte[] a4 = a(instance, 1, bArr2, 0, bArr2.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, this.c, new IvParameterSpec(a3));
        instance2.doFinal(bArr, 0, bArr.length, bArr3, this.d);
        byte[] a5 = a(instance, 2, bArr3, this.d, bArr.length);
        int length = bArr.length + this.d;
        for (int i = 0; i < 16; i++) {
            bArr3[length + i] = (byte) ((a4[i] ^ a3[i]) ^ a5[i]);
        }
        return bArr3;
    }
}
