package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.au;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@bfk
public final class ayz {
    private final Map<aza, azb> a = new HashMap();
    private final LinkedList<aza> b = new LinkedList<>();
    private axv c;

    static Set<String> a(aoy aoy) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aoy.c.keySet());
        Bundle bundle = aoy.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    private static void a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static void a(String str, aza aza) {
        if (fn.a(2)) {
            fn.a(String.format(str, new Object[]{aza}));
        }
    }

    private static String[] a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    static aoy b(aoy aoy) {
        aoy d = d(aoy);
        Bundle bundle = d.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        d.c.putBoolean("_skipMediation", true);
        return d;
    }

    private final String b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((aza) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    private static boolean b(String str) {
        try {
            return Pattern.matches((String) app.f().a(asw.aM), str);
        } catch (RuntimeException e) {
            au.i().a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static aoy c(aoy aoy) {
        aoy d = d(aoy);
        for (String str : ((String) app.f().a(asw.aI)).split(",")) {
            a(d.m, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                a(d.c, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return d;
    }

    private static String c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException e) {
            return str;
        }
    }

    private static aoy d(aoy aoy) {
        Parcel obtain = Parcel.obtain();
        aoy.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        aoy createFromParcel = aoy.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        if (((Boolean) app.f().a(asw.aB)).booleanValue()) {
            aoy.a(createFromParcel);
        }
        return createFromParcel;
    }

    /* access modifiers changed from: package-private */
    public final azc a(aoy aoy, String str) {
        azb azb;
        if (b(str)) {
            return null;
        }
        int i = new bt(this.c.a()).a().n;
        aoy c2 = c(aoy);
        String c3 = c(str);
        aza aza = new aza(c2, c3, i);
        azb azb2 = this.a.get(aza);
        if (azb2 == null) {
            a("Interstitial pool created at %s.", aza);
            azb azb3 = new azb(c2, c3, i);
            this.a.put(aza, azb3);
            azb = azb3;
        } else {
            azb = azb2;
        }
        this.b.remove(aza);
        this.b.add(aza);
        azb.g();
        while (true) {
            if (this.b.size() <= ((Integer) app.f().a(asw.aJ)).intValue()) {
                break;
            }
            aza remove = this.b.remove();
            azb azb4 = this.a.get(remove);
            a("Evicting interstitial queue for %s.", remove);
            while (azb4.d() > 0) {
                azc a2 = azb4.a((aoy) null);
                if (a2.e) {
                    azd.a().c();
                }
                a2.a.F();
            }
            this.a.remove(remove);
        }
        while (azb.d() > 0) {
            azc a3 = azb.a(c2);
            if (a3.e) {
                if (au.k().a() - a3.d > 1000 * ((long) ((Integer) app.f().a(asw.aL)).intValue())) {
                    a("Expired interstitial at %s.", aza);
                    azd.a().b();
                }
            }
            String str2 = a3.b != null ? " (inline) " : " ";
            a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), aza);
            return a3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r2 = r0.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r8 = 2
            r7 = 0
            com.google.android.gms.internal.axv r0 = r9.c
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.util.Map<com.google.android.gms.internal.aza, com.google.android.gms.internal.azb> r0 = r9.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.google.android.gms.internal.aza r1 = (com.google.android.gms.internal.aza) r1
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.azb r0 = (com.google.android.gms.internal.azb) r0
            boolean r2 = com.google.android.gms.internal.fn.a(r8)
            if (r2 == 0) goto L_0x0056
            int r2 = r0.d()
            int r3 = r0.e()
            if (r3 >= r2) goto L_0x0056
            java.lang.String r5 = "Loading %s/%s pooled interstitials for %s."
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r3 = r2 - r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r7] = r3
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r3] = r2
            r6[r8] = r1
            java.lang.String r2 = java.lang.String.format(r5, r6)
            com.google.android.gms.internal.fn.a(r2)
        L_0x0056:
            int r2 = r0.f()
            int r2 = r2 + 0
            r3 = r2
        L_0x005d:
            int r5 = r0.d()
            com.google.android.gms.internal.asl<java.lang.Integer> r2 = com.google.android.gms.internal.asw.aK
            com.google.android.gms.internal.asu r6 = com.google.android.gms.internal.app.f()
            java.lang.Object r2 = r6.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 >= r2) goto L_0x0084
            java.lang.String r2 = "Pooling and loading one new interstitial for %s."
            a((java.lang.String) r2, (com.google.android.gms.internal.aza) r1)
            com.google.android.gms.internal.axv r2 = r9.c
            boolean r2 = r0.a((com.google.android.gms.internal.axv) r2)
            if (r2 == 0) goto L_0x005d
            int r2 = r3 + 1
            r3 = r2
            goto L_0x005d
        L_0x0084:
            com.google.android.gms.internal.azd r0 = com.google.android.gms.internal.azd.a()
            r0.a(r3)
            goto L_0x0011
        L_0x008c:
            com.google.android.gms.internal.axv r0 = r9.c
            if (r0 == 0) goto L_0x0006
            com.google.android.gms.internal.axv r0 = r9.c
            android.content.Context r0 = r0.a()
            java.lang.String r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r7)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            r2.clear()
            java.util.Map<com.google.android.gms.internal.aza, com.google.android.gms.internal.azb> r0 = r9.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x00ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.google.android.gms.internal.aza r1 = (com.google.android.gms.internal.aza) r1
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.azb r0 = (com.google.android.gms.internal.azb) r0
            boolean r4 = r0.h()
            if (r4 == 0) goto L_0x00ad
            com.google.android.gms.internal.azf r4 = new com.google.android.gms.internal.azf
            r4.<init>(r0)
            java.lang.String r0 = r4.a()
            java.lang.String r4 = r1.toString()
            r2.putString(r4, r0)
            java.lang.String r0 = "Saved interstitial queue for %s."
            a((java.lang.String) r0, (com.google.android.gms.internal.aza) r1)
            goto L_0x00ad
        L_0x00e1:
            java.lang.String r0 = "PoolKeys"
            java.lang.String r1 = r9.b()
            r2.putString(r0, r1)
            r2.apply()
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ayz.a():void");
    }

    /* access modifiers changed from: package-private */
    public final void a(axv axv) {
        if (this.c == null) {
            this.c = axv.b();
            if (this.c != null) {
                SharedPreferences sharedPreferences = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.b.size() > 0) {
                    aza remove = this.b.remove();
                    azb azb = this.a.get(remove);
                    a("Flushing interstitial queue for %s.", remove);
                    while (azb.d() > 0) {
                        azb.a((aoy) null).a.F();
                    }
                    this.a.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                        if (!((String) next.getKey()).equals("PoolKeys")) {
                            azf a2 = azf.a((String) next.getValue());
                            aza aza = new aza(a2.a, a2.b, a2.c);
                            if (!this.a.containsKey(aza)) {
                                this.a.put(aza, new azb(a2.a, a2.b, a2.c));
                                hashMap.put(aza.toString(), aza);
                                a("Restored interstitial queue for %s.", aza);
                            }
                        }
                    }
                    for (String str : a(sharedPreferences.getString("PoolKeys", ""))) {
                        aza aza2 = (aza) hashMap.get(str);
                        if (this.a.containsKey(aza2)) {
                            this.b.add(aza2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    au.i().a(e, "InterstitialAdPool.restore");
                    fn.c("Malformed preferences value for InterstitialAdPool.", e);
                    this.a.clear();
                    this.b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(aoy aoy, String str) {
        if (this.c != null) {
            int i = new bt(this.c.a()).a().n;
            aoy c2 = c(aoy);
            String c3 = c(str);
            aza aza = new aza(c2, c3, i);
            azb azb = this.a.get(aza);
            if (azb == null) {
                a("Interstitial pool created at %s.", aza);
                azb = new azb(c2, c3, i);
                this.a.put(aza, azb);
            }
            azb.a(this.c, aoy);
            azb.g();
            a("Inline entry added to the queue at %s.", aza);
        }
    }
}
