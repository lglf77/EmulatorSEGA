package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class e implements Callable<Integer> {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Integer c;

    e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
