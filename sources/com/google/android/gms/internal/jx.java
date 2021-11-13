package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@bfk
public final class jx {
    public static <T> kg<T> a(T t) {
        return new kg<>(t);
    }

    public static <V> kh<V> a(kh<V> khVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ks ksVar = new ks();
        a(ksVar, khVar);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new kb(ksVar), j, timeUnit);
        a(khVar, ksVar);
        ksVar.a(new kc(schedule), kn.b);
        return ksVar;
    }

    public static <A, B> kh<B> a(kh<A> khVar, js<? super A, ? extends B> jsVar, Executor executor) {
        ks ksVar = new ks();
        khVar.a(new ka(ksVar, jsVar, khVar), executor);
        a(ksVar, khVar);
        return ksVar;
    }

    public static <A, B> kh<B> a(kh<A> khVar, jt<A, B> jtVar, Executor executor) {
        ks ksVar = new ks();
        khVar.a(new jz(ksVar, jtVar, khVar), executor);
        a(ksVar, khVar);
        return ksVar;
    }

    public static <V, X extends Throwable> kh<V> a(kh<? extends V> khVar, Class<X> cls, js<? super X, ? extends V> jsVar, Executor executor) {
        ks ksVar = new ks();
        a(ksVar, khVar);
        khVar.a(new kd(ksVar, khVar, cls, jsVar, executor), kn.b);
        return ksVar;
    }

    public static <T> T a(Future<T> future, T t) {
        try {
            return future.get(((Long) app.f().a(asw.bl)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            fn.c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            au.i().a((Throwable) e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            fn.b("Error waiting for future.", e2);
            au.i().a((Throwable) e2, "Futures.resolveFuture");
            return t;
        }
    }

    public static <T> T a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            fn.c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            au.i().a((Throwable) e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            fn.b("Error waiting for future.", e2);
            au.i().a((Throwable) e2, "Futures.resolveFuture");
            return t;
        }
    }

    public static <V> void a(kh<V> khVar, ju<V> juVar, Executor executor) {
        khVar.a(new jy(juVar, khVar), executor);
    }

    private static <V> void a(kh<? extends V> khVar, ks<V> ksVar) {
        a(ksVar, khVar);
        khVar.a(new ke(ksVar, khVar), kn.b);
    }

    private static <A, B> void a(kh<A> khVar, Future<B> future) {
        khVar.a(new kf(khVar, future), kn.b);
    }

    static final /* synthetic */ void a(ks ksVar, js jsVar, kh khVar) {
        if (!ksVar.isCancelled()) {
            try {
                a(jsVar.a(khVar.get()), ksVar);
            } catch (CancellationException e) {
                ksVar.cancel(true);
            } catch (ExecutionException e2) {
                ksVar.a(e2.getCause());
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                ksVar.a(e3);
            } catch (Exception e4) {
                ksVar.a(e4);
            }
        }
    }

    static final /* synthetic */ void a(ks ksVar, kh khVar, Class cls, js jsVar, Executor executor) {
        try {
            ksVar.b(khVar.get());
            return;
        } catch (ExecutionException e) {
            e = e.getCause();
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
        } catch (Exception e3) {
            e = e3;
        }
        if (cls.isInstance(e)) {
            a(a(a(e), jsVar, executor), ksVar);
        } else {
            ksVar.a(e);
        }
    }
}
