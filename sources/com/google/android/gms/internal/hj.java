package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class hj implements arp {
    private static boolean a = df.a;
    @Deprecated
    private os b;
    private final gi c;
    private ik d;

    public hj(gi giVar) {
        this(giVar, new ik(4096));
    }

    private hj(gi giVar, ik ikVar) {
        this.c = giVar;
        this.b = giVar;
        this.d = ikVar;
    }

    @Deprecated
    public hj(os osVar) {
        this(osVar, new ik(4096));
    }

    @Deprecated
    private hj(os osVar, ik ikVar) {
        this.b = osVar;
        this.c = new fh(osVar);
        this.d = ikVar;
    }

    private static List<aqo> a(List<aqo> list, qe qeVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (aqo a2 : list) {
                treeSet.add(a2.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (qeVar.h != null) {
            if (!qeVar.h.isEmpty()) {
                for (aqo next : qeVar.h) {
                    if (!treeSet.contains(next.a())) {
                        arrayList.add(next);
                    }
                }
            }
        } else if (!qeVar.g.isEmpty()) {
            for (Map.Entry next2 : qeVar.g.entrySet()) {
                if (!treeSet.contains(next2.getKey())) {
                    arrayList.add(new aqo((String) next2.getKey(), (String) next2.getValue()));
                }
            }
        }
        return arrayList;
    }

    private static void a(String str, aws<?> aws, ce ceVar) {
        b i = aws.i();
        int h = aws.h();
        try {
            i.a(ceVar);
            aws.b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(h)}));
        } catch (ce e) {
            aws.b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(h)}));
            throw e;
        }
    }

    private final byte[] a(InputStream inputStream, int i) {
        ov ovVar = new ov(this.d, i);
        if (inputStream == null) {
            try {
                throw new ac();
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        df.a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.d.a((byte[]) null);
                ovVar.close();
                throw th;
            }
        } else {
            byte[] a2 = this.d.a(1024);
            while (true) {
                int read = inputStream.read(a2);
                if (read == -1) {
                    break;
                }
                ovVar.write(a2, 0, read);
            }
            byte[] byteArray = ovVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    df.a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.d.a(a2);
            ovVar.close();
            return byteArray;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        a("socket", r21, new com.google.android.gms.internal.bd());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r3 = r2;
        r2 = java.lang.String.valueOf(r21.e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fa, code lost:
        if (r2.length() != 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        throw new java.lang.RuntimeException(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        r3 = r3.a();
        com.google.android.gms.internal.df.c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r3), r21.e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        if (r4 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013a, code lost:
        r2 = new com.google.android.gms.internal.auq(r3, r4, false, android.os.SystemClock.elapsedRealtime() - r18, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        if (r3 == 401) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014e, code lost:
        a("auth", r21, new com.google.android.gms.internal.a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015c, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0167, code lost:
        throw new com.google.android.gms.internal.avr(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r3 < 400) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0175, code lost:
        throw new com.google.android.gms.internal.all(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0178, code lost:
        if (r3 < 500) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0183, code lost:
        throw new com.google.android.gms.internal.ac(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0189, code lost:
        throw new com.google.android.gms.internal.ac(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018a, code lost:
        a("network", r21, new com.google.android.gms.internal.atp());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0198, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0199, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:2:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8 A[ExcHandler: MalformedURLException (r2v5 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0162 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.auq a(com.google.android.gms.internal.aws<?> r21) {
        /*
            r20 = this;
            long r18 = android.os.SystemClock.elapsedRealtime()
        L_0x0004:
            r3 = 0
            r9 = 0
            java.util.List r8 = java.util.Collections.emptyList()
            com.google.android.gms.internal.qe r4 = r21.f()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            if (r4 != 0) goto L_0x0040
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
        L_0x0014:
            r0 = r20
            com.google.android.gms.internal.gi r4 = r0.c     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            r0 = r21
            com.google.android.gms.internal.oq r17 = r4.a(r0, r2)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            int r3 = r17.a()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            java.util.List r8 = r17.b()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r2 = 304(0x130, float:4.26E-43)
            if (r3 != r2) goto L_0x0088
            com.google.android.gms.internal.qe r2 = r21.f()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            if (r2 != 0) goto L_0x0072
            com.google.android.gms.internal.auq r2 = new com.google.android.gms.internal.auq     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r3 = 304(0x130, float:4.26E-43)
            r4 = 0
            r5 = 1
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            long r6 = r6 - r18
            r2.<init>((int) r3, (byte[]) r4, (boolean) r5, (long) r6, (java.util.List<com.google.android.gms.internal.aqo>) r8)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
        L_0x003f:
            return r2
        L_0x0040:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            java.lang.String r5 = r4.b     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = "If-None-Match"
            java.lang.String r6 = r4.b     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            r2.put(r5, r6)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
        L_0x0050:
            long r6 = r4.d     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            r10 = 0
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0014
            java.lang.String r5 = "If-Modified-Since"
            long r6 = r4.d     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            java.lang.String r4 = com.google.android.gms.internal.np.a((long) r6)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            r2.put(r5, r4)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0198 }
            goto L_0x0014
        L_0x0064:
            r2 = move-exception
            java.lang.String r2 = "socket"
            com.google.android.gms.internal.bd r3 = new com.google.android.gms.internal.bd
            r3.<init>()
            r0 = r21
            a(r2, r0, r3)
            goto L_0x0004
        L_0x0072:
            java.util.List r16 = a((java.util.List<com.google.android.gms.internal.aqo>) r8, (com.google.android.gms.internal.qe) r2)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            com.google.android.gms.internal.auq r10 = new com.google.android.gms.internal.auq     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r11 = 304(0x130, float:4.26E-43)
            byte[] r12 = r2.a     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r13 = 1
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            long r14 = r2 - r18
            r10.<init>((int) r11, (byte[]) r12, (boolean) r13, (long) r14, (java.util.List<com.google.android.gms.internal.aqo>) r16)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r2 = r10
            goto L_0x003f
        L_0x0088:
            java.io.InputStream r2 = r17.d()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            if (r2 == 0) goto L_0x0104
            int r4 = r17.c()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            r0 = r20
            byte[] r4 = r0.a((java.io.InputStream) r2, (int) r4)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
        L_0x0098:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            long r6 = r6 - r18
            boolean r2 = a     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            if (r2 != 0) goto L_0x00a8
            r10 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00da
        L_0x00a8:
            java.lang.String r5 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r2 = 5
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r2 = 0
            r9[r2] = r21     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r2 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r9[r2] = r6     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r6 = 2
            if (r4 == 0) goto L_0x0108
            int r2 = r4.length     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
        L_0x00bf:
            r9[r6] = r2     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r2 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r9[r2] = r6     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r2 = 4
            com.google.android.gms.internal.b r6 = r21.i()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            int r6 = r6.b()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r9[r2] = r6     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            com.google.android.gms.internal.df.b(r5, r9)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
        L_0x00da:
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 < r2) goto L_0x00e2
            r2 = 299(0x12b, float:4.19E-43)
            if (r3 <= r2) goto L_0x010b
        L_0x00e2:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            throw r2     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
        L_0x00e8:
            r2 = move-exception
            r3 = r2
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Bad URL "
            java.lang.String r2 = r21.e()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r6 = r2.length()
            if (r6 == 0) goto L_0x015c
            java.lang.String r2 = r5.concat(r2)
        L_0x0100:
            r4.<init>(r2, r3)
            throw r4
        L_0x0104:
            r2 = 0
            byte[] r4 = new byte[r2]     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x019b }
            goto L_0x0098
        L_0x0108:
            java.lang.String r2 = "null"
            goto L_0x00bf
        L_0x010b:
            com.google.android.gms.internal.auq r2 = new com.google.android.gms.internal.auq     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            r5 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            long r6 = r6 - r18
            r2.<init>((int) r3, (byte[]) r4, (boolean) r5, (long) r6, (java.util.List<com.google.android.gms.internal.aqo>) r8)     // Catch:{ SocketTimeoutException -> 0x0064, MalformedURLException -> 0x00e8, IOException -> 0x0119 }
            goto L_0x003f
        L_0x0119:
            r2 = move-exception
            r3 = r17
        L_0x011c:
            if (r3 == 0) goto L_0x0162
            int r3 = r3.a()
            java.lang.String r2 = "Unexpected response code %d for %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5[r6] = r7
            r6 = 1
            java.lang.String r7 = r21.e()
            r5[r6] = r7
            com.google.android.gms.internal.df.c(r2, r5)
            if (r4 == 0) goto L_0x018a
            com.google.android.gms.internal.auq r2 = new com.google.android.gms.internal.auq
            r5 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r18
            r2.<init>((int) r3, (byte[]) r4, (boolean) r5, (long) r6, (java.util.List<com.google.android.gms.internal.aqo>) r8)
            r4 = 401(0x191, float:5.62E-43)
            if (r3 == r4) goto L_0x014e
            r4 = 403(0x193, float:5.65E-43)
            if (r3 != r4) goto L_0x0168
        L_0x014e:
            java.lang.String r3 = "auth"
            com.google.android.gms.internal.a r4 = new com.google.android.gms.internal.a
            r4.<init>(r2)
            r0 = r21
            a(r3, r0, r4)
            goto L_0x0004
        L_0x015c:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
            goto L_0x0100
        L_0x0162:
            com.google.android.gms.internal.avr r3 = new com.google.android.gms.internal.avr
            r3.<init>(r2)
            throw r3
        L_0x0168:
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x0176
            r4 = 499(0x1f3, float:6.99E-43)
            if (r3 > r4) goto L_0x0176
            com.google.android.gms.internal.all r3 = new com.google.android.gms.internal.all
            r3.<init>(r2)
            throw r3
        L_0x0176:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 < r4) goto L_0x0184
            r4 = 599(0x257, float:8.4E-43)
            if (r3 > r4) goto L_0x0184
            com.google.android.gms.internal.ac r3 = new com.google.android.gms.internal.ac
            r3.<init>(r2)
            throw r3
        L_0x0184:
            com.google.android.gms.internal.ac r3 = new com.google.android.gms.internal.ac
            r3.<init>(r2)
            throw r3
        L_0x018a:
            java.lang.String r2 = "network"
            com.google.android.gms.internal.atp r3 = new com.google.android.gms.internal.atp
            r3.<init>()
            r0 = r21
            a(r2, r0, r3)
            goto L_0x0004
        L_0x0198:
            r2 = move-exception
            r4 = r9
            goto L_0x011c
        L_0x019b:
            r2 = move-exception
            r4 = r9
            r3 = r17
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hj.a(com.google.android.gms.internal.aws):com.google.android.gms.internal.auq");
    }
}
