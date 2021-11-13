package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class afr {
    private static String a = afr.class.getSimpleName();
    private final yj b;
    private final String c;
    private final String d;
    private final int e = 2;
    private volatile Method f = null;
    private final Class<?>[] g;
    private CountDownLatch h = new CountDownLatch(1);

    public afr(yj yjVar, String str, String str2, Class<?>... clsArr) {
        this.b = yjVar;
        this.c = str;
        this.d = str2;
        this.g = clsArr;
        this.b.c().submit(new afs(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.b.e().a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    public final void b() {
        try {
            Class loadClass = this.b.d().loadClass(a(this.b.f(), this.c));
            if (loadClass != null) {
                this.f = loadClass.getMethod(a(this.b.f(), this.d), this.g);
                if (this.f == null) {
                    this.h.countDown();
                } else {
                    this.h.countDown();
                }
            }
        } catch (xu e2) {
        } catch (UnsupportedEncodingException e3) {
        } catch (ClassNotFoundException e4) {
        } catch (NoSuchMethodException e5) {
        } catch (NullPointerException e6) {
        } finally {
            this.h.countDown();
        }
    }

    public final Method a() {
        if (this.f != null) {
            return this.f;
        }
        try {
            if (this.h.await(2, TimeUnit.SECONDS)) {
                return this.f;
            }
            return null;
        } catch (InterruptedException e2) {
            return null;
        }
    }
}
