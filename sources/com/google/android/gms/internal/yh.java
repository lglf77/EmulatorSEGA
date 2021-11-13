package com.google.android.gms.internal;

import java.util.HashMap;

public final class yh extends px<Integer, Object> {
    public Long a;
    public Boolean b;
    public Boolean c;

    public yh() {
    }

    public yh(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = (Long) b2.get(0);
            this.b = (Boolean) b2.get(1);
            this.c = (Boolean) b2.get(2);
        }
    }
}
