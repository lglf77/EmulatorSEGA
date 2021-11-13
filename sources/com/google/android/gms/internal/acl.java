package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;

public final class acl extends ahc<acl, a> implements aif {
    /* access modifiers changed from: private */
    public static final acl g;
    private static volatile aij<acl> h;
    private int d;
    private int e;
    private ahh<b> f = l();

    public static final class a extends ahc.a<acl, a> implements aif {
        private a() {
            super(acl.g);
        }

        /* synthetic */ a(acm acm) {
            this();
        }

        public final a a(int i) {
            b();
            ((acl) this.a).a(i);
            return this;
        }

        public final a a(b bVar) {
            b();
            ((acl) this.a).a(bVar);
            return this;
        }
    }

    public static final class b extends ahc<b, a> implements aif {
        /* access modifiers changed from: private */
        public static final b h;
        private static volatile aij<b> i;
        private String d = "";
        private int e;
        private int f;
        private int g;

        public static final class a extends ahc.a<b, a> implements aif {
            private a() {
                super(b.h);
            }

            /* synthetic */ a(acm acm) {
                this();
            }

            public final a a(int i) {
                b();
                ((b) this.a).a(i);
                return this;
            }

            public final a a(acd acd) {
                b();
                ((b) this.a).a(acd);
                return this;
            }

            public final a a(acv acv) {
                b();
                ((b) this.a).a(acv);
                return this;
            }

            public final a a(String str) {
                b();
                ((b) this.a).a(str);
                return this;
            }
        }

        static {
            b bVar = new b();
            h = bVar;
            bVar.a(ahc.g.f, (Object) null, (Object) null);
            bVar.b.c();
        }

        private b() {
        }

        public static a a() {
            b bVar = h;
            ahc.a aVar = (ahc.a) bVar.a(ahc.g.h, (Object) null, (Object) null);
            aVar.a(bVar);
            return (a) aVar;
        }

        /* access modifiers changed from: private */
        public final void a(int i2) {
            this.f = i2;
        }

        /* access modifiers changed from: private */
        public final void a(acd acd) {
            if (acd == null) {
                throw new NullPointerException();
            }
            this.e = acd.a();
        }

        /* access modifiers changed from: private */
        public final void a(acv acv) {
            if (acv == null) {
                throw new NullPointerException();
            }
            this.g = acv.a();
        }

        /* access modifiers changed from: private */
        public final void a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.d = str;
        }

