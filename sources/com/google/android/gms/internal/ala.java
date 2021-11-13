package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.js.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@bfk
public final class ala implements alm {
    private final Object a = new Object();
    private final WeakHashMap<ev, alb> b = new WeakHashMap<>();
    private final ArrayList<alb> c = new ArrayList<>();
    private final Context d;
    private final jp e;
    private final z f;

    public ala(Context context, jp jpVar) {
        this.d = context.getApplicationContext();
        this.e = jpVar;
        this.f = new z(context.getApplicationContext(), jpVar, (String) app.f().a(asw.a));
    }

    private final boolean e(ev evVar) {
        boolean z;
        synchronized (this.a) {
            alb alb = this.b.get(evVar);
            z = alb != null && alb.c();
        }
        return z;
    }

    public final void a(alb alb) {
        synchronized (this.a) {
            if (!alb.c()) {
                this.c.remove(alb);
                Iterator<Map.Entry<ev, alb>> it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == alb) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void a(apc apc, ev evVar) {
        mw mwVar = evVar.b;
        if (mwVar == null) {
            throw null;
        }
        a(apc, evVar, (View) mwVar);
    }

    public final void a(apc apc, ev evVar, View view) {
        a(apc, evVar, (amq) new alk(view, evVar), (mw) null);
    }

    public final void a(apc apc, ev evVar, View view, mw mwVar) {
        a(apc, evVar, (amq) new alk(view, evVar), mwVar);
    }

    public final void a(apc apc, ev evVar, amq amq, mw mwVar) {
        alb alb;
        synchronized (this.a) {
            if (e(evVar)) {
                alb = this.b.get(evVar);
            } else {
                alb = new alb(this.d, apc, evVar, this.e, amq);
                alb.a((alm) this);
                this.b.put(evVar, alb);
                this.c.add(alb);
            }
            if (mwVar != null) {
                alb.a((ama) new aln(alb, mwVar));
            } else {
                alb.a((ama) new alr(alb, this.f, this.d));
            }
        }
    }

    public final void a(ev evVar) {
        synchronized (this.a) {
            alb alb = this.b.get(evVar);
            if (alb != null) {
                alb.b();
            }
        }
    }

    public final void b(ev evVar) {
        synchronized (this.a) {
            alb alb = this.b.get(evVar);
            if (alb != null) {
                alb.d();
            }
        }
    }

    public final void c(ev evVar) {
        synchronized (this.a) {
            alb alb = this.b.get(evVar);
            if (alb != null) {
                alb.e();
            }
        }
    }

    public final void d(ev evVar) {
        synchronized (this.a) {
            alb alb = this.b.get(evVar);
            if (alb != null) {
                alb.f();
            }
        }
    }
}
