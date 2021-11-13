package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.df;
import java.util.Collections;
import java.util.Map;

public abstract class aws<T> implements Comparable<aws<T>> {
    /* access modifiers changed from: private */
    public final df.a a;
    private final int b;
    private final String c;
    private final int d;
    private final bcm e;
    private Integer f;
    private bau g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private b l;
    private qe m;
    private ays n;
    private final Object o;

    public aws(int i2, String str, bcm bcm) {
        Uri parse;
        String host;
        this.a = df.a.a ? new df.a() : null;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = false;
        this.m = null;
        this.o = new Object();
        this.b = i2;
        this.c = str;
        this.e = bcm;
        this.l = new amm();
        this.d = (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) ? 0 : host.hashCode();
    }

    public final aws<?> a(int i2) {
        this.f = Integer.valueOf(i2);
        return this;
    }

    public final aws<?> a(bau bau) {
        this.g = bau;
        return this;
    }

    public final aws<?> a(qe qeVar) {
        this.m = qeVar;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract bbt<T> a(auq auq);

    /* access modifiers changed from: package-private */
    public final void a(ays ays) {
        synchronized (this.o) {
            this.n = ays;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(bbt<?> bbt) {
        synchronized (this.o) {
            if (this.n != null) {
                this.n.a(this, bbt);
            }
        }
    }

    public final void a(ce ceVar) {
        if (this.e != null) {
            this.e.a(ceVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public byte[] a() {
        return null;
    }

    public Map<String, String> b() {
        return Collections.emptyMap();
    }

    public final void b(String str) {
        if (df.a.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public final int c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        if (this.g != null) {
            this.g.b(this);
        }
        if (df.a.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new axr(this, str, id));
                return;
            }
            this.a.a(str, id);
            this.a.a(toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        aws aws = (aws) obj;
        azt azt = azt.NORMAL;
        azt azt2 = azt.NORMAL;
        return azt == azt2 ? this.f.intValue() - aws.f.intValue() : azt2.ordinal() - azt.ordinal();
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final qe f() {
        return this.m;
    }

    public final boolean g() {
        return this.h;
    }

    public final int h() {
        return this.l.a();
    }

    public final b i() {
        return this.l;
    }

    public final void j() {
        this.j = true;
    }

    public final boolean k() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        synchronized (this.o) {
            if (this.n != null) {
                this.n.a(this);
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        String str = this.c;
        String valueOf2 = String.valueOf(azt.NORMAL);
        String valueOf3 = String.valueOf(this.f);
        return new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("[ ] ").append(str).append(" ").append(concat).append(" ").append(valueOf2).append(" ").append(valueOf3).toString();
    }
}
