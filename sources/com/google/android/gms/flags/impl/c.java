package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class c implements Callable<Boolean> {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Boolean c;

    c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