        public static b b() {
            return h;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(int r7, java.lang.Object r8, java.lang.Object r9) {
            /*
                r6 = this;
                r0 = 0
                r2 = 0
                r1 = 1
                int[] r3 = com.google.android.gms.internal.acm.a
                int r4 = r7 + -1
                r3 = r3[r4]
                switch(r3) {
                    case 1: goto L_0x0012;
                    case 2: goto L_0x0018;
                    case 3: goto L_0x001b;
                    case 4: goto L_0x001d;
                    case 5: goto L_0x0023;
                    case 6: goto L_0x008f;
                    case 7: goto L_0x00ea;
                    case 8: goto L_0x00ee;
                    case 9: goto L_0x010a;
                    case 10: goto L_0x0110;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
            L_0x0012:
                com.google.android.gms.internal.acl$b r6 = new com.google.android.gms.internal.acl$b
                r6.<init>()
            L_0x0017:
                return r6
            L_0x0018:
                com.google.android.gms.internal.acl$b r6 = h
                goto L_0x0017
            L_0x001b:
                r6 = r0
                goto L_0x0017
            L_0x001d:
                com.google.android.gms.internal.acl$b$a r6 = new com.google.android.gms.internal.acl$b$a
                r6.<init>(r0)
                goto L_0x0017
            L_0x0023:
                com.google.android.gms.internal.ahc$h r8 = (com.google.android.gms.internal.ahc.h) r8
                com.google.android.gms.internal.acl$b r9 = (com.google.android.gms.internal.acl.b) r9
                java.lang.String r0 = r6.d
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x007f
                r0 = r1
            L_0x0030:
                java.lang.String r4 = r6.d
                java.lang.String r3 = r9.d
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L_0x0081
                r3 = r1
            L_0x003b:
                java.lang.String r5 = r9.d
                java.lang.String r0 = r8.a((boolean) r0, (java.lang.String) r4, (boolean) r3, (java.lang.String) r5)
                r6.d = r0
                int r0 = r6.e
                if (r0 == 0) goto L_0x0083
                r0 = r1
            L_0x0048:
                int r4 = r6.e
                int r3 = r9.e
                if (r3 == 0) goto L_0x0085
                r3 = r1
            L_0x004f:
                int r5 = r9.e
                int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
                r6.e = r0
                int r0 = r6.f
                if (r0 == 0) goto L_0x0087
                r0 = r1
            L_0x005c:
                int r4 = r6.f
                int r3 = r9.f
                if (r3 == 0) goto L_0x0089
                r3 = r1
            L_0x0063:
                int r5 = r9.f
                int r0 = r8.a((boolean) r0, (int) r4, (boolean) r3, (int) r5)
                r6.f = r0
                int r0 = r6.g
                if (r0 == 0) goto L_0x008b
                r0 = r1
            L_0x0070:
                int r3 = r6.g
                int r4 = r9.g
                if (r4 == 0) goto L_0x008d
            L_0x0076:
                int r2 = r9.g
                int r0 = r8.a((boolean) r0, (int) r3, (boolean) r1, (int) r2)
                r6.g = r0
                goto L_0x0017
            L_0x007f:
                r0 = r2
                goto L_0x0030
            L_0x0081:
                r3 = r2
                goto L_0x003b
            L_0x0083:
                r0 = r2
                goto L_0x0048
            L_0x0085:
                r3 = r2
                goto L_0x004f
            L_0x0087:
                r0 = r2
                goto L_0x005c
            L_0x0089:
                r3 = r2
                goto L_0x0063
            L_0x008b:
                r0 = r2
                goto L_0x0070
            L_0x008d:
                r1 = r2
                goto L_0x0076
            L_0x008f:
                com.google.android.gms.internal.agn r8 = (com.google.android.gms.internal.agn) r8
                com.google.android.gms.internal.agu r9 = (com.google.android.gms.internal.agu) r9
                if (r9 != 0) goto L_0x009c
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>()
                throw r0
            L_0x009b:
                r2 = r1
            L_0x009c:
                if (r2 != 0) goto L_0x00ea
                int r0 = r8.a()     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                switch(r0) {
                    case 0: goto L_0x009b;
                    case 10: goto L_0x00ad;
                    case 16: goto L_0x00c1;
                    case 24: goto L_0x00dc;
                    case 32: goto L_0x00e3;
                    default: goto L_0x00a5;
                }     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
            L_0x00a5:
                boolean r0 = r6.a((int) r0, (com.google.android.gms.internal.agn) r8)     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                if (r0 != 0) goto L_0x009c
                r2 = r1
                goto L_0x009c
            L_0x00ad:
                java.lang.String r0 = r8.f()     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                r6.d = r0     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                goto L_0x009c
            L_0x00b4:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bf }
                com.google.android.gms.internal.ahi r0 = r0.a(r6)     // Catch:{ all -> 0x00bf }
                r1.<init>(r0)     // Catch:{ all -> 0x00bf }
                throw r1     // Catch:{ all -> 0x00bf }
            L_0x00bf:
                r0 = move-exception
                throw r0
            L_0x00c1:
                int r0 = r8.i()     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                r6.e = r0     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                goto L_0x009c
            L_0x00c8:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bf }
                com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x00bf }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00bf }
                r2.<init>(r0)     // Catch:{ all -> 0x00bf }
                com.google.android.gms.internal.ahi r0 = r2.a(r6)     // Catch:{ all -> 0x00bf }
                r1.<init>(r0)     // Catch:{ all -> 0x00bf }
                throw r1     // Catch:{ all -> 0x00bf }
            L_0x00dc:
                int r0 = r8.h()     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                r6.f = r0     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                goto L_0x009c
            L_0x00e3:
                int r0 = r8.i()     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                r6.g = r0     // Catch:{ ahi -> 0x00b4, IOException -> 0x00c8 }
                goto L_0x009c
            L_0x00ea:
                com.google.android.gms.internal.acl$b r6 = h
                goto L_0x0017
            L_0x00ee:
                com.google.android.gms.internal.aij<com.google.android.gms.internal.acl$b> r0 = i
                if (r0 != 0) goto L_0x0103
                java.lang.Class<com.google.android.gms.internal.acl$b> r1 = com.google.android.gms.internal.acl.b.class
                monitor-enter(r1)
                com.google.android.gms.internal.aij<com.google.android.gms.internal.acl$b> r0 = i     // Catch:{ all -> 0x0107 }
                if (r0 != 0) goto L_0x0102
                com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x0107 }
                com.google.android.gms.internal.acl$b r2 = h     // Catch:{ all -> 0x0107 }
                r0.<init>(r2)     // Catch:{ all -> 0x0107 }
                i = r0     // Catch:{ all -> 0x0107 }
            L_0x0102:
                monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            L_0x0103:
                com.google.android.gms.internal.aij<com.google.android.gms.internal.acl$b> r6 = i
                goto L_0x0017
            L_0x0107:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0107 }
                throw r0
            L_0x010a:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
                goto L_0x0017
            L_0x0110:
                r6 = r0
                goto L_0x0017
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acl.b.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final void a(agq agq) {
            if (!this.d.isEmpty()) {
                agq.a(1, this.d);
            }
            if (this.e != acd.UNKNOWN_STATUS.a()) {
                agq.b(2, this.e);
            }
            if (this.f != 0) {
                agq.c(3, this.f);
            }
            if (this.g != acv.UNKNOWN_PREFIX.a()) {
                agq.b(4, this.g);
            }
            this.b.a(agq);
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
            if (this.e != acd.UNKNOWN_STATUS.a()) {
                i3 += agq.g(2, this.e);
            }
            if (this.f != 0) {
                i3 += agq.e(3, this.f);
            }
            if (this.g != acv.UNKNOWN_PREFIX.a()) {
                i3 += agq.g(4, this.g);
            }
            int e2 = i3 + this.b.e();
            this.c = e2;
            return e2;
        }
    }

    static {
        acl acl = new acl();
        g = acl;
        acl.a(ahc.g.f, (Object) null, (Object) null);
        acl.b.c();
    }

    private acl() {
    }

    public static a a() {
        acl acl = g;
        ahc.a aVar = (ahc.a) acl.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(acl);
        return (a) aVar;
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.e = i;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        }
        if (!this.f.a()) {
            ahh<b> ahh = this.f;
            int size = ahh.size();
            this.f = ahh.a(size == 0 ? 10 : size << 1);
        }
        this.f.add(bVar);
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
            int[] r3 = com.google.android.gms.internal.acm.a
            int r4 = r6 + -1
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0018;
                case 3: goto L_0x001b;
                case 4: goto L_0x0022;
                case 5: goto L_0x0028;
                case 6: goto L_0x0059;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00ce;
                case 9: goto L_0x00ea;
                case 10: goto L_0x00f0;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            com.google.android.gms.internal.acl r5 = new com.google.android.gms.internal.acl
            r5.<init>()
        L_0x0017:
            return r5
        L_0x0018:
            com.google.android.gms.internal.acl r5 = g
            goto L_0x0017
        L_0x001b:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r1 = r5.f
            r1.b()
            r5 = r0
            goto L_0x0017
        L_0x0022:
            com.google.android.gms.internal.acl$a r5 = new com.google.android.gms.internal.acl$a
            r5.<init>(r0)
            goto L_0x0017
        L_0x0028:
            com.google.android.gms.internal.ahc$h r7 = (com.google.android.gms.internal.ahc.h) r7
            com.google.android.gms.internal.acl r8 = (com.google.android.gms.internal.acl) r8
            int r0 = r5.e
            if (r0 == 0) goto L_0x0055
            r0 = r1
        L_0x0031:
            int r3 = r5.e
            int r4 = r8.e
            if (r4 == 0) goto L_0x0057
        L_0x0037:
            int r2 = r8.e
            int r0 = r7.a((boolean) r0, (int) r3, (boolean) r1, (int) r2)
            r5.e = r0
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r0 = r5.f
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r1 = r8.f
            com.google.android.gms.internal.ahh r0 = r7.a(r0, r1)
            r5.f = r0
            com.google.android.gms.internal.ahc$f r0 = com.google.android.gms.internal.ahc.f.a
            if (r7 != r0) goto L_0x0017
            int r0 = r5.d
            int r1 = r8.d
            r0 = r0 | r1
            r5.d = r0
            goto L_0x0017
        L_0x0055:
            r0 = r2
            goto L_0x0031
        L_0x0057:
            r1 = r2
            goto L_0x0037
        L_0x0059:
            com.google.android.gms.internal.agn r7 = (com.google.android.gms.internal.agn) r7
            com.google.android.gms.internal.agu r8 = (com.google.android.gms.internal.agu) r8
            if (r8 != 0) goto L_0x0066
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0065:
            r2 = r1
        L_0x0066:
            if (r2 != 0) goto L_0x00ca
            int r0 = r7.a()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            switch(r0) {
                case 0: goto L_0x0065;
                case 8: goto L_0x0077;
                case 18: goto L_0x008b;
                default: goto L_0x006f;
            }     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
        L_0x006f:
            boolean r0 = r5.a((int) r0, (com.google.android.gms.internal.agn) r7)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            if (r0 != 0) goto L_0x0066
            r2 = r1
            goto L_0x0066
        L_0x0077:
            int r0 = r7.h()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            r5.e = r0     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            goto L_0x0066
        L_0x007e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0089 }
            com.google.android.gms.internal.ahi r0 = r0.a(r5)     // Catch:{ all -> 0x0089 }
            r1.<init>(r0)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            throw r0
        L_0x008b:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r0 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            boolean r0 = r0.a()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            if (r0 != 0) goto L_0x00a3
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r3 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            int r0 = r3.size()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            if (r0 != 0) goto L_0x00c7
            r0 = 10
        L_0x009d:
            com.google.android.gms.internal.ahh r0 = r3.a(r0)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            r5.f = r0     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
        L_0x00a3:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acl$b> r3 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.acl$b r0 = com.google.android.gms.internal.acl.b.b()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.ahc r0 = r7.a(r0, r8)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.acl$b r0 = (com.google.android.gms.internal.acl.b) r0     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            r3.add(r0)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            goto L_0x0066
        L_0x00b3:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0089 }
            com.google.android.gms.internal.ahi r2 = new com.google.android.gms.internal.ahi     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0089 }
            r2.<init>(r0)     // Catch:{ all -> 0x0089 }
            com.google.android.gms.internal.ahi r0 = r2.a(r5)     // Catch:{ all -> 0x0089 }
            r1.<init>(r0)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x00c7:
            int r0 = r0 << 1
            goto L_0x009d
        L_0x00ca:
            com.google.android.gms.internal.acl r5 = g
            goto L_0x0017
        L_0x00ce:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acl> r0 = h
            if (r0 != 0) goto L_0x00e3
            java.lang.Class<com.google.android.gms.internal.acl> r1 = com.google.android.gms.internal.acl.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acl> r0 = h     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.acl r2 = g     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e7 }
            h = r0     // Catch:{ all -> 0x00e7 }
        L_0x00e2:
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
        L_0x00e3:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acl> r5 = h
            goto L_0x0017
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            throw r0
        L_0x00ea:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            goto L_0x0017
        L_0x00f0:
            r5 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a(agq agq) {
        if (this.e != 0) {
            agq.c(1, this.e);
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
        int e2 = this.e != 0 ? agq.e(1, this.e) + 0 : 0;
        while (true) {
            int i3 = e2;
            if (i < this.f.size()) {
                e2 = agq.c(2, (aid) this.f.get(i)) + i3;
                i++;
            } else {
                int e3 = this.b.e() + i3;
                this.c = e3;
                return e3;
            }
        }
    }
}
