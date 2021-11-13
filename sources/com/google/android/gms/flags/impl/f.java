package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.qk;

public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) qk.a(new g(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l;
        }
    }
}
