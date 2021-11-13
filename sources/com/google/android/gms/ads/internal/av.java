package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.c.f;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.aps;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.aql;
import com.google.android.gms.internal.aqs;
import com.google.android.gms.internal.arg;
import com.google.android.gms.internal.asf;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.auv;
import com.google.android.gms.internal.awi;
import com.google.android.gms.internal.awl;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.awr;
import com.google.android.gms.internal.awy;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.cu;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.fg;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mx;
import com.google.android.gms.internal.xn;
import com.google.android.gms.internal.xr;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@bfk
public final class av implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    cu A;
    public String B;
    List<String> C;
    public fg D;
    View E;
    public int F;
    boolean G;
    private HashSet<ex> H;
    private int I;
    private int J;
    private it K;
    private boolean L;
    private boolean M;
    private boolean N;
    final String a;
    public String b;
    public final Context c;
    final xr d;
    public final jp e;
    aw f;
    public fj g;
    public hp h;
    public apc i;
    public ev j;
    public ew k;
    public ex l;
    aps m;
    apv n;
    aql o;
    aqs p;
    awi q;
    awl r;
    f<String, awo> s;
    f<String, awr> t;
    auv u;
    asf v;
    arg w;
    awy x;
    List<Integer> y;
    atq z;

    public av(Context context, apc apc, String str, jp jpVar) {
        this(context, apc, str, jpVar, (xr) null);
    }

    private av(Context context, apc apc, String str, jp jpVar, xr xrVar) {
        this.D = null;
        this.E = null;
        this.F = 0;
        this.G = false;
        this.H = null;
        this.I = -1;
        this.J = -1;
        this.L = true;
        this.M = true;
        this.N = false;
        asw.a(context);
        if (au.i().e() != null) {
            List<String> b2 = asw.b();
            if (jpVar.b != 0) {
                b2.add(Integer.toString(jpVar.b));
            }
            au.i().e().a(b2);
        }
        this.a = UUID.randomUUID().toString();
        if (apc.d || apc.h) {
            this.f = null;
        } else {
            this.f = new aw(context, str, jpVar.a, this, this);
            this.f.setMinimumWidth(apc.f);
            this.f.setMinimumHeight(apc.c);
            this.f.setVisibility(4);
        }
        this.i = apc;
        this.b = str;
        this.c = context;
        this.e = jpVar;
        this.d = new xr(new g(this));
        this.K = new it(200);
        this.t = new f<>();
    }

    private final void b(boolean z2) {
        View findViewById;
        boolean z3 = true;
        if (this.f != null && this.j != null && this.j.b != null && this.j.b.w() != null) {
            if (!z2 || this.K.a()) {
                if (this.j.b.w().b()) {
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    app.a();
                    int b2 = jc.b(this.c, iArr[0]);
                    app.a();
                    int b3 = jc.b(this.c, iArr[1]);
                    if (!(b2 == this.I && b3 == this.J)) {
                        this.I = b2;
                        this.J = b3;
                        mx w2 = this.j.b.w();
                        int i2 = this.I;
                        int i3 = this.J;
                        if (z2) {
                            z3 = false;
                        }
                        w2.a(i2, i3, z3);
                    }
                }
                if (this.f != null && (findViewById = this.f.getRootView().findViewById(16908290)) != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.f.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.L = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.M = false;
                    }
                }
            }
        }
    }

    public final HashSet<ex> a() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        xn a2;
        if (((Boolean) app.f().a(asw.bt)).booleanValue() && (a2 = this.d.a()) != null) {
            a2.a(view);
        }
    }

    public final void a(HashSet<ex> hashSet) {
        this.H = hashSet;
    }

    public final void a(boolean z2) {
        if (!(this.F != 0 || this.j == null || this.j.b == null)) {
            this.j.b.stopLoading();
        }
        if (this.g != null) {
            this.g.c();
        }
        if (this.h != null) {
            this.h.c();
        }
        if (z2) {
            this.j = null;
        }
    }

    public final void b() {
        if (this.j != null && this.j.b != null) {
            this.j.b.destroy();
        }
    }

    public final void c() {
        if (this.j != null && this.j.o != null) {
            try {
                this.j.o.c();
            } catch (RemoteException e2) {
                fn.e("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean d() {
        return this.F == 0;
    }

    public final boolean e() {
        return this.F == 1;
    }

    public final String f() {
        return (!this.L || !this.M) ? this.L ? this.N ? "top-scrollable" : "top-locked" : this.M ? this.N ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    public final void onGlobalLayout() {
        b(false);
    }

    public final void onScrollChanged() {
        b(true);
        this.N = true;
    }
}
