package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class mq implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ boolean e = false;
    private /* synthetic */ mp f;

    mq(mp mpVar, String str, String str2, int i, int i2, boolean z) {
        this.f = mpVar;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("bytesLoaded", Integer.toString(this.c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("cacheReady", this.e ? "1" : "0");
        this.f.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
