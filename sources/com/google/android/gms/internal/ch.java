package com.google.android.gms.internal;

import com.google.android.gms.common.internal.v;

@bfk
public final class ch extends cn {
    private final String a;
    private final int b;

    public ch(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return v.a(this.a, chVar.a) && v.a(Integer.valueOf(this.b), Integer.valueOf(chVar.b));
    }
}
