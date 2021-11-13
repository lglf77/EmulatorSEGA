package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.y;

public final class sz {
    private String a;
    private final String b;
    private final String c;
    private final long d;
    private /* synthetic */ su e;

    private sz(su suVar, String str, long j) {
        this.e = suVar;
        y.a(str);
        y.b(j > 0);
        this.a = String.valueOf(str).concat(":start");
        this.b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.d = j;
    }

    private final void b() {
        this.e.c();
        long a2 = this.e.k().a();
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a2);
        edit.apply();
    }

    private final long c() {
        return this.e.D().getLong(this.a, 0);
    }

    public final Pair<String, Long> a() {
        long abs;
        this.e.c();
        this.e.c();
        long c2 = c();
        if (c2 == 0) {
            b();
            abs = 0;
        } else {
            abs = Math.abs(c2 - this.e.k().a());
        }
        if (abs < this.d) {
            return null;
        }
        if (abs > (this.d << 1)) {
            b();
            return null;
        }
        String string = this.e.D().getString(this.c, (String) null);
        long j = this.e.D().getLong(this.b, 0);
        b();
        return (string == null || j <= 0) ? su.a : new Pair<>(string, Long.valueOf(j));
    }

    public final void a(String str, long j) {
        this.e.c();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.D().getLong(this.b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.D().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        boolean z = (this.e.p().z().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / (j2 + 1);
        SharedPreferences.Editor edit2 = this.e.D().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j2 + 1);
        edit2.apply();
    }
}
