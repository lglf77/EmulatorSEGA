package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.bq;

@bfk
public final class ci extends cq {
    private final Context a;
    private final Object b;
    private final jp c;
    private final cj d;

    public ci(Context context, bq bqVar, bar bar, jp jpVar) {
        this(context, jpVar, new cj(context, bqVar, apc.a(), bar, jpVar));
    }

    private ci(Context context, jp jpVar, cj cjVar) {
        this.b = new Object();
        this.a = context;
        this.c = jpVar;
        this.d = cjVar;
    }

    public final void a() {
        synchronized (this.b) {
            this.d.F();
        }
    }

    public final void a(a aVar) {
        synchronized (this.b) {
            this.d.n();
        }
    }

    public final void a(cu cuVar) {
        synchronized (this.b) {
            this.d.a(cuVar);
        }
    }

    public final void a(da daVar) {
        synchronized (this.b) {
            this.d.a(daVar);
        }
    }

    public final void a(String str) {
        synchronized (this.b) {
            this.d.a(str);
        }
    }

    public final void a(boolean z) {
        synchronized (this.b) {
            this.d.c(z);
        }
    }

    public final void b(a aVar) {
        synchronized (this.b) {
            Context context = aVar == null ? null : (Context) c.a(aVar);
            if (context != null) {
                try {
                    this.d.a(context);
                } catch (Exception e) {
                    fn.c("Unable to extract updated context.", e);
                }
            }
            this.d.o();
        }
    }

    public final boolean b() {
        boolean G;
        synchronized (this.b) {
            G = this.d.G();
        }
        return G;
    }

    public final void c() {
        a((a) null);
    }

    public final void c(a aVar) {
        synchronized (this.b) {
            this.d.i();
        }
    }

    public final void d() {
        b((a) null);
    }

    public final void e() {
        c((a) null);
    }

    public final String f() {
        String a2;
        synchronized (this.b) {
            a2 = this.d.a();
        }
        return a2;
    }
}
