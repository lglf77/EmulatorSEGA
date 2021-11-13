package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class gb extends go {
    private /* synthetic */ Context a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gb(Context context) {
        super((fq) null);
        this.a = context;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.remove("native_advanced_settings");
        edit.apply();
    }
}
