package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class ach extends ahc<ach, a> implements aif {
    /* access modifiers changed from: private */
    public static final ach i;
    private static volatile aij<ach> j;
    private String d = "";
    private String e = "";
    private int f;
    private boolean g;
    private String h = "";

    public static final class a extends ahc.a<ach, a> implements aif {
        private a() {
            super(ach.i);
        }

        /* synthetic */ a(aci aci) {
            this();
        }

        public final a a(int i) {
            b();
            ((ach) this.a).a(0);
            return this;
        }

        public final a a(String str) {
            b();
            ((ach) this.a).a(str);
            return this;
        }

        public final a a(boolean z) {
            b();
            ((ach) this.a).a(true);
            return this;
        }

        public final a b(String str) {
            b();
            ((ach) this.a).b(str);
            return this;
        }

        public final a c(String str) {
            b();
            ((ach) this.a).c(str);
            return this;
        }
    }

    static {
        ach ach = new ach();
        i = ach;
        ach.a(ahc.g.f, (Object) null, (Object) null);
        ach.b.c();
    }

    private ach() {
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        this.f = i2;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.d = str;
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.e = str;
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.h = str;
    }

    public static a g() {
        ach ach = i;
        ahc.a aVar = (ahc.a) ach.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(ach);
        return (a) aVar;
    }

    public static ach h() {
        return i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 201 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            r0 = 0
            r2 = 0
            r1 = 1
            int[] r3 = com.google.android.gms.internal.aci.a
            int r4 = r7 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x001d;
                case 5: goto L_0x0023;
                case 6: goto L_0x00b8;
                case 7: goto L_0x011a;
                case 8: goto L_0x011e;
                case 9: goto L_0x013a;
                case 10: goto L_0x0140;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.ach r6 = new com.google.android.gms.internal.ach
            r6.<init>()
        L_0x0017:
            return r6
        L_0x0018:
            com.google.android.gms.internal.ach r6 = i
            goto L_0x0017
        L_0x001b:
            r6 = r0
            goto L_0x0017
        L_0x001d:
            com.google.android.gms.internal.ach$a r6 = new com.google.android.gms.internal.ach$a
            r6.<init>(r0)
            goto L_0x0017
        L_0x0023:
            com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
            com.google.android.gms.internal.ach r9 = (com.google.android.gms.internal.ach) r9
            java.lang.String r0 = r6.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a4
            r0 = r1
        L_0x0030:
            java.lang.String r4 = r6.d
            java.lang.String r3 = r9.d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00a6
            r3 = r1
        L_0x003b:
            java.lang.String r5 = r9.d
            java.lang.String r0 = r8.a((boolean) r0, (java.lang.String) r4, (boolean) r3, (java.lang.String) r5)
            r6.d = r0
            java.lang.String r0 = r6.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a8
            r0 = r1
        L_0x004c:
            java.lang.String r4 = r6.e
            java.lang.String r3 = r9.e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00aa
            r3 = r1
        L_0x0057:
            java.lang.String r5 = r9.e
            java.lang.String r0 = r8.a((boolean) r0, (java.lang.String) r4, (boolean) r3, (java.lang.String) r5)
            r6.e = r0
            int r0 = r6.f
            if (r0 == 0) goto L_0x00ac
            r0 = r1
        L_0x0064:
            int r4 = r6.f
            int r3 = r9.f
            if (r3 == 0) goto L_0x00ae
            r3 = r1
        L_0x006b:
            int r5 = r9.f
            int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
            r6.f = r0
            boolean r0 = r6.g
            if (r0 == 0) goto L_0x00b0
            r0 = r1
        L_0x0078:
            boolean r4 = r6.g
            boolean r3 = r9.g
            if (r3 == 0) goto L_0x00b2
            r3 = r1
        L_0x007f:
            boolean r5 = r9.g
            boolean r0 = r8.a((boolean) r0, (boolean) r4, (boolean) r3, (boolean) r5)
            r6.g = r0
            java.lang.String r0 = r6.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b4
            r0 = r1
        L_0x0090:
            java.lang.String r3 = r6.h
            java.lang.String r4 = r9.h
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00b6
        L_0x009a:
            java.lang.String r2 = r9.h
            java.lang.String r0 = r8.a((boolean) r0, (java.lang.String) r3, (boolean) r1, (java.lang.String) r2)
            r6.h = r0
            goto L_0x0017
        L_0x00a4:
            r0 = r2
            goto L_0x0030
        L_0x00a6:
            r3 = r2
            goto L_0x003b
        L_0x00a8:
            r0 = r2
            goto L_0x004c
        L_0x00aa:
            r3 = r2
            goto L_0x0057
        L_0x00ac:
            r0 = r2
            goto L_0x0064
        L_0x00ae:
            r3 = r2
            goto L_0x006b
        L_0x00b0:
            r0 = r2
            goto L_0x0078
        L_0x00b2:
            r3 = r2
            goto L_0x007f
        L_0x00b4:
            r0 = r2
            goto L_0x0090
        L_0x00b6:
            r1 = r2
            goto L_0x009a
        L_0x00b8:
            com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
            com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
            if (r9 != 0) goto L_0x00c5
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x00c4:
            r2 = r1
        L_0x00c5:
            if (r2 != 0) goto L_0x011a
            int r0 = r8.a()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            switch(r0) {
                case 0: goto L_0x00c4;
                case 10: goto L_0x00d6;
                case 18: goto L_0x00ea;
                case 24: goto L_0x0105;
                case 32: goto L_0x010c;
                case 42: goto L_0x0113;
                default: goto L_0x00ce;
            }     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
        L_0x00ce:
            boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            if (r0 != 0) goto L_0x00c5
            r2 = r1
            goto L_0x00c5
        L_0x00d6:
            java.lang.String r0 = r8.f()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            r6.d = r0     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            goto L_0x00c5
        L_0x00dd:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e8 }
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            throw r0
        L_0x00ea:
            java.lang.String r0 = r8.f()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            r6.e = r0     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            goto L_0x00c5
        L_0x00f1:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e8 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e8 }
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x0105:
            int r0 = r8.h()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            r6.f = r0     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            goto L_0x00c5
        L_0x010c:
            boolean r0 = r8.e()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            r6.g = r0     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            goto L_0x00c5
        L_0x0113:
            java.lang.String r0 = r8.f()     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            r6.h = r0     // Catch:{ ahi -> 0x00dd, IOException -> 0x00f1 }
            goto L_0x00c5
        L_0x011a:
            com.google.android.gms.internal.ach r6 = i
            goto L_0x0017
        L_0x011e:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.ach> r0 = j
            if (r0 != 0) goto L_0x0133
            java.lang.Class<com.google.android.gms.internal.ach> r1 = com.google.android.gms.internal.ach.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.ach> r0 = j     // Catch:{ all -> 0x0137 }
            if (r0 != 0) goto L_0x0132
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x0137 }
            com.google.android.gms.internal.ach r2 = i     // Catch:{ all -> 0x0137 }
            r0.<init>(r2)     // Catch:{ all -> 0x0137 }
            j = r0     // Catch:{ all -> 0x0137 }
        L_0x0132:
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
        L_0x0133:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.ach> r6 = j
            goto L_0x0017
        L_0x0137:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x0140:
            r6 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ach.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String a() {
        return this.d;
    }

    public final void a(agq agq) {
        if (!this.d.isEmpty()) {
            agq.a(1, this.d);
        }
        if (!this.e.isEmpty()) {
            agq.a(2, this.e);
        }
        if (this.f != 0) {
            agq.c(3, this.f);
        }
        if (this.g) {
            agq.a(4, this.g);
        }
        if (!this.h.isEmpty()) {
            agq.a(5, this.h);
        }
        this.b.a(agq);
    }

    public final String b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.d.isEmpty()) {
            i3 = agq.b(1, this.d) + 0;
        }
        if (!this.e.isEmpty()) {
            i3 += agq.b(2, this.e);
        }
        if (this.f != 0) {
            i3 += agq.e(3, this.f);
        }
        if (this.g) {
            i3 += agq.b(4, this.g);
        }
        if (!this.h.isEmpty()) {
            i3 += agq.b(5, this.h);
        }
        int e2 = i3 + this.b.e();
        this.c = e2;
        return e2;
    }

    public final boolean e() {
        return this.g;
    }

    public final String f() {
        return this.h;
    }
}
