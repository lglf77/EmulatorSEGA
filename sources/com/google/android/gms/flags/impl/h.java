package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.qk;

public final class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) qk.a(new i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
