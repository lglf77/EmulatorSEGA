package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@bfk
public final class anm extends and {
    private MessageDigest b;
    private final int c;
    private final int d;

    public anm(int i) {
        int i2 = i / 8;
        this.c = i % 8 > 0 ? i2 + 1 : i2;
        this.d = i;
    }

    public final byte[] a(String str) {
        byte[] bArr;
        synchronized (this.a) {
            this.b = a();
            if (this.b == null) {
                bArr = new byte[0];
            } else {
                this.b.reset();
                this.b.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.b.digest();
                bArr = new byte[(digest.length > this.c ? this.c : digest.length)];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
                if (this.d % 8 > 0) {
                    long j = 0;
                    for (int i = 0; i < bArr.length; i++) {
                        if (i > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i] & 255);
                    }
                    long j2 = j >>> (8 - (this.d % 8));
                    for (int i2 = this.c - 1; i2 >= 0; i2--) {
                        bArr[i2] = (byte) ((int) (255 & j2));
                        j2 >>>= 8;
                    }
                }
            }
        }
        return bArr;
    }
}
