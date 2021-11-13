package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class abx extends ahc<abx, a> implements aif {
    /* access modifiers changed from: private */
    public static final abx f;
    private static volatile aij<abx> g;
    private int d;
    private int e;

    public static final class a extends ahc.a<abx, a> implements aif {
        private a() {
            super(abx.f);
        }

        /* synthetic */ a(aby aby) {
            this();
        }
    }

    static {
        abx abx = new abx();
        f = abx;
        abx.a(ahc.g.f, (Object) null, (Object) null);
        abx.b.c();
    }

    private abx() {
    }

    public static abx c() {
        return f;
    }

    public final abr a() {
        abr a2 = abr.a(this.d);
        return a2 == null ? abr.UNRECOGNIZED : a2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            r0 = 0
            r2 = 0
            r1 = 1
            int[] r3 = com.google.android.gms.internal.aby.a
            int r4 = r7 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x0057;
                case 7: goto L_0x00a4;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00c4;
                case 10: goto L_0x00ca;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.abx r6 = new com.google.android.gms.internal.abx
            r6.<init>()
        L_0x0017:
            return r6
        L_0x0018:
            com.google.android.gms.internal.abx r6 = f
            goto L_0x0017
        L_0x001b:
            r6 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.abx$a r6 = new com.google.android.gms.internal.abx$a
            r6.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
            com.google.android.gms.internal.abx r9 = (com.google.android.gms.internal.abx) r9
            int r0 = r6.d
            if (r0 == 0) goto L_0x004f
            r0 = r1
        L_0x002c:
            int r4 = r6.d
            int r3 = r9.d
            if (r3 == 0) goto L_0x0051
            r3 = r1
        L_0x0033:
            int r5 = r9.d
            int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
            r6.d = r0
            int r0 = r6.e
            if (r0 == 0) goto L_0x0053
            r0 = r1
        L_0x0040:
            int r3 = r6.e
            int r4 = r9.e
            if (r4 == 0) goto L_0x0055
        L_0x0046:
            int r2 = r9.e
            int r0 = r8.a((boolean) r0, (int) r3, (boolean) r1, (int) r2)
            r6.e = r0
            goto L_0x0017
        L_0x004f:
            r0 = r2
            goto L_0x002c
        L_0x0051:
            r3 = r2
            goto L_0x0033
        L_0x0053:
            r0 = r2
            goto L_0x0040
        L_0x0055:
            r1 = r2
            goto L_0x0046
        L_0x0057:
            com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
            com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
            if (r9 != 0) goto L_0x0064
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0063:
            r2 = r1
        L_0x0064:
            if (r2 != 0) goto L_0x00a4
            int r0 = r8.a()     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            switch(r0) {
                case 0: goto L_0x0063;
                case 8: goto L_0x0075;
                case 16: goto L_0x0089;
                default: goto L_0x006d;
            }     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
        L_0x006d:
            boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            if (r0 != 0) goto L_0x0064
            r2 = r1
            goto L_0x0064
        L_0x0075:
            int r0 = r8.i()     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            r6.d = r0     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            goto L_0x0064
        L_0x007c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x0087 }
            r1.<init>(r0)     // Catch:{ all -> 0x0087 }
            throw r1     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            throw r0
        L_0x0089:
            int r0 = r8.h()     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            r6.e = r0     // Catch:{ ahi -> 0x007c, IOException -> 0x0090 }
            goto L_0x0064
        L_0x0090:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0087 }
            r2.<init>(r0)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x0087 }
            r1.<init>(r0)     // Catch:{ all -> 0x0087 }
            throw r1     // Catch:{ all -> 0x0087 }
        L_0x00a4:
            com.google.android.gms.internal.abx r6 = f
            goto L_0x0017
        L_0x00a8:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abx> r0 = g
            if (r0 != 0) goto L_0x00bd
            java.lang.Class<com.google.android.gms.internal.abx> r1 = com.google.android.gms.internal.abx.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abx> r0 = g     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00bc
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.internal.abx r2 = f     // Catch:{ all -> 0x00c1 }
            r0.<init>(r2)     // Catch:{ all -> 0x00c1 }
            g = r0     // Catch:{ all -> 0x00c1 }
        L_0x00bc:
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
        L_0x00bd:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.abx> r6 = g
            goto L_0x0017
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00c4:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00ca:
            r6 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.abx.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a(agq agq) {
        if (this.d != abr.UNKNOWN_HASH.a()) {
            agq.b(1, this.d);
        }
        if (this.e != 0) {
            agq.c(2, this.e);
        }
        this.b.a(agq);
    }

    public final int b() {
        return this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != abr.UNKNOWN_HASH.a()) {
            i2 = agq.g(1, this.d) + 0;
        }
        if (this.e != 0) {
            i2 += agq.e(2, this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
