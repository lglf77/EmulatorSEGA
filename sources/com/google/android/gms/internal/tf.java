package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class tf extends uk {
    /* access modifiers changed from: private */
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    private ExecutorService a;
    /* access modifiers changed from: private */
    public tj b;
    /* access modifiers changed from: private */
    public tj c;
    private final PriorityBlockingQueue<ti<?>> d = new PriorityBlockingQueue<>();
    private final BlockingQueue<ti<?>> e = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler f = new th(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler g = new th(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object h = new Object();
    /* access modifiers changed from: private */
    public final Semaphore i = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean j;

    tf(tk tkVar) {
        super(tkVar);
    }

    private final void a(ti<?> tiVar) {
        synchronized (this.h) {
            this.d.add(tiVar);
            if (this.b == null) {
                this.b = new tj(this, "Measurement Worker", this.d);
                this.b.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    public static boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService A() {
        ExecutorService executorService;
        synchronized (this.h) {
            if (this.a == null) {
                this.a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.a;
        }
        return executorService;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        Q();
        y.a(callable);
        ti tiVar = new ti(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.b) {
            if (!this.d.isEmpty()) {
                t().A().a("Callable skipped the worker queue.");
            }
            tiVar.run();
        } else {
            a((ti<?>) tiVar);
        }
        return tiVar;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Runnable runnable) {
        Q();
        y.a(runnable);
        a((ti<?>) new ti(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        Q();
        y.a(callable);
        ti tiVar = new ti(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.b) {
            tiVar.run();
        } else {
            a((ti<?>) tiVar);
        }
        return tiVar;
    }

    public final void b() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void b(Runnable runnable) {
        Q();
        y.a(runnable);
        ti tiVar = new ti(this, runnable, false, "Task exception on network thread");
        synchronized (this.h) {
            this.e.add(tiVar);
            if (this.c == null) {
                this.c = new tj(this, "Measurement Network", this.e);
                this.c.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                this.c.a();
            }
        }
    }

    public final void c() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final boolean z() {
        return Thread.currentThread() == this.b;
    }
}
