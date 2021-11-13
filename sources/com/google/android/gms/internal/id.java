package com.google.android.gms.internal;

import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public final class id {
    public final String a;
    public final double b;
    public final int c;
    private double d;
    private double e;

    public id(String str, double d2, double d3, double d4, int i) {
        this.a = str;
        this.e = d2;
        this.d = d3;
        this.b = d4;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof id)) {
            return false;
        }
        id idVar = (id) obj;
        return v.a(this.a, idVar.a) && this.d == idVar.d && this.e == idVar.e && this.c == idVar.c && Double.compare(this.b, idVar.b) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return v.a(this).a("name", this.a).a("minBound", Double.valueOf(this.e)).a("maxBound", Double.valueOf(this.d)).a("percent", Double.valueOf(this.b)).a("count", Integer.valueOf(this.c)).toString();
    }
}
