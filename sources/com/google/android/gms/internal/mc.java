package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class mc {
    public final String a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    public mc(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e2) {
            }
        } else {
            jSONObject = null;
        }
        jSONObject2 = jSONObject;
        this.b = a(jSONObject2, "aggressive_media_codec_release", asw.x);
        this.a = c(jSONObject2, "exo_player_version", asw.f);
        this.c = b(jSONObject2, "exo_cache_buffer_size", asw.l);
        this.d = b(jSONObject2, "exo_connect_timeout_millis", asw.g);
        this.e = b(jSONObject2, "exo_read_timeout_millis", asw.h);
        this.f = b(jSONObject2, "load_check_interval_bytes", asw.i);
        this.g = a(jSONObject2, "use_cache_data_source", asw.cr);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.asl, com.google.android.gms.internal.asl<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.asl<java.lang.Boolean> r3) {
        /*
            if (r1 == 0) goto L_0x0008
            boolean r0 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x0007 }
        L_0x0006:
            return r0
        L_0x0007:
            r0 = move-exception
        L_0x0008:
            com.google.android.gms.internal.asu r0 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r0.a(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mc.a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.asl):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.asl<java.lang.Integer>, com.google.android.gms.internal.asl] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.asl<java.lang.Integer> r3) {
        /*
            if (r1 == 0) goto L_0x0008
            int r0 = r1.getInt(r2)     // Catch:{ JSONException -> 0x0007 }
        L_0x0006:
            return r0
        L_0x0007:
            r0 = move-exception
        L_0x0008:
            com.google.android.gms.internal.asu r0 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r0.a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mc.b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.asl):int");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.asl, com.google.android.gms.internal.asl<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.asl<java.lang.String> r3) {
        /*
            if (r1 == 0) goto L_0x0008
            java.lang.String r0 = r1.getString(r2)     // Catch:{ JSONException -> 0x0007 }
        L_0x0006:
            return r0
        L_0x0007:
            r0 = move-exception
        L_0x0008:
            com.google.android.gms.internal.asu r0 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r0.a(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mc.c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.asl):java.lang.String");
    }
}
