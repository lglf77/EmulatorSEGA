package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.js.b;
import com.google.android.gms.ads.internal.js.k;
import com.google.android.gms.ads.internal.js.z;
import org.json.JSONObject;

@bfk
public final class alr implements ama {
    /* access modifiers changed from: private */
    public final alb a;
    private final Context b;
    /* access modifiers changed from: private */
    public final ag c;
    private b d;
    /* access modifiers changed from: private */
    public boolean e;
    private final aa<k> f = new alw(this);
    private final aa<k> g = new alx(this);
    private final aa<k> h = new aly(this);
    private final aa<k> i = new alz(this);

    public alr(alb alb, z zVar, Context context) {
        this.a = alb;
        this.b = context;
        this.c = new ag(this.b);
        this.d = zVar.b((xr) null);
        this.d.a(new als(this), new alt(this));
        String valueOf = String.valueOf(this.a.a.d());
        fn.b(valueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(valueOf) : new String("Core JS tracking ad unit: "));
    }

    /* access modifiers changed from: package-private */
    public final void a(k kVar) {
        kVar.a("/updateActiveView", this.f);
        kVar.a("/untrackActiveViewUnit", this.g);
        kVar.a("/visibilityChanged", this.h);
        if (au.z().a(this.b)) {
            kVar.a("/logScionEvent", this.i);
        }
    }

    public final void a(JSONObject jSONObject, boolean z) {
        this.d.a(new alu(this, jSONObject), new kw());
    }

    public final boolean a() {
        return this.e;
    }

    public final void b() {
        this.d.a(new alv(this), new kw());
        this.d.a();
    }

    /* access modifiers changed from: package-private */
    public final void b(k kVar) {
        kVar.b("/visibilityChanged", this.h);
        kVar.b("/untrackActiveViewUnit", this.g);
        kVar.b("/updateActiveView", this.f);
        if (au.z().a(this.b)) {
            kVar.b("/logScionEvent", this.i);
        }
    }
}
