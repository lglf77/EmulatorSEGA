package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class auu implements aa<Object> {
    private /* synthetic */ beq a;
    private /* synthetic */ auo b;

    auu(auo auo, beq beq) {
        this.b = auo;
        this.a = beq;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : map.keySet()) {
                jSONObject.put(next, map.get(next));
            }
            jSONObject.put("id", this.b.b);
            this.a.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            fn.b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
