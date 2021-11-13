package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class sy {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private /* synthetic */ su e;

    public sy(su suVar, String str, long j) {
        this.e = suVar;
        y.a(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long j) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
