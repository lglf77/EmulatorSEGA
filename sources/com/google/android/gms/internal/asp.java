package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class asp extends asl<Long> {
    asp(int i, String str, Long l) {
        super(i, str, l, (asm) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(a(), ((Long) b()).longValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(a(), ((Long) b()).longValue()));
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(a(), ((Long) obj).longValue());
    }
}
