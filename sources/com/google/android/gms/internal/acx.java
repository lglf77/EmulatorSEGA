package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;
import java.util.List;

public final class acx extends ahc<acx, a> implements aif {
    /* access modifiers changed from: private */
    public static final acx g;
    private static volatile aij<acx> h;
    private int d;
    private String e = "";
    private ahh<ach> f = l();

    public static final class a extends ahc.a<acx, a> implements aif {
        private a() {
            super(acx.g);
        }

        /* synthetic */ a(acy acy) {
            this();
        }

        public final a a(ach ach) {
            b();
            ((acx) this.a).a(ach);
            return this;
        }

        public final a a(String str) {
            b();
            ((acx) this.a).a(str);
            return this;
        }
    }

    static {
        acx acx = new acx();
        g = acx;
        acx.a(ahc.g.f, (Object) null, (Object) null);
        acx.b.c();
    }

    private acx() {
    }

    /* access modifiers changed from: private */
    public final void a(ach ach) {
        if (ach == null) {
            throw new NullPointerException();
        }
        if (!this.f.a()) {
            ahh<ach> ahh = this.f;
            int size = ahh.size();
            this.f = ahh.a(size == 0 ? 10 : size << 1);
        }
        this.f.add(ach);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.e = str;
    }

    public static a b() {
        acx acx = g;
        ahc.a aVar = (ahc.a) acx.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(acx);
        return (a) aVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 172 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = this;
            r0 = 0
            r2 = 0
            r1 = 1
            int[] r3 = com.google.android.gms.internal.acy.a
            int r4 = r6 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x0022;
                case 5: goto L_0x0028;
                case 6: goto L_0x0061;
                case 7: goto L_0x00d2;
                case 8: goto L_0x00d6;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00f8;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.acx r5 = new com.google.android.gms.internal.acx
            r5.<init>()
        L_0x0017:
            return r5
        L_0x0018:
            com.google.android.gms.internal.acx r5 = g
            goto L_0x0017
        L_0x001b:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r1 = r5.f
            r1.b()
            r5 = r0
            goto L_0x0017
        L_0x0022:
            com.google.android.gms.internal.acx$a r5 = new com.google.android.gms.internal.acx$a
            r5.<init>(r0)
            goto L_0x0017
        L_0x0028:
            com.google.android.gms.internal.ahc$h r7 = (com.google.android.gms.internal.ahc.h) r7
            com.google.android.gms.internal.acx r8 = (com.google.android.gms.internal.acx) r8
            java.lang.String r0 = r5.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005d
            r0 = r1
        L_0x0035:
            java.lang.String r3 = r5.e
            java.lang.String r4 = r8.e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005f
        L_0x003f:
            java.lang.String r2 = r8.e
            java.lang.String r0 = r7.a((boolean) r0, (java.lang.String) r3, (boolean) r1, (java.lang.String) r2)
            r5.e = r0
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r0 = r5.f
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r1 = r8.f
            com.google.android.gms.internal.ahh r0 = r7.a(r0, r1)
            r5.f = r0
            com.google.android.gms.internal.ahc$f r0 = com.google.android.gms.internal.ahc.f.a
            if (r7 != r0) goto L_0x0017
            int r0 = r5.d
            int r1 = r8.d
            r0 = r0 | r1
            r5.d = r0
            goto L_0x0017
        L_0x005d:
            r0 = r2
            goto L_0x0035
        L_0x005f:
            r1 = r2
            goto L_0x003f
        L_0x0061:
            com.google.android.gms.internal.agn r7 = (com.google.android.gms.internal.agn) r7
            com.google.android.gms.internal.agu r8 = (com.google.android.gms.internal.agu) r8
            if (r8 != 0) goto L_0x006e
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x006d:
            r2 = r1
        L_0x006e:
            if (r2 != 0) goto L_0x00d2
            int r0 = r7.a()     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            switch(r0) {
                case 0: goto L_0x006d;
                case 10: goto L_0x007f;
                case 18: goto L_0x0093;
                default: goto L_0x0077;
            }     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
        L_0x0077:
            boolean r0 = r5.a((int) r0, (com.google.android.gms.internal.agn) r7)     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            if (r0 != 0) goto L_0x006e
            r2 = r1
            goto L_0x006e
        L_0x007f:
            java.lang.String r0 = r7.f()     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            r5.e = r0     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            goto L_0x006e
        L_0x0086:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ahi r0 = r0.a(r5)     // Catch:{ all -> 0x0091 }
            r1.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            throw r0
        L_0x0093:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r0 = r5.f     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            boolean r0 = r0.a()     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            if (r0 != 0) goto L_0x00ab
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r3 = r5.f     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            int r0 = r3.size()     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            if (r0 != 0) goto L_0x00cf
            r0 = 10
        L_0x00a5:
            com.google.android.gms.internal.ahh r0 = r3.a(r0)     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            r5.f = r0     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
        L_0x00ab:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.ach> r3 = r5.f     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            com.google.android.gms.internal.ach r0 = com.google.android.gms.internal.ach.h()     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            com.google.android.gms.internal.ahc r0 = r7.a(r0, r8)     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            com.google.android.gms.internal.ach r0 = (com.google.android.gms.internal.ach) r0     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            r3.add(r0)     // Catch:{ ahi -> 0x0086, IOException -> 0x00bb }
            goto L_0x006e
        L_0x00bb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0091 }
            r2.<init>(r0)     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ahi r0 = r2.a(r5)     // Catch:{ all -> 0x0091 }
            r1.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x00cf:
            int r0 = r0 << 1
            goto L_0x00a5
        L_0x00d2:
            com.google.android.gms.internal.acx r5 = g
            goto L_0x0017
        L_0x00d6:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acx> r0 = h
            if (r0 != 0) goto L_0x00eb
            java.lang.Class<com.google.android.gms.internal.acx> r1 = com.google.android.gms.internal.acx.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acx> r0 = h     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00ea
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00ef }
            com.google.android.gms.internal.acx r2 = g     // Catch:{ all -> 0x00ef }
            r0.<init>(r2)     // Catch:{ all -> 0x00ef }
            h = r0     // Catch:{ all -> 0x00ef }
        L_0x00ea:
            monitor-exit(r1)     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acx> r5 = h
            goto L_0x0017
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ef }
            throw r0
        L_0x00f2:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00f8:
            r5 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acx.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final List<ach> a() {
        return this.f;
    }

    public final void a(agq agq) {
        if (!this.e.isEmpty()) {
            agq.a(1, this.e);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                agq.a(2, (aid) this.f.get(i2));
                i = i2 + 1;
            } else {
                this.b.a(agq);
                return;
            }
        }
    }

    public final int d() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int b = !this.e.isEmpty() ? agq.b(1, this.e) + 0 : 0;
        while (true) {
            int i3 = b;
            if (i < this.f.size()) {
                b = agq.c(2, (aid) this.f.get(i)) + i3;
                i++;
            } else {
                int e2 = this.b.e() + i3;
                this.c = e2;
                return e2;
            }
        }
    }
}
