package com.google.android.gms.internal;

import java.util.HashMap;

public final class xv extends px<Integer, Long> {
    public long a;
    public long b;

    public xv() {
        this.a = -1;
        this.b = -1;
    }

    public xv(String str) {
        this();
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = ((Long) b2.get(0)).longValue();
            this.b = ((Long) b2.get(1)).longValue();
        }
    }
}
