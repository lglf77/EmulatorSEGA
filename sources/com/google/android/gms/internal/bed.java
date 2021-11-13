package com.google.android.gms.internal;

import java.util.List;

final class bed implements jt<List<aty>, atw> {
    private /* synthetic */ String a;
    private /* synthetic */ Integer b;
    private /* synthetic */ Integer c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private /* synthetic */ int f;
    private /* synthetic */ int g;
    private /* synthetic */ boolean h;

    bed(bea bea, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
    }

    public final /* synthetic */ Object a(Object obj) {
        Integer num = null;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        if (this.d > 0) {
            num = Integer.valueOf(this.d);
        }
        return new atw(str, list, num2, num3, num, this.e + this.f, this.g, this.h);
    }
}
