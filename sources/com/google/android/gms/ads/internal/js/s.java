package com.google.android.gms.ads.internal.js;

import org.json.JSONObject;

final class s implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ JSONObject b;
    private /* synthetic */ q c;

    s(q qVar, String str, JSONObject jSONObject) {
        this.c = qVar;
        this.a = str;
        this.b = jSONObject;
    }

    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
