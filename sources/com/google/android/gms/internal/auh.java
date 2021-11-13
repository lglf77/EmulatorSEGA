package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.y;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@bfk
public final class auh extends aum {
    private bbe b;
    private bbh c;
    private final auj d;
    private aui e;
    private boolean f;
    private Object g;

    private auh(Context context, auj auj, xr xrVar, auk auk) {
        super(context, auj, (beq) null, xrVar, (JSONObject) null, auk, (jp) null, (String) null);
        this.f = false;
        this.g = new Object();
        this.d = auj;
    }

    public auh(Context context, auj auj, xr xrVar, bbe bbe, auk auk) {
        this(context, auj, xrVar, auk);
        this.b = bbe;
    }

    public auh(Context context, auj auj, xr xrVar, bbh bbh, auk auk) {
        this(context, auj, xrVar, auk);
        this.c = bbh;
    }

    public final View a(View.OnClickListener onClickListener, boolean z) {
        a aVar;
        synchronized (this.g) {
            if (this.e != null) {
                View a = this.e.a(onClickListener, z);
                return a;
            }
            try {
                if (this.b != null) {
                    aVar = this.b.n();
                } else {
                    if (this.c != null) {
                        aVar = this.c.k();
                    }
                    aVar = null;
                }
            } catch (RemoteException e2) {
                fn.c("Failed to call getAdChoicesContent", e2);
            }
            if (aVar == null) {
                return null;
            }
            View view = (View) c.a(aVar);
            return view;
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map) {
        y.b("recordImpression must be called on the main UI thread.");
        synchronized (this.g) {
            this.a = true;
            if (this.e != null) {
                this.e.a(view, map);
                this.d.W();
            } else {
                try {
                    if (this.b != null && !this.b.j()) {
                        this.b.i();
                        this.d.W();
                    } else if (this.c != null && !this.c.h()) {
                        this.c.g();
                        this.d.W();
                    }
                } catch (RemoteException e2) {
                    fn.c("Failed to call recordImpression", e2);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        y.b("performClick must be called on the main UI thread.");
        synchronized (this.g) {
            if (this.e != null) {
                this.e.a(view, map, bundle, view2);
                this.d.e();
            } else {
                try {
                    if (this.b != null && !this.b.k()) {
                        this.b.a(c.a(view));
                        this.d.e();
                    }
                    if (this.c != null && !this.c.i()) {
                        this.c.a(c.a(view));
                        this.d.e();
                    }
                } catch (RemoteException e2) {
                    fn.c("Failed to call performClick", e2);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.g) {
            this.f = true;
            try {
                if (this.b != null) {
                    this.b.b(c.a(view));
                } else if (this.c != null) {
                    this.c.b(c.a(view));
                }
            } catch (RemoteException e2) {
                fn.c("Failed to call prepareAd", e2);
            }
            this.f = false;
        }
    }

    public final void a(aui aui) {
        synchronized (this.g) {
            this.e = aui;
        }
    }

    public final boolean a() {
        boolean a;
        synchronized (this.g) {
            a = this.e != null ? this.e.a() : this.d.M();
        }
        return a;
    }

    public final void b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.g) {
            try {
                if (this.b != null) {
                    this.b.c(c.a(view));
                } else if (this.c != null) {
                    this.c.c(c.a(view));
                }
            } catch (RemoteException e2) {
                fn.c("Failed to call untrackView", e2);
            }
        }
    }

    public final boolean b() {
        boolean b2;
        synchronized (this.g) {
            b2 = this.e != null ? this.e.b() : this.d.N();
        }
        return b2;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    public final aui d() {
        aui aui;
        synchronized (this.g) {
            aui = this.e;
        }
        return aui;
    }

    public final mw e() {
        return null;
    }

    public final void f() {
    }

    public final void g() {
    }
}
