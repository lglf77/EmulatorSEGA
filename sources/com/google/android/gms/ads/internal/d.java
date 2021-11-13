package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.azi;
import com.google.android.gms.internal.azn;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.kn;
import org.json.JSONObject;

@bfk
public final class d {
    private final Object a = new Object();
    private Context b;
    private long c = 0;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ kh a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("isSuccessful", false)) {
            return jx.a(null);
        }
        return au.i().a(this.b, jSONObject.getString("appSettingsJson"));
    }

    public final void a(Context context, jp jpVar, String str, Runnable runnable) {
        a(context, jpVar, true, (ez) null, str, (String) null, runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, jp jpVar, boolean z, ez ezVar, String str, String str2, Runnable runnable) {
        boolean z2;
        if (au.k().b() - this.c < 5000) {
            fn.e("Not retrying to fetch app settings");
            return;
        }
        this.c = au.k().b();
        if (ezVar == null) {
            z2 = true;
        } else {
            z2 = (((au.k().a() - ezVar.a()) > ((Long) app.f().a(asw.cd)).longValue() ? 1 : ((au.k().a() - ezVar.a()) == ((Long) app.f().a(asw.cd)).longValue() ? 0 : -1)) > 0) || !ezVar.b();
        }
        if (!z2) {
            return;
        }
        if (context == null) {
            fn.e("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.b = applicationContext;
            azi<I, O> a2 = au.r().a(this.b, jpVar).a("google.afma.config.fetchAppSettings", azn.a, azn.a);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                kh<O> b2 = a2.b(jSONObject);
                kh<B> a3 = jx.a(b2, new e(this), kn.b);
                if (runnable != null) {
                    b2.a(runnable, kn.b);
                }
                jv.a(a3, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                fn.b("Error requesting application settings", e);
            }
        } else {
            fn.e("App settings could not be fetched. Required parameters missing");
        }
    }
}
