package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.ks;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class af implements aa<Object> {
    private HashMap<String, ks<JSONObject>> a = new HashMap<>();

    public final Future<JSONObject> a(String str) {
        ks ksVar = new ks();
        this.a.put(str, ksVar);
        return ksVar;
    }

    public final void b(String str) {
        ks ksVar = this.a.get(str);
        if (ksVar == null) {
            fn.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!ksVar.isDone()) {
            ksVar.cancel(true);
        }
        this.a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        fn.b("Received ad from the cache.");
        ks ksVar = this.a.get(str);
        if (ksVar == null) {
            fn.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            ksVar.b(new JSONObject(str2));
        } catch (JSONException e) {
            fn.b("Failed constructing JSON object from value passed from javascript", e);
            ksVar.b(null);
        } finally {
            this.a.remove(str);
        }
    }
}
