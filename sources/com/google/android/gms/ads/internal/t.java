package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class t implements nb {
    private /* synthetic */ aub a;
    private /* synthetic */ String b;
    private /* synthetic */ mw c;

    t(aub aub, String str, mw mwVar) {
        this.a = aub;
        this.b = str;
        this.c = mwVar;
    }

    public final void a(mw mwVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.a.a());
            jSONObject.put("body", this.a.e());
            jSONObject.put("call_to_action", this.a.g());
            jSONObject.put("advertiser", this.a.h());
            jSONObject.put("logo", r.a(this.a.f()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = this.a.b();
            if (b2 != null) {
                for (Object a2 : b2) {
                    jSONArray.put(r.a(r.b(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", r.b(this.a.n(), this.b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            this.c.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            fn.c("Exception occurred when loading assets", e);
        }
    }
}
