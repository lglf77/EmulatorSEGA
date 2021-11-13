package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ahe {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;
    private static Charset c = Charset.forName("ISO-8859-1");
    private static ByteBuffer d;
    private static agn e = agn.a(b);

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        d = ByteBuffer.wrap(bArr);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean a(aid aid) {
        return false;
    }
}
