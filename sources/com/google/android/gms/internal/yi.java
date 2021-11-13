package com.google.android.gms.internal;

import java.util.HashMap;

public final class yi extends px<Integer, Long> {
    public Long a;
    public Long b;

    public yi() {
    }

    public yi(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = (Long) b2.get(0);
            this.b = (Long) b2.get(1);
        }
    }
}
