package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class fs extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fs(Context context, boolean z) {
        super((fq) null);
        this.a = context;
        this.b = z;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("auto_collect_location", this.b);
        edit.apply();
    }
}
