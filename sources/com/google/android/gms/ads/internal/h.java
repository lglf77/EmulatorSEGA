package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.c.f;
import com.google.android.gms.ads.b.j;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.apz;
import com.google.android.gms.internal.aqs;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.auv;
import com.google.android.gms.internal.awi;
import com.google.android.gms.internal.awl;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.awr;
import com.google.android.gms.internal.awv;
import com.google.android.gms.internal.awy;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class h extends apz {
    private final Context a;
    private final apv b;
    private final bar c;
    private final awi d;
    private final awv e;
    private final awl f;
    private final awy g;
    private final apc h;
    private final j i;
    private final f<String, awr> j;
    private final f<String, awo> k;
    private final auv l;
    private final List<String> m;
    private final aqs n;
    private final String o;
    private final jp p;
    private WeakReference<ay> q;
    private final bq r;
    /* access modifiers changed from: private */
    public final Object s = new Object();

    h(Context context, String str, bar bar, jp jpVar, apv apv, awi awi, awv awv, awl awl, f<String, awr> fVar, f<String, awo> fVar2, auv auv, aqs aqs, bq bqVar, awy awy, apc apc, j jVar) {
        this.a = context;
        this.o = str;
        this.c = bar;
        this.p = jpVar;
        this.b = apv;
        this.f = awl;
        this.d = awi;
        this.e = awv;
        this.j = fVar;
        this.k = fVar2;
        this.l = auv;
        this.m = f();
        this.n = aqs;
        this.r = bqVar;
        this.g = awy;
        this.h = apc;
        this.i = jVar;
        asw.a(this.a);
    }

    private static void a(Runnable runnable) {
        gw.a.post(runnable);
    }

    /* access modifiers changed from: private */
    public final void b(aoy aoy) {
        bl blVar = new bl(this.a, this.r, this.h, this.o, this.c, this.p);
        this.q = new WeakReference<>(blVar);
        awy awy = this.g;
        y.b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        blVar.e.x = awy;
        if (this.i != null) {
            if (this.i.b() != null) {
                blVar.a(this.i.b());
            }
            blVar.b(this.i.a());
        }
        awi awi = this.d;
        y.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        blVar.e.q = awi;
        awl awl = this.f;
        y.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        blVar.e.r = awl;
        f<String, awr> fVar = this.j;
        y.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        blVar.e.t = fVar;
        f<String, awo> fVar2 = this.k;
        y.b("setOnCustomClickListener must be called on the main UI thread.");
        blVar.e.s = fVar2;
        auv auv = this.l;
        y.b("setNativeAdOptions must be called on the main UI thread.");
        blVar.e.u = auv;
        blVar.b(f());
        blVar.a(this.b);
        blVar.a(this.n);
        ArrayList arrayList = new ArrayList();
        if (e()) {
            arrayList.add(1);
        }
        if (this.g != null) {
            arrayList.add(2);
        }
        blVar.c(arrayList);
        if (e()) {
            aoy.c.putBoolean("ina", true);
        }
        if (this.g != null) {
            aoy.c.putBoolean("iba", true);
        }
        blVar.b(aoy);
    }

    /* access modifiers changed from: private */
    public final void b(aoy aoy, int i2) {
        ac acVar = new ac(this.a, this.r, apc.a(this.a), this.o, this.c, this.p);
        this.q = new WeakReference<>(acVar);
        awi awi = this.d;
        y.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        acVar.e.q = awi;
        awl awl = this.f;
        y.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        acVar.e.r = awl;
        f<String, awr> fVar = this.j;
        y.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        acVar.e.t = fVar;
        acVar.a(this.b);
        f<String, awo> fVar2 = this.k;
        y.b("setOnCustomClickListener must be called on the main UI thread.");
        acVar.e.s = fVar2;
        acVar.b(f());
        auv auv = this.l;
        y.b("setNativeAdOptions must be called on the main UI thread.");
        acVar.e.u = auv;
        acVar.a(this.n);
        acVar.b(i2);
        acVar.b(aoy);
    }

    /* access modifiers changed from: private */
    public final boolean d() {
        return ((Boolean) app.f().a(asw.aA)).booleanValue() && this.g != null;
    }

    private final boolean e() {
        return (this.d == null && this.f == null && (this.j == null || this.j.size() <= 0)) ? false : true;
    }

    private final List<String> f() {
        ArrayList arrayList = new ArrayList();
        if (this.f != null) {
            arrayList.add("1");
        }
        if (this.d != null) {
            arrayList.add("2");
        }
        if (this.j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r3 = this;
            r1 = 0
            java.lang.Object r2 = r3.s
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x001d }
            com.google.android.gms.ads.internal.ay r0 = (com.google.android.gms.ads.internal.ay) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x001d }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
        L_0x0017:
            return r0
        L_0x0018:
            r0 = r1
            goto L_0x0016
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            r0 = r1
            goto L_0x0017
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.h.a():java.lang.String");
    }

    public final void a(aoy aoy) {
        a((Runnable) new i(this, aoy));
    }

    public final void a(aoy aoy, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        a((Runnable) new j(this, aoy, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r3 = this;
            r1 = 0
            java.lang.Object r2 = r3.s
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x001d }
            com.google.android.gms.ads.internal.ay r0 = (com.google.android.gms.ads.internal.ay) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.d_()     // Catch:{ all -> 0x001d }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
        L_0x0017:
            return r0
        L_0x0018:
            r0 = r1
            goto L_0x0016
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            r0 = r1
            goto L_0x0017
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.h.b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r3 = this;
            r1 = 0
            java.lang.Object r2 = r3.s
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ay> r0 = r3.q     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x001d }
            com.google.android.gms.ads.internal.ay r0 = (com.google.android.gms.ads.internal.ay) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.q()     // Catch:{ all -> 0x001d }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
        L_0x0017:
            return r0
        L_0x0018:
            r0 = r1
            goto L_0x0016
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            r0 = r1
            goto L_0x0017
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.h.c():boolean");
    }
}
