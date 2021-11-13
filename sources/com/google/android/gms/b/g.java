package com.google.android.gms.b;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class g {

    static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        /* synthetic */ a(p pVar) {
            this();
        }

        public final void a() {
            this.a.await();
        }

        public final void a(Exception exc) {
            this.a.countDown();
        }

        public final void a(Object obj) {
            this.a.countDown();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }
    }

    interface b extends a, b<Object> {
    }

    public static <TResult> d<TResult> a(Exception exc) {
        o oVar = new o();
        oVar.a(exc);
        return oVar;
    }

    public static <TResult> d<TResult> a(TResult tresult) {
        o oVar = new o();
        oVar.a(tresult);
        return oVar;
    }

    public static <TResult> d<TResult> a(Executor executor, Callable<TResult> callable) {
        y.a(executor, (Object) "Executor must not be null");
        y.a(callable, (Object) "Callback must not be null");
        o oVar = new o();
        executor.execute(new p(oVar, callable));
        return oVar;
    }

    public static <TResult> TResult a(d<TResult> dVar) {
        y.c("Must not be called on the main application thread");
        y.a(dVar, (Object) "Task must not be null");
        if (dVar.a()) {
            return b(dVar);
        }
        a aVar = new a((p) null);
        a((d<?>) dVar, (b) aVar);
        aVar.a();
        return b(dVar);
    }

    public static <TResult> TResult a(d<TResult> dVar, long j, TimeUnit timeUnit) {
        y.c("Must not be called on the main application thread");
        y.a(dVar, (Object) "Task must not be null");
        y.a(timeUnit, (Object) "TimeUnit must not be null");
        if (dVar.a()) {
            return b(dVar);
        }
        a aVar = new a((p) null);
        a((d<?>) dVar, (b) aVar);
        if (aVar.a(j, timeUnit)) {
            return b(dVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(d<?> dVar, b bVar) {
        dVar.a(f.b, (b<? super Object>) bVar);
        dVar.a(f.b, (a) bVar);
    }

    private static <TResult> TResult b(d<TResult> dVar) {
        if (dVar.b()) {
            return dVar.c();
        }
        throw new ExecutionException(dVar.d());
    }
}
