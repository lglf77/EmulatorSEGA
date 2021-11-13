package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class acp extends ahc<acp, a> implements aif {
    /* access modifiers changed from: private */
    public static final acp e;
    private static volatile aij<acp> f;
    private String d = "";

    public static final class a extends ahc.a<acp, a> implements aif {
        private a() {
            super(acp.e);
        }

        /* synthetic */ a(acq acq) {
            this();
        }
    }

    static {
        acp acp = new acp();
        e = acp;
        acp.a(ahc.g.f, (Object) null, (Object) null);
        acp.b.c();
    }

    private acp() {
    }

    public static acp a(age age) {
        return (acp) ahc.a(e, age);
    }

    public static acp b() {
        return e;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 161 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = this;
            r0 = 0
            r2 = 0
            r1 = 1
            int[] r3 = com.google.android.gms.internal.acq.a
            int r4 = r6 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x0047;
                case 7: goto L_0x008d;
                case 8: goto L_0x0090;
                case 9: goto L_0x00ac;
                case 10: goto L_0x00b2;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.acp r5 = new com.google.android.gms.internal.acp
            r5.<init>()
        L_0x0017:
            return r5
        L_0x0018:
            com.google.android.gms.internal.acp r5 = e
            goto L_0x0017
        L_0x001b:
            r5 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.acp$a r5 = new com.google.android.gms.internal.acp$a
            r5.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r7 = (com.google.android.gms.internal.ahc.h) r7
            com.google.android.gms.internal.acp r8 = (com.google.android.gms.internal.acp) r8
            java.lang.String r0 = r5.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0043
            r0 = r1
        L_0x0030:
            java.lang.String r3 = r5.d
            java.lang.String r4 = r8.d
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0045
        L_0x003a:
            java.lang.String r2 = r8.d
            java.lang.String r0 = r7.a((boolean) r0, (java.lang.String) r3, (boolean) r1, (java.lang.String) r2)
            r5.d = r0
            goto L_0x0017
        L_0x0043:
            r0 = r2
            goto L_0x0030
        L_0x0045:
            r1 = r2
            goto L_0x003a
        L_0x0047:
            com.google.android.gms.internal.agn r7 = (com.google.android.gms.internal.agn) r7
            com.google.android.gms.internal.agu r8 = (com.google.android.gms.internal.agu) r8
            if (r8 != 0) goto L_0x0054
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0053:
            r2 = r1
        L_0x0054:
            if (r2 != 0) goto L_0x008d
            int r0 = r7.a()     // Catch:{ ahi -> 0x006c, IOException -> 0x0079 }
            switch(r0) {
                case 0: goto L_0x0053;
                case 10: goto L_0x0065;
                default: goto L_0x005d;
            }     // Catch:{ ahi -> 0x006c, IOException -> 0x0079 }
        L_0x005d:
            boolean r0 = r5.a((int) r0, (com.google.android.gms.internal.agn) r7)     // Catch:{ ahi -> 0x006c, IOException -> 0x0079 }
            if (r0 != 0) goto L_0x0054
            r2 = r1
            goto L_0x0054
        L_0x0065:
            java.lang.String r0 = r7.f()     // Catch:{ ahi -> 0x006c, IOException -> 0x0079 }
            r5.d = r0     // Catch:{ ahi -> 0x006c, IOException -> 0x0079 }
            goto L_0x0054
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ahi r0 = r0.a(r5)     // Catch:{ all -> 0x0077 }
            r1.<init>(r0)     // Catch:{ all -> 0x0077 }
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            throw r0
        L_0x0079:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0077 }
            r2.<init>(r0)     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ahi r0 = r2.a(r5)     // Catch:{ all -> 0x0077 }
            r1.<init>(r0)     // Catch:{ all -> 0x0077 }
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x008d:
            com.google.android.gms.internal.acp r5 = e
            goto L_0x0017
        L_0x0090:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acp> r0 = f
            if (r0 != 0) goto L_0x00a5
            java.lang.Class<com.google.android.gms.internal.acp> r1 = com.google.android.gms.internal.acp.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acp> r0 = f     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a4
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.internal.acp r2 = e     // Catch:{ all -> 0x00a9 }
            r0.<init>(r2)     // Catch:{ all -> 0x00a9 }
            f = r0     // Catch:{ all -> 0x00a9 }
        L_0x00a4:
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acp> r5 = f
            goto L_0x0017
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00b2:
            r5 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acp.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String a() {
        return this.d;
    }

    public final void a(agq agq) {
        if (!this.d.isEmpty()) {
            agq.a(1, this.d);
        }
        this.b.a(agq);
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
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
