package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class aur implements nb {
    private /* synthetic */ Map a;
    private /* synthetic */ aup b;

    aur(aup aup, Map map) {
        this.b = aup;
        this.a = map;
    }

    public final void a(mw mwVar, boolean z) {
        String unused = this.b.b.b = (String) this.a.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.b.b.b);
            this.b.a.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            fn.b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
