package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class asn extends asl<Integer> {
    asn(int i, String str, Integer num) {
        super(i, str, num, (asm) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(a(), ((Integer) b()).intValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(a(), ((Integer) b()).intValue()));
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(a(), ((Integer) obj).intValue());
    }
}
