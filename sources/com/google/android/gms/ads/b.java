package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.g;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.aov;
import com.google.android.gms.internal.apb;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.apy;
import com.google.android.gms.internal.aqb;
import com.google.android.gms.internal.ari;
import com.google.android.gms.internal.auv;
import com.google.android.gms.internal.awi;
import com.google.android.gms.internal.awl;
import com.google.android.gms.internal.axd;
import com.google.android.gms.internal.axe;
import com.google.android.gms.internal.axf;
import com.google.android.gms.internal.axg;
import com.google.android.gms.internal.baq;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.jn;

public class b {
    private final apb a;
    private final Context b;
    private final apy c;

    public static class a {
        private final Context a;
        private final aqb b;

        private a(Context context, aqb aqb) {
            this.a = context;
            this.b = aqb;
        }

        public a(Context context, String str) {
            this((Context) y.a(context, (Object) "context cannot be null"), app.b().a(context, str, (bar) new baq()));
        }

        public a a(a aVar) {
            try {
                this.b.a((apv) new aov(aVar));
            } catch (RemoteException e) {
                jn.c("Failed to set AdListener.", e);
            }
            return this;
        }

        public a a(d dVar) {
            try {
                this.b.a(new auv(dVar));
            } catch (RemoteException e) {
                jn.c("Failed to specify native ad options", e);
            }
            return this;
        }

        public a a(g.a aVar) {
            try {
                this.b.a((awi) new axd(aVar));
            } catch (RemoteException e) {
                jn.c("Failed to add app install ad listener", e);
            }
            return this;
        }

        public a a(h.a aVar) {
            try {
                this.b.a((awl) new axe(aVar));
            } catch (RemoteException e) {
                jn.c("Failed to add content ad listener", e);
            }
            return this;
        }

        public a a(String str, i.b bVar, i.a aVar) {
            try {
                this.b.a(str, new axg(bVar), aVar == null ? null : new axf(aVar));
            } catch (RemoteException e) {
                jn.c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public b a() {
            try {
                return new b(this.a, this.b.a());
            } catch (RemoteException e) {
                jn.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    b(Context context, apy apy) {
        this(context, apy, apb.a);
    }

    private b(Context context, apy apy, apb apb) {
        this.b = context;
        this.c = apy;
        this.a = apb;
    }

    private final void a(ari ari) {
        try {
            this.c.a(apb.a(this.b, ari));
        } catch (RemoteException e) {
            jn.b("Failed to load ad.", e);
        }
    }

    public void a(c cVar) {
        a(cVar.a());
    }
}
