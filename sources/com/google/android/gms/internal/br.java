package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@bfk
public final class br {
    private final List<String> a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private String h;
    private final int i;
    private final boolean j;
    private final JSONObject k;

    public br(int i2, Map<String, String> map) {
        this.h = map.get("url");
        this.b = map.get("base_uri");
        this.c = map.get("post_parameters");
        this.e = b(map.get("drt_include"));
        this.f = map.get("request_id");
        this.d = map.get("type");
        this.a = c(map.get("errors"));
        this.i = i2;
        this.g = map.get("fetched_ad");
        this.j = b(map.get("render_test_ad_label"));
        this.k = new JSONObject();
    }

    public br(JSONObject jSONObject) {
        int i2 = 1;
        this.h = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.e = b(jSONObject.optString("drt_include"));
        this.f = jSONObject.optString("request_id");
        this.d = jSONObject.optString("type");
        this.a = c(jSONObject.optString("errors"));
        this.i = jSONObject.optInt("valid", 0) == 1 ? -2 : i2;
        this.g = jSONObject.optString("fetched_ad");
        this.j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    private static boolean b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private static List<String> c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    public final int a() {
        return this.i;
    }

    public final void a(String str) {
        this.h = str;
    }

    public final List<String> b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.h;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final String i() {
        return this.g;
    }

    public final boolean j() {
        return this.j;
    }
}
