package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.au;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bx extends bz {
    private final Object a = new Object();
    private final Context b;
    private SharedPreferences c;
    private final azi<JSONObject, JSONObject> d;

    public bx(Context context, azi<JSONObject, JSONObject> azi) {
        this.b = context.getApplicationContext();
        this.d = azi;
    }

    public final kh<Void> a() {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (au.k().a() - this.c.getLong("js_last_update", 0) < ((Long) app.f().a(asw.bH)).longValue()) {
            return jx.a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", jp.a().a);
            jSONObject.put("mf", app.f().a(asw.bI));
            jSONObject.put("cl", "179146524");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            return jx.a(this.d.b(jSONObject), new by(this), kn.b);
        } catch (JSONException e) {
            fn.b("Unable to populate SDK Core Constants parameters.", e);
            return jx.a(null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(JSONObject jSONObject) {
        asw.a(this.b, 1, jSONObject);
        this.c.edit().putLong("js_last_update", au.k().a()).apply();
        return null;
    }
}
