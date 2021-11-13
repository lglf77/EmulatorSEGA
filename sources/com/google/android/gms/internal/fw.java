package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class fw extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fw(Context context, String str, long j) {
        super((fq) null);
        this.a = context;
        this.b = str;
        this.c = j;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putString("app_settings_json", this.b);
        edit.putLong("app_settings_last_update_ms", this.c);
        edit.apply();
    }
}
