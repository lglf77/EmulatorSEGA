package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class ti<V> extends FutureTask<V> implements Comparable<ti> {
    final boolean a;
    private final long b = tf.k.getAndIncrement();
    private final String c;
    private /* synthetic */ tf d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ti(tf tfVar, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.d = tfVar;
        y.a(str);
        this.c = str;
        this.a = false;
        if (this.b == Long.MAX_VALUE) {
            tfVar.t().y().a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ti(tf tfVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.d = tfVar;
        y.a(str);
        this.c = str;
        this.a = z;
        if (this.b == Long.MAX_VALUE) {
            tfVar.t().y().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        ti tiVar = (ti) obj;
        if (this.a != tiVar.a) {
            return this.a ? -1 : 1;
        }
        if (this.b < tiVar.b) {
            return -1;
        }
        if (this.b > tiVar.b) {
            return 1;
        }
        this.d.t().z().a("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.d.t().y().a(this.c, th);
        if (th instanceof tg) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
