package com.google.android.gms.internal;

import java.util.HashMap;

public final class pz extends px<Integer, Object> {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public pz() {
        this.a = "E";
        this.b = -1;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }

    public pz(String str) {
        this();
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = b2.get(0) == null ? "E" : (String) b2.get(0);
            this.b = b2.get(1) == null ? -1 : ((Long) b2.get(1)).longValue();
            this.c = b2.get(2) == null ? "E" : (String) b2.get(2);
            this.d = b2.get(3) == null ? "E" : (String) b2.get(3);
            this.e = b2.get(4) == null ? "E" : (String) b2.get(4);
        }
    }
}
