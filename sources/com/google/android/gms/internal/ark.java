package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.j;
import java.util.concurrent.atomic.AtomicBoolean;

@bfk
public final class ark {
    private final baq a;
    private final apb b;
    private final AtomicBoolean c;
    /* access modifiers changed from: private */
    public final i d;
    private apr e;
    private aot f;
    private a g;
    private d[] h;
    private com.google.android.gms.ads.a.a i;
    private f j;
    private aqg k;
    private c l;
    private j m;
    private String n;
    private ViewGroup o;
    private int p;
    private boolean q;

    public ark(ViewGroup viewGroup, int i2) {
        this(viewGroup, (AttributeSet) null, false, apb.a, i2);
    }

    public ark(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, false, apb.a, i2);
    }

    private ark(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, apb apb, int i2) {
        this(viewGroup, attributeSet, z, apb, (aqg) null, i2);
    }

    private ark(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, apb apb, aqg aqg, int i2) {
        this.a = new baq();
        this.d = new i();
        this.e = new arl(this);
        this.o = viewGroup;
        this.b = apb;
        this.k = null;
        this.c = new AtomicBoolean(false);
        this.p = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                apf apf = new apf(context, attributeSet);
                this.h = apf.a(z);
                this.n = apf.a();
                if (viewGroup.isInEditMode()) {
                    jc a2 = app.a();
                    d dVar = this.h[0];
                    int i3 = this.p;
                    apc apc = new apc(context, dVar);
                    apc.j = a(i3);
                    a2.a(viewGroup, apc, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                app.a().a(viewGroup, new apc(context, d.a), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static apc a(Context context, d[] dVarArr, int i2) {
        apc apc = new apc(context, dVarArr);
        apc.j = a(i2);
        return apc;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a() {
        try {
            if (this.k != null) {
                this.k.i();
            }
        } catch (RemoteException e2) {
            jn.c("Failed to destroy AdView.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.a.a aVar) {
        try {
            this.i = aVar;
            if (this.k != null) {
                this.k.a((aql) aVar != null ? new ape(aVar) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the AppEventListener.", e2);
        }
    }

    public final void a(c cVar) {
        this.l = cVar;
        try {
            if (this.k != null) {
                this.k.a((atq) cVar != null ? new att(cVar) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the onCustomRenderedAdLoadedListener.", e2);
        }
    }

    public final void a(a aVar) {
        this.g = aVar;
        this.e.a(aVar);
    }

    public final void a(f fVar) {
        this.j = fVar;
        try {
            if (this.k != null) {
                this.k.a((aqs) this.j == null ? null : this.j.a());
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set correlator.", e2);
        }
    }

    public final void a(j jVar) {
        this.m = jVar;
        try {
            if (this.k != null) {
                this.k.a(jVar == null ? null : new asf(jVar));
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set video options.", e2);
        }
    }

    public final void a(aot aot) {
        try {
            this.f = aot;
            if (this.k != null) {
                this.k.a((aps) aot != null ? new aou(aot) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the AdClickListener.", e2);
        }
    }

    public final void a(ari ari) {
        try {
            if (this.k == null) {
                if ((this.h == null || this.n == null) && this.k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.o.getContext();
                apc a2 = a(context, this.h, this.p);
                this.k = "search_v2".equals(a2.a) ? (aqg) apg.a(context, false, new api(app.b(), context, a2, this.n)) : (aqg) apg.a(context, false, new aph(app.b(), context, a2, this.n, this.a));
                this.k.a((apv) new aov(this.e));
                if (this.f != null) {
                    this.k.a((aps) new aou(this.f));
                }
                if (this.i != null) {
                    this.k.a((aql) new ape(this.i));
                }
                if (this.l != null) {
                    this.k.a((atq) new att(this.l));
                }
                if (this.j != null) {
                    this.k.a((aqs) this.j.a());
                }
                if (this.m != null) {
                    this.k.a(new asf(this.m));
                }
                this.k.b(this.q);
                try {
                    com.google.android.gms.a.a j2 = this.k.j();
                    if (j2 != null) {
                        this.o.addView((View) com.google.android.gms.a.c.a(j2));
                    }
                } catch (RemoteException e2) {
                    jn.c("Failed to get an ad frame.", e2);
                }
            }
            if (this.k.b(apb.a(this.o.getContext(), ari))) {
                this.a.a(ari.j());
            }
        } catch (RemoteException e3) {
            jn.c("Failed to load ad.", e3);
        }
    }

    public final void a(String str) {
        if (this.n != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.n = str;
    }

    public final void a(boolean z) {
        this.q = z;
        try {
            if (this.k != null) {
                this.k.b(this.q);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set manual impressions.", e2);
        }
    }

    public final void a(d... dVarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        b(dVarArr);
    }

    public final a b() {
        return this.g;
    }

    public final void b(d... dVarArr) {
        this.h = dVarArr;
        try {
            if (this.k != null) {
                this.k.a(a(this.o.getContext(), this.h, this.p));
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the ad size.", e2);
        }
        this.o.requestLayout();
    }

    public final d c() {
        apc k2;
        try {
            if (!(this.k == null || (k2 = this.k.k()) == null)) {
                return k2.b();
            }
        } catch (RemoteException e2) {
            jn.c("Failed to get the current AdSize.", e2);
        }
        if (this.h != null) {
            return this.h[0];
        }
        return null;
    }

    public final d[] d() {
        return this.h;
    }

    public final String e() {
        if (this.n == null && this.k != null) {
            try {
                this.n = this.k.A();
            } catch (RemoteException e2) {
                jn.c("Failed to get ad unit id.", e2);
            }
        }
        return this.n;
    }

    public final com.google.android.gms.ads.a.a f() {
        return this.i;
    }

    public final c g() {
        return this.l;
    }

    public final void h() {
        try {
            if (this.k != null) {
                this.k.n();
            }
        } catch (RemoteException e2) {
            jn.c("Failed to call pause.", e2);
        }
    }

    public final void i() {
        try {
            if (this.k != null) {
                this.k.o();
            }
        } catch (RemoteException e2) {
            jn.c("Failed to call resume.", e2);
        }
    }

    public final String j() {
        try {
            if (this.k != null) {
                return this.k.d_();
            }
        } catch (RemoteException e2) {
            jn.c("Failed to get the mediation adapter class name.", e2);
        }
        return null;
    }

    public final i k() {
        return this.d;
    }

    public final ara l() {
        if (this.k == null) {
            return null;
        }
        try {
            return this.k.r();
        } catch (RemoteException e2) {
            jn.c("Failed to retrieve VideoController.", e2);
            return null;
        }
    }

    public final j m() {
        return this.m;
    }
}
