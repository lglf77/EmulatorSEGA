package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.y;

abstract class ro {
    private static volatile Handler b;
    /* access modifiers changed from: private */
    public final tk a;
    private final Runnable c = new rp(this);
    /* access modifiers changed from: private */
    public volatile long d;
    /* access modifiers changed from: private */
    public boolean e = true;

    ro(tk tkVar) {
        y.a(tkVar);
        this.a = tkVar;
    }

    private final Handler d() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (ro.class) {
            if (b == null) {
                b = new Handler(this.a.t().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.u().a();
            if (!d().postDelayed(this.c, j)) {
                this.a.f().y().a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final void c() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }
}
