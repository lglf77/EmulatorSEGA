package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class aay extends ahc<aay, a> implements aif {
    /* access modifiers changed from: private */
    public static final aay f;
    private static volatile aij<aay> g;
    private int d;
    private age e = age.a;

    public static final class a extends ahc.a<aay, a> implements aif {
        private a() {
            super(aay.f);
        }

        /* synthetic */ a(aaz aaz) {
            this();
        }

        public final a a(int i) {
            b();
            ((aay) this.a).a(0);
            return this;
        }

        public final a a(age age) {
            b();
            ((aay) this.a).b(age);
            return this;
        }
    }

    static {
        aay aay = new aay();
        f = aay;
        aay.a(ahc.g.f, (Object) null, (Object) null);
        aay.b.c();
    }

    private aay() {
    }

    public static aay a(age age) {
        return (aay) ahc.a(f, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void b(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.e = age;
    }

    public static a c() {
        aay aay = f;
        ahc.a aVar = (ahc.a) aay.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(aay);
        return (a) aVar;
    }

    public final int a() {
        return this.d;
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
            int[] r3 = com.google.android.gms.internal.aaz.a
            int r4 = r7 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x005b;
                case 7: goto L_0x00a8;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00ce;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.aay r6 = new com.google.android.gms.internal.aay
            r6.<init>()
        L_0x0017:
            return r6
        L_0x0018:
            com.google.android.gms.internal.aay r6 = f
            goto L_0x0017
        L_0x001b:
            r6 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.aay$a r6 = new com.google.android.gms.internal.aay$a
            r6.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
            com.google.android.gms.internal.aay r9 = (com.google.android.gms.internal.aay) r9
            int r0 = r6.d
            if (r0 == 0) goto L_0x0053
            r0 = r1
        L_0x002c:
            int r4 = r6.d
            int r3 = r9.d
            if (r3 == 0) goto L_0x0055
            r3 = r1
        L_0x0033:
            int r5 = r9.d
            int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
            r6.d = r0
            com.google.android.gms.internal.age r0 = r6.e
            com.google.android.gms.internal.age r3 = com.google.android.gms.internal.age.a
            if (r0 == r3) goto L_0x0057
            r0 = r1
        L_0x0042:
            com.google.android.gms.internal.age r3 = r6.e
            com.google.android.gms.internal.age r4 = r9.e
            com.google.android.gms.internal.age r5 = com.google.android.gms.internal.age.a
            if (r4 == r5) goto L_0x0059
        L_0x004a:
            com.google.android.gms.internal.age r2 = r9.e
            com.google.android.gms.internal.age r0 = r8.a((boolean) r0, (com.google.android.gms.internal.age) r3, (boolean) r1, (com.google.android.gms.internal.age) r2)
            r6.e = r0
            goto L_0x0017
        L_0x0053:
            r0 = r2
            goto L_0x002c
        L_0x0055:
            r3 = r2
            goto L_0x0033
        L_0x0057:
            r0 = r2
            goto L_0x0042
        L_0x0059:
            r1 = r2
            goto L_0x004a
        L_0x005b:
            com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
            com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
            if (r9 != 0) goto L_0x0068
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0067:
            r2 = r1
        L_0x0068:
            if (r2 != 0) goto L_0x00a8
            int r0 = r8.a()     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            switch(r0) {
                case 0: goto L_0x0067;
                case 8: goto L_0x0079;
                case 18: goto L_0x008d;
                default: goto L_0x0071;
            }     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
        L_0x0071:
            boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            if (r0 != 0) goto L_0x0068
            r2 = r1
            goto L_0x0068
        L_0x0079:
            int r0 = r8.h()     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            r6.d = r0     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            goto L_0x0068
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x008b }
            r1.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            throw r0
        L_0x008d:
            com.google.android.gms.internal.age r0 = r8.g()     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            r6.e = r0     // Catch:{ ahi -> 0x0080, IOException -> 0x0094 }
            goto L_0x0068
        L_0x0094:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x008b }
            r2.<init>(r0)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x008b }
            r1.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x00a8:
            com.google.android.gms.internal.aay r6 = f
            goto L_0x0017
        L_0x00ac:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aay> r0 = g
            if (r0 != 0) goto L_0x00c1
            java.lang.Class<com.google.android.gms.internal.aay> r1 = com.google.android.gms.internal.aay.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aay> r0 = g     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00c0
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.aay r2 = f     // Catch:{ all -> 0x00c5 }
            r0.<init>(r2)     // Catch:{ all -> 0x00c5 }
            g = r0     // Catch:{ all -> 0x00c5 }
        L_0x00c0:
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
        L_0x00c1:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.aay> r6 = g
            goto L_0x0017
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00ce:
            r6 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aay.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a(agq agq) {
        if (this.d != 0) {
            agq.c(1, this.d);
        }
        if (!this.e.b()) {
            agq.a(2, this.e);
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
        if (this.d != 0) {
            i2 = agq.e(1, this.d) + 0;
        }
        if (!this.e.b()) {
            i2 += agq.c(2, this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
