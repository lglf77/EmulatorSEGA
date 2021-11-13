package com.google.android.gms.internal;

import java.util.HashMap;

public final class yy extends px<Integer, Long> {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public Long m;

    public yy() {
    }

    public yy(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        hashMap.put(5, this.f);
        hashMap.put(6, this.g);
        hashMap.put(7, this.h);
        hashMap.put(8, this.i);
        hashMap.put(9, this.j);
        hashMap.put(10, this.k);
        hashMap.put(11, this.l);
        hashMap.put(12, this.m);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = (Long) b2.get(0);
            this.b = (Long) b2.get(1);
            this.c = (Long) b2.get(2);
            this.d = (Long) b2.get(3);
            this.e = (Long) b2.get(4);
            this.f = (Long) b2.get(5);
            this.g = (Long) b2.get(6);
            this.h = (Long) b2.get(7);
            this.i = (Long) b2.get(8);
            this.j = (Long) b2.get(9);
            this.k = (Long) b2.get(10);
            this.l = (Long) b2.get(11);
            this.m = (Long) b2.get(12);
        }
    }
}
