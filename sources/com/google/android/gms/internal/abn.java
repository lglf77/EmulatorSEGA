package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class abn extends ahc<abn, a> implements aif {
    /* access modifiers changed from: private */
    public static final abn g;
    private static volatile aij<abn> h;
    private int d;
    private int e;
    private age f = age.a;

    public static final class a extends ahc.a<abn, a> implements aif {
        private a() {
            super(abn.g);
        }

        /* synthetic */ a(abo abo) {
            this();
        }
    }

    static {
        abn abn = new abn();
        g = abn;
        abn.a(ahc.g.f, (Object) null, (Object) null);
        abn.b.c();
    }

    private abn() {
    }

    public static abn e() {
        return g;
    }

    public final abp a() {
        abp a2 = abp.a(this.d);
        return a2 == null ? abp.UNRECOGNIZED : a2;
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
            int[] r3 = com.google.android.gms.internal.abo.a
            int r4 = r7 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x0073;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00cb;
                case 9: goto L_0x00e7;
                case 10: goto L_0x00ed;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.abn r6 = new com.google.android.gms.internal.abn
            r6.<init>()
        L_0x0017:
            return r6
        L_0x0018:
            com.google.android.gms.internal.abn r6 = g
            goto L_0x0017
        L_0x001b:
            r6 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.abn$a r6 = new com.google.android.gms.internal.abn$a
            r6.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
            com.google.android.gms.internal.abn r9 = (com.google.android.gms.internal.abn) r9
            int r0 = r6.d
            if (r0 == 0) goto L_0x0067
            r0 = r1
        L_0x002c:
            int r4 = r6.d
            int r3 = r9.d
            if (r3 == 0) goto L_0x0069
            r3 = r1
        L_0x0033:
            int r5 = r9.d
            int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
            r6.d = r0
            int r0 = r6.e
            if (r0 == 0) goto L_0x006b
            r0 = r1
        L_0x0040:
            int r4 = r6.e
            int r3 = r9.e
            if (r3 == 0) goto L_0x006d
            r3 = r1
        L_0x0047:
            int r5 = r9.e
            int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
            r6.e = r0
            com.google.android.gms.internal.age r0 = r6.f
            com.google.android.gms.internal.age r3 = com.google.android.gms.internal.age.a
            if (r0 == r3) goto L_0x006f
            r0 = r1
        L_0x0056:
            com.google.android.gms.internal.age r3 = r6.f
            com.google.android.gms.internal.age r4 = r9.f
            com.google.android.gms.internal.age r5 = com.google.android.gms.internal.age.a
            if (r4 == r5) goto L_0x0071
        L_0x005e:
            com.google.android.gms.internal.age r2 = r9.f
            com.google.android.gms.internal.age r0 = r8.a((boolean) r0, (com.google.android.gms.internal.age) r3, (boolean) r1, (com.google.android.gms.internal.age) r2)
            r6.f = r0
            goto L_0x0017
        L_0x0067:
            r0 = r2
            goto L_0x002c
        L_0x0069:
            r3 = r2
            goto L_0x0033
        L_0x006b:
            r0 = r2
            goto L_0x0040
        L_0x006d:
            r3 = r2
            goto L_0x0047
        L_0x006f:
            r0 = r2
            goto L_0x0056
        L_0x0071:
            r1 = r2
            goto L_0x005e
        L_0x0073:
            com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
            com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
            if (r9 != 0) goto L_0x0080
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x007f:
            r2 = r1
        L_0x0080:
            if (r2 != 0) goto L_0x00c7
            int r0 = r8.a()     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            switch(r0) {
                case 0: goto L_0x007f;
                case 8: goto L_0x0091;
                case 16: goto L_0x00a5;
                case 90: goto L_0x00c0;
                default: goto L_0x0089;
            }     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
        L_0x0089:
            boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            if (r0 != 0) goto L_0x0080
            r2 = r1
            goto L_0x0080
        L_0x0091:
            int r0 = r8.i()     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            r6.d = r0     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            goto L_0x0080
        L_0x0098:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            throw r0
        L_0x00a5:
            int r0 = r8.i()     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            r6.e = r0     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            goto L_0x0080
        L_0x00ac:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00a3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00c0:
            com.google.android.gms.internal.age r0 = r8.g()     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            r6.f = r0     // Catch:{ ahi -> 0x0098, IOException -> 0x00ac }
            goto L_0x0080
        L_0x00c7:
            com.google.android.gms.internal.abn r6 = g
            goto L_0x0017
        L_0x00cb:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abn> r0 = h
            if (r0 != 0) goto L_0x00e0
            java.lang.Class<com.google.android.gms.internal.abn> r1 = com.google.android.gms.internal.abn.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abn> r0 = h     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00df
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.internal.abn r2 = g     // Catch:{ all -> 0x00e4 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e4 }
            h = r0     // Catch:{ all -> 0x00e4 }
        L_0x00df:
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e0:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abn> r6 = h
            goto L_0x0017
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r0
        L_0x00e7:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00ed:
            r6 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.abn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a(agq agq) {
        if (this.d != abp.UNKNOWN_CURVE.a()) {
            agq.b(1, this.d);
        }
        if (this.e != abr.UNKNOWN_HASH.a()) {
            agq.b(2, this.e);
        }
        if (!this.f.b()) {
            agq.a(11, this.f);
        }
        this.b.a(agq);
    }

    public final abr b() {
        abr a2 = abr.a(this.e);
        return a2 == null ? abr.UNRECOGNIZED : a2;
    }

    public final age c() {
        return this.f;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != abp.UNKNOWN_CURVE.a()) {
            i2 = agq.g(1, this.d) + 0;
        }
        if (this.e != abr.UNKNOWN_HASH.a()) {
            i2 += agq.g(2, this.e);
        }
        if (!this.f.b()) {
            i2 += agq.c(11, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
