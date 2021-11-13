package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.qk;

public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) qk.a(new c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
