package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class qa {
    static CountDownLatch a = new CountDownLatch(1);
    private static boolean b = false;
    /* access modifiers changed from: private */
    public static MessageDigest c = null;
    private static final Object d = new Object();
    private static final Object e = new Object();

    private static pb a(long j) {
        pb pbVar = new pb();
        pbVar.k = 4096L;
        return pbVar;
    }

    static String a(pb pbVar, String str) {
        byte[] a2;
        byte[] a3 = akf.a((akf) pbVar);
        if (((Boolean) app.f().a(asw.by)).booleanValue()) {
            a2 = a(a3, str);
        } else if (qd.a == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] a4 = qd.a.a(a3, str != null ? str.getBytes() : new byte[0]);
            pk pkVar = new pk();
            pkVar.a = new byte[][]{a4};
            pkVar.c = 2;
            a2 = akf.a((akf) pkVar);
        }
        return py.a(a2, true);
    }

    private static Vector<byte[]> a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException e2) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (e) {
            if (!b) {
                b = true;
                new Thread(new qc()).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (d) {
            MessageDigest b2 = b();
            if (b2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b2.reset();
            b2.update(bArr);
            digest = c.digest();
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str) {
        Vector<byte[]> a2 = a(bArr, 255);
        if (a2 == null || a2.size() == 0) {
            return a(akf.a((akf) a(4096)), str, true);
        }
        pk pkVar = new pk();
        pkVar.a = new byte[a2.size()][];
        Iterator<byte[]> it = a2.iterator();
        int i = 0;
        while (it.hasNext()) {
            pkVar.a[i] = a(it.next(), str, false);
            i++;
        }
        pkVar.b = a(bArr);
        return akf.a((akf) pkVar);
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        byte[] array;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = akf.a((akf) a(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        new qf().a(array, bArr3);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new afy(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        a();
        boolean z = false;
        try {
            z = a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
        }
        if (z && c != null) {
            return c;
        }
        return null;
    }
}
