package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class bao implements baa {
    private final v a;
    private final bar b;
    private final Context c;
    private final Object d = new Object();
    private final bac e;
    private final boolean f;
    private final long g;
    private final long h;
    private final atj i;
    private final boolean j;
    private final String k;
    private boolean l = false;
    private baf m;
    private List<bai> n = new ArrayList();
    private final boolean o;

    public bao(Context context, v vVar, bar bar, bac bac, boolean z, boolean z2, String str, long j2, long j3, atj atj, boolean z3) {
        this.c = context;
        this.a = vVar;
        this.b = bar;
        this.e = bac;
        this.f = z;
        this.j = z2;
        this.k = str;
        this.g = j2;
        this.h = j3;
        this.i = atj;
        this.o = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        r2 = r24.m.a(r24.g, r24.h);
        r24.n.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0106, code lost:
        if (r2.a != 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0108, code lost:
        com.google.android.gms.internal.fn.b("Adapter succeeded.");
        r24.i.a("mediation_network_succeed", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011a, code lost:
        if (r18.isEmpty() != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        r24.i.a("mediation_networks_fail", android.text.TextUtils.join(",", r18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012d, code lost:
        r24.i.a(r22, "mls");
        r24.i.a(r19, "ttm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0154, code lost:
        r18.add(r4);
        r24.i.a(r22, "mlf");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016c, code lost:
        if (r2.c == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016e, code lost:
        com.google.android.gms.internal.gw.a.post(new com.google.android.gms.internal.bap(r24, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.bai a(java.util.List<com.google.android.gms.internal.bab> r25) {
        /*
            r24 = this;
            java.lang.String r2 = "Starting mediation."
            com.google.android.gms.internal.fn.b(r2)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            r0 = r24
            com.google.android.gms.internal.atj r2 = r0.i
            com.google.android.gms.internal.ath r19 = r2.a()
            r0 = r24
            com.google.android.gms.internal.v r2 = r0.a
            com.google.android.gms.internal.apc r2 = r2.d
            r3 = 2
            int[] r3 = new int[r3]
            com.google.android.gms.internal.apc[] r4 = r2.g
            if (r4 == 0) goto L_0x019b
            com.google.android.gms.ads.internal.au.v()
            r0 = r24
            java.lang.String r4 = r0.k
            boolean r4 = com.google.android.gms.internal.bak.a((java.lang.String) r4, (int[]) r3)
            if (r4 == 0) goto L_0x019b
            r4 = 0
            r4 = r3[r4]
            r5 = 1
            r5 = r3[r5]
            com.google.android.gms.internal.apc[] r6 = r2.g
            int r7 = r6.length
            r3 = 0
        L_0x0036:
            if (r3 >= r7) goto L_0x019b
            r9 = r6[r3]
            int r8 = r9.e
            if (r4 != r8) goto L_0x0096
            int r8 = r9.b
            if (r5 != r8) goto L_0x0096
        L_0x0042:
            java.util.Iterator r20 = r25.iterator()
        L_0x0046:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x017c
            java.lang.Object r7 = r20.next()
            com.google.android.gms.internal.bab r7 = (com.google.android.gms.internal.bab) r7
            java.lang.String r3 = "Trying mediation network: "
            java.lang.String r2 = r7.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0099
            java.lang.String r2 = r3.concat(r2)
        L_0x0064:
            com.google.android.gms.internal.fn.d(r2)
            java.util.List<java.lang.String> r2 = r7.c
            java.util.Iterator r21 = r2.iterator()
        L_0x006d:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r4 = r21.next()
            java.lang.String r4 = (java.lang.String) r4
            r0 = r24
            com.google.android.gms.internal.atj r2 = r0.i
            com.google.android.gms.internal.ath r22 = r2.a()
            r0 = r24
            java.lang.Object r0 = r0.d
            r23 = r0
            monitor-enter(r23)
            r0 = r24
            boolean r2 = r0.l     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x009f
            com.google.android.gms.internal.bai r2 = new com.google.android.gms.internal.bai     // Catch:{ all -> 0x0151 }
            r3 = -1
            r2.<init>(r3)     // Catch:{ all -> 0x0151 }
            monitor-exit(r23)     // Catch:{ all -> 0x0151 }
        L_0x0095:
            return r2
        L_0x0096:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0099:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0064
        L_0x009f:
            com.google.android.gms.internal.baf r2 = new com.google.android.gms.internal.baf     // Catch:{ all -> 0x0151 }
            r0 = r24
            android.content.Context r3 = r0.c     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.bar r5 = r0.b     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.bac r6 = r0.e     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r8 = r0.a     // Catch:{ all -> 0x0151 }
            com.google.android.gms.internal.aoy r8 = r8.c     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r10 = r0.a     // Catch:{ all -> 0x0151 }
            com.google.android.gms.internal.jp r10 = r10.k     // Catch:{ all -> 0x0151 }
            r0 = r24
            boolean r11 = r0.f     // Catch:{ all -> 0x0151 }
            r0 = r24
            boolean r12 = r0.j     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r13 = r0.a     // Catch:{ all -> 0x0151 }
            com.google.android.gms.internal.auv r13 = r13.y     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r14 = r0.a     // Catch:{ all -> 0x0151 }
            java.util.List<java.lang.String> r14 = r14.n     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r15 = r0.a     // Catch:{ all -> 0x0151 }
            java.util.List<java.lang.String> r15 = r15.z     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.v r0 = r0.a     // Catch:{ all -> 0x0151 }
            r16 = r0
            r0 = r16
            java.util.List<java.lang.String> r0 = r0.X     // Catch:{ all -> 0x0151 }
            r16 = r0
            r0 = r24
            boolean r0 = r0.o     // Catch:{ all -> 0x0151 }
            r17 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0151 }
            r0 = r24
            r0.m = r2     // Catch:{ all -> 0x0151 }
            monitor-exit(r23)     // Catch:{ all -> 0x0151 }
            r0 = r24
            com.google.android.gms.internal.baf r2 = r0.m
            r0 = r24
            long r10 = r0.g
            r0 = r24
            long r12 = r0.h
            com.google.android.gms.internal.bai r2 = r2.a((long) r10, (long) r12)
            r0 = r24
            java.util.List<com.google.android.gms.internal.bai> r3 = r0.n
            r3.add(r2)
            int r3 = r2.a
            if (r3 != 0) goto L_0x0154
            java.lang.String r3 = "Adapter succeeded."
            com.google.android.gms.internal.fn.b(r3)
            r0 = r24
            com.google.android.gms.internal.atj r3 = r0.i
            java.lang.String r5 = "mediation_network_succeed"
            r3.a((java.lang.String) r5, (java.lang.String) r4)
            boolean r3 = r18.isEmpty()
            if (r3 != 0) goto L_0x012d
            r0 = r24
            com.google.android.gms.internal.atj r3 = r0.i
            java.lang.String r4 = "mediation_networks_fail"
            java.lang.String r5 = ","
            r0 = r18
            java.lang.String r5 = android.text.TextUtils.join(r5, r0)
            r3.a((java.lang.String) r4, (java.lang.String) r5)
        L_0x012d:
            r0 = r24
            com.google.android.gms.internal.atj r3 = r0.i
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            java.lang.String r6 = "mls"
            r4[r5] = r6
            r0 = r22
            r3.a((com.google.android.gms.internal.ath) r0, (java.lang.String[]) r4)
            r0 = r24
            com.google.android.gms.internal.atj r3 = r0.i
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            java.lang.String r6 = "ttm"
            r4[r5] = r6
            r0 = r19
            r3.a((com.google.android.gms.internal.ath) r0, (java.lang.String[]) r4)
            goto L_0x0095
        L_0x0151:
            r2 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0151 }
            throw r2
        L_0x0154:
            r0 = r18
            r0.add(r4)
            r0 = r24
            com.google.android.gms.internal.atj r3 = r0.i
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            java.lang.String r6 = "mlf"
            r4[r5] = r6
            r0 = r22
            r3.a((com.google.android.gms.internal.ath) r0, (java.lang.String[]) r4)
            com.google.android.gms.internal.bav r3 = r2.c
            if (r3 == 0) goto L_0x006d
            android.os.Handler r3 = com.google.android.gms.internal.gw.a
            com.google.android.gms.internal.bap r4 = new com.google.android.gms.internal.bap
            r0 = r24
            r4.<init>(r0, r2)
            r3.post(r4)
            goto L_0x006d
        L_0x017c:
            boolean r2 = r18.isEmpty()
            if (r2 != 0) goto L_0x0193
            r0 = r24
            com.google.android.gms.internal.atj r2 = r0.i
            java.lang.String r3 = "mediation_networks_fail"
            java.lang.String r4 = ","
            r0 = r18
            java.lang.String r4 = android.text.TextUtils.join(r4, r0)
            r2.a((java.lang.String) r3, (java.lang.String) r4)
        L_0x0193:
            com.google.android.gms.internal.bai r2 = new com.google.android.gms.internal.bai
            r3 = 1
            r2.<init>(r3)
            goto L_0x0095
        L_0x019b:
            r9 = r2
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bao.a(java.util.List):com.google.android.gms.internal.bai");
    }

    public final void a() {
        synchronized (this.d) {
            this.l = true;
            if (this.m != null) {
                this.m.a();
            }
        }
    }

    public final List<bai> b() {
        return this.n;
    }
}
