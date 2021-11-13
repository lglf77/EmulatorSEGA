package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class asm extends asl<Boolean> {
    asm(int i, String str, Boolean bool) {
        super(i, str, bool, (asm) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(a(), ((Boolean) b()).booleanValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(a(), ((Boolean) b()).booleanValue()));
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(a(), ((Boolean) obj).booleanValue());
    }
}
