package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@bfk
public class ky<T> implements ku<T> {
    private final Object a = new Object();
    private int b = 0;
    private BlockingQueue<kz> c = new LinkedBlockingQueue();
    private T d;

    public final void a(kx<T> kxVar, kv kvVar) {
        synchronized (this.a) {
            if (this.b == 1) {
                kxVar.a(this.d);
            } else if (this.b == -1) {
                kvVar.a();
            } else if (this.b == 0) {
                this.c.add(new kz(this, kxVar, kvVar));
            }
        }
    }

    public final void a(T t) {
        synchronized (this.a) {
            if (this.b != 0) {
                throw new UnsupportedOperationException();
            }
            this.d = t;
            this.b = 1;
            for (kz kzVar : this.c) {
                kzVar.a.a(t);
            }
            this.c.clear();
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (this.b != 0) {
                throw new UnsupportedOperationException();
            }
            this.b = -1;
            for (kz kzVar : this.c) {
                kzVar.b.a();
            }
            this.c.clear();
        }
    }

    public final int e() {
        return this.b;
    }
}
