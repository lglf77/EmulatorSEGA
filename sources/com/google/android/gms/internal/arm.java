package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.f;

@bfk
public final class arm {
    private final baq a;
    private final Context b;
    private final apb c;
    private a d;
    private aot e;
    private aqg f;
    private String g;
    private com.google.android.gms.ads.a.a h;
    private e i;
    private c j;
    private f k;
    private com.google.android.gms.ads.reward.c l;
    private boolean m;
    private boolean n;

    public arm(Context context) {
        this(context, apb.a, (e) null);
    }

    private arm(Context context, apb apb, e eVar) {
        this.a = new baq();
        this.b = context;
        this.c = apb;
        this.i = eVar;
    }

    private final void b(String str) {
        if (this.f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    public final void a(a aVar) {
        try {
            this.d = aVar;
            if (this.f != null) {
                this.f.a((apv) aVar != null ? new aov(aVar) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the AdListener.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.reward.c cVar) {
        try {
            this.l = cVar;
            if (this.f != null) {
                this.f.a((cu) cVar != null ? new cz(cVar) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the AdListener.", e2);
        }
    }

    public final void a(aot aot) {
        try {
            this.e = aot;
            if (this.f != null) {
                this.f.a((aps) aot != null ? new aou(aot) : null);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set the AdClickListener.", e2);
        }
    }

    public final void a(ari ari) {
        try {
            if (this.f == null) {
                if (this.g == null) {
                    b("loadAd");
                }
                apc a2 = this.m ? apc.a() : new apc();
                apg b2 = app.b();
                Context context = this.b;
                this.f = (aqg) apg.a(context, false, new apj(b2, context, a2, this.g, this.a));
                if (this.d != null) {
                    this.f.a((apv) new aov(this.d));
                }
                if (this.e != null) {
                    this.f.a((aps) new aou(this.e));
                }
                if (this.h != null) {
                    this.f.a((aql) new ape(this.h));
                }
                if (this.j != null) {
                    this.f.a((atq) new att(this.j));
                }
                if (this.k != null) {
                    this.f.a((aqs) this.k.a());
                }
                if (this.l != null) {
                    this.f.a((cu) new cz(this.l));
                }
                this.f.c(this.n);
            }
            if (this.f.b(apb.a(this.b, ari))) {
                this.a.a(ari.j());
            }
        } catch (RemoteException e2) {
            jn.c("Failed to load ad.", e2);
        }
    }

    public final void a(String str) {
        if (this.g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.g = str;
    }

    public final void a(boolean z) {
        this.m = true;
    }

    public final boolean a() {
        try {
            if (this.f == null) {
                return false;
            }
            return this.f.l();
        } catch (RemoteException e2) {
            jn.c("Failed to check if ad is ready.", e2);
            return false;
        }
    }

    public final void b() {
        try {
            b("show");
            this.f.D();
        } catch (RemoteException e2) {
            jn.c("Failed to show interstitial.", e2);
        }
    }

    public final void b(boolean z) {
        try {
            this.n = z;
            if (this.f != null) {
                this.f.c(z);
            }
        } catch (RemoteException e2) {
            jn.c("Failed to set immersive mode", e2);
        }
    }
}
