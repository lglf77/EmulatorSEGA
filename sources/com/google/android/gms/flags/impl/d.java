package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.qk;

public final class d extends a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) qk.a(new e(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
