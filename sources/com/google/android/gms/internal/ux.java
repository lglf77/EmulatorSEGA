package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class ux implements Callable<String> {
    private /* synthetic */ um a;

    ux(um umVar) {
        this.a = umVar;
    }

    public final /* synthetic */ Object call() {
        String z = this.a.u().z();
        if (z == null) {
            um f = this.a.f();
            if (f.s().z()) {
                f.t().y().a("Cannot retrieve app instance id from analytics worker thread");
                z = null;
            } else {
                f.s();
                if (tf.y()) {
                    f.t().y().a("Cannot retrieve app instance id from main thread");
                    z = null;
                } else {
                    long b = f.k().b();
                    z = f.c(120000);
                    long b2 = f.k().b() - b;
                    if (z == null && b2 < 120000) {
                        z = f.c(120000 - b2);
                    }
                }
            }
            if (z == null) {
                throw new TimeoutException();
            }
            this.a.u().d(z);
        }
        return z;
    }
}
