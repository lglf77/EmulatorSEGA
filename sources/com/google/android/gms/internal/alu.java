package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.k;
import org.json.JSONObject;

final class alu implements kx<k> {
    private /* synthetic */ JSONObject a;

    alu(alr alr, JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        ((k) obj).b("AFMA_updateActiveView", this.a);
    }
}
