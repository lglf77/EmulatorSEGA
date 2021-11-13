package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bp {
    private ab A;
    private boolean B = false;
    private String C;
    private List<String> D;
    private boolean E;
    private String F;
    private ee G;
    private boolean H;
    private boolean I;
    private final v J;
    private String a;
    private String b;
    private String c;
    private List<String> d;
    private String e;
    private String f;
    private String g;
    private List<String> h;
    private long i = -1;
    private boolean j = false;
    private final long k = -1;
    private List<String> l;
    private long m = -1;
    private int n = -1;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private boolean s = true;
    private String t = "";
    private boolean u = false;
    private boolean v = false;
    private dw w;
    private List<String> x;
    private List<String> y;
    private boolean z = false;

    public bp(v vVar, String str) {
        this.b = str;
        this.J = vVar;
    }

    private static String a(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private static long b(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e2) {
                fn.e(new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    private static List<String> c(Map<String, List<String>> map, String str) {
        String str2;
        List list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    private static boolean d(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    public final z a(long j2, boolean z2) {
        return new z(this.J, this.b, this.c, this.d, this.h, this.i, this.j, -1, this.l, this.m, this.n, this.a, j2, this.f, this.g, this.o, this.p, this.q, this.r, false, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.e, this.s, this.H, this.I, z2 ? 2 : 1);
    }

    public final void a(String str, Map<String, List<String>> map, String str2) {
        this.c = str2;
        a(map);
    }

    public final void a(Map<String, List<String>> map) {
        this.a = a(map, "X-Afma-Ad-Size");
        this.F = a(map, "X-Afma-Ad-Slot-Size");
        List<String> c2 = c(map, "X-Afma-Click-Tracking-Urls");
        if (c2 != null) {
            this.d = c2;
        }
        this.e = a(map, "X-Afma-Debug-Signals");
        List list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f = (String) list.get(0);
        }
        List<String> c3 = c(map, "X-Afma-Tracking-Urls");
        if (c3 != null) {
            this.h = c3;
        }
        long b2 = b(map, "X-Afma-Interstitial-Timeout");
        if (b2 != -1) {
            this.i = b2;
        }
        this.j |= d(map, "X-Afma-Mediation");
        List<String> c4 = c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.l = c4;
        }
        long b3 = b(map, "X-Afma-Refresh-Rate");
        if (b3 != -1) {
            this.m = b3;
        }
        List list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.n = au.g().b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.n = au.g().a();
            }
        }
        this.g = a(map, "X-Afma-ActiveView");
        List list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.q = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.o |= d(map, "X-Afma-Custom-Rendering-Allowed");
        this.p = "native".equals(a(map, "X-Afma-Ad-Format"));
        List list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.r = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.s = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.t = (String) list6.get(0);
        }
        String a2 = a(map, "X-Afma-Fluid");
        if (a2 != null && a2.equals("height")) {
            this.u = true;
        }
        this.v = "native_express".equals(a(map, "X-Afma-Ad-Format"));
        this.w = dw.a(a(map, "X-Afma-Rewards"));
        if (this.x == null) {
            this.x = c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.y == null) {
            this.y = c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.z |= d(map, "X-Afma-Use-Displayed-Impression");
        this.B |= d(map, "X-Afma-Auto-Collect-Location");
        this.C = a(map, "Set-Cookie");
        String a3 = a(map, "X-Afma-Auto-Protection-Configuration");
        if (a3 == null || TextUtils.isEmpty(a3)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f);
            }
            boolean booleanValue = ((Boolean) app.f().a(asw.e)).booleanValue();
            String builder = buildUpon.toString();
            this.A = new ab(booleanValue, Arrays.asList(new String[]{new StringBuilder(String.valueOf(builder).length() + 18 + String.valueOf("navigationURL").length()).append(builder).append("&").append("navigationURL").append("={NAVIGATION_URL}").toString()}));
        } else {
            try {
                this.A = ab.a(new JSONObject(a3));
            } catch (JSONException e2) {
                fn.c("Error parsing configuration JSON", e2);
                this.A = new ab();
            }
        }
        List<String> c5 = c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.D = c5;
        }
        String a4 = a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.G = ee.a(new JSONObject(a4));
            } catch (JSONException e3) {
                fn.c("Error parsing safe browsing header", e3);
            }
        }
        this.E |= d(map, "X-Afma-Render-In-Browser");
        String a5 = a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.H = new JSONObject(a5).getBoolean("never_pool");
            } catch (JSONException e4) {
                fn.c("Error parsing interstitial pool header", e4);
            }
        }
        this.I = d(map, "X-Afma-Custom-Close-Blocked");
    }
}
