package com.google.android.gms.internal;

import java.io.IOException;

public abstract class akf {
    protected volatile int Y = -1;

    public static final <T extends akf> T a(T t, byte[] bArr) {
        return a(t, bArr, 0, bArr.length);
    }

    private static <T extends akf> T a(T t, byte[] bArr, int i, int i2) {
        try {
            ajw a = ajw.a(bArr, 0, i2);
            t.a(a);
            a.a(0);
            return t;
        } catch (ake e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] a(akf akf) {
        byte[] bArr = new byte[akf.f()];
        try {
            ajx a = ajx.a(bArr, 0, bArr.length);
            akf.a(a);
            a.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public abstract akf a(ajw ajw);

    public void a(ajx ajx) {
    }

    /* renamed from: d */
    public akf clone() {
        return (akf) super.clone();
    }

    public final int e() {
        if (this.Y < 0) {
            f();
        }
        return this.Y;
    }

    public final int f() {
        int a = a();
        this.Y = a;
        return a;
    }

    public String toString() {
        return akg.a(this);
    }
}
