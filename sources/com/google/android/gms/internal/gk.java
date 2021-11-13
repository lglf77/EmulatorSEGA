package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class gk extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gk(Context context, boolean z) {
        super((fq) null);
        this.a = context;
        this.b = z;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("content_url_opted_out", this.b);
        edit.apply();
    }
}
