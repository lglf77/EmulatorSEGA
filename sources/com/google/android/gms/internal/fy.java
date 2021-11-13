package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class fy extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fy(Context context, String str) {
        super((fq) null);
        this.a = context;
        this.b = str;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putString("native_advanced_settings", this.b);
        edit.apply();
    }
}
