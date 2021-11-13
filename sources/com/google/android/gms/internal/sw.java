package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class sw {
    private final String a;
    private final boolean b = true;
    private boolean c;
    private boolean d;
    private /* synthetic */ su e;

    public sw(su suVar, String str, boolean z) {
        this.e = suVar;
        y.a(str);
        this.a = str;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
