package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class ez {
    private final long a;
    private final List<String> b = new ArrayList();
    private final List<String> c = new ArrayList();
    private final Map<String, bac> d = new HashMap();
    private String e;
    private String f;
    private boolean g = false;

    public ez(String str, long j) {
        this.f = str;
        this.a = j;
        a(str);
    }

    private final void a(String str) {
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.g = false;
                    fn.e("App settings could not be fetched successfully.");
                    return;
                }
                this.g = true;
                this.e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.c.add(optString2);
                            } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                this.d.put(optString2, new bac(optJSONObject));
                            }
                        }
                    }
                }
                a(jSONObject);
            } catch (JSONException e2) {
                fn.c("Exception occurred while processing app setting json", e2);
                au.i().a((Throwable) e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    private final void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.b.add(optJSONArray.optString(i));
            }
        }
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.g;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final Map<String, bac> e() {
        return this.d;
    }
}
