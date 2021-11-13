package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.au;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@bfk
public final class asy {
    private boolean a;
    private String b;
    private Map<String, String> c;
    private Context d = null;
    private String e = null;

    public asy(Context context, String str) {
        this.d = context;
        this.e = str;
        this.a = ((Boolean) app.f().a(asw.H)).booleanValue();
        this.b = (String) app.f().a(asw.I);
        this.c = new LinkedHashMap();
        this.c.put("s", "gmob_sdk");
        this.c.put("v", "3");
        this.c.put("os", Build.VERSION.RELEASE);
        this.c.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.c;
        au.e();
        map.put("device", gw.b());
        this.c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.c;
        au.e();
        map2.put("is_lite_sdk", gw.m(context) ? "1" : "0");
        Future<bs> a2 = au.o().a(this.d);
        try {
            a2.get();
            this.c.put("network_coarse", Integer.toString(a2.get().n));
            this.c.put("network_fine", Integer.toString(a2.get().o));
        } catch (Exception e2) {
            au.i().a((Throwable) e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final Context c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> e() {
        return this.c;
    }
}
