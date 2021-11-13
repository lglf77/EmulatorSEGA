package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

public final class aey extends aft {
    private static volatile pz d = null;
    private static final Object e = new Object();
    private oy f = null;

    public aey(yj yjVar, String str, String str2, pb pbVar, int i, int i2, oy oyVar) {
        super(yjVar, str, str2, pbVar, i, 27);
        this.f = oyVar;
    }

    private final String c() {
        try {
            if (this.a.l() != null) {
                this.a.l().get();
            }
            pb k = this.a.k();
            if (!(k == null || k.n == null)) {
                return k.n;
            }
        } catch (InterruptedException | ExecutionException e2) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            r4 = 2
            r1 = 1
            r2 = 0
            com.google.android.gms.internal.pz r0 = d
            if (r0 == 0) goto L_0x0029
            com.google.android.gms.internal.pz r0 = d
            java.lang.String r0 = r0.a
            boolean r0 = com.google.android.gms.internal.zz.b(r0)
            if (r0 != 0) goto L_0x0029
            com.google.android.gms.internal.pz r0 = d
            java.lang.String r0 = r0.a
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0029
            com.google.android.gms.internal.pz r0 = d
            java.lang.String r0 = r0.a
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00ad
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x0078
            java.lang.Object r5 = e
            monitor-enter(r5)
            com.google.android.gms.internal.oy r0 = r10.f     // Catch:{ all -> 0x0105 }
            r0 = 0
            boolean r0 = com.google.android.gms.internal.zz.b(r0)     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00b0
            r0 = 4
            r3 = r0
        L_0x003a:
            java.lang.reflect.Method r6 = r10.c     // Catch:{ all -> 0x0105 }
            r7 = 0
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x0105 }
            r0 = 0
            com.google.android.gms.internal.yj r9 = r10.a     // Catch:{ all -> 0x0105 }
            android.content.Context r9 = r9.a()     // Catch:{ all -> 0x0105 }
            r8[r0] = r9     // Catch:{ all -> 0x0105 }
            r9 = 1
            if (r3 != r4) goto L_0x00f9
            r0 = r1
        L_0x004d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0105 }
            r8[r9] = r0     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r6.invoke(r7, r8)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0105 }
            com.google.android.gms.internal.pz r1 = new com.google.android.gms.internal.pz     // Catch:{ all -> 0x0105 }
            r1.<init>(r0)     // Catch:{ all -> 0x0105 }
            d = r1     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r1.a     // Catch:{ all -> 0x0105 }
            boolean r0 = com.google.android.gms.internal.zz.b(r0)     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x0074
            com.google.android.gms.internal.pz r0 = d     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "E"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0077
        L_0x0074:
            switch(r3) {
                case 3: goto L_0x0108;
                case 4: goto L_0x00fc;
                default: goto L_0x0077;
            }     // Catch:{ all -> 0x0105 }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0105 }
        L_0x0078:
            com.google.android.gms.internal.pb r1 = r10.b
            monitor-enter(r1)
            com.google.android.gms.internal.pz r0 = d     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.pb r0 = r10.b     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pz r2 = d     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0118 }
            r0.n = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pb r0 = r10.b     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pz r2 = d     // Catch:{ all -> 0x0118 }
            long r2 = r2.b     // Catch:{ all -> 0x0118 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0118 }
            r0.t = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pb r0 = r10.b     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pz r2 = d     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0118 }
            r0.s = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pb r0 = r10.b     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pz r2 = d     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x0118 }
            r0.C = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pb r0 = r10.b     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.pz r2 = d     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0118 }
            r0.D = r2     // Catch:{ all -> 0x0118 }
        L_0x00ab:
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            return
        L_0x00ad:
            r0 = r2
            goto L_0x002a
        L_0x00b0:
            com.google.android.gms.internal.oy r0 = r10.f     // Catch:{ all -> 0x0105 }
            r0 = 0
            com.google.android.gms.internal.zz.b(r0)     // Catch:{ all -> 0x0105 }
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00f6
            com.google.android.gms.internal.yj r0 = r10.a     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.i()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.bB     // Catch:{ all -> 0x0105 }
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r3.a(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.bC     // Catch:{ all -> 0x0105 }
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r3.a(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00f4
            r0 = r1
        L_0x00ee:
            if (r0 == 0) goto L_0x00f6
            r0 = 3
            r3 = r0
            goto L_0x003a
        L_0x00f4:
            r0 = r2
            goto L_0x00ee
        L_0x00f6:
            r3 = r4
            goto L_0x003a
        L_0x00f9:
            r0 = r2
            goto L_0x004d
        L_0x00fc:
            com.google.android.gms.internal.pz r0 = d     // Catch:{ all -> 0x0105 }
            r1 = 0
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x0105 }
            r0.a = r1     // Catch:{ all -> 0x0105 }
            goto L_0x0077
        L_0x0105:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0105 }
            throw r0
        L_0x0108:
            java.lang.String r0 = r10.c()     // Catch:{ all -> 0x0105 }
            boolean r1 = com.google.android.gms.internal.zz.b(r0)     // Catch:{ all -> 0x0105 }
            if (r1 != 0) goto L_0x0077
            com.google.android.gms.internal.pz r1 = d     // Catch:{ all -> 0x0105 }
            r1.a = r0     // Catch:{ all -> 0x0105 }
            goto L_0x0077
        L_0x0118:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aey.a():void");
    }
}
