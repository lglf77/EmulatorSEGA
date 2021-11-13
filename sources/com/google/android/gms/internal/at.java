package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.b;
import org.json.JSONObject;

final class at implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ String b;
    private /* synthetic */ ar c;

    at(ar arVar, JSONObject jSONObject, String str) {
        this.c = arVar;
        this.a = jSONObject;
        this.b = str;
    }

    public final void run() {
        b unused = this.c.l = ar.d.b((xr) null);
        this.c.l.a(new au(this), new av(this));
    }
}
