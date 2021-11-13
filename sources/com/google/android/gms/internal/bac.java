package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class bac {
    public final List<bab> a;
    public final long b;
    public final List<String> c;
    public final List<String> d;
    public final List<String> e;
    public final List<String> f;
    public final boolean g;
    public final String h;
    public final long i;
    public final String j;
    public final int k;
    public final int l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public int q;
    public int r;
    public boolean s;

    public bac(String str) {
        this(new JSONObject(str));
    }

    public bac(List<bab> list, long j2, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j3, int i2, int i3, String str2, int i4, int i5, long j4, boolean z2) {
        this.a = list;
        this.b = j2;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = z;
        this.h = str;
        this.i = -1;
        this.q = 0;
        this.r = 1;
        this.j = null;
        this.k = 0;
        this.l = -1;
        this.m = -1;
        this.n = false;
        this.o = false;
        this.p = false;
        this.s = false;
    }

    public bac(JSONObject jSONObject) {
        if (fn.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            fn.a(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            bab bab = new bab(jSONArray.getJSONObject(i3));
            if (bab.a()) {
                this.s = true;
            }
            arrayList.add(bab);
            if (i2 < 0 && a(bab)) {
                i2 = i3;
            }
        }
        this.q = i2;
        this.r = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.h = jSONObject.optString("qdata");
        this.l = jSONObject.optInt("fs_model_type", -1);
        this.m = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            au.v();
            this.c = bak.a(optJSONObject, "click_urls");
            au.v();
            this.d = bak.a(optJSONObject, "imp_urls");
            au.v();
            this.e = bak.a(optJSONObject, "nofill_urls");
            au.v();
            this.f = bak.a(optJSONObject, "remote_ping_urls");
            this.g = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.i = optLong > 0 ? optLong * 1000 : -1;
            dw a2 = dw.a(optJSONObject.optJSONArray("rewards"));
            if (a2 == null) {
                this.j = null;
                this.k = 0;
            } else {
                this.j = a2.a;
                this.k = a2.b;
            }
            this.n = optJSONObject.optBoolean("use_displayed_impression", false);
            this.o = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.p = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.b = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = -1;
        this.j = null;
        this.k = 0;
        this.n = false;
        this.g = false;
        this.o = false;
        this.p = false;
    }

    private static boolean a(bab bab) {
        for (String equals : bab.c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
