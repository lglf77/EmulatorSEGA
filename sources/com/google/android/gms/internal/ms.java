package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class ms implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ mp e;

    ms(mp mpVar, String str, String str2, String str3, String str4) {
        this.e = mpVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.a);
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("cachedSrc", this.b);
        }
        hashMap.put("type", mp.b(this.c));
        hashMap.put("reason", this.c);
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put("message", this.d);
        }
        this.e.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
