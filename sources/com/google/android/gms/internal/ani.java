package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@bfk
public final class ani extends and {
    private MessageDigest b;

    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        if (split.length == 1) {
            int a = anh.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else if (split.length < 5) {
            byte[] bArr3 = new byte[(split.length << 1)];
            for (int i = 0; i < split.length; i++) {
                int a2 = anh.a(split[i]);
                int i2 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr4 = {(byte) i2, (byte) (i2 >> 8)};
                bArr3[i << 1] = bArr4[0];
                bArr3[(i << 1) + 1] = bArr4[1];
            }
            bArr = bArr3;
        } else {
            bArr = new byte[split.length];
            for (int i3 = 0; i3 < split.length; i3++) {
                int a3 = anh.a(split[i3]);
                bArr[i3] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
            }
        }
        this.b = a();
        synchronized (this.a) {
            if (this.b == null) {
                bArr2 = new byte[0];
            } else {
                this.b.reset();
                this.b.update(bArr);
                byte[] digest = this.b.digest();
                bArr2 = new byte[(digest.length > 4 ? 4 : digest.length)];
                System.arraycopy(digest, 0, bArr2, 0, bArr2.length);
            }
        }
        return bArr2;
    }
}
