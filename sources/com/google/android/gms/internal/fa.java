package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class fa implements amw, gp {
    private long A = 0;
    private long B = 0;
    private int C = -1;
    private JSONObject D = new JSONObject();
    private int E = 0;
    private final AtomicInteger F = new AtomicInteger(0);
    private final fc G = new fc();
    private final Object a = new Object();
    private final fe b = new fe(app.c());
    private ala c;
    private BigInteger d = BigInteger.ONE;
    private final HashSet<ex> e = new HashSet<>();
    private final HashMap<String, fg> f = new HashMap<>();
    private boolean g = false;
    private boolean h = true;
    private int i = 0;
    private boolean j = false;
    private Context k;
    private jp l;
    private asz m = null;
    private boolean n = true;
    private boolean o = true;
    private amx p = null;
    private ams q = null;
    private String r;
    private String s;
    private Boolean t = null;
    private String u;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private String y = "";
    private long z = 0;

    public fa(gw gwVar) {
    }

    private final Future b(int i2) {
        Future b2;
        synchronized (this.a) {
            this.C = i2;
            b2 = fp.b(this.k, i2);
        }
        return b2;
    }

    private final Future b(long j2) {
        Future a2;
        synchronized (this.a) {
            this.A = j2;
            a2 = fp.a(this.k, j2);
        }
        return a2;
    }

    public final Bundle a(Context context, ff ffVar, String str) {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.b.a(context, str));
            Bundle bundle2 = new Bundle();
            for (String next : this.f.keySet()) {
                bundle2.putBundle(next, this.f.get(next).a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator<ex> it = this.e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ffVar.a(this.e);
            this.e.clear();
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.amx a(android.content.Context r5) {
        /*
            r4 = this;
            r1 = 0
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.K
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0015
            r0 = r1
        L_0x0014:
            return r0
        L_0x0015:
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.S
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003b
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.Q
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003b
            r0 = r1
            goto L_0x0014
        L_0x003b:
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0049
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0049
            r0 = r1
            goto L_0x0014
        L_0x0049:
            java.lang.Object r2 = r4.a
            monitor-enter(r2)
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0057
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            r0 = r1
            goto L_0x0014
        L_0x0057:
            com.google.android.gms.internal.ams r0 = r4.q     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0062
            com.google.android.gms.internal.ams r0 = new com.google.android.gms.internal.ams     // Catch:{ all -> 0x007e }
            r0.<init>()     // Catch:{ all -> 0x007e }
            r4.q = r0     // Catch:{ all -> 0x007e }
        L_0x0062:
            com.google.android.gms.internal.amx r0 = r4.p     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0075
            com.google.android.gms.internal.amx r0 = new com.google.android.gms.internal.amx     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.ams r1 = r4.q     // Catch:{ all -> 0x007e }
            android.content.Context r3 = r4.k     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.bfi r3 = com.google.android.gms.internal.bfe.a((android.content.Context) r3)     // Catch:{ all -> 0x007e }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x007e }
            r4.p = r0     // Catch:{ all -> 0x007e }
        L_0x0075:
            com.google.android.gms.internal.amx r0 = r4.p     // Catch:{ all -> 0x007e }
            r0.a()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.amx r0 = r4.p     // Catch:{ all -> 0x007e }
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            goto L_0x0014
        L_0x007e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fa.a(android.content.Context):com.google.android.gms.internal.amx");
    }

    public final kh a(Context context, String str) {
        kh a2;
        this.z = au.k().a();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.y)) {
                    this.y = str;
                    a2 = fp.a(context, str, this.z);
                }
            }
            a2 = jx.a(null);
        }
        return a2;
    }

    public final Future a(int i2) {
        Future a2;
        synchronized (this.a) {
            this.E = i2;
            a2 = fp.a(this.k, i2);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final Future a(long j2) {
        Future b2;
        synchronized (this.a) {
            this.B = j2;
            b2 = fp.b(this.k, j2);
        }
        return b2;
    }

    public final Future a(Context context, String str, String str2, boolean z2) {
        Future c2;
        int i2 = 0;
        synchronized (this.a) {
            JSONArray optJSONArray = this.D.optJSONArray(str);
            JSONArray jSONArray = optJSONArray == null ? new JSONArray() : optJSONArray;
            int length = jSONArray.length();
            while (true) {
                if (i2 >= jSONArray.length()) {
                    i2 = length;
                    break;
                }
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject == null || !str2.equals(optJSONObject.optString("template_id"))) {
                    i2++;
                } else if (z2 && optJSONObject.optBoolean("uses_media_view", false) == z2) {
                    c2 = null;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z2);
                jSONObject.put("timestamp_ms", au.k().a());
                jSONArray.put(i2, jSONObject);
                this.D.put(str, jSONArray);
            } catch (JSONException e2) {
                fn.c("Could not update native advanced settings", e2);
            }
            c2 = fp.c(this.k, this.D.toString());
        }
        return c2;
    }

    public final Future a(Context context, boolean z2) {
        Future future;
        synchronized (this.a) {
            if (z2 != this.h) {
                this.h = z2;
                future = fp.a(context, z2);
            } else {
                future = null;
            }
        }
        return future;
    }

    public final Future a(String str) {
        Future future;
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.r)) {
                    this.r = str;
                    future = fp.a(this.k, str);
                }
            }
            future = null;
        }
        return future;
    }

    @TargetApi(23)
    public final void a(Context context, jp jpVar) {
        synchronized (this.a) {
            if (!this.j) {
                this.k = context.getApplicationContext();
                this.l = jpVar;
                au.h().a((amw) this);
                fp.a(context, (gp) this);
                fp.b(context, (gp) this);
                fp.h(context, this);
                fp.f(context, this);
                fp.c(context, (gp) this);
                fp.d(context, this);
                fp.e(context, this);
                fp.g(context, this);
                fp.i(context, this);
                fp.j(context, this);
                fp.k(context, this);
                bfe.a(this.k);
                this.u = au.e().a(context, jpVar.a);
                if (Build.VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.w = true;
                }
                this.c = new ala(context.getApplicationContext(), this.l);
                asy asy = new asy(this.k, this.l.a);
                try {
                    au.m();
                    this.m = atb.a(asy);
                } catch (IllegalArgumentException e2) {
                    fn.c("Cannot initialize CSI reporter.", e2);
                }
                this.j = true;
            }
        }
    }

    public final void a(Bundle bundle) {
        synchronized (this.a) {
            this.h = bundle.getBoolean("use_https", this.h);
            this.i = bundle.getInt("webview_cache_version", this.i);
            if (bundle.containsKey("content_url_opted_out")) {
                a(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.r = bundle.getString("content_url_hashes");
            }
            this.x = bundle.getBoolean("auto_collect_location", this.x);
            if (bundle.containsKey("content_vertical_opted_out")) {
                b(bundle.getBoolean("content_vertical_opted_out"));
            }
            if (bundle.containsKey("content_vertical_hashes")) {
                this.s = bundle.getString("content_vertical_hashes");
            }
            if (bundle.containsKey("native_advanced_settings")) {
                try {
                    this.D = new JSONObject(bundle.getString("native_advanced_settings"));
                } catch (JSONException e2) {
                    fn.c("Could not convert native advanced settings to json object", e2);
                }
            }
            if (bundle.containsKey("version_code")) {
                this.E = bundle.getInt("version_code");
            }
            this.y = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.y;
            this.z = bundle.getLong("app_settings_last_update_ms", this.z);
            this.A = bundle.getLong("app_last_background_time_ms", this.A);
            this.C = bundle.getInt("request_in_session_count", this.C);
            this.B = bundle.getLong("first_ad_req_time_ms", this.B);
        }
    }

    public final void a(ex exVar) {
        synchronized (this.a) {
            this.e.add(exVar);
        }
    }

    public final void a(Boolean bool) {
        synchronized (this.a) {
            this.t = bool;
        }
    }

    public final void a(String str, fg fgVar) {
        synchronized (this.a) {
            this.f.put(str, fgVar);
        }
    }

    public final void a(Throwable th, String str) {
        bfe.a(this.k).a(th, str);
    }

    public final void a(HashSet<ex> hashSet) {
        synchronized (this.a) {
            this.e.addAll(hashSet);
        }
    }

    public final void a(boolean z2) {
        synchronized (this.a) {
            if (this.n != z2) {
                fp.b(this.k, z2);
            }
            this.n = z2;
            amx a2 = a(this.k);
            if (a2 != null && !a2.isAlive()) {
                fn.d("start fetching content...");
                a2.a();
            }
        }
    }

    public final boolean a() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.n;
        }
        return z2;
    }

    public final Future b(Context context, boolean z2) {
        Future future;
        synchronized (this.a) {
            if (z2 != this.x) {
                this.x = z2;
                future = fp.c(context, z2);
            } else {
                future = null;
            }
        }
        return future;
    }

    public final Future b(String str) {
        Future future;
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.s)) {
                    this.s = str;
                    future = fp.b(this.k, str);
                }
            }
            future = null;
        }
        return future;
    }

    public final void b(boolean z2) {
        synchronized (this.a) {
            if (this.o != z2) {
                fp.b(this.k, z2);
            }
            fp.b(this.k, z2);
            this.o = z2;
            amx a2 = a(this.k);
            if (a2 != null && !a2.isAlive()) {
                fn.d("start fetching content...");
                a2.a();
            }
        }
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.o;
        }
        return z2;
    }

    public final String c() {
        String bigInteger;
        synchronized (this.a) {
            bigInteger = this.d.toString();
            this.d = this.d.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public final void c(boolean z2) {
        this.G.a(z2);
    }

    public final fe d() {
        fe feVar;
        synchronized (this.a) {
            feVar = this.b;
        }
        return feVar;
    }

    public final void d(boolean z2) {
        long a2 = au.k().a();
        if (z2) {
            if (a2 - this.A > ((Long) app.f().a(asw.aw)).longValue()) {
                this.b.a = -1;
                return;
            }
            this.b.a = this.C;
            return;
        }
        b(a2);
        b(this.b.a);
    }

    public final asz e() {
        asz asz;
        synchronized (this.a) {
            asz = this.m;
        }
        return asz;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.h || this.w;
        }
        return z2;
    }

    public final String g() {
        String str;
        synchronized (this.a) {
            str = this.r;
        }
        return str;
    }

    public final String h() {
        String str;
        synchronized (this.a) {
            str = this.s;
        }
        return str;
    }

    public final Boolean i() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.t;
        }
        return bool;
    }

    public final boolean j() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.x;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final long k() {
        long j2;
        synchronized (this.a) {
            j2 = this.A;
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final long l() {
        long j2;
        synchronized (this.a) {
            j2 = this.B;
        }
        return j2;
    }

    public final int m() {
        int i2;
        synchronized (this.a) {
            i2 = this.E;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int n() {
        int i2;
        synchronized (this.a) {
            i2 = this.C;
        }
        return i2;
    }

    public final boolean o() {
        return this.G.a();
    }

    public final boolean p() {
        return this.G.b();
    }

    public final void q() {
        this.G.c();
    }

    public final ez r() {
        ez ezVar;
        synchronized (this.a) {
            ezVar = new ez(this.y, this.z);
        }
        return ezVar;
    }

    public final JSONObject s() {
        JSONObject jSONObject;
        synchronized (this.a) {
            jSONObject = this.D;
        }
        return jSONObject;
    }

    public final Future t() {
        Future a2;
        synchronized (this.a) {
            a2 = fp.a(this.k);
        }
        return a2;
    }

    public final ala u() {
        return this.c;
    }

    public final Resources v() {
        if (this.l.d) {
            return this.k.getResources();
        }
        try {
            DynamiteModule a2 = DynamiteModule.a(this.k, DynamiteModule.a, ModuleDescriptor.MODULE_ID);
            if (a2 != null) {
                return a2.a().getResources();
            }
            return null;
        } catch (DynamiteModule.c e2) {
            fn.c("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void w() {
        this.F.incrementAndGet();
    }

    public final void x() {
        this.F.decrementAndGet();
    }

    public final int y() {
        return this.F.get();
    }
}
