package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ac;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@bfk
public final class bdw extends fj {
    /* access modifiers changed from: private */
    public final bdp a;
    private final z b;
    private final ew c;
    private final bea d;
    private final Object e;
    private Future<ev> f;

    public bdw(Context context, ac acVar, ew ewVar, xr xrVar, bdp bdp, atj atj) {
        this(ewVar, bdp, new bea(context, acVar, new Cif(context), xrVar, ewVar, atj));
    }

    private bdw(ew ewVar, bdp bdp, bea bea) {
        this.e = new Object();
        this.c = ewVar;
        this.b = ewVar.b;
        this.a = bdp;
        this.d = bea;
    }

    public final void a() {
        ev evVar;
        int i = -2;
        try {
            synchronized (this.e) {
                this.f = gq.a((ExecutorService) gq.a, this.d);
            }
            evVar = this.f.get(60000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            fn.e("Timed out waiting for native ad.");
            i = 2;
            this.f.cancel(true);
            evVar = null;
        } catch (ExecutionException e3) {
            i = 0;
            evVar = null;
        } catch (InterruptedException e4) {
            i = 0;
            evVar = null;
        } catch (CancellationException e5) {
            i = 0;
            evVar = null;
        }
        if (evVar == null) {
            evVar = new ev(this.c.a.c, (mw) null, (List<String>) null, i, (List<String>) null, (List<String>) null, this.b.k, this.b.j, this.c.a.i, false, (bab) null, (bav) null, (String) null, (bac) null, (bae) null, this.b.h, this.c.d, this.b.f, this.c.f, this.b.m, this.b.n, this.c.h, (auk) null, (dw) null, (List<String>) null, (List<String>) null, this.c.b.D, this.c.b.E, (String) null, (List<String>) null, this.b.L, this.c.i, this.c.b.O, false);
        }
        gw.a.post(new bdx(this, evVar));
    }

    public final void b() {
        synchronized (this.e) {
            if (this.f != null) {
                this.f.cancel(true);
            }
        }
    }
}
