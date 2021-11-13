package com.google.android.gms.internal;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class atw extends ave {
    private static final int a = Color.rgb(12, 174, 206);
    private static final int b;
    private static int c;
    private static int d = a;
    private final String e;
    private final List<aty> f = new ArrayList();
    private final List<avh> g = new ArrayList();
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        b = rgb;
        c = rgb;
    }

    public atw(String str, List<aty> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.e = str;
        if (list != null) {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= list.size()) {
                    break;
                }
                aty aty = list.get(i5);
                this.f.add(aty);
                this.g.add(aty);
                i4 = i5 + 1;
            }
        }
        this.h = num != null ? num.intValue() : c;
        this.i = num2 != null ? num2.intValue() : d;
        this.j = num3 != null ? num3.intValue() : 12;
        this.k = i2;
        this.l = i3;
        this.m = z;
    }

    public final String a() {
        return this.e;
    }

    public final List<avh> b() {
        return this.g;
    }

    public final List<aty> c() {
        return this.f;
    }

    public final int d() {
        return this.h;
    }

    public final int e() {
        return this.i;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.l;
    }

    public final boolean i() {
        return this.m;
    }
}
