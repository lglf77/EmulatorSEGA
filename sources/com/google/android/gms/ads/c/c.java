package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.s;

public final class c {
    private SharedPreferences a;

    public c(Context context) {
        try {
            Context c = s.c(context);
            this.a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(String str, float f) {
        try {
            if (this.a == null) {
                return 0.0f;
            }
            return this.a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return this.a == null ? str2 : this.a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.a == null) {
                return false;
            }
            return this.a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
