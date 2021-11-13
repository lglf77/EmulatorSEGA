package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@bfk
public final class mj implements aa<md> {
    private boolean a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            app.a();
            return jc.a(context, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            fn.e(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            return i;
        }
    }

    private static void a(lr lrVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                fn.e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        md mdVar = (md) obj;
        String str = (String) map.get("action");
        if (str == null) {
            fn.e("Action missing from video GMSG.");
            return;
        }
        if (fn.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            fn.b(new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length()).append("Video GMSG: ").append(str).append(" ").append(jSONObject2).toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                fn.e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                mdVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException e) {
                fn.e("Invalid color parameter in video GMSG.");
            }
        } else if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                fn.e("No MIME types specified for decoder properties inspection.");
                lr.a(mdVar, "missingMimeTypes");
            } else if (Build.VERSION.SDK_INT < 16) {
                fn.e("Video decoder properties available on API versions >= 16.");
                lr.a(mdVar, "deficientApiVersion");
            } else {
                HashMap hashMap = new HashMap();
                for (String str4 : str3.split(",")) {
                    hashMap.put(str4, ja.a(str4.trim()));
                }
                lr.a(mdVar, (Map<String, List<Map<String, Object>>>) hashMap);
            }
        } else {
            lu a2 = mdVar.a();
            if (a2 == null) {
                fn.e("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = mdVar.getContext();
                int a3 = a(context, map, "x", 0);
                int a4 = a(context, map, "y", 0);
                int a5 = a(context, map, "w", -1);
                int a6 = a(context, map, "h", -1);
                if (((Boolean) app.f().a(asw.bR)).booleanValue()) {
                    i = Math.min(a5, mdVar.m() - a3);
                    a6 = Math.min(a6, mdVar.l() - a4);
                } else {
                    i = a5;
                }
                try {
                    i2 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException e2) {
                    i2 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || a2.a() != null) {
                    a2.a(a3, a4, i, a6);
                    return;
                }
                a2.a(a3, a4, i, a6, i2, parseBoolean, new mc((String) map.get("flags")));
                lr a7 = a2.a();
                if (a7 != null) {
                    a(a7, map);
                    return;
                }
                return;
            }
            lr a8 = a2.a();
            if (a8 == null) {
                lr.a(mdVar);
            } else if ("click".equals(str)) {
                Context context2 = mdVar.getContext();
                int a9 = a(context2, map, "x", 0);
                int a10 = a(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a9, (float) a10, 0);
                a8.a(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str5 = (String) map.get("time");
                if (str5 == null) {
                    fn.e("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    a8.a((int) (Float.parseFloat(str5) * 1000.0f));
                } catch (NumberFormatException e3) {
                    String valueOf = String.valueOf(str5);
                    fn.e(valueOf.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                a8.setVisibility(4);
            } else if ("load".equals(str)) {
                a8.h();
            } else if ("loadControl".equals(str)) {
                a(a8, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    a8.k();
                } else {
                    a8.l();
                }
            } else if ("pause".equals(str)) {
                a8.i();
            } else if ("play".equals(str)) {
                a8.j();
            } else if ("show".equals(str)) {
                a8.setVisibility(0);
            } else if ("src".equals(str)) {
                a8.a((String) map.get("src"));
            } else if ("touchMove".equals(str)) {
                Context context3 = mdVar.getContext();
                a8.a((float) a(context3, map, "dx", 0), (float) a(context3, map, "dy", 0));
                if (!this.a) {
                    mdVar.f();
                    this.a = true;
                }
            } else if ("volume".equals(str)) {
                String str6 = (String) map.get("volume");
                if (str6 == null) {
                    fn.e("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    a8.a(Float.parseFloat(str6));
                } catch (NumberFormatException e4) {
                    String valueOf2 = String.valueOf(str6);
                    fn.e(valueOf2.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf2) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                a8.m();
            } else {
                String valueOf3 = String.valueOf(str);
                fn.e(valueOf3.length() != 0 ? "Unknown video action: ".concat(valueOf3) : new String("Unknown video action: "));
            }
        }
    }
}
