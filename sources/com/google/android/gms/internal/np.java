package com.google.android.gms.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

public final class np {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            df.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static qe a(auq auq) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = auq.c;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = map.get("Date");
        if (str != null) {
            j3 = a(str);
        }
        String str2 = map.get("Cache-Control");
        if (str2 != null) {
            String[] split = str2.split(",");
            z = false;
            long j6 = 0;
            long j7 = 0;
            for (String trim : split) {
                String trim2 = trim.trim();
                if (trim2.equals("no-cache") || trim2.equals("no-store")) {
                    return null;
                }
                if (trim2.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim2.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim2.startsWith("stale-while-revalidate=")) {
                    try {
                        j6 = Long.parseLong(trim2.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim2.equals("must-revalidate") || trim2.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j4 = j7;
            j5 = j6;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        String str3 = map.get("Expires");
        long a = str3 != null ? a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a2 = str4 != null ? a(str4) : 0;
        String str5 = map.get("ETag");
        if (z2) {
            j2 = currentTimeMillis + (1000 * j4);
            j = z ? j2 : (1000 * j5) + j2;
        } else if (j3 <= 0 || a < j3) {
            j = 0;
            j2 = 0;
        } else {
            j = (a - j3) + currentTimeMillis;
            j2 = j;
        }
        qe qeVar = new qe();
        qeVar.a = auq.b;
        qeVar.b = str5;
        qeVar.f = j2;
        qeVar.e = j;
        qeVar.c = j3;
        qeVar.d = a2;
        qeVar.g = map;
        qeVar.h = auq.d;
        return qeVar;
    }

    static String a(long j) {
        return a().format(new Date(j));
    }

    public static String a(Map<String, String> map) {
        String str = map.get("Content-Type");
        if (str != null) {
            String[] split = str.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    static Map<String, String> a(List<aqo> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (aqo next : list) {
            treeMap.put(next.a(), next.b());
        }
        return treeMap;
    }

    static List<aqo> b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new aqo((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }
}
