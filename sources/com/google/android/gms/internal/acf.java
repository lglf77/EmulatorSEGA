package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class acf extends ahc<acf, a> implements aif {
    /* access modifiers changed from: private */
    public static final acf g;
    private static volatile aij<acf> h;
    private String d = "";
    private age e = age.a;
    private int f;

    public static final class a extends ahc.a<acf, a> implements aif {
        private a() {
            super(acf.g);
        }

        /* synthetic */ a(acg acg) {
            this();
        }
    }

    static {
        acf acf = new acf();
        g = acf;
        acf.a(ahc.g.f, (Object) null, (Object) null);
        acf.b.c();
    }

    private acf() {
    }

    public static acf c() {
        return g;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 181 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            r0 = 0
            r2 = 0
            r1 = 1
            int[] r3 = com.google.android.gms.internal.acg.a
            int r4 = r7 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x007b;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00f5;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.acf r6 = new com.google.android.gms.internal.acf
            r6.<init>()
        L_0x0017:
            return r6
        L_0x0018:
            com.google.android.gms.internal.acf r6 = g
            goto L_0x0017
        L_0x001b:
            r6 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.acf$a r6 = new com.google.android.gms.internal.acf$a
            r6.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
            com.google.android.gms.internal.acf r9 = (com.google.android.gms.internal.acf) r9
            java.lang.String r0 = r6.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006f
            r0 = r1
        L_0x0030:
            java.lang.String r4 = r6.d
            java.lang.String r3 = r9.d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0071
            r3 = r1
        L_0x003b:
            java.lang.String r5 = r9.d
            java.lang.String r0 = r8.a((boolean) r0, (java.lang.String) r4, (boolean) r3, (java.lang.String) r5)
            r6.d = r0
            com.google.android.gms.internal.age r0 = r6.e
            com.google.android.gms.internal.age r3 = com.google.android.gms.internal.age.a
            if (r0 == r3) goto L_0x0073
            r0 = r1
        L_0x004a:
            com.google.android.gms.internal.age r4 = r6.e
            com.google.android.gms.internal.age r3 = r9.e
            com.google.android.gms.internal.age r5 = com.google.android.gms.internal.age.a
            if (r3 == r5) goto L_0x0075
            r3 = r1
        L_0x0053:
            com.google.android.gms.internal.age r5 = r9.e
            com.google.android.gms.internal.age r0 = r8.a((boolean) r0, (com.google.android.gms.internal.age) r4, (boolean) r3, (com.google.android.gms.internal.age) r5)
            r6.e = r0
            int r0 = r6.f
            if (r0 == 0) goto L_0x0077
            r0 = r1
        L_0x0060:
            int r3 = r6.f
            int r4 = r9.f
            if (r4 == 0) goto L_0x0079
        L_0x0066:
            int r2 = r9.f
            int r0 = r8.a((boolean) r0, (int) r3, (boolean) r1, (int) r2)
            r6.f = r0
            goto L_0x0017
        L_0x006f:
            r0 = r2
            goto L_0x0030
        L_0x0071:
            r3 = r2
            goto L_0x003b
        L_0x0073:
            r0 = r2
            goto L_0x004a
        L_0x0075:
            r3 = r2
            goto L_0x0053
        L_0x0077:
            r0 = r2
            goto L_0x0060
        L_0x0079:
            r1 = r2
            goto L_0x0066
        L_0x007b:
            com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
            com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
            if (r9 != 0) goto L_0x0088
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0087:
            r2 = r1
        L_0x0088:
            if (r2 != 0) goto L_0x00cf
            int r0 = r8.a()     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            switch(r0) {
                case 0: goto L_0x0087;
                case 10: goto L_0x0099;
                case 18: goto L_0x00ad;
                case 24: goto L_0x00c8;
                default: goto L_0x0091;
            }     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
        L_0x0091:
            boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            if (r0 != 0) goto L_0x0088
            r2 = r1
            goto L_0x0088
        L_0x0099:
            java.lang.String r0 = r8.f()     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            r6.d = r0     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            goto L_0x0088
        L_0x00a0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x00ab }
            r1.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            throw r0
        L_0x00ad:
            com.google.android.gms.internal.age r0 = r8.g()     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            r6.e = r0     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            goto L_0x0088
        L_0x00b4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ab }
            r2.<init>(r0)     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x00ab }
            r1.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00c8:
            int r0 = r8.i()     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            r6.f = r0     // Catch:{ ahi -> 0x00a0, IOException -> 0x00b4 }
            goto L_0x0088
        L_0x00cf:
            com.google.android.gms.internal.acf r6 = g
            goto L_0x0017
        L_0x00d3:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acf> r0 = h
            if (r0 != 0) goto L_0x00e8
            java.lang.Class<com.google.android.gms.internal.acf> r1 = com.google.android.gms.internal.acf.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acf> r0 = h     // Catch:{ all -> 0x00ec }
            if (r0 != 0) goto L_0x00e7
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00ec }
            com.google.android.gms.internal.acf r2 = g     // Catch:{ all -> 0x00ec }
            r0.<init>(r2)     // Catch:{ all -> 0x00ec }
            h = r0     // Catch:{ all -> 0x00ec }
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
        L_0x00e8:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acf> r6 = h
            goto L_0x0017
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            throw r0
        L_0x00ef:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00f5:
            r6 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acf.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String a() {
        return this.d;
    }

    public final void a(agq agq) {
        if (!this.d.isEmpty()) {
            agq.a(1, this.d);
        }
        if (!this.e.b()) {
            agq.a(2, this.e);
        }
        if (this.f != acv.UNKNOWN_PREFIX.a()) {
            agq.b(3, this.f);
        }
        this.b.a(agq);
    }

    public final age b() {
        return this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.d.isEmpty()) {
            i2 = agq.b(1, this.d) + 0;
        }
        if (!this.e.b()) {
            i2 += agq.c(2, this.e);
        }
        if (this.f != acv.UNKNOWN_PREFIX.a()) {
            i2 += agq.g(3, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
