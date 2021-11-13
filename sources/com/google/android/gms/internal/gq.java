package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@bfk
public final class gq {
    public static final ThreadPoolExecutor a = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Default"));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Loader"));

    static {
        a.allowCoreThreadTimeOut(true);
        b.allowCoreThreadTimeOut(true);
    }

    public static kh<Void> a(int i, Runnable runnable) {
        return i == 1 ? a((ExecutorService) b, new gr(runnable)) : a((ExecutorService) a, new gs(runnable));
    }

    public static kh<Void> a(Runnable runnable) {
        return a(0, runnable);
    }

    public static <T> kh<T> a(ExecutorService executorService, Callable<T> callable) {
        ks ksVar = new ks();
        try {
            ksVar.a(new gu(ksVar, executorService.submit(new gt(ksVar, callable))), kn.a);
        } catch (RejectedExecutionException e) {
            fn.c("Thread execution is rejected.", e);
            ksVar.a(e);
        }
        return ksVar;
    }

    private static ThreadFactory a(String str) {
        return new gv(str);
    }
}
