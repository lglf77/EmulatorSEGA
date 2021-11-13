package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

@bfk
public abstract class p implements hp<Void>, n {
    private final ku<v> a;
    private final n b;
    private final Object c = new Object();

    public p(ku<v> kuVar, n nVar) {
        this.a = kuVar;
        this.b = nVar;
    }

    public abstract void a();

    public final void a(z zVar) {
        synchronized (this.c) {
            this.b.a(zVar);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ae aeVar, v vVar) {
        try {
            aeVar.a(vVar, (ah) new y(this));
            return true;
        } catch (Throwable th) {
            fn.c("Could not fetch ad response from ad request service due to an Exception.", th);
            au.i().a(th, "AdRequestClientTask.getAdResponseFromService");
            this.b.a(new z(0));
            return false;
        }
    }

    public abstract ae b();

    public final void c() {
        a();
    }

    public final /* synthetic */ Object d() {
        ae b2 = b();
        if (b2 == null) {
            this.b.a(new z(0));
            a();
        } else {
            this.a.a(new q(this, b2), new r(this));
        }
        return null;
    }
}
