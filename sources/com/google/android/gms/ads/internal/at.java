package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.jp;
import java.util.Map;
import java.util.TreeMap;

final class at {
    private final String a;
    private final Map<String, String> b = new TreeMap();
    private String c;
    private String d;

    public at(String str) {
        this.a = str;
    }

    public final String a() {
        return this.d;
    }

    public final void a(aoy aoy, jp jpVar) {
        this.c = aoy.j.a;
        Bundle bundle = aoy.m != null ? aoy.m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) app.f().a(asw.ci);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.b.put("SDKVersion", jpVar.a);
        }
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final Map<String, String> d() {
        return this.b;
    }
}
