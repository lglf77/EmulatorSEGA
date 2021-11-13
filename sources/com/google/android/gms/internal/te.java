package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.v4.c.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;

public final class te extends uk {
    private static int a = 65535;
    private static int b = 2;
    private final Map<String, Map<String, String>> c = new a();
    private final Map<String, Map<String, Boolean>> d = new a();
    private final Map<String, Map<String, Boolean>> e = new a();
    private final Map<String, wz> f = new a();
    private final Map<String, Map<String, Integer>> g = new a();
    private final Map<String, String> h = new a();

    te(tk tkVar) {
        super(tkVar);
    }

    private final wz a(String str, byte[] bArr) {
        if (bArr == null) {
            return new wz();
        }
        ajw a2 = ajw.a(bArr, 0, bArr.length);
        wz wzVar = new wz();
        try {
            wzVar.a(a2);
            t().E().a("Parsed config. version, gmp_app_id", wzVar.a, wzVar.b);
            return wzVar;
        } catch (IOException e2) {
            t().A().a("Unable to merge remote config. appId", sj.a(str), e2);
            return new wz();
        }
    }

    private static Map<String, String> a(wz wzVar) {
        a aVar = new a();
        if (!(wzVar == null || wzVar.c == null)) {
            for (xa xaVar : wzVar.c) {
                if (xaVar != null) {
                    aVar.put(xaVar.a, xaVar.b);
                }
            }
        }
        return aVar;
    }

    private final void a(String str, wz wzVar) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (!(wzVar == null || wzVar.d == null)) {
            for (wy wyVar : wzVar.d) {
                if (TextUtils.isEmpty(wyVar.a)) {
                    t().A().a("EventConfig contained null event name");
                } else {
                    String a2 = AppMeasurement.a.a(wyVar.a);
                    if (!TextUtils.isEmpty(a2)) {
                        wyVar.a = a2;
                    }
                    aVar.put(wyVar.a, wyVar.b);
                    aVar2.put(wyVar.a, wyVar.c);
                    if (wyVar.d != null) {
                        if (wyVar.d.intValue() < b || wyVar.d.intValue() > a) {
                            t().A().a("Invalid sampling rate. Event name, sample rate", wyVar.a, wyVar.d);
                        } else {
                            aVar3.put(wyVar.a, wyVar.d);
                        }
                    }
                }
            }
        }
        this.d.put(str, aVar);
        this.e.put(str, aVar2);
        this.g.put(str, aVar3);
    }

    private final void e(String str) {
        Q();
        c();
        y.a(str);
        if (this.f.get(str) == null) {
            byte[] d2 = n().d(str);
            if (d2 == null) {
                this.c.put(str, (Object) null);
                this.d.put(str, (Object) null);
                this.e.put(str, (Object) null);
                this.f.put(str, (Object) null);
                this.h.put(str, (Object) null);
                this.g.put(str, (Object) null);
                return;
            }
            wz a2 = a(str, d2);
            this.c.put(str, a(a2));
            a(str, a2);
            this.f.put(str, a2);
            this.h.put(str, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public final wz a(String str) {
        Q();
        c();
        y.a(str);
        e(str);
        return this.f.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        c();
        e(str);
        Map map = this.c.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        Q();
        c();
        y.a(str);
        wz a2 = a(str, bArr);
        if (a2 == null) {
            return false;
        }
        a(str, a2);
        this.f.put(str, a2);
        this.h.put(str, str2);
        this.c.put(str, a(a2));
        rg e2 = e();
        ws[] wsVarArr = a2.e;
        y.a(wsVarArr);
        for (ws wsVar : wsVarArr) {
            for (wt wtVar : wsVar.c) {
                String a3 = AppMeasurement.a.a(wtVar.b);
                if (a3 != null) {
                    wtVar.b = a3;
                }
                for (wu wuVar : wtVar.c) {
                    String a4 = AppMeasurement.d.a(wuVar.d);
                    if (a4 != null) {
                        wuVar.d = a4;
                    }
                }
            }
            for (ww wwVar : wsVar.b) {
                String a5 = AppMeasurement.e.a(wwVar.b);
                if (a5 != null) {
                    wwVar.b = a5;
                }
            }
        }
        e2.n().a(str, wsVarArr);
        try {
            a2.e = null;
            byte[] bArr2 = new byte[a2.f()];
            a2.a(ajx.a(bArr2, 0, bArr2.length));
            bArr = bArr2;
        } catch (IOException e3) {
            t().A().a("Unable to serialize reduced-size config. Storing full config instead. appId", sj.a(str), e3);
        }
        rk n = n();
        y.a(str);
        n.c();
        n.Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) n.A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                n.t().y().a("Failed to update remote config (got 0). appId", sj.a(str));
            }
        } catch (SQLiteException e4) {
            n.t().y().a("Error storing remote config. appId", sj.a(str), e4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return this.h.get(str);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        c();
        e(str);
        if (p().l(str) && wr.i(str2)) {
            return true;
        }
        if (p().m(str) && wr.a(str2)) {
            return true;
        }
        Map map = this.d.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.h.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        c();
        e(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = this.e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        c();
        e(str);
        Map map = this.g.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        this.f.remove(str);
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }
}
