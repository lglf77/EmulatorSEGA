package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bk {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0154 A[Catch:{ JSONException -> 0x0256 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.z a(android.content.Context r50, com.google.android.gms.internal.v r51, java.lang.String r52) {
        /*
            org.json.JSONObject r28 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0256 }
            r0 = r28
            r1 = r52
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "ad_base_url"
            r5 = 0
            r0 = r28
            java.lang.String r6 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "ad_url"
            r5 = 0
            r0 = r28
            java.lang.String r7 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "ad_size"
            r5 = 0
            r0 = r28
            java.lang.String r19 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "ad_slot_size"
            r0 = r28
            r1 = r19
            java.lang.String r43 = r0.optString(r4, r1)     // Catch:{ JSONException -> 0x0256 }
            if (r51 == 0) goto L_0x00df
            r0 = r51
            int r4 = r0.m     // Catch:{ JSONException -> 0x0256 }
            if (r4 == 0) goto L_0x00df
            r27 = 1
        L_0x0038:
            java.lang.String r4 = "ad_json"
            r5 = 0
            r0 = r28
            java.lang.String r5 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            if (r5 != 0) goto L_0x004c
            java.lang.String r4 = "ad_html"
            r5 = 0
            r0 = r28
            java.lang.String r5 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
        L_0x004c:
            if (r5 != 0) goto L_0x0057
            java.lang.String r4 = "body"
            r5 = 0
            r0 = r28
            java.lang.String r5 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
        L_0x0057:
            if (r5 != 0) goto L_0x0067
            java.lang.String r4 = "ads"
            r0 = r28
            boolean r4 = r0.has(r4)     // Catch:{ JSONException -> 0x0256 }
            if (r4 == 0) goto L_0x0067
            java.lang.String r5 = r28.toString()     // Catch:{ JSONException -> 0x0256 }
        L_0x0067:
            r20 = -1
            java.lang.String r4 = "debug_dialog"
            r8 = 0
            r0 = r28
            java.lang.String r22 = r0.optString(r4, r8)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "debug_signals"
            r8 = 0
            r0 = r28
            java.lang.String r45 = r0.optString(r4, r8)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "interstitial_timeout"
            r0 = r28
            boolean r4 = r0.has(r4)     // Catch:{ JSONException -> 0x0256 }
            if (r4 == 0) goto L_0x00e3
            java.lang.String r4 = "interstitial_timeout"
            r0 = r28
            double r8 = r0.getDouble(r4)     // Catch:{ JSONException -> 0x0256 }
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r12 = (long) r8     // Catch:{ JSONException -> 0x0256 }
        L_0x0094:
            java.lang.String r4 = "orientation"
            r8 = 0
            r0 = r28
            java.lang.String r4 = r0.optString(r4, r8)     // Catch:{ JSONException -> 0x0256 }
            r18 = -1
            java.lang.String r8 = "portrait"
            boolean r8 = r8.equals(r4)     // Catch:{ JSONException -> 0x0256 }
            if (r8 == 0) goto L_0x00e6
            com.google.android.gms.internal.hc r4 = com.google.android.gms.ads.internal.au.g()     // Catch:{ JSONException -> 0x0256 }
            int r18 = r4.b()     // Catch:{ JSONException -> 0x0256 }
        L_0x00af:
            r4 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0256 }
            if (r8 == 0) goto L_0x028b
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0256 }
            if (r8 != 0) goto L_0x028b
            r0 = r51
            com.google.android.gms.internal.jp r4 = r0.k     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r6 = r4.a     // Catch:{ JSONException -> 0x0256 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r51
            r5 = r50
            com.google.android.gms.internal.z r4 = com.google.android.gms.internal.bf.a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r6 = r4.a     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r7 = r4.b     // Catch:{ JSONException -> 0x0256 }
            long r0 = r4.m     // Catch:{ JSONException -> 0x0256 }
            r20 = r0
        L_0x00d6:
            if (r7 != 0) goto L_0x00f7
            com.google.android.gms.internal.z r4 = new com.google.android.gms.internal.z     // Catch:{ JSONException -> 0x0256 }
            r5 = 0
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0256 }
        L_0x00de:
            return r4
        L_0x00df:
            r27 = 0
            goto L_0x0038
        L_0x00e3:
            r12 = -1
            goto L_0x0094
        L_0x00e6:
            java.lang.String r8 = "landscape"
            boolean r4 = r8.equals(r4)     // Catch:{ JSONException -> 0x0256 }
            if (r4 == 0) goto L_0x00af
            com.google.android.gms.internal.hc r4 = com.google.android.gms.ads.internal.au.g()     // Catch:{ JSONException -> 0x0256 }
            int r18 = r4.a()     // Catch:{ JSONException -> 0x0256 }
            goto L_0x00af
        L_0x00f7:
            java.lang.String r5 = "click_urls"
            r0 = r28
            org.json.JSONArray r5 = r0.optJSONArray(r5)     // Catch:{ JSONException -> 0x0256 }
            if (r4 != 0) goto L_0x0276
            r8 = 0
        L_0x0102:
            if (r5 == 0) goto L_0x0108
            java.util.List r8 = a((org.json.JSONArray) r5, (java.util.List<java.lang.String>) r8)     // Catch:{ JSONException -> 0x0256 }
        L_0x0108:
            java.lang.String r5 = "impression_urls"
            r0 = r28
            org.json.JSONArray r5 = r0.optJSONArray(r5)     // Catch:{ JSONException -> 0x0256 }
            if (r4 != 0) goto L_0x027a
            r9 = 0
        L_0x0113:
            if (r5 == 0) goto L_0x0119
            java.util.List r9 = a((org.json.JSONArray) r5, (java.util.List<java.lang.String>) r9)     // Catch:{ JSONException -> 0x0256 }
        L_0x0119:
            java.lang.String r5 = "manual_impression_urls"
            r0 = r28
            org.json.JSONArray r5 = r0.optJSONArray(r5)     // Catch:{ JSONException -> 0x0256 }
            if (r4 != 0) goto L_0x027e
            r15 = 0
        L_0x0124:
            if (r5 == 0) goto L_0x012a
            java.util.List r15 = a((org.json.JSONArray) r5, (java.util.List<java.lang.String>) r15)     // Catch:{ JSONException -> 0x0256 }
        L_0x012a:
            if (r4 == 0) goto L_0x0288
            int r5 = r4.k     // Catch:{ JSONException -> 0x0256 }
            r10 = -1
            if (r5 == r10) goto L_0x0135
            int r0 = r4.k     // Catch:{ JSONException -> 0x0256 }
            r18 = r0
        L_0x0135:
            long r10 = r4.f     // Catch:{ JSONException -> 0x0256 }
            r16 = 0
            int r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0288
            long r10 = r4.f     // Catch:{ JSONException -> 0x0256 }
        L_0x013f:
            java.lang.String r4 = "active_view"
            r0 = r28
            java.lang.String r25 = r0.optString(r4)     // Catch:{ JSONException -> 0x0256 }
            r24 = 0
            java.lang.String r4 = "ad_is_javascript"
            r5 = 0
            r0 = r28
            boolean r23 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            if (r23 == 0) goto L_0x015d
            java.lang.String r4 = "ad_passback_url"
            r5 = 0
            r0 = r28
            java.lang.String r24 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
        L_0x015d:
            java.lang.String r4 = "mediation"
            r5 = 0
            r0 = r28
            boolean r12 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "custom_render_allowed"
            r5 = 0
            r0 = r28
            boolean r26 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "content_url_opted_out"
            r5 = 1
            r0 = r28
            boolean r29 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "content_vertical_opted_out"
            r5 = 1
            r0 = r28
            boolean r46 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "prefetch"
            r5 = 0
            r0 = r28
            boolean r30 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "refresh_interval_milliseconds"
            r16 = -1
            r0 = r28
            r1 = r16
            long r16 = r0.optLong(r4, r1)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "mediation_config_cache_time_milliseconds"
            r32 = -1
            r0 = r28
            r1 = r32
            long r13 = r0.optLong(r4, r1)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "gws_query_id"
            java.lang.String r5 = ""
            r0 = r28
            java.lang.String r31 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "height"
            java.lang.String r5 = "fluid"
            java.lang.String r32 = ""
            r0 = r28
            r1 = r32
            java.lang.String r5 = r0.optString(r5, r1)     // Catch:{ JSONException -> 0x0256 }
            boolean r32 = r4.equals(r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "native_express"
            r5 = 0
            r0 = r28
            boolean r33 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "video_start_urls"
            r0 = r28
            org.json.JSONArray r4 = r0.optJSONArray(r4)     // Catch:{ JSONException -> 0x0256 }
            r5 = 0
            java.util.List r35 = a((org.json.JSONArray) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "video_complete_urls"
            r0 = r28
            org.json.JSONArray r4 = r0.optJSONArray(r4)     // Catch:{ JSONException -> 0x0256 }
            r5 = 0
            java.util.List r36 = a((org.json.JSONArray) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "rewards"
            r0 = r28
            org.json.JSONArray r4 = r0.optJSONArray(r4)     // Catch:{ JSONException -> 0x0256 }
            com.google.android.gms.internal.dw r34 = com.google.android.gms.internal.dw.a((org.json.JSONArray) r4)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "use_displayed_impression"
            r5 = 0
            r0 = r28
            boolean r37 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "auto_protection_configuration"
            r0 = r28
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch:{ JSONException -> 0x0256 }
            com.google.android.gms.internal.ab r38 = com.google.android.gms.internal.ab.a(r4)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "set_cookie"
            java.lang.String r5 = ""
            r0 = r28
            java.lang.String r40 = r0.optString(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "remote_ping_urls"
            r0 = r28
            org.json.JSONArray r4 = r0.optJSONArray(r4)     // Catch:{ JSONException -> 0x0256 }
            r5 = 0
            java.util.List r41 = a((org.json.JSONArray) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "safe_browsing"
            r0 = r28
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch:{ JSONException -> 0x0256 }
            com.google.android.gms.internal.ee r44 = com.google.android.gms.internal.ee.a(r4)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "render_in_browser"
            r0 = r51
            boolean r5 = r0.K     // Catch:{ JSONException -> 0x0256 }
            r0 = r28
            boolean r42 = r0.optBoolean(r4, r5)     // Catch:{ JSONException -> 0x0256 }
            java.lang.String r4 = "custom_close_blocked"
            r0 = r28
            boolean r48 = r0.optBoolean(r4)     // Catch:{ JSONException -> 0x0256 }
            com.google.android.gms.internal.z r4 = new com.google.android.gms.internal.z     // Catch:{ JSONException -> 0x0256 }
            r0 = r51
            boolean r0 = r0.p     // Catch:{ JSONException -> 0x0256 }
            r28 = r0
            r0 = r51
            boolean r0 = r0.G     // Catch:{ JSONException -> 0x0256 }
            r39 = r0
            r0 = r51
            boolean r0 = r0.U     // Catch:{ JSONException -> 0x0256 }
            r47 = r0
            r49 = 0
            r5 = r51
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ JSONException -> 0x0256 }
            goto L_0x00de
        L_0x0256:
            r4 = move-exception
            java.lang.String r5 = "Could not parse the inline ad response: "
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r6 = r4.length()
            if (r6 == 0) goto L_0x0282
            java.lang.String r4 = r5.concat(r4)
        L_0x026b:
            com.google.android.gms.internal.fn.e(r4)
            com.google.android.gms.internal.z r4 = new com.google.android.gms.internal.z
            r5 = 0
            r4.<init>(r5)
            goto L_0x00de
        L_0x0276:
            java.util.List<java.lang.String> r8 = r4.c     // Catch:{ JSONException -> 0x0256 }
            goto L_0x0102
        L_0x027a:
            java.util.List<java.lang.String> r9 = r4.e     // Catch:{ JSONException -> 0x0256 }
            goto L_0x0113
        L_0x027e:
            java.util.List<java.lang.String> r15 = r4.i     // Catch:{ JSONException -> 0x0256 }
            goto L_0x0124
        L_0x0282:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x026b
        L_0x0288:
            r10 = r12
            goto L_0x013f
        L_0x028b:
            r7 = r5
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bk.a(android.content.Context, com.google.android.gms.internal.v, java.lang.String):com.google.android.gms.internal.z");
    }

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static List<String> a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    private static JSONArray a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static JSONObject a(Context context, bc bcVar) {
        String str;
        v vVar = bcVar.i;
        Location location = bcVar.d;
        bs bsVar = bcVar.j;
        Bundle bundle = bcVar.a;
        JSONObject jSONObject = bcVar.k;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_caps", app.f().a(asw.bG));
            if (bcVar.c.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", bcVar.c));
            }
            if (vVar.b != null) {
                hashMap.put("ad_pos", vVar.b);
            }
            aoy aoy = vVar.c;
            String a2 = fi.a();
            if (a2 != null) {
                hashMap.put("abf", a2);
            }
            if (aoy.b != -1) {
                hashMap.put("cust_age", a.format(new Date(aoy.b)));
            }
            if (aoy.c != null) {
                hashMap.put("extras", aoy.c);
            }
            if (aoy.d != -1) {
                hashMap.put("cust_gender", Integer.valueOf(aoy.d));
            }
            if (aoy.e != null) {
                hashMap.put("kw", aoy.e);
            }
            if (aoy.g != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(aoy.g));
            }
            if (aoy.f) {
                if (((Boolean) app.f().a(asw.cO)).booleanValue()) {
                    hashMap.put("test_request", true);
                } else {
                    hashMap.put("adtest", "on");
                }
            }
            if (aoy.a >= 2) {
                if (aoy.h) {
                    hashMap.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(aoy.i)) {
                    hashMap.put("ppid", aoy.i);
                }
            }
            if (aoy.a >= 3 && aoy.l != null) {
                hashMap.put("url", aoy.l);
            }
            if (aoy.a >= 5) {
                if (aoy.n != null) {
                    hashMap.put("custom_targeting", aoy.n);
                }
                if (aoy.o != null) {
                    hashMap.put("category_exclusions", aoy.o);
                }
                if (aoy.p != null) {
                    hashMap.put("request_agent", aoy.p);
                }
            }
            if (aoy.a >= 6 && aoy.q != null) {
                hashMap.put("request_pkg", aoy.q);
            }
            if (aoy.a >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(aoy.r));
            }
            if (vVar.d.g != null) {
                boolean z = false;
                boolean z2 = false;
                for (apc apc : vVar.d.g) {
                    if (!apc.i && !z2) {
                        hashMap.put("format", apc.a);
                        z2 = true;
                    }
                    if (apc.i && !z) {
                        hashMap.put("fluid", "height");
                        z = true;
                    }
                    if (z2 && z) {
                        break;
                    }
                }
            } else {
                hashMap.put("format", vVar.d.a);
                if (vVar.d.i) {
                    hashMap.put("fluid", "height");
                }
            }
            if (vVar.d.e == -1) {
                hashMap.put("smart_w", "full");
            }
            if (vVar.d.b == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (vVar.d.g != null) {
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                for (apc apc2 : vVar.d.g) {
                    if (apc2.i) {
                        z3 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(apc2.e == -1 ? (int) (((float) apc2.f) / bsVar.s) : apc2.e);
                        sb.append("x");
                        sb.append(apc2.b == -2 ? (int) (((float) apc2.c) / bsVar.s) : apc2.b);
                    }
                }
                if (z3) {
                    if (sb.length() != 0) {
                        sb.insert(0, "|");
                    }
                    sb.insert(0, "320x50");
                }
                hashMap.put("sz", sb);
            }
            if (vVar.m != 0) {
                hashMap.put("native_version", Integer.valueOf(vVar.m));
                hashMap.put("native_templates", vVar.n);
                auv auv = vVar.y;
                if (auv != null) {
                    switch (auv.c) {
                        case a.b.AdsAttrs_adSize:
                            str = "any";
                            break;
                        case a.b.AdsAttrs_adSizes:
                            str = "portrait";
                            break;
                        case 2:
                            str = "landscape";
                            break;
                        default:
                            str = "not_set";
                            break;
                    }
                } else {
                    str = "any";
                }
                hashMap.put("native_image_orientation", str);
                if (!vVar.z.isEmpty()) {
                    hashMap.put("native_custom_templates", vVar.z);
                }
                if (vVar.a >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(vVar.Y));
                }
                if (!TextUtils.isEmpty(vVar.W)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(vVar.W));
                    } catch (JSONException e) {
                        fn.c("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (vVar.V != null && vVar.V.size() > 0) {
                for (Integer next : vVar.V) {
                    if (next.intValue() == 2) {
                        hashMap.put("iba", true);
                    } else if (next.intValue() == 1) {
                        hashMap.put("ina", true);
                    }
                }
            }
            if (vVar.d.j) {
                hashMap.put("ene", true);
            }
            if (vVar.O != null) {
                hashMap.put("is_icon_ad", true);
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(vVar.O.a));
            }
            hashMap.put("slotname", vVar.e);
            hashMap.put("pn", vVar.f.packageName);
            if (vVar.g != null) {
                hashMap.put("vc", Integer.valueOf(vVar.g.versionCode));
            }
            hashMap.put("ms", bcVar.g);
            hashMap.put("seq_num", vVar.i);
            hashMap.put("session_id", vVar.j);
            hashMap.put("js", vVar.k.a);
            cc ccVar = bcVar.e;
            Bundle bundle2 = vVar.M;
            Bundle bundle3 = bcVar.b;
            hashMap.put("am", Integer.valueOf(bsVar.a));
            hashMap.put("cog", a(bsVar.b));
            hashMap.put("coh", a(bsVar.c));
            if (!TextUtils.isEmpty(bsVar.d)) {
                hashMap.put("carrier", bsVar.d);
            }
            hashMap.put("gl", bsVar.e);
            if (bsVar.f) {
                hashMap.put("simulator", 1);
            }
            if (bsVar.g) {
                hashMap.put("is_sidewinder", 1);
            }
            hashMap.put("ma", a(bsVar.h));
            hashMap.put("sp", a(bsVar.i));
            hashMap.put("hl", bsVar.j);
            if (!TextUtils.isEmpty(bsVar.k)) {
                hashMap.put("mv", bsVar.k);
            }
            hashMap.put("muv", Integer.valueOf(bsVar.m));
            if (bsVar.n != -2) {
                hashMap.put("cnt", Integer.valueOf(bsVar.n));
            }
            hashMap.put("gnt", Integer.valueOf(bsVar.o));
            hashMap.put("pt", Integer.valueOf(bsVar.p));
            hashMap.put("rm", Integer.valueOf(bsVar.q));
            hashMap.put("riv", Integer.valueOf(bsVar.r));
            Bundle bundle4 = new Bundle();
            bundle4.putString("build_build", bsVar.z);
            bundle4.putString("build_device", bsVar.A);
            Bundle bundle5 = new Bundle();
            bundle5.putBoolean("is_charging", bsVar.w);
            bundle5.putDouble("battery_level", bsVar.v);
            bundle4.putBundle("battery", bundle5);
            Bundle bundle6 = new Bundle();
            bundle6.putInt("active_network_state", bsVar.y);
            bundle6.putBoolean("active_network_metered", bsVar.x);
            if (ccVar != null) {
                Bundle bundle7 = new Bundle();
                bundle7.putInt("predicted_latency_micros", ccVar.a);
                bundle7.putLong("predicted_down_throughput_bps", ccVar.b);
                bundle7.putLong("predicted_up_throughput_bps", ccVar.c);
                bundle6.putBundle("predictions", bundle7);
            }
            bundle4.putBundle("network", bundle6);
            Bundle bundle8 = new Bundle();
            bundle8.putBoolean("is_browser_custom_tabs_capable", bsVar.B);
            bundle4.putBundle("browser", bundle8);
            if (bundle2 != null) {
                Bundle bundle9 = new Bundle();
                bundle9.putString("runtime_free", Long.toString(bundle2.getLong("runtime_free_memory", -1)));
                bundle9.putString("runtime_max", Long.toString(bundle2.getLong("runtime_max_memory", -1)));
                bundle9.putString("runtime_total", Long.toString(bundle2.getLong("runtime_total_memory", -1)));
                bundle9.putString("web_view_count", Integer.toString(bundle2.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle2.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle9.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle9.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle9.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle9.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle9.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle9.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle9.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle9.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle9.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle4.putBundle("android_mem_info", bundle9);
            }
            Bundle bundle10 = new Bundle();
            bundle10.putBundle("parental_controls", bundle3);
            if (!TextUtils.isEmpty(bsVar.l)) {
                bundle10.putString("package_version", bsVar.l);
            }
            bundle4.putBundle("play_store", bundle10);
            hashMap.put("device", bundle4);
            Bundle bundle11 = new Bundle();
            bundle11.putString("doritos", bcVar.f);
            if (((Boolean) app.f().a(asw.ax)).booleanValue()) {
                String str2 = null;
                boolean z4 = false;
                if (bcVar.h != null) {
                    str2 = bcVar.h.a();
                    z4 = bcVar.h.b();
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle11.putString("rdid", str2);
                    bundle11.putBoolean("is_lat", z4);
                    bundle11.putString("idtype", "adid");
                } else {
                    app.a();
                    bundle11.putString("pdid", jc.b(context));
                    bundle11.putString("pdidtype", "ssaid");
                }
            }
            hashMap.put("pii", bundle11);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location != null) {
                a((HashMap<String, Object>) hashMap, location);
            } else if (vVar.c.a >= 2 && vVar.c.k != null) {
                a((HashMap<String, Object>) hashMap, vVar.c.k);
            }
            if (vVar.a >= 2) {
                hashMap.put("quality_signals", vVar.l);
            }
            if (vVar.a >= 4 && vVar.p) {
                hashMap.put("forceHttps", Boolean.valueOf(vVar.p));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (vVar.a >= 5) {
                hashMap.put("u_sd", Float.valueOf(vVar.s));
                hashMap.put("sh", Integer.valueOf(vVar.r));
                hashMap.put("sw", Integer.valueOf(vVar.q));
            } else {
                hashMap.put("u_sd", Float.valueOf(bsVar.s));
                hashMap.put("sh", Integer.valueOf(bsVar.u));
                hashMap.put("sw", Integer.valueOf(bsVar.t));
            }
            if (vVar.a >= 6) {
                if (!TextUtils.isEmpty(vVar.t)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(vVar.t));
                    } catch (JSONException e2) {
                        fn.c("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(vVar.u));
            }
            if (vVar.a >= 7) {
                hashMap.put("request_id", vVar.v);
            }
            if (vVar.a >= 12 && !TextUtils.isEmpty(vVar.B)) {
                hashMap.put("anchor", vVar.B);
            }
            if (vVar.a >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(vVar.C));
            }
            if (vVar.a >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(vVar.I));
            }
            if (vVar.a >= 14 && vVar.D > 0) {
                hashMap.put("target_api", Integer.valueOf(vVar.D));
            }
            if (vVar.a >= 15) {
                hashMap.put("scroll_index", Integer.valueOf(vVar.E == -1 ? -1 : vVar.E));
            }
            if (vVar.a >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(vVar.F));
            }
            if (vVar.a >= 18) {
                if (!TextUtils.isEmpty(vVar.J)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(vVar.J));
                    } catch (JSONException e3) {
                        fn.c("Problem creating json from app settings", e3);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(vVar.K));
            }
            if (vVar.a >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(vVar.L));
            }
            jp jpVar = vVar.k;
            boolean z5 = vVar.Z;
            boolean z6 = bcVar.l;
            boolean z7 = vVar.ab;
            Bundle bundle12 = new Bundle();
            Bundle bundle13 = new Bundle();
            bundle13.putString("cl", "179146524");
            bundle13.putString("rapid_rc", "dev");
            bundle13.putString("rapid_rollup", "HEAD");
            bundle12.putBundle("build_meta", bundle13);
            bundle12.putString("mf", Boolean.toString(((Boolean) app.f().a(asw.bI)).booleanValue()));
            bundle12.putBoolean("instant_app", z5);
            bundle12.putBoolean("lite", jpVar.e);
            bundle12.putBoolean("local_service", z6);
            bundle12.putBoolean("is_privileged_process", z7);
            hashMap.put("sdk_env", bundle12);
            hashMap.put("cache_state", jSONObject);
            if (vVar.a >= 19) {
                hashMap.put("gct", vVar.N);
            }
            if (vVar.a >= 21 && vVar.P) {
                hashMap.put("de", "1");
            }
            if (((Boolean) app.f().a(asw.aF)).booleanValue()) {
                String str3 = vVar.d.a;
                boolean z8 = str3.equals("interstitial_mb") || str3.equals("reward_mb");
                Bundle bundle14 = vVar.Q;
                boolean z9 = bundle14 != null;
                if (z8 && z9) {
                    Bundle bundle15 = new Bundle();
                    bundle15.putBundle("interstitial_pool", bundle14);
                    hashMap.put("counters", bundle15);
                }
            }
            if (vVar.R != null) {
                hashMap.put("gmp_app_id", vVar.R);
            }
            if (vVar.S == null) {
                hashMap.put("fbs_aiid", "");
            } else if ("TIME_OUT".equals(vVar.S)) {
                hashMap.put("sai_timeout", app.f().a(asw.ap));
            } else {
                hashMap.put("fbs_aiid", vVar.S);
            }
            if (vVar.T != null) {
                hashMap.put("fbs_aeid", vVar.T);
            }
            if (vVar.a >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(vVar.aa));
            }
            String str4 = (String) app.f().a(asw.A);
            if (str4 != null && !str4.isEmpty()) {
                if (Build.VERSION.SDK_INT >= ((Integer) app.f().a(asw.B)).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    for (String str5 : str4.split(",")) {
                        hashMap2.put(str5, ja.a(str5));
                    }
                    hashMap.put("video_decoders", hashMap2);
                }
            }
            if (fn.a(2)) {
                String valueOf = String.valueOf(au.e().a((Map<String, ?>) hashMap).toString(2));
                fn.a(valueOf.length() != 0 ? "Ad Request JSON: ".concat(valueOf) : new String("Ad Request JSON: "));
            }
            return au.e().a((Map<String, ?>) hashMap);
        } catch (JSONException e4) {
            String valueOf2 = String.valueOf(e4.getMessage());
            fn.e(valueOf2.length() != 0 ? "Problem serializing ad request to JSON: ".concat(valueOf2) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    public static JSONObject a(z zVar) {
        JSONObject jSONObject = new JSONObject();
        if (zVar.a != null) {
            jSONObject.put("ad_base_url", zVar.a);
        }
        if (zVar.l != null) {
            jSONObject.put("ad_size", zVar.l);
        }
        jSONObject.put("native", zVar.s);
        if (zVar.s) {
            jSONObject.put("ad_json", zVar.b);
        } else {
            jSONObject.put("ad_html", zVar.b);
        }
        if (zVar.n != null) {
            jSONObject.put("debug_dialog", zVar.n);
        }
        if (zVar.L != null) {
            jSONObject.put("debug_signals", zVar.L);
        }
        if (zVar.f != -1) {
            jSONObject.put("interstitial_timeout", ((double) zVar.f) / 1000.0d);
        }
        if (zVar.k == au.g().b()) {
            jSONObject.put("orientation", "portrait");
        } else if (zVar.k == au.g().a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (zVar.c != null) {
            jSONObject.put("click_urls", a(zVar.c));
        }
        if (zVar.e != null) {
            jSONObject.put("impression_urls", a(zVar.e));
        }
        if (zVar.i != null) {
            jSONObject.put("manual_impression_urls", a(zVar.i));
        }
        if (zVar.q != null) {
            jSONObject.put("active_view", zVar.q);
        }
        jSONObject.put("ad_is_javascript", zVar.o);
        if (zVar.p != null) {
            jSONObject.put("ad_passback_url", zVar.p);
        }
        jSONObject.put("mediation", zVar.g);
        jSONObject.put("custom_render_allowed", zVar.r);
        jSONObject.put("content_url_opted_out", zVar.u);
        jSONObject.put("content_vertical_opted_out", zVar.M);
        jSONObject.put("prefetch", zVar.v);
        if (zVar.j != -1) {
            jSONObject.put("refresh_interval_milliseconds", zVar.j);
        }
        if (zVar.h != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", zVar.h);
        }
        if (!TextUtils.isEmpty(zVar.x)) {
            jSONObject.put("gws_query_id", zVar.x);
        }
        jSONObject.put("fluid", zVar.y ? "height" : "");
        jSONObject.put("native_express", zVar.z);
        if (zVar.B != null) {
            jSONObject.put("video_start_urls", a(zVar.B));
        }
        if (zVar.C != null) {
            jSONObject.put("video_complete_urls", a(zVar.C));
        }
        if (zVar.A != null) {
            dw dwVar = zVar.A;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", dwVar.a);
            jSONObject2.put("rb_amount", dwVar.b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", zVar.D);
        jSONObject.put("auto_protection_configuration", zVar.E);
        jSONObject.put("render_in_browser", zVar.I);
        return jSONObject;
    }

    private static void a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }
}
