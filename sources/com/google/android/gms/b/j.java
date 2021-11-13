package com.google.android.gms.b;

import java.util.concurrent.Executor;

final class j<TResult> implements l<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public b<? super TResult> c;

    public j(Executor executor, b<? super TResult> bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void a(d<TResult> dVar) {
        if (dVar.b()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new k(this, dVar));
                }
            }
        }
    }
}
