package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

@bfk
public abstract class bdj extends fj {
    protected final bdp a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final ew e;
    protected z f;

    protected bdj(Context context, ew ewVar, bdp bdp) {
        super(true);
        this.b = context;
        this.e = ewVar;
        this.f = ewVar.b;
        this.a = bdp;
    }

    /* access modifiers changed from: protected */
    public abstract ev a(int i);

    public final void a() {
        synchronized (this.c) {
            fn.b("AdRendererBackgroundTask started.");
            int i = this.e.e;
            try {
                a(SystemClock.elapsedRealtime());
            } catch (bdm e2) {
                int a2 = e2.a();
                if (a2 == 3 || a2 == -1) {
                    fn.d(e2.getMessage());
                } else {
                    fn.e(e2.getMessage());
                }
                if (this.f == null) {
                    this.f = new z(a2);
                } else {
                    this.f = new z(a2, this.f.j);
                }
                gw.a.post(new bdk(this));
                i = a2;
            }
            gw.a.post(new bdl(this, a(i)));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j);

    public void b() {
    }
}
