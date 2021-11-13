package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.internal.y;
import java.util.concurrent.atomic.AtomicBoolean;

@bfk
public abstract class bdh implements hp<Void>, nb {
    protected final Context a;
    protected final mw b;
    protected z c;
    private bdp d;
    private ew e;
    private Runnable f;
    private Object g = new Object();
    /* access modifiers changed from: private */
    public AtomicBoolean h = new AtomicBoolean(true);

    protected bdh(Context context, ew ewVar, mw mwVar, bdp bdp) {
        this.a = context;
        this.e = ewVar;
        this.c = this.e.b;
        this.b = mwVar;
        this.d = bdp;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(int i) {
        if (i != -2) {
            this.c = new z(i, this.c.j);
        }
        this.b.q();
        bdp bdp = this.d;
        v vVar = this.e.a;
        bdp bdp2 = bdp;
        bdp2.b(new ev(vVar.c, this.b, this.c.c, i, this.c.e, this.c.i, this.c.k, this.c.j, vVar.i, this.c.g, (bab) null, (bav) null, (String) null, (bac) null, (bae) null, this.c.h, this.e.d, this.c.f, this.e.f, this.c.m, this.c.n, this.e.h, (auk) null, this.c.A, this.c.B, this.c.C, this.c.D, this.c.E, (String) null, this.c.H, this.c.L, this.e.i, this.e.b.O, this.e.j));
    }

    public final void a(mw mwVar, boolean z) {
        int i = 0;
        fn.b("WebView finished loading.");
        if (this.h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            a(i);
            gw.a.removeCallbacks(this.f);
        }
    }

    public void c() {
        if (this.h.getAndSet(false)) {
            this.b.stopLoading();
            au.g();
            hc.a(this.b);
            a(-1);
            gw.a.removeCallbacks(this.f);
        }
    }

    public final /* synthetic */ Object d() {
        y.b("Webview render task needs to be called on UI thread.");
        this.f = new bdi(this);
        gw.a.postDelayed(this.f, ((Long) app.f().a(asw.bn)).longValue());
        a();
        return null;
    }
}
