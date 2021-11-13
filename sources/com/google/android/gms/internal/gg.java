package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

final class gg extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gg(Context context, long j) {
        super((fq) null);
        this.a = context;
        this.b = j;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("admob", 0).edit();
        edit.putLong("first_ad_req_time_ms", this.b);
        edit.apply();
    }
}
