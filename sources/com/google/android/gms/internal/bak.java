package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class bak {
    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(Context context, String str, ev evVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = a(a(a(a(a(a(a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", evVar.q.h), "@gw_sdkver@", str), "@gw_sessid@", app.c()), "@gw_seqnum@", evVar.i), "@gw_adnetstatus@", evVar.s);
                if (evVar.n != null) {
                    a2 = a(a(a2, "@gw_adnetid@", evVar.n.b), "@gw_allocid@", evVar.n.d);
                }
                String a3 = ep.a(a2, context);
                au.e();
                gw.b(context, str, a3);
            }
        }
    }

    public static void a(Context context, String str, List<String> list, String str2, dw dwVar) {
        if (list != null && !list.isEmpty()) {
            long a = au.k().a();
            for (String a2 : list) {
                String a3 = a(a(a2, "@gw_rwd_userid@", str2), "@gw_tmstmp@", Long.toString(a));
                if (dwVar != null) {
                    a3 = a(a(a3, "@gw_rwd_itm@", dwVar.a), "@gw_rwd_amt@", Integer.toString(dwVar.b));
                }
                au.e();
                gw.b(context, str, a3);
            }
        }
    }

    public static boolean a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
