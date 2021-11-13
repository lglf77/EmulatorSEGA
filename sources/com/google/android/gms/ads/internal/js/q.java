package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.aog;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.or;
import com.google.android.gms.internal.xr;
import java.util.Map;
import org.json.JSONObject;

@bfk
public final class q implements o {
    /* access modifiers changed from: private */
    public final mw a;
    private final Context b;

    public q(Context context, jp jpVar, xr xrVar, bq bqVar) {
        this.b = context;
        this.a = au.f().a(context, or.a(), "", false, false, xrVar, jpVar, (atj) null, (an) null, (bq) null, aog.a());
        mw mwVar = this.a;
        if (mwVar == null) {
            throw null;
        }
        ((View) mwVar).setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        app.a();
        if (jc.b()) {
            runnable.run();
        } else {
            gw.a.post(runnable);
        }
    }

    public final void a() {
        this.a.destroy();
    }

    public final void a(p pVar) {
        this.a.w().a((nb) new w(this, pVar));
    }

    public final void a(String str) {
        a((Runnable) new t(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void a(String str, aa<? super k> aaVar) {
        this.a.w().a(str, (aa<? super mw>) new x(this, aaVar));
    }

    public final void a(String str, Map<String, ?> map) {
        this.a.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public final l b() {
        return new m(this);
    }

    public final void b(String str) {
        a((Runnable) new v(this, str));
    }

    public final void b(String str, aa<? super k> aaVar) {
        this.a.w().a(str, (k<aa<? super mw>>) new r(aaVar));
    }

    public final void b(String str, JSONObject jSONObject) {
        a((Runnable) new s(this, str, jSONObject));
    }

    public final void c(String str) {
        a((Runnable) new u(this, str));
    }
}
