package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.amx;
import com.google.android.gms.internal.aoi;
import com.google.android.gms.internal.aol;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.arg;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.auv;
import com.google.android.gms.internal.awe;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.azd;
import com.google.android.gms.internal.bad;
import com.google.android.gms.internal.bak;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.bfn;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.pw;
import com.google.android.gms.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public abstract class ay extends a implements an, n, bad {
    protected final bar i;
    private transient boolean j;

    public ay(Context context, apc apc, String str, bar bar, jp jpVar, bq bqVar) {
        this(new av(context, apc, str, jpVar), bar, (ak) null, bqVar);
    }

    private ay(av avVar, bar bar, ak akVar, bq bqVar) {
        super(avVar, (ak) null, bqVar);
        this.i = bar;
        this.j = false;
    }

    private final w a(aoy aoy, Bundle bundle, ez ezVar, int i2) {
        PackageInfo packageInfo;
        JSONArray optJSONArray;
        ApplicationInfo applicationInfo = this.e.c.getApplicationInfo();
        try {
            packageInfo = pw.a(this.e.c).b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.e.c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.e.f == null || this.e.f.getParent() == null)) {
            int[] iArr = new int[2];
            this.e.f.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = this.e.f.getWidth();
            int height = this.e.f.getHeight();
            int i5 = 0;
            if (this.e.f.isShown() && i3 + width > 0 && i4 + height > 0 && i3 <= displayMetrics.widthPixels && i4 <= displayMetrics.heightPixels) {
                i5 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i3);
            bundle2.putInt("y", i4);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i5);
        }
        String c = au.i().c();
        this.e.l = new ex(c, this.e.b);
        this.e.l.a(aoy);
        au.e();
        String a = gw.a(this.e.c, (View) this.e.f, this.e.i);
        long j2 = 0;
        if (this.e.p != null) {
            try {
                j2 = this.e.p.a();
            } catch (RemoteException e2) {
                fn.e("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a2 = au.i().a(this.e.c, this, c);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= this.e.t.size()) {
                break;
            }
            String b = this.e.t.b(i7);
            arrayList.add(b);
            if (this.e.s.containsKey(b) && this.e.s.get(b) != null) {
                arrayList2.add(b);
            }
            i6 = i7 + 1;
        }
        kh a3 = gq.a((ExecutorService) gq.a, new az(this));
        kh a4 = gq.a((ExecutorService) gq.a, new ba(this));
        String str = null;
        if (ezVar != null) {
            str = ezVar.c();
        }
        String str2 = null;
        if (this.e.C != null && this.e.C.size() > 0) {
            int i8 = 0;
            if (packageInfo != null) {
                i8 = packageInfo.versionCode;
            }
            if (i8 > au.i().m()) {
                au.i().t();
                au.i().a(i8);
            } else {
                JSONObject s = au.i().s();
                if (!(s == null || (optJSONArray = s.optJSONArray(this.e.b)) == null)) {
                    str2 = optJSONArray.toString();
                }
            }
        }
        apc apc = this.e.i;
        String str3 = this.e.b;
        String c2 = app.c();
        jp jpVar = this.e.e;
        List<String> list = this.e.C;
        boolean f = au.i().f();
        int i9 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        List<String> a5 = asw.a();
        String str4 = this.e.a;
        auv auv = this.e.u;
        String f3 = this.e.f();
        au.e();
        float c3 = gw.c();
        au.e();
        boolean d = gw.d();
        au.e();
        int k = gw.k(this.e.c);
        au.e();
        int d2 = gw.d((View) this.e.f);
        boolean z = this.e.c instanceof Activity;
        boolean j3 = au.i().j();
        boolean o = au.i().o();
        int a6 = au.x().a();
        au.e();
        Bundle e3 = gw.e();
        String a7 = au.n().a();
        arg arg = this.e.w;
        boolean b2 = au.n().b();
        Bundle j4 = azd.a().j();
        au.i();
        Context context = this.e.c;
        boolean contains = context.getSharedPreferences("admob", 0).getStringSet("never_pool_slots", Collections.emptySet()).contains(this.e.b);
        List<Integer> list2 = this.e.y;
        boolean a8 = pw.a(this.e.c).a();
        boolean p = au.i().p();
        au.g();
        return new w(bundle2, aoy, apc, str3, applicationInfo, packageInfo, c, c2, jpVar, a2, list, arrayList, bundle, f, i9, i10, f2, a, j2, uuid, a5, str4, auv, f3, c3, d, k, d2, z, j3, a3, str, o, a6, e3, a7, arg, b2, j4, contains, a4, list2, str2, arrayList2, i2, a8, p, hc.e());
    }

    static String c(ev evVar) {
        if (evVar == null) {
            return null;
        }
        String str = evVar.p;
        if (!("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) || evVar.n == null) {
            return str;
        }
        try {
            return new JSONObject(evVar.n.j).getString("class_name");
        } catch (NullPointerException | JSONException e) {
            return str;
        }
    }

    public void D() {
        fn.e("showInterstitial is not supported for current ad type");
    }

    public void O() {
        e();
    }

    public void P() {
        W();
    }

    public void Q() {
        fn.e("Mediated ad does not support onVideoEnd callback");
    }

    /* access modifiers changed from: protected */
    public boolean R() {
        au.e();
        if (gw.a(this.e.c, this.e.c.getPackageName(), "android.permission.INTERNET")) {
            au.e();
            return gw.a(this.e.c);
        }
    }

    public final void S() {
        b();
    }

    public final void T() {
        t();
    }

    public final void U() {
        f();
    }

    public final void V() {
        if (this.e.j != null) {
            String str = this.e.j.p;
            fn.e(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(this.e.j, true);
        v();
    }

    public final void W() {
        a(this.e.j, false);
    }

    public final String a() {
        if (this.e.j == null) {
            return null;
        }
        return this.e.j.p;
    }

    public final void a(awe awe, String str) {
        String str2;
        awo awo = null;
        if (awe != null) {
            try {
                str2 = awe.l();
            } catch (RemoteException e) {
                fn.c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            str2 = null;
        }
        if (!(this.e.s == null || str2 == null)) {
            awo = this.e.s.get(str2);
        }
        if (awo == null) {
            fn.e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            awo.a(awe, str);
        }
    }

    /* access modifiers changed from: protected */
    public void a(ev evVar, boolean z) {
        if (evVar == null) {
            fn.e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (evVar == null) {
            fn.e("Ad state was null when trying to ping impression URLs.");
        } else {
            fn.b("Pinging Impression URLs.");
            if (this.e.l != null) {
                this.e.l.a();
            }
            evVar.H.a(aoi.a.b.AD_IMPRESSION);
            if (evVar.e != null && !evVar.C) {
                au.e();
                gw.a(this.e.c, this.e.e.a, a(evVar.e));
                evVar.C = true;
            }
        }
        if (!evVar.D || z) {
            if (!(evVar.q == null || evVar.q.d == null)) {
                au.v();
                bak.a(this.e.c, this.e.e.a, evVar, this.e.b, z, a(evVar.q.d));
            }
            if (!(evVar.n == null || evVar.n.g == null)) {
                au.v();
                bak.a(this.e.c, this.e.e.a, evVar, this.e.b, z, evVar.n.g);
            }
            evVar.D = true;
        }
    }

    public boolean a(aoy aoy, atj atj) {
        return a(aoy, atj, 1);
    }

    public final boolean a(aoy aoy, atj atj, int i2) {
        ez ezVar;
        if (!R()) {
            return false;
        }
        au.e();
        amx a = au.i().a(this.e.c);
        Bundle a2 = a == null ? null : gw.a(a);
        this.d.a();
        this.e.F = 0;
        if (((Boolean) app.f().a(asw.cc)).booleanValue()) {
            ezVar = au.i().r();
            au.l().a(this.e.c, this.e.e, false, ezVar, ezVar != null ? ezVar.d() : null, this.e.b, (Runnable) null);
        } else {
            ezVar = null;
        }
        return a(a(aoy, a2, ezVar, i2), atj);
    }

    /* access modifiers changed from: protected */
    public boolean a(aoy aoy, ev evVar, boolean z) {
        if (!z && this.e.d()) {
            if (evVar.h > 0) {
                this.d.a(aoy, evVar.h);
            } else if (evVar.q != null && evVar.q.i > 0) {
                this.d.a(aoy, evVar.q.i);
            } else if (!evVar.m && evVar.d == 2) {
                this.d.b(aoy);
            }
        }
        return this.d.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ev evVar) {
        aoy aoy;
        boolean z = false;
        if (this.f != null) {
            aoy = this.f;
            this.f = null;
        } else {
            aoy = evVar.a;
            if (aoy.c != null) {
                z = aoy.c.getBoolean("_noRefresh", false);
            }
        }
        return a(aoy, evVar, z);
    }

    /* access modifiers changed from: protected */
    public boolean a(ev evVar, ev evVar2) {
        int i2;
        int i3 = 0;
        if (!(evVar == null || evVar.r == null)) {
            evVar.r.a((bad) null);
        }
        if (evVar2.r != null) {
            evVar2.r.a((bad) this);
        }
        if (evVar2.q != null) {
            i2 = evVar2.q.q;
            i3 = evVar2.q.r;
        } else {
            i2 = 0;
        }
        this.e.D.a(i2, i3);
        return true;
    }

    public final boolean a(w wVar, atj atj) {
        this.a = atj;
        atj.a("seq_num", wVar.g);
        atj.a("request_id", wVar.v);
        atj.a("session_id", wVar.h);
        if (wVar.f != null) {
            atj.a("app_version", String.valueOf(wVar.f.versionCode));
        }
        av avVar = this.e;
        au.a();
        Context context = this.e.c;
        aol aol = this.h.d;
        fj arVar = wVar.b.c.getBundle("sdk_less_server_data") != null ? new ar(context, wVar, this, aol) : new bfn(context, wVar, this, aol);
        arVar.h();
        avVar.g = arVar;
        return true;
    }

    public void b() {
        this.j = false;
        s();
        this.e.l.c();
    }

    public final void b(ev evVar) {
        super.b(evVar);
        if (evVar.n != null) {
            fn.b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.e.f != null) {
                this.e.f.d();
            }
            fn.b("Pinging network fill URLs.");
            au.v();
            bak.a(this.e.c, this.e.e.a, evVar, this.e.b, false, evVar.n.i);
            if (!(evVar.q == null || evVar.q.f == null || evVar.q.f.size() <= 0)) {
                fn.b("Pinging urls remotely");
                au.e().a(this.e.c, evVar.q.f);
            }
        } else {
            fn.b("Enable the debug gesture detector on the admob ad frame.");
            if (this.e.f != null) {
                this.e.f.c();
            }
        }
        if (evVar.d == 3 && evVar.q != null && evVar.q.e != null) {
            fn.b("Pinging no fill URLs.");
            au.v();
            bak.a(this.e.c, this.e.e.a, evVar, this.e.b, false, evVar.q.e);
        }
    }

    public final void b(String str, String str2) {
        a(str, str2);
    }

    public final void c() {
        this.g.c(this.e.j);
    }

    /* access modifiers changed from: protected */
    public final boolean c(aoy aoy) {
        return super.c(aoy) && !this.j;
    }

    public final void d() {
        this.g.d(this.e.j);
    }

    public final String d_() {
        if (this.e.j == null) {
            return null;
        }
        return c(this.e.j);
    }

    public void e() {
        if (this.e.j == null) {
            fn.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.e.j.q == null || this.e.j.q.c == null)) {
            au.v();
            bak.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, a(this.e.j.q.c));
        }
        if (!(this.e.j.n == null || this.e.j.n.f == null)) {
            au.v();
            bak.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, this.e.j.n.f);
        }
        super.e();
    }

    public final void e_() {
        au.e();
        gw.a((Runnable) new bb(this));
    }

    public void f() {
        this.j = true;
        u();
    }

    public final void f_() {
        au.e();
        gw.a((Runnable) new bc(this));
    }

    public void n() {
        y.b("pause must be called on the main UI thread.");
        if (!(this.e.j == null || this.e.j.b == null || !this.e.d())) {
            au.g();
            hc.a(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.o == null)) {
            try {
                this.e.j.o.d();
            } catch (RemoteException e) {
                fn.e("Could not pause mediation adapter.");
            }
        }
        this.g.c(this.e.j);
        this.d.b();
    }

    public void o() {
        y.b("resume must be called on the main UI thread.");
        mw mwVar = null;
        if (!(this.e.j == null || this.e.j.b == null)) {
            mwVar = this.e.j.b;
        }
        if (mwVar != null && this.e.d()) {
            au.g();
            hc.b(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.o == null)) {
            try {
                this.e.j.o.e();
            } catch (RemoteException e) {
                fn.e("Could not resume mediation adapter.");
            }
        }
        if (mwVar == null || !mwVar.E()) {
            this.d.c();
        }
        this.g.d(this.e.j);
    }
}
