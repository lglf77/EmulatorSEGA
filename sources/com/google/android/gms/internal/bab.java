package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class bab {
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final List<String> i;
    public final String j;
    public final List<String> k;
    public final List<String> l;
    public final String m;
    public final String n;
    public final String o;
    public final List<String> p;
    public final String q;
    public final long r;
    private String s;

    public bab(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, String str5, String str6, List<String> list5, List<String> list6, String str7, String str8, String str9, List<String> list7, String str10, List<String> list8, String str11, long j2) {
        this.a = str;
        this.b = null;
        this.c = list;
        this.d = null;
        this.e = null;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.j = str5;
        this.k = list5;
        this.l = list6;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.i = list8;
        this.s = null;
        this.r = -1;
    }

    public bab(JSONObject jSONObject) {
        List<String> list;
        this.b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", (String) null);
        au.v();
        this.f = bak.a(jSONObject, "clickurl");
        au.v();
        this.g = bak.a(jSONObject, "imp_urls");
        au.v();
        this.i = bak.a(jSONObject, "fill_urls");
        au.v();
        this.k = bak.a(jSONObject, "video_start_urls");
        au.v();
        this.l = bak.a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            au.v();
            list = bak.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.h = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.j = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.m = jSONObject.optString("html_template", (String) null);
        this.n = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.o = optJSONObject3 != null ? optJSONObject3.toString() : null;
        au.v();
        this.p = bak.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.q = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.s = jSONObject.optString("response_type", (String) null);
        this.r = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    public final boolean a() {
        return "banner".equalsIgnoreCase(this.s);
    }

    public final boolean b() {
        return "native".equalsIgnoreCase(this.s);
    }
}
