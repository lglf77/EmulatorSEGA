package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class mr implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ int c;
    private /* synthetic */ mp d;

    mr(mp mpVar, String str, String str2, int i) {
        this.d = mpVar;
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("totalBytes", Integer.toString(this.c));
        this.d.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
