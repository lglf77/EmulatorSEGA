package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.mediation.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class baf implements baj {
    /* access modifiers changed from: private */
    public final String a;
    private final bar b;
    private final long c;
    private final bac d;
    private final bab e;
    private aoy f;
    private final apc g;
    private final Context h;
    /* access modifiers changed from: private */
    public final Object i = new Object();
    private final jp j;
    private final boolean k;
    private final auv l;
    private final List<String> m;
    private final List<String> n;
    private final List<String> o;
    private final boolean p;
    private final boolean q;
    /* access modifiers changed from: private */
    public bav r;
    /* access modifiers changed from: private */
    public int s = -2;
    private bbb t;

    public baf(Context context, String str, bar bar, bac bac, bab bab, aoy aoy, apc apc, jp jpVar, boolean z, boolean z2, auv auv, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        this.h = context;
        this.b = bar;
        this.e = bab;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.a = b();
        } else {
            this.a = str;
        }
        this.d = bac;
        if (bab.r != -1) {
            this.c = bab.r;
        } else if (bac.b != -1) {
            this.c = bac.b;
        } else {
            this.c = 10000;
        }
        this.f = aoy;
        this.g = apc;
        this.j = jpVar;
        this.k = z;
        this.p = z2;
        this.l = auv;
        this.m = list;
        this.n = list2;
        this.o = list3;
        this.q = z3;
    }

    private static bav a(b bVar) {
        return new bbm(bVar);
    }

    private final String a(String str) {
        if (str == null || !e() || b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException e2) {
            fn.e("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* access modifiers changed from: private */
    public final void a(bae bae) {
        String a2 = a(this.e.j);
        try {
            if (this.j.c < 4100000) {
                if (this.g.d) {
                    this.r.a(c.a(this.h), this.f, a2, bae);
                } else {
                    this.r.a(c.a(this.h), this.g, this.f, a2, (bay) bae);
                }
            } else if (this.k || this.e.b()) {
                ArrayList arrayList = new ArrayList(this.m);
                if (this.n != null) {
                    for (String next : this.n) {
                        String str = ":false";
                        if (this.o != null && this.o.contains(next)) {
                            str = ":true";
                        }
                        arrayList.add(new StringBuilder(String.valueOf(next).length() + 7 + String.valueOf(str).length()).append("custom:").append(next).append(str).toString());
                    }
                }
                this.r.a(c.a(this.h), this.f, a2, this.e.a, bae, this.l, arrayList);
            } else if (this.g.d) {
                this.r.a(c.a(this.h), this.f, a2, this.e.a, (bay) bae);
            } else if (!this.p) {
                this.r.a(c.a(this.h), this.g, this.f, a2, this.e.a, bae);
            } else if (this.e.m != null) {
                this.r.a(c.a(this.h), this.f, a2, this.e.a, bae, new auv(b(this.e.q)), this.e.p);
            } else {
                this.r.a(c.a(this.h), this.g, this.f, a2, this.e.a, bae);
            }
        } catch (RemoteException e2) {
            fn.c("Could not request ad from mediation adapter.", e2);
            a(5);
        }
    }

    private static d b(String str) {
        int i2 = 0;
        d.a aVar = new d.a();
        if (str == null) {
            return aVar.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.b(jSONObject.optBoolean("multiple_images", false));
            aVar.a(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i2 = 2;
            } else if ("portrait".equals(optString)) {
                i2 = 1;
            } else if (!"any".equals(optString)) {
                i2 = -1;
            }
            aVar.a(i2);
        } catch (JSONException e2) {
            fn.c("Exception occurred when creating native ad options", e2);
        }
        return aVar.a();
    }

    private final String b() {
        try {
            return (TextUtils.isEmpty(this.e.e) || !this.b.b(this.e.e)) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (RemoteException e2) {
            fn.e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* access modifiers changed from: private */
    public final boolean b(int i2) {
        try {
            Bundle l2 = this.k ? this.r.l() : this.g.d ? this.r.k() : this.r.j();
            return l2 != null && (l2.getInt("capabilities", 0) & i2) == i2;
        } catch (RemoteException e2) {
            fn.e("Could not get adapter info. Returning false");
            return false;
        }
    }

    private final bbb c() {
        if (this.s != 0 || !e()) {
            return null;
        }
        try {
            if (!(!b(4) || this.t == null || this.t.a() == 0)) {
                return this.t;
            }
        } catch (RemoteException e2) {
            fn.e("Could not get cpm value from MediationResponseMetadata");
        }
        return new bah(f());
    }

    /* access modifiers changed from: private */
    public final bav d() {
        String valueOf = String.valueOf(this.a);
        fn.d(valueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(valueOf) : new String("Instantiating mediation adapter: "));
        if (!this.k && !this.e.b()) {
            if (((Boolean) app.f().a(asw.bi)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return a((b) new AdMobAdapter());
            }
            if (((Boolean) app.f().a(asw.bj)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                return a((b) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new bbm(new zzwl());
            }
        }
        try {
            return this.b.a(this.a);
        } catch (RemoteException e2) {
            RemoteException remoteException = e2;
            String valueOf2 = String.valueOf(this.a);
            fn.a(valueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(valueOf2) : new String("Could not instantiate mediation adapter: "), remoteException);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean e() {
        return this.d.l != -1;
    }

    private final int f() {
        if (this.e.j == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.e.j);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e2) {
            fn.e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public final bai a(long j2, long j3) {
        bai bai;
        synchronized (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bae bae = new bae();
            gw.a.post(new bag(this, bae));
            long j4 = this.c;
            while (this.s == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j5 = j4 - (elapsedRealtime2 - elapsedRealtime);
                long j6 = j3 - (elapsedRealtime2 - j2);
                if (j5 <= 0 || j6 <= 0) {
                    fn.d("Timed out waiting for adapter.");
                    this.s = 3;
                } else {
                    try {
                        this.i.wait(Math.min(j5, j6));
                    } catch (InterruptedException e2) {
                        this.s = 5;
                    }
                }
            }
            bai = new bai(this.e, this.r, this.a, bae, this.s, c(), au.k().b() - elapsedRealtime);
        }
        return bai;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                if (this.r != null) {
                    this.r.c();
                }
            } catch (RemoteException e2) {
                fn.c("Could not destroy mediation adapter.", e2);
            }
            this.s = -1;
            this.i.notify();
        }
    }

    public final void a(int i2) {
        synchronized (this.i) {
            this.s = i2;
            this.i.notify();
        }
    }

    public final void a(int i2, bbb bbb) {
        synchronized (this.i) {
            this.s = 0;
            this.t = bbb;
            this.i.notify();
        }
    }
}
