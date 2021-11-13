package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class asr extends asl<String> {
    asr(int i, String str, String str2) {
        super(i, str, str2, (asm) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), (String) b());
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(a(), (String) b());
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(a(), (String) obj);
    }
}
