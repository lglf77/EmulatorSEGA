package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.aoi;
import org.json.JSONObject;

@bfk
public final class bfn extends fj implements n {
    hp a;
    private final bfm b;
    /* access modifiers changed from: private */
    public final w c;
    /* access modifiers changed from: private */
    public final Object d = new Object();
    private final Context e;
    private final aog f;
    private final aol g;
    private v h;
    /* access modifiers changed from: private */
    public Runnable i;
    private z j;
    private bac k;

    public bfn(Context context, w wVar, bfm bfm, aol aol) {
        this.b = bfm;
        this.e = context;
        this.c = wVar;
        this.g = aol;
        this.f = new aog(this.g, ((Boolean) app.f().a(asw.cJ)).booleanValue());
        this.f.a((aoh) new bfo(this));
        aos aos = new aos();
        aos.a = Integer.valueOf(this.c.j.b);
        aos.b = Integer.valueOf(this.c.j.c);
        aos.c = Integer.valueOf(this.c.j.d ? 0 : 2);
        this.f.a((aoh) new c(aos));
        if (this.c.f != null) {
            this.f.a((aoh) new d(this));
        }
        apc apc = this.c.c;
        if (apc.d && "interstitial_mb".equals(apc.a)) {
            this.f.a(e.a);
        } else if (apc.d && "reward_mb".equals(apc.a)) {
            this.f.a(f.a);
        } else if (apc.h || apc.d) {
            this.f.a(h.a);
        } else {
            this.f.a(g.a);
        }
        this.f.a(aoi.a.b.AD_REQUEST);
    }

