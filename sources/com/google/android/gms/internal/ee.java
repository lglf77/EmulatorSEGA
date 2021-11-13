package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class ee extends pp {
    public static final Parcelable.Creator<ee> CREATOR = new ef();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List<String> e;
    public final boolean f;
    public final boolean g;

    public ee(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = z3;
        this.g = z4;
    }

    public static ee a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("click_string", "");
        String optString2 = jSONObject.optString("report_url", "");
        boolean optBoolean = jSONObject.optBoolean("rendered_ad_enabled", false);
        boolean optBoolean2 = jSONObject.optBoolean("non_malicious_reporting_enabled", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("allowed_headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString3 = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString3)) {
                arrayList.add(optString3.toLowerCase(Locale.ENGLISH));
            }
        }
        return new ee(optString, optString2, optBoolean, optBoolean2, arrayList, jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b, false);
        ps.a(parcel, 4, this.c);
        ps.a(parcel, 5, this.d);
        ps.b(parcel, 6, this.e, false);
        ps.a(parcel, 7, this.f);
        ps.a(parcel, 8, this.g);
        ps.a(parcel, a2);
    }
}
