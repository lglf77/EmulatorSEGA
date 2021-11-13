package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

@bfk
public final class mt implements aa<md> {
    private mp a;

    private static Integer a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException e) {
            String str2 = map.get(str);
            fn.e(new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length()).append("Precache invalid numeric parameter '").append(str).append("': ").append(str2).toString());
            return null;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        md mdVar = (md) obj;
        au.x();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                if (this.a != null) {
                    fn.e("Threadless precache task has already started.");
                    return;
                } else if (mn.b(mdVar) != null) {
                    fn.e("Precache task is already running.");
                    return;
                } else if (mdVar.e() == null) {
                    fn.e("Precache requires a dependency provider.");
                    return;
                } else {
                    mc mcVar = new mc((String) map.get("flags"));
                    Integer a2 = a(map, "notifyBytes");
                    Integer a3 = a(map, "notifyMillis");
                    Integer a4 = a(map, "player");
                    if (a4 == null) {
                        a4 = 0;
                    }
                    mp a5 = mdVar.e().a.a(mdVar, a4.intValue(), (String) null, mcVar);
                    if ((a2 == null && a3 == null) ? false : true) {
                        String[] split = mcVar.a.split(",");
                        int length = split.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            String str2 = split[i];
                            if (!str2.equals("1") && !str2.equals("2")) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (z) {
                            if (a2 != null) {
                                a2.intValue();
                            } else {
                                a3.intValue();
                            }
                            this.a = a5;
                        }
                    }
                    new ml(mdVar, a5, str).d();
                }
            } else if (mn.b(mdVar) == null && this.a == null) {
                fn.e("Precache must specify a source.");
                return;
            }
            Integer a6 = a(map, "minBufferMs");
            if (a6 != null) {
                a6.intValue();
            }
            Integer a7 = a(map, "maxBufferMs");
            if (a7 != null) {
                a7.intValue();
            }
            Integer a8 = a(map, "bufferForPlaybackMs");
            if (a8 != null) {
                a8.intValue();
            }
            Integer a9 = a(map, "bufferForPlaybackAfterRebufferMs");
            if (a9 != null) {
                a9.intValue();
            }
        } else if (this.a != null) {
            this.a.a();
        } else if (!mn.a(mdVar)) {
            fn.e("Precache abort but no precache task running.");
        }
    }
}
