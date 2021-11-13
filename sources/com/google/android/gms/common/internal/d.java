package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

public final class d {
    private final String a;
    private final String b;
    private final ComponentName c = null;
    private final int d;

    public d(String str, String str2, int i) {
        this.a = y.a(str);
        this.b = y.a(str2);
        this.d = i;
    }

    public final String a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final Intent d() {
        return this.a != null ? new Intent(this.a).setPackage(this.b) : new Intent().setComponent(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return v.a(this.a, dVar.a) && v.a(this.b, dVar.b) && v.a(this.c, dVar.c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        return this.a == null ? this.c.flattenToString() : this.a;
    }
}
