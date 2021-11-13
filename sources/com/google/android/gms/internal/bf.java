package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.internal.au;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bf extends af {
    private static final Object a = new Object();
    private static bf b;
    private final Context c;
    private final be d;
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();

    private bf(Context context, be beVar) {
        this.c = context;
        this.d = beVar;
    }

    public static bf a(Context context, be beVar) {
        bf bfVar;
        synchronized (a) {
            if (b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                asw.a(context);
                b = new bf(context, beVar);
                if (context.getApplicationContext() != null) {
                    au.e().c(context);
                }
                fl.a(context);
            }
            bfVar = b;
        }
        return bfVar;
    }

    private static z a(Context context, be beVar, v vVar, ScheduledExecutorService scheduledExecutorService) {
        String string;
        fn.b("Starting ad request from service using: google.afma.request.getAdDictionary");
        atj atj = new atj(((Boolean) app.f().a(asw.H)).booleanValue(), "load_ad", vVar.d.a);
        if (vVar.a > 10 && vVar.A != -1) {
            atj.a(atj.a(vVar.A), "cts");
        }
        ath a2 = atj.a();
        kh<V> a3 = jx.a(beVar.h.a(context), ((Long) app.f().a(asw.ck)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        kh<V> a4 = jx.a(beVar.g.a(context), ((Long) app.f().a(asw.bh)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        kh<String> a5 = beVar.c.a(vVar.g.packageName);
        kh<String> a6 = beVar.i.a(vVar.h, vVar.g);
        Future<bs> a7 = au.o().a(context);
        kh a8 = jx.a(null);
        Bundle bundle = vVar.c.c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (vVar.G && !z) {
            a8 = beVar.f.a(vVar.f);
        }
        kh a9 = jx.a(a8, ((Long) app.f().a(asw.cb)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        Future a10 = ((Boolean) app.f().a(asw.ax)).booleanValue() ? jx.a(beVar.i.a(context), ((Long) app.f().a(asw.ay)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService) : jx.a(null);
        Bundle bundle2 = (vVar.a < 4 || vVar.o == null) ? null : vVar.o;
        ((Boolean) app.f().a(asw.X)).booleanValue();
        au.e();
        if (gw.a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            fn.b("Device is offline.");
        }
        String uuid = vVar.a >= 7 ? vVar.v : UUID.randomUUID().toString();
        new bl(context, uuid, vVar.f.packageName);
        if (vVar.c.c != null && (string = vVar.c.c.getString("_ad")) != null) {
            return bk.a(context, vVar, string);
        }
        List<String> a11 = beVar.d.a(vVar.w);
        Bundle bundle3 = (Bundle) jx.a(a3, null, ((Long) app.f().a(asw.ck)).longValue(), TimeUnit.MILLISECONDS);
        cc ccVar = (cc) jx.a(a4, null);
        Location location = (Location) jx.a(a9, null);
        a.C0015a aVar = (a.C0015a) jx.a(a10, null);
        String str = (String) jx.a(a6, null);
        String str2 = (String) jx.a(a5, null);
        bs bsVar = (bs) jx.a(a7, null);
        if (bsVar == null) {
            fn.e("Error fetching device info. This is not recoverable.");
            return new z(0);
        }
        bc bcVar = new bc();
        bcVar.i = vVar;
        bcVar.j = bsVar;
        bcVar.e = ccVar;
        bcVar.d = location;
        bcVar.b = bundle3;
        bcVar.g = str;
        bcVar.h = aVar;
        if (a11 == null) {
            bcVar.c.clear();
        }
        bcVar.c = a11;
        bcVar.a = bundle2;
        bcVar.f = str2;
        bcVar.k = beVar.b.a(context);
        bcVar.l = beVar.j;
        JSONObject a12 = bk.a(context, bcVar);
        if (a12 == null) {
            return new z(0);
        }
        if (vVar.a < 7) {
            try {
                a12.put("request_id", uuid);
            } catch (JSONException e2) {
            }
        }
        a12.toString();
        atj.a(a2, "arc");
        atj.a();
        kh<V> a13 = jx.a(jx.a(beVar.k.a().b(a12), bg.a, (Executor) scheduledExecutorService), 10, TimeUnit.SECONDS, scheduledExecutorService);
        kh<Void> a14 = beVar.e.a();
        if (a14 != null) {
            jv.a(a14, "AdRequestServiceImpl.loadAd.flags");
        }
        br brVar = (br) jx.a(a13, null);
        if (brVar == null) {
            return new z(0);
        }
        if (brVar.a() != -2) {
            return new z(brVar.a());
        }
        atj.d();
        z zVar = null;
        if (!TextUtils.isEmpty(brVar.i())) {
            zVar = bk.a(context, vVar, brVar.i());
        }
        if (zVar == null && !TextUtils.isEmpty(brVar.e())) {
            zVar = a(vVar, context, vVar.k.a, brVar.e(), str2, brVar, atj, beVar);
        }
        if (zVar == null) {
            zVar = new z(0);
        }
        atj.a(a2, "tts");
        zVar.w = atj.b();
        return zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r7 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5 = new java.io.InputStreamReader(r2.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.google.android.gms.ads.internal.au.e();
        r6 = com.google.android.gms.internal.gw.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.common.util.i.a(r5);
        r12.a(r6);
        a(r7, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, r6, r3);
        r9.a(r7, r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (r20 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        r20.a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r3 = r9.a(r10, r19.j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0126, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0127, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        com.google.android.gms.common.util.i.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bd, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01be, code lost:
        r4 = r5;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0128=Splitter:B:64:0x0128, B:55:0x011d=Splitter:B:55:0x011d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.z a(com.google.android.gms.internal.v r14, android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.br r19, com.google.android.gms.internal.atj r20, com.google.android.gms.internal.be r21) {
        /*
            if (r20 == 0) goto L_0x00f1
            com.google.android.gms.internal.ath r2 = r20.a()
            r4 = r2
        L_0x0007:
            com.google.android.gms.internal.bp r9 = new com.google.android.gms.internal.bp     // Catch:{ IOException -> 0x00fc }
            java.lang.String r2 = r19.c()     // Catch:{ IOException -> 0x00fc }
            r9.<init>(r14, r2)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r3 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r2 = java.lang.String.valueOf(r17)     // Catch:{ IOException -> 0x00fc }
            int r5 = r2.length()     // Catch:{ IOException -> 0x00fc }
            if (r5 == 0) goto L_0x00f5
            java.lang.String r2 = r3.concat(r2)     // Catch:{ IOException -> 0x00fc }
        L_0x0020:
            com.google.android.gms.internal.fn.b(r2)     // Catch:{ IOException -> 0x00fc }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00fc }
            r0 = r17
            r3.<init>(r0)     // Catch:{ IOException -> 0x00fc }
            r2 = 0
            com.google.android.gms.common.util.d r5 = com.google.android.gms.ads.internal.au.k()     // Catch:{ IOException -> 0x00fc }
            long r10 = r5.b()     // Catch:{ IOException -> 0x00fc }
            r7 = r2
            r8 = r3
        L_0x0035:
            java.net.URLConnection r2 = r8.openConnection()     // Catch:{ IOException -> 0x00fc }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x00fc }
            com.google.android.gms.internal.gw r3 = com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0121 }
            r5 = 0
            r0 = r16
            r3.a((android.content.Context) r15, (java.lang.String) r0, (boolean) r5, (java.net.HttpURLConnection) r2)     // Catch:{ all -> 0x0121 }
            boolean r3 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x0121 }
            if (r3 != 0) goto L_0x0058
            boolean r3 = r19.g()     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x0058
            java.lang.String r3 = "x-afma-drt-cookie"
            r0 = r18
            r2.addRequestProperty(r3, r0)     // Catch:{ all -> 0x0121 }
        L_0x0058:
            java.lang.String r3 = r14.H     // Catch:{ all -> 0x0121 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0121 }
            if (r5 != 0) goto L_0x006a
            java.lang.String r5 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.fn.b(r5)     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = "Cookie"
            r2.addRequestProperty(r5, r3)     // Catch:{ all -> 0x0121 }
        L_0x006a:
            r3 = 0
            if (r19 == 0) goto L_0x0097
            java.lang.String r5 = r19.d()     // Catch:{ all -> 0x0121 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0121 }
            if (r5 != 0) goto L_0x0097
            r3 = 1
            r2.setDoOutput(r3)     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = r19.d()     // Catch:{ all -> 0x0121 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x0121 }
            int r5 = r3.length     // Catch:{ all -> 0x0121 }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ all -> 0x0121 }
            r6 = 0
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x011b }
            java.io.OutputStream r12 = r2.getOutputStream()     // Catch:{ all -> 0x011b }
            r5.<init>(r12)     // Catch:{ all -> 0x011b }
            r5.write(r3)     // Catch:{ all -> 0x01c1 }
            com.google.android.gms.common.util.i.a(r5)     // Catch:{ all -> 0x0121 }
        L_0x0097:
            com.google.android.gms.internal.jg r12 = new com.google.android.gms.internal.jg     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = r14.v     // Catch:{ all -> 0x0121 }
            r12.<init>(r5)     // Catch:{ all -> 0x0121 }
            r12.a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ all -> 0x0121 }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x0121 }
            java.util.Map r13 = r2.getHeaderFields()     // Catch:{ all -> 0x0121 }
            r12.a((java.net.HttpURLConnection) r2, (int) r3)     // Catch:{ all -> 0x0121 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 < r5) goto L_0x012c
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 >= r5) goto L_0x012c
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0121 }
            r6 = 0
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0126 }
            java.io.InputStream r8 = r2.getInputStream()     // Catch:{ all -> 0x0126 }
            r5.<init>(r8)     // Catch:{ all -> 0x0126 }
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x01bd }
            java.lang.String r6 = com.google.android.gms.internal.gw.a((java.io.InputStreamReader) r5)     // Catch:{ all -> 0x01bd }
            com.google.android.gms.common.util.i.a(r5)     // Catch:{ all -> 0x0121 }
            r12.a((java.lang.String) r6)     // Catch:{ all -> 0x0121 }
            a((java.lang.String) r7, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, (java.lang.String) r6, (int) r3)     // Catch:{ all -> 0x0121 }
            r9.a(r7, r13, r6)     // Catch:{ all -> 0x0121 }
            if (r20 == 0) goto L_0x00e4
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0121 }
            r5 = 0
            java.lang.String r6 = "ufe"
            r3[r5] = r6     // Catch:{ all -> 0x0121 }
            r0 = r20
            r0.a((com.google.android.gms.internal.ath) r4, (java.lang.String[]) r3)     // Catch:{ all -> 0x0121 }
        L_0x00e4:
            boolean r3 = r19.j()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.z r3 = r9.a((long) r10, (boolean) r3)     // Catch:{ all -> 0x0121 }
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            r2 = r3
        L_0x00f0:
            return r2
        L_0x00f1:
            r2 = 0
            r4 = r2
            goto L_0x0007
        L_0x00f5:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x00fc }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0020
        L_0x00fc:
            r2 = move-exception
            java.lang.String r3 = "Error while connecting to ad server: "
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x01b6
            java.lang.String r2 = r3.concat(r2)
        L_0x0111:
            com.google.android.gms.internal.fn.e(r2)
            com.google.android.gms.internal.z r2 = new com.google.android.gms.internal.z
            r3 = 2
            r2.<init>(r3)
            goto L_0x00f0
        L_0x011b:
            r3 = move-exception
            r4 = r6
        L_0x011d:
            com.google.android.gms.common.util.i.a(r4)     // Catch:{ all -> 0x0121 }
            throw r3     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r3 = move-exception
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            throw r3     // Catch:{ IOException -> 0x00fc }
        L_0x0126:
            r3 = move-exception
            r4 = r6
        L_0x0128:
            com.google.android.gms.common.util.i.a(r4)     // Catch:{ all -> 0x0121 }
            throw r3     // Catch:{ all -> 0x0121 }
        L_0x012c:
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0121 }
            r6 = 0
            a((java.lang.String) r5, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r13, (java.lang.String) r6, (int) r3)     // Catch:{ all -> 0x0121 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r5) goto L_0x0182
            r5 = 400(0x190, float:5.6E-43)
            if (r3 >= r5) goto L_0x0182
            java.lang.String r3 = "Location"
            java.lang.String r3 = r2.getHeaderField(r3)     // Catch:{ all -> 0x0121 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x0158
            java.lang.String r3 = "No location header to follow redirect."
            com.google.android.gms.internal.fn.e(r3)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.z r3 = new com.google.android.gms.internal.z     // Catch:{ all -> 0x0121 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0121 }
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            r2 = r3
            goto L_0x00f0
        L_0x0158:
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x0121 }
            r6.<init>(r3)     // Catch:{ all -> 0x0121 }
            int r5 = r7 + 1
            com.google.android.gms.internal.asl<java.lang.Integer> r3 = com.google.android.gms.internal.asw.cL     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.asu r7 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0121 }
            java.lang.Object r3 = r7.a(r3)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0121 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0121 }
            if (r5 <= r3) goto L_0x01a6
            java.lang.String r3 = "Too many redirects."
            com.google.android.gms.internal.fn.e(r3)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.z r3 = new com.google.android.gms.internal.z     // Catch:{ all -> 0x0121 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0121 }
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            r2 = r3
            goto L_0x00f0
        L_0x0182:
            r4 = 46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r5.<init>(r4)     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = "Received error HTTP response code: "
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.fn.e(r3)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.z r3 = new com.google.android.gms.internal.z     // Catch:{ all -> 0x0121 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0121 }
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            r2 = r3
            goto L_0x00f0
        L_0x01a6:
            r9.a(r13)     // Catch:{ all -> 0x0121 }
            r2.disconnect()     // Catch:{ IOException -> 0x00fc }
            if (r21 == 0) goto L_0x01b2
            r7 = r5
            r8 = r6
            goto L_0x0035
        L_0x01b2:
            r7 = r5
            r8 = r6
            goto L_0x0035
        L_0x01b6:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0111
        L_0x01bd:
            r3 = move-exception
            r4 = r5
            goto L_0x0128
        L_0x01c1:
            r3 = move-exception
            r4 = r5
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bf.a(com.google.android.gms.internal.v, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.br, com.google.android.gms.internal.atj, com.google.android.gms.internal.be):com.google.android.gms.internal.z");
    }

    private static void a(String str, Map<String, List<String>> map, String str2, int i) {
        if (fn.a(2)) {
            fn.a(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String next : map.keySet()) {
                    fn.a(new StringBuilder(String.valueOf(next).length() + 5).append("    ").append(next).append(":").toString());
                    for (String valueOf : map.get(next)) {
                        String valueOf2 = String.valueOf(valueOf);
                        fn.a(valueOf2.length() != 0 ? "      ".concat(valueOf2) : new String("      "));
                    }
                }
            }
            fn.a("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    fn.a(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                fn.a("    null");
            }
            fn.a(new StringBuilder(34).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    public final z a(v vVar) {
        return a(this.c, this.d, vVar, this.e);
    }

    public final void a(ap apVar, ak akVar) {
        fn.a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    public final void a(v vVar, ah ahVar) {
        au.i().a(this.c, vVar.k);
        kh<Void> a2 = gq.a((Runnable) new bh(this, vVar, ahVar));
        au.s().a();
        au.s().b().postDelayed(new bi(this, a2), 60000);
    }
}
