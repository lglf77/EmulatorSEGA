package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.fn;
import org.json.JSONObject;

final class ac implements Runnable {
    private /* synthetic */ JSONObject a;
    private /* synthetic */ ab b;

    ac(ab abVar, JSONObject jSONObject) {
        this.b = abVar;
        this.a = jSONObject;
    }

    public final void run() {
        this.b.a.a("fetchHttpRequestCompleted", this.a);
        fn.b("Dispatched http response.");
    }
}
