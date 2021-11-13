package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class aak extends ahc<aak, a> implements aif {
    /* access modifiers changed from: private */
    public static final aak e;
    private static volatile aij<aak> f;
    private int d;

    public static final class a extends ahc.a<aak, a> implements aif {
        private a() {
            super(aak.e);
        }

        /* synthetic */ a(aal aal) {
            this();
        }
    }

    static {
        aak aak = new aak();
        e = aak;
        aak.a(ahc.g.f, (Object) null, (Object) null);
        aak.b.c();
    }

    private aak() {
    }

    public static aak b() {
        return e;
    }

    public final int a() {
        return this.d;
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
            int[] r3 = com.google.android.gms.internal.aal.a
            int r4 = r6 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x003f;
                case 7: goto L_0x0085;
                case 8: goto L_0x0088;
                case 9: goto L_0x00a4;
                case 10: goto L_0x00aa;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.aak r5 = new com.google.android.gms.internal.aak
            r5.<init>()
        L_0x0017:
            return r5
        L_0x0018:
            com.google.android.gms.internal.aak r5 = e
            goto L_0x0017
        L_0x001b:
            r5 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.aak$a r5 = new com.google.android.gms.internal.aak$a
            r5.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r7 = (com.google.android.gms.internal.ahc.h) r7
            com.google.android.gms.internal.aak r8 = (com.google.android.gms.internal.aak) r8
            int r0 = r5.d
            if (r0 == 0) goto L_0x003b
            r0 = r1
        L_0x002c:
            int r3 = r5.d
            int r4 = r8.d
            if (r4 == 0) goto L_0x003d
        L_0x0032:
            int r2 = r8.d
            int r0 = r7.a((boolean) r0, (int) r3, (boolean) r1, (int) r2)
            r5.d = r0
            goto L_0x0017
        L_0x003b:
            r0 = r2
            goto L_0x002c
        L_0x003d:
            r1 = r2
            goto L_0x0032
        L_0x003f:
            com.google.android.gms.internal.agn r7 = (com.google.android.gms.internal.agn) r7
            com.google.android.gms.internal.agu r8 = (com.google.android.gms.internal.agu) r8
            if (r8 != 0) goto L_0x004c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x004b:
            r2 = r1
        L_0x004c:
            if (r2 != 0) goto L_0x0085
            int r0 = r7.a()     // Catch:{ ahi -> 0x0064, IOException -> 0x0071 }
            switch(r0) {
                case 0: goto L_0x004b;
                case 8: goto L_0x005d;
                default: goto L_0x0055;
            }     // Catch:{ ahi -> 0x0064, IOException -> 0x0071 }
        L_0x0055:
            boolean r0 = r5.a((int) r0, (com.google.android.gms.internal.agn) r7)     // Catch:{ ahi -> 0x0064, IOException -> 0x0071 }
            if (r0 != 0) goto L_0x004c
            r2 = r1
            goto L_0x004c
        L_0x005d:
            int r0 = r7.h()     // Catch:{ ahi -> 0x0064, IOException -> 0x0071 }
            r5.d = r0     // Catch:{ ahi -> 0x0064, IOException -> 0x0071 }
            goto L_0x004c
        L_0x0064:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ahi r0 = r0.a(r5)     // Catch:{ all -> 0x006f }
            r1.<init>(r0)     // Catch:{ all -> 0x006f }
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            throw r0
        L_0x0071:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x006f }
            r2.<init>(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ahi r0 = r2.a(r5)     // Catch:{ all -> 0x006f }
            r1.<init>(r0)     // Catch:{ all -> 0x006f }
            throw r1     // Catch:{ all -> 0x006f }
        L_0x0085:
            com.google.android.gms.internal.aak r5 = e
            goto L_0x0017
        L_0x0088:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aak> r0 = f
            if (r0 != 0) goto L_0x009d
            java.lang.Class<com.google.android.gms.internal.aak> r1 = com.google.android.gms.internal.aak.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aak> r0 = f     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.aak r2 = e     // Catch:{ all -> 0x00a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x00a1 }
            f = r0     // Catch:{ all -> 0x00a1 }
        L_0x009c:
            monitor-exit(r1)     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aak> r5 = f
            goto L_0x0017
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00aa:
            r5 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aak.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a(agq agq) {
        if (this.d != 0) {
            agq.c(1, this.d);
        }
        this.b.a(agq);
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != 0) {
            i2 = agq.e(1, this.d) + 0;
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
