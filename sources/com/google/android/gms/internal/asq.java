package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class asq extends asl<Float> {
    asq(int i, String str, Float f) {
        super(i, str, f, (asm) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(a(), ((Float) b()).floatValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(a(), (double) ((Float) b()).floatValue()));
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(a(), ((Float) obj).floatValue());
    }
}
