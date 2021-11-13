package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class ag<TListener> {
    private TListener a;
    private boolean b = false;
    private /* synthetic */ ab c;

    public ag(ab abVar, TListener tlistener) {
        this.c = abVar;
        this.a = tlistener;
    }

    /* access modifiers changed from: protected */
    public abstract void a(TListener tlistener);

    public final void b() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.b) {
                String valueOf = String.valueOf(this);
                Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        c();
    }

    public final void c() {
        d();
        synchronized (this.c.r) {
            this.c.r.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
