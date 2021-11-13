package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.av;
import com.google.android.gms.ads.internal.ay;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class cj extends ay implements dl {
    private static cj j;
    private static final baq k = new baq();
    private final Map<String, dr> l = new HashMap();
    private boolean m;
    private boolean n;
    private el o;

    public cj(Context context, bq bqVar, apc apc, bar bar, jp jpVar) {
        super(context, apc, (String) null, bar, jpVar, bqVar);
        j = this;
        this.o = new el(context, (String) null);
    }

    public static cj E() {
        return j;
    }

    private static ew b(ew ewVar) {
        fn.a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = bk.a(ewVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ewVar.a.e);
            return new ew(ewVar.a, ewVar.b, new bac(Arrays.asList(new bab[]{new bab(jSONObject, (String) null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), (String) null, Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1)}), ((Long) app.f().a(asw.bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, (String) null, 0, -1, -1, false), ewVar.d, ewVar.e, ewVar.f, ewVar.g, ewVar.h, ewVar.i, (Boolean) null);
        } catch (JSONException e) {
            fn.b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new ew(ewVar.a, ewVar.b, (bac) null, ewVar.d, 0, ewVar.f, ewVar.g, ewVar.h, ewVar.i, (Boolean) null);
        }
    }

    public final void F() {
        y.b("showAd must be called on the main UI thread.");
        if (!G()) {
            fn.e("The reward video has not loaded.");
            return;
        }
        this.m = true;
        dr b = b(this.e.j.p);
        if (b != null && b.a() != null) {
            try {
                b.a().a(this.n);
                b.a().f();
            } catch (RemoteException e) {
                fn.c("Could not call showVideo.", e);
            }
        }
    }

    public final boolean G() {
        y.b("isLoaded must be called on the main UI thread.");
        return this.e.g == null && this.e.h == null && this.e.j != null && !this.m;
    }

    public final void H() {
        if (au.z().e(this.e.c)) {
            this.o.a(true);
        }
        a(this.e.j, false);
        u();
    }

    public final void I() {
        if (!(this.e.j == null || this.e.j.n == null)) {
            au.v();
            bak.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, this.e.j.n.k);
        }
        y();
    }

    public final void J() {
        if (au.z().e(this.e.c)) {
            this.o.a(false);
        }
        s();
    }

    public final void K() {
        e();
    }

    public final void L() {
        t();
    }

    public final void a(Context context) {
        for (dr a : this.l.values()) {
            try {
                a.a().a(c.a(context));
            } catch (RemoteException e) {
                fn.b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public final void a(da daVar) {
        y.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(daVar.b)) {
            fn.e("Invalid ad unit id. Aborting.");
            gw.a.post(new ck(this));
            return;
        }
        this.m = false;
        this.e.b = daVar.b;
        this.o.a(daVar.b);
        super.b(daVar.a);
    }

    public final void a(dw dwVar) {
        if (!(this.e.j == null || this.e.j.q == null || TextUtils.isEmpty(this.e.j.q.j))) {
            dwVar = new dw(this.e.j.q.j, this.e.j.q.k);
        }
        if (!(this.e.j == null || this.e.j.n == null)) {
            au.v();
            bak.a(this.e.c, this.e.e.a, this.e.j.n.l, this.e.B, dwVar);
        }
        if (au.z().e(this.e.c) && dwVar != null) {
            au.z().a(this.e.c, au.z().i(this.e.c), this.e.b, dwVar.a, dwVar.b);
        }
        b(dwVar);
    }

    public final void a(ew ewVar, atj atj) {
        if (ewVar.e != -2) {
            gw.a.post(new cl(this, ewVar));
            return;
        }
        this.e.k = ewVar;
        if (ewVar.c == null) {
            this.e.k = b(ewVar);
        }
        this.e.F = 0;
        av avVar = this.e;
        au.d();
        Cdo doVar = new Cdo(this.e.c, this.e.k, this);
        String valueOf = String.valueOf(doVar.getClass().getName());
        fn.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        doVar.d();
        avVar.h = doVar;
    }

    /* access modifiers changed from: protected */
    public final boolean a(aoy aoy, ev evVar, boolean z) {
        return false;
    }

    public final boolean a(ev evVar, ev evVar2) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.dr b(java.lang.String r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.dr> r0 = r5.l
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.dr r0 = (com.google.android.gms.internal.dr) r0
            if (r0 != 0) goto L_0x0026
            com.google.android.gms.internal.bar r1 = r5.i     // Catch:{ Exception -> 0x0027 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x0027 }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.internal.baq r1 = k     // Catch:{ Exception -> 0x0027 }
            r2 = r1
        L_0x0017:
            com.google.android.gms.internal.dr r1 = new com.google.android.gms.internal.dr     // Catch:{ Exception -> 0x0027 }
            com.google.android.gms.internal.bav r2 = r2.a(r6)     // Catch:{ Exception -> 0x0027 }
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x0027 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.dr> r0 = r5.l     // Catch:{ Exception -> 0x0045 }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x0045 }
            r0 = r1
        L_0x0026:
            return r0
        L_0x0027:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x002a:
            java.lang.String r3 = "Fail to instantiate adapter "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x003f
            java.lang.String r0 = r3.concat(r0)
        L_0x003a:
            com.google.android.gms.internal.fn.c(r0, r2)
            r0 = r1
            goto L_0x0026
        L_0x003f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x003a
        L_0x0045:
            r0 = move-exception
            r2 = r0
            goto L_0x002a
        L_0x0048:
            r2 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cj.b(java.lang.String):com.google.android.gms.internal.dr");
    }

    public final void c(boolean z) {
        y.b("setImmersiveMode must be called on the main UI thread.");
        this.n = z;
    }

    public final void i() {
        y.b("destroy must be called on the main UI thread.");
        for (String next : this.l.keySet()) {
            try {
                dr drVar = this.l.get(next);
                if (!(drVar == null || drVar.a() == null)) {
                    drVar.a().c();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(next);
                fn.e(valueOf.length() != 0 ? "Fail to destroy adapter: ".concat(valueOf) : new String("Fail to destroy adapter: "));
            }
        }
    }

    public final void n() {
        y.b("pause must be called on the main UI thread.");
        for (String next : this.l.keySet()) {
            try {
                dr drVar = this.l.get(next);
                if (!(drVar == null || drVar.a() == null)) {
                    drVar.a().d();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(next);
                fn.e(valueOf.length() != 0 ? "Fail to pause adapter: ".concat(valueOf) : new String("Fail to pause adapter: "));
            }
        }
    }

    public final void o() {
        y.b("resume must be called on the main UI thread.");
        for (String next : this.l.keySet()) {
            try {
                dr drVar = this.l.get(next);
                if (!(drVar == null || drVar.a() == null)) {
                    drVar.a().e();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(next);
                fn.e(valueOf.length() != 0 ? "Fail to resume adapter: ".concat(valueOf) : new String("Fail to resume adapter: "));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void s() {
        this.e.j = null;
        super.s();
    }
}
