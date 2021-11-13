package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.js.a;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.md;
import com.google.android.gms.internal.mj;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nw;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.on;
import com.google.android.gms.internal.oo;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.xs;
import java.util.HashMap;
import java.util.Map;

@bfk
public final class k {
    public static final aa<mw> a = l.a;
    public static final aa<mw> b = m.a;
    public static final aa<mw> c = n.a;
    public static final aa<mw> d = new s();
    public static final aa<mw> e = new t();
    public static final aa<mw> f = o.a;
    public static final aa<Object> g = new u();
    public static final aa<mw> h = new v();
    public static final aa<mw> i = p.a;
    public static final aa<mw> j = new w();
    public static final aa<mw> k = new x();
    public static final aa<md> l = new mj();
    public static final aa<md> m = new mk();
    public static final aa<mw> n = new j();
    public static final e o = new e();
    public static final aa<mw> p = new y();
    public static final aa<mw> q = new z();
    public static final aa<mw> r = new r();
    private static aa<Object> s = new q();

    static final /* synthetic */ void a(a aVar, Map map) {
        Uri uri;
        String str = (String) map.get("u");
        if (str == null) {
            fn.e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            xr y = ((om) aVar).y();
            if (y == null || !y.a(parse)) {
                uri = parse;
            } else {
                Context context = ((nw) aVar).getContext();
                oo ooVar = (oo) aVar;
                if (ooVar == null) {
                    throw null;
                }
                uri = y.a(parse, context, (View) ooVar, ((nw) aVar).d());
            }
            parse = uri;
        } catch (xs e2) {
            String valueOf = String.valueOf(str);
            fn.e(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        if ((((Boolean) app.f().a(asw.am)).booleanValue() && au.z().a(((nw) aVar).getContext())) && TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
            String i2 = au.z().i(((nw) aVar).getContext());
            au.e();
            parse = gw.a(parse.toString(), "fbs_aeid", i2);
            au.z().d(((nw) aVar).getContext(), i2);
        }
        new is(((nw) aVar).getContext(), ((on) aVar).k().a, parse.toString()).h();
    }

    static final /* synthetic */ void a(nw nwVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            fn.e("URL missing from httpTrack GMSG.");
        } else {
            new is(nwVar.getContext(), ((on) nwVar).k().a, str).h();
        }
    }

    static final /* synthetic */ void a(om omVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            xr y = omVar.y();
            if (y != null) {
                y.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e2) {
            fn.e("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void b(com.google.android.gms.internal.nw r16, java.util.Map r17) {
        /*
            android.content.Context r1 = r16.getContext()
            android.content.pm.PackageManager r4 = r1.getPackageManager()
            java.lang.String r1 = "data"
            r0 = r17
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00cb }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x00cb }
            java.lang.String r1 = "intents"
            org.json.JSONArray r5 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x00db }
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r1 = 0
        L_0x0023:
            int r2 = r5.length()
            if (r1 >= r2) goto L_0x0118
            org.json.JSONObject r2 = r5.getJSONObject(r1)     // Catch:{ JSONException -> 0x00eb }
            java.lang.String r3 = "id"
            java.lang.String r7 = r2.optString(r3)
            java.lang.String r3 = "u"
            java.lang.String r8 = r2.optString(r3)
            java.lang.String r3 = "i"
            java.lang.String r9 = r2.optString(r3)
            java.lang.String r3 = "m"
            java.lang.String r10 = r2.optString(r3)
            java.lang.String r3 = "p"
            java.lang.String r11 = r2.optString(r3)
            java.lang.String r3 = "c"
            java.lang.String r12 = r2.optString(r3)
            java.lang.String r3 = "f"
            r2.optString(r3)
            java.lang.String r3 = "e"
            r2.optString(r3)
            java.lang.String r3 = "intent_url"
            java.lang.String r2 = r2.optString(r3)
            r3 = 0
            boolean r13 = android.text.TextUtils.isEmpty(r2)
            if (r13 != 0) goto L_0x0106
            r13 = 0
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r13)     // Catch:{ URISyntaxException -> 0x00f2 }
        L_0x006d:
            if (r2 != 0) goto L_0x00bb
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0081
            android.net.Uri r3 = android.net.Uri.parse(r8)
            r2.setData(r3)
        L_0x0081:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x008a
            r2.setAction(r9)
        L_0x008a:
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x0093
            r2.setType(r10)
        L_0x0093:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x009c
            r2.setPackage(r11)
        L_0x009c:
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x00bb
            java.lang.String r3 = "/"
            r8 = 2
            java.lang.String[] r3 = r12.split(r3, r8)
            int r8 = r3.length
            r9 = 2
            if (r8 != r9) goto L_0x00bb
            android.content.ComponentName r8 = new android.content.ComponentName
            r9 = 0
            r9 = r3[r9]
            r10 = 1
            r3 = r3[r10]
            r8.<init>(r9, r3)
            r2.setComponent(r8)
        L_0x00bb:
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r4.resolveActivity(r2, r3)
            if (r2 == 0) goto L_0x010f
            r2 = 1
        L_0x00c4:
            r6.put(r7, r2)     // Catch:{ JSONException -> 0x0111 }
        L_0x00c7:
            int r1 = r1 + 1
            goto L_0x0023
        L_0x00cb:
            r1 = move-exception
            com.google.android.gms.ads.internal.js.a r16 = (com.google.android.gms.ads.internal.js.a) r16
            java.lang.String r1 = "openableIntents"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0 = r16
            r0.a((java.lang.String) r1, (org.json.JSONObject) r2)
        L_0x00da:
            return
        L_0x00db:
            r1 = move-exception
            com.google.android.gms.ads.internal.js.a r16 = (com.google.android.gms.ads.internal.js.a) r16
            java.lang.String r1 = "openableIntents"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0 = r16
            r0.a((java.lang.String) r1, (org.json.JSONObject) r2)
            goto L_0x00da
        L_0x00eb:
            r2 = move-exception
            java.lang.String r3 = "Error parsing the intent data."
            com.google.android.gms.internal.fn.b(r3, r2)
            goto L_0x00c7
        L_0x00f2:
            r13 = move-exception
            java.lang.String r14 = "Error parsing the url: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r15 = r2.length()
            if (r15 == 0) goto L_0x0109
            java.lang.String r2 = r14.concat(r2)
        L_0x0103:
            com.google.android.gms.internal.fn.b(r2, r13)
        L_0x0106:
            r2 = r3
            goto L_0x006d
        L_0x0109:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r14)
            goto L_0x0103
        L_0x010f:
            r2 = 0
            goto L_0x00c4
        L_0x0111:
            r2 = move-exception
            java.lang.String r3 = "Error constructing openable urls response."
            com.google.android.gms.internal.fn.b(r3, r2)
            goto L_0x00c7
        L_0x0118:
            com.google.android.gms.ads.internal.js.a r16 = (com.google.android.gms.ads.internal.js.a) r16
            java.lang.String r1 = "openableIntents"
            r0 = r16
            r0.a((java.lang.String) r1, (org.json.JSONObject) r6)
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.k.b(com.google.android.gms.internal.nw, java.util.Map):void");
    }

    static final /* synthetic */ void c(nw nwVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            fn.e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = nwVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
        }
        ((a) nwVar).a("openableURLs", (Map<String, ?>) hashMap);
    }
}
