package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class fu extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fu(Context context, int i) {
        super((fq) null);
        this.a = context;
        this.b = i;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putInt("version_code", this.b);
        edit.apply();
    }
}
