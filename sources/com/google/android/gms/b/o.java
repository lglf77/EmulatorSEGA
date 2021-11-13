package com.google.android.gms.b;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Executor;

final class o<TResult> extends d<TResult> {
    private final Object a = new Object();
    private final m<TResult> b = new m<>();
    private boolean c;
    private TResult d;
    private Exception e;

    o() {
    }

    private final void e() {
        y.a(this.c, (Object) "Task is not yet complete");
    }

    private final void f() {
        y.a(!this.c, (Object) "Task is already complete");
    }

    private final void g() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    public final d<TResult> a(Executor executor, a aVar) {
        this.b.a(new h(executor, aVar));
        g();
        return this;
    }

    public final d<TResult> a(Executor executor, b<? super TResult> bVar) {
        this.b.a(new j(executor, bVar));
        g();
        return this;
    }

    public final void a(Exception exc) {
        y.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            f();
            this.c = true;
            this.e = exc;
        }
        this.b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            f();
            this.c = true;
            this.d = tresult;
        }
        this.b.a(this);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }

    public final TResult c() {
        TResult tresult;
        synchronized (this.a) {
            e();
            if (this.e != null) {
                throw new c(this.e);
            }
            tresult = this.d;
        }
        return tresult;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }
}
