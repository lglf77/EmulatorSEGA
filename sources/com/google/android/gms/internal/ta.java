package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class ta {
    private final String a;
    private final String b = null;
    private boolean c;
    private String d;
    private /* synthetic */ su e;

    public ta(su suVar, String str, String str2) {
        this.e = suVar;
        y.a(str);
        this.a = str;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getString(this.a, (String) null);
        }
        return this.d;
    }

    public final void a(String str) {
        if (!wr.a(str, this.d)) {
            SharedPreferences.Editor edit = this.e.D().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.d = str;
        }
    }
}