    private final apc a(v vVar) {
        boolean z = true;
        if (this.h == null || this.h.V == null || this.h.V.size() <= 1) {
            z = false;
        }
        if (z && this.k != null && !this.k.s) {
            return null;
        }
        if (this.j.y) {
            for (apc apc : vVar.d.g) {
                if (apc.i) {
                    return new apc(apc, vVar.d.g);
                }
            }
        }
        if (this.j.l == null) {
            throw new k("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.j.l.split("x");
        if (split.length != 2) {
            String valueOf = String.valueOf(this.j.l);
            throw new k(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (apc apc2 : vVar.d.g) {
                float f2 = this.e.getResources().getDisplayMetrics().density;
                int i2 = apc2.e == -1 ? (int) (((float) apc2.f) / f2) : apc2.e;
                int i3 = apc2.b == -2 ? (int) (((float) apc2.c) / f2) : apc2.b;
                if (parseInt == i2 && parseInt2 == i3 && !apc2.i) {
                    return new apc(apc2, vVar.d.g);
                }
            }
            String valueOf2 = String.valueOf(this.j.l);
            throw new k(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
        } catch (NumberFormatException e2) {
            String valueOf3 = String.valueOf(this.j.l);
            throw new k(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
        }
    }

    /* access modifiers changed from: private */
    public final void a(int i2, String str) {
        if (i2 == 3 || i2 == -1) {
            fn.d(str);
        } else {
            fn.e(str);
        }
        if (this.j == null) {
            this.j = new z(i2);
        } else {
            this.j = new z(i2, this.j.j);
        }
        this.b.a(new ew(this.h != null ? this.h : new v(this.c, -1, (String) null, (String) null, (String) null), this.j, this.k, (apc) null, i2, -1, this.j.m, (JSONObject) null, this.f, (Boolean) null));
    }

    /* access modifiers changed from: package-private */
    public final hp a(jp jpVar, ku<v> kuVar) {
        Context context = this.e;
        if (new m(context).a(jpVar)) {
            fn.b("Fetching ad response from local ad request service.");
            s sVar = new s(context, kuVar, this);
            sVar.d();
            return sVar;
        }
        fn.b("Fetching ad response from remote ad request service.");
        app.a();
        if (jc.c(context)) {
            return new t(context, jpVar, kuVar, this);
        }
        fn.e("Failed to connect to remote ad request service.");
        return null;
    }

    public final void a() {
        String string;
        fn.b("AdLoaderBackgroundTask started.");
        this.i = new i(this);
        gw.a.postDelayed(this.i, ((Long) app.f().a(asw.bm)).longValue());
        long b2 = au.k().b();
        if (!((Boolean) app.f().a(asw.bk)).booleanValue() || this.c.b.c == null || (string = this.c.b.c.getString("_ad")) == null) {
            ky kyVar = new ky();
            gq.a((Runnable) new j(this, kyVar));
            String g2 = au.z().g(this.e);
            String h2 = au.z().h(this.e);
            String i2 = au.z().i(this.e);
            au.z().f(this.e, i2);
            this.h = new v(this.c, b2, g2, h2, i2);
            kyVar.a(this.h);
            return;
        }
        this.h = new v(this.c, b2, (String) null, (String) null, (String) null);
        a(bk.a(this.e, this.h, string));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(aor aor) {
        aor.c.a = this.c.f.packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.z r14) {
        /*
            r13 = this;
            r5 = -2
            r10 = -3
            r9 = 1
            r1 = 0
            r8 = 0
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.fn.b(r0)
            r13.j = r14
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.au.k()
            long r6 = r0.b()
            java.lang.Object r2 = r13.d
            monitor-enter(r2)
            r0 = 0
            r13.a = r0     // Catch:{ all -> 0x00b6 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()
            android.content.Context r2 = r13.e
            com.google.android.gms.internal.z r3 = r13.j
            boolean r3 = r3.F
            r0.b(r2, r3)
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.aF
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.internal.z r0 = r13.j
            boolean r0 = r0.N
            if (r0 == 0) goto L_0x00b9
            com.google.android.gms.ads.internal.au.i()
            android.content.Context r0 = r13.e
            com.google.android.gms.internal.v r2 = r13.h
            java.lang.String r2 = r2.e
            java.lang.String r3 = "admob"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r8)
            java.util.Set r3 = java.util.Collections.emptySet()
            java.lang.String r4 = "never_pool_slots"
            java.util.Set r3 = r0.getStringSet(r4, r3)
            boolean r4 = r3.contains(r2)
            if (r4 != 0) goto L_0x0073
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            r4.add(r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "never_pool_slots"
            r0.putStringSet(r2, r4)
            r0.apply()
        L_0x0073:
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            int r0 = r0.d     // Catch:{ k -> 0x00a2 }
            if (r0 == r5) goto L_0x00ed
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            int r0 = r0.d     // Catch:{ k -> 0x00a2 }
            if (r0 == r10) goto L_0x00ed
            com.google.android.gms.internal.k r0 = new com.google.android.gms.internal.k     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.z r1 = r13.j     // Catch:{ k -> 0x00a2 }
            int r1 = r1.d     // Catch:{ k -> 0x00a2 }
            r2 = 66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ k -> 0x00a2 }
            r3.<init>(r2)     // Catch:{ k -> 0x00a2 }
            java.lang.String r2 = "There was a problem getting an ad response. ErrorCode: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ k -> 0x00a2 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ k -> 0x00a2 }
            java.lang.String r1 = r1.toString()     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.z r2 = r13.j     // Catch:{ k -> 0x00a2 }
            int r2 = r2.d     // Catch:{ k -> 0x00a2 }
            r0.<init>(r1, r2)     // Catch:{ k -> 0x00a2 }
            throw r0     // Catch:{ k -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            int r1 = r0.a()
            java.lang.String r0 = r0.getMessage()
            r13.a((int) r1, (java.lang.String) r0)
            android.os.Handler r0 = com.google.android.gms.internal.gw.a
            java.lang.Runnable r1 = r13.i
            r0.removeCallbacks(r1)
        L_0x00b5:
            return
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
            throw r0
        L_0x00b9:
            com.google.android.gms.ads.internal.au.i()
            android.content.Context r0 = r13.e
            com.google.android.gms.internal.v r2 = r13.h
            java.lang.String r2 = r2.e
            java.lang.String r3 = "admob"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r8)
            java.util.Set r3 = java.util.Collections.emptySet()
            java.lang.String r4 = "never_pool_slots"
            java.util.Set r3 = r0.getStringSet(r4, r3)
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L_0x0073
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            r4.remove(r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "never_pool_slots"
            r0.putStringSet(r2, r4)
            r0.apply()
            goto L_0x0073
        L_0x00ed:
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            int r0 = r0.d     // Catch:{ k -> 0x00a2 }
            if (r0 == r10) goto L_0x0165
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            java.lang.String r0 = r0.b     // Catch:{ k -> 0x00a2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ k -> 0x00a2 }
            if (r0 == 0) goto L_0x0106
            com.google.android.gms.internal.k r0 = new com.google.android.gms.internal.k     // Catch:{ k -> 0x00a2 }
            java.lang.String r1 = "No fill from ad server."
            r2 = 3
            r0.<init>(r1, r2)     // Catch:{ k -> 0x00a2 }
            throw r0     // Catch:{ k -> 0x00a2 }
        L_0x0106:
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ k -> 0x00a2 }
            android.content.Context r2 = r13.e     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.z r3 = r13.j     // Catch:{ k -> 0x00a2 }
            boolean r3 = r3.t     // Catch:{ k -> 0x00a2 }
            r0.a((android.content.Context) r2, (boolean) r3)     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            boolean r0 = r0.g     // Catch:{ k -> 0x00a2 }
            if (r0 == 0) goto L_0x0216
            com.google.android.gms.internal.bac r0 = new com.google.android.gms.internal.bac     // Catch:{ JSONException -> 0x01ef }
            com.google.android.gms.internal.z r2 = r13.j     // Catch:{ JSONException -> 0x01ef }
            java.lang.String r2 = r2.b     // Catch:{ JSONException -> 0x01ef }
            r0.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x01ef }
            r13.k = r0     // Catch:{ JSONException -> 0x01ef }
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ JSONException -> 0x01ef }
            com.google.android.gms.internal.bac r2 = r13.k     // Catch:{ JSONException -> 0x01ef }
            boolean r2 = r2.g     // Catch:{ JSONException -> 0x01ef }
            r0.c(r2)     // Catch:{ JSONException -> 0x01ef }
        L_0x012f:
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            java.lang.String r0 = r0.G     // Catch:{ k -> 0x00a2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ k -> 0x00a2 }
            if (r0 != 0) goto L_0x0165
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.cm     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ k -> 0x00a2 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ k -> 0x00a2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ k -> 0x00a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ k -> 0x00a2 }
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.fn.b(r0)     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.hc r0 = com.google.android.gms.ads.internal.au.g()     // Catch:{ k -> 0x00a2 }
            android.content.Context r2 = r13.e     // Catch:{ k -> 0x00a2 }
            android.webkit.CookieManager r0 = r0.c((android.content.Context) r2)     // Catch:{ k -> 0x00a2 }
            if (r0 == 0) goto L_0x0165
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.z r3 = r13.j     // Catch:{ k -> 0x00a2 }
            java.lang.String r3 = r3.G     // Catch:{ k -> 0x00a2 }
            r0.setCookie(r2, r3)     // Catch:{ k -> 0x00a2 }
        L_0x0165:
            com.google.android.gms.internal.v r0 = r13.h     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.apc r0 = r0.d     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.apc[] r0 = r0.g     // Catch:{ k -> 0x00a2 }
            if (r0 == 0) goto L_0x022e
            com.google.android.gms.internal.v r0 = r13.h     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.apc r4 = r13.a((com.google.android.gms.internal.v) r0)     // Catch:{ k -> 0x00a2 }
        L_0x0173:
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()
            com.google.android.gms.internal.z r2 = r13.j
            boolean r2 = r2.u
            r0.a((boolean) r2)
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()
            com.google.android.gms.internal.z r2 = r13.j
            boolean r2 = r2.M
            r0.b((boolean) r2)
            com.google.android.gms.internal.z r0 = r13.j
            java.lang.String r0 = r0.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0229
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0223 }
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = r0.q     // Catch:{ Exception -> 0x0223 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0223 }
        L_0x019c:
            com.google.android.gms.internal.z r0 = r13.j
            int r0 = r0.P
            r2 = 2
            if (r0 != r2) goto L_0x01b1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            com.google.android.gms.ads.internal.au.e()
            com.google.android.gms.internal.v r0 = r13.h
            com.google.android.gms.internal.aoy r0 = r0.c
            com.google.android.gms.internal.gw.a((com.google.android.gms.internal.aoy) r0, (boolean) r9)
        L_0x01b1:
            com.google.android.gms.internal.z r0 = r13.j
            int r0 = r0.P
            if (r0 != r9) goto L_0x01bb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
        L_0x01bb:
            com.google.android.gms.internal.z r0 = r13.j
            int r0 = r0.P
            if (r0 != 0) goto L_0x022c
            com.google.android.gms.ads.internal.au.e()
            com.google.android.gms.internal.v r0 = r13.h
            com.google.android.gms.internal.aoy r0 = r0.c
            boolean r0 = com.google.android.gms.internal.gw.a((com.google.android.gms.internal.aoy) r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x01d0:
            com.google.android.gms.internal.ew r0 = new com.google.android.gms.internal.ew
            com.google.android.gms.internal.v r1 = r13.h
            com.google.android.gms.internal.z r2 = r13.j
            com.google.android.gms.internal.bac r3 = r13.k
            com.google.android.gms.internal.z r8 = r13.j
            long r8 = r8.m
            com.google.android.gms.internal.aog r11 = r13.f
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.bfm r1 = r13.b
            r1.a(r0)
            android.os.Handler r0 = com.google.android.gms.internal.gw.a
            java.lang.Runnable r1 = r13.i
            r0.removeCallbacks(r1)
            goto L_0x00b5
        L_0x01ef:
            r0 = move-exception
            java.lang.String r1 = "Could not parse mediation config."
            com.google.android.gms.internal.fn.b(r1, r0)     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.k r1 = new com.google.android.gms.internal.k     // Catch:{ k -> 0x00a2 }
            java.lang.String r2 = "Could not parse mediation config: "
            com.google.android.gms.internal.z r0 = r13.j     // Catch:{ k -> 0x00a2 }
            java.lang.String r0 = r0.b     // Catch:{ k -> 0x00a2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ k -> 0x00a2 }
            int r3 = r0.length()     // Catch:{ k -> 0x00a2 }
            if (r3 == 0) goto L_0x0210
            java.lang.String r0 = r2.concat(r0)     // Catch:{ k -> 0x00a2 }
        L_0x020b:
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ k -> 0x00a2 }
            throw r1     // Catch:{ k -> 0x00a2 }
        L_0x0210:
            java.lang.String r0 = new java.lang.String     // Catch:{ k -> 0x00a2 }
            r0.<init>(r2)     // Catch:{ k -> 0x00a2 }
            goto L_0x020b
        L_0x0216:
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ k -> 0x00a2 }
            com.google.android.gms.internal.z r2 = r13.j     // Catch:{ k -> 0x00a2 }
            boolean r2 = r2.I     // Catch:{ k -> 0x00a2 }
            r0.c(r2)     // Catch:{ k -> 0x00a2 }
            goto L_0x012f
        L_0x0223:
            r0 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.fn.b(r2, r0)
        L_0x0229:
            r10 = r1
            goto L_0x019c
        L_0x022c:
            r12 = r1
            goto L_0x01d0
        L_0x022e:
            r4 = r1
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bfn.a(com.google.android.gms.internal.z):void");
    }

    public final void b() {
        synchronized (this.d) {
            if (this.a != null) {
                this.a.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(aor aor) {
        aor.a = this.c.v;
    }
}
