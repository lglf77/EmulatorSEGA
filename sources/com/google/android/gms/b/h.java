package com.google.android.gms.b;

import java.util.concurrent.Executor;

final class h<TResult> implements l<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public a c;

    public h(Executor executor, a aVar) {
        this.a = executor;
        this.c = aVar;
    }

    public final void a(d<TResult> dVar) {
        if (!dVar.b()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new i(this, dVar));
                }
            }
        }
    }
}
