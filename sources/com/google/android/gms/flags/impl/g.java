package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class g implements Callable<Long> {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Long c;

    g(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}
