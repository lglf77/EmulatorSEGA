package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fx extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ gp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fx(Context context, gp gpVar) {
        super((fq) null);
        this.a = context;
        this.b = gpVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("app_settings_json", sharedPreferences.getString("app_settings_json", ""));
        bundle.putLong("app_settings_last_update_ms", sharedPreferences.getLong("app_settings_last_update_ms", 0));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
