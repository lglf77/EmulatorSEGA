package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.ahc;
import java.io.IOException;
import java.util.List;

public final class acj extends ahc<acj, a> implements aif {
    /* access modifiers changed from: private */
    public static final acj g;
    private static volatile aij<acj> h;
    private int d;
    private int e;
    private ahh<b> f = l();

    public static final class a extends ahc.a<acj, a> implements aif {
        private a() {
            super(acj.g);
        }

        /* synthetic */ a(ack ack) {
            this();
        }
    }

    public static final class b extends ahc<b, a> implements aif {
        /* access modifiers changed from: private */
        public static final b h;
        private static volatile aij<b> i;
        private abz d;
        private int e;
        private int f;
        private int g;

        public static final class a extends ahc.a<b, a> implements aif {
            private a() {
                super(b.h);
            }

            /* synthetic */ a(ack ack) {
                this();
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

        public static b g() {
            return h;
        }

        /* access modifiers changed from: protected */
        public final Object a(int i2, Object obj, Object obj2) {
            abz.a aVar;
            boolean z = true;
            switch (ack.a[i2 - 1]) {
                case a.b.AdsAttrs_adSizes:
                    return new b();
                case 2:
                    return h;
                case 3:
                    return null;
                case 4:
                    return new a((ack) null);
                case 5:
                    ahc.h hVar = (ahc.h) obj;
                    b bVar = (b) obj2;
                    this.d = (abz) hVar.a(this.d, bVar.d);
                    this.e = hVar.a(this.e != 0, this.e, bVar.e != 0, bVar.e);
                    this.f = hVar.a(this.f != 0, this.f, bVar.f != 0, bVar.f);
                    boolean z2 = this.g != 0;
                    int i3 = this.g;
                    if (bVar.g == 0) {
                        z = false;
                    }
                    this.g = hVar.a(z2, i3, z, bVar.g);
                    return this;
                case 6:
                    agn agn = (agn) obj;
                    agu agu = (agu) obj2;
                    if (agu != null) {
                        boolean z3 = false;
                        while (!z3) {
                            try {
                                int a2 = agn.a();
                                switch (a2) {
                                    case a.b.AdsAttrs_adSize:
                                        z3 = true;
                                        break;
                                    case 10:
                                        if (this.d != null) {
                                            abz abz = this.d;
                                            ahc.a aVar2 = (ahc.a) abz.a(ahc.g.h, (Object) null, (Object) null);
                                            aVar2.a(abz);
                                            aVar = (abz.a) aVar2;
                                        } else {
                                            aVar = null;
                                        }
                                        this.d = (abz) agn.a(abz.f(), agu);
                                        if (aVar == null) {
                                            break;
                                        } else {
                                            aVar.a(this.d);
                                            this.d = (abz) aVar.c();
                                            break;
                                        }
                                    case 16:
                                        this.e = agn.i();
                                        break;
                                    case 24:
                                        this.f = agn.h();
                                        break;
                                    case 32:
                                        this.g = agn.i();
                                        break;
                                    default:
                                        if (a(a2, agn)) {
                                            break;
                                        } else {
                                            z3 = true;
                                            break;
                                        }
                                }
                            } catch (ahi e2) {
                                throw new RuntimeException(e2.a(this));
                            } catch (IOException e3) {
                                throw new RuntimeException(new ahi(e3.getMessage()).a(this));
                            }
                        }
                        break;
                    } else {
                        throw new NullPointerException();
                    }
                case 7:
                    break;
                case 8:
                    if (i == null) {
                        synchronized (b.class) {
                            if (i == null) {
                                i = new ahc.b(h);
                            }
                        }
                    }
                    return i;
                case 9:
                    return (byte) 1;
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return h;
        }

        public final void a(agq agq) {
            if (this.d != null) {
                agq.a(1, (aid) this.d == null ? abz.f() : this.d);
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

        public final boolean a() {
            return this.d != null;
        }

        public final abz b() {
            return this.d == null ? abz.f() : this.d;
        }

        public final acd c() {
            acd a2 = acd.a(this.e);
            return a2 == null ? acd.UNRECOGNIZED : a2;
        }

        public final int d() {
            int i2 = this.c;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if (this.d != null) {
                i3 = agq.c(1, (aid) this.d == null ? abz.f() : this.d) + 0;
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

        public final int e() {
            return this.f;
        }

        public final acv f() {
            acv a2 = acv.a(this.g);
            return a2 == null ? acv.UNRECOGNIZED : a2;
        }
    }

    static {
        acj acj = new acj();
        g = acj;
        acj.a(ahc.g.f, (Object) null, (Object) null);
        acj.b.c();
    }

    private acj() {
    }

    public static acj a(byte[] bArr) {
        return (acj) ahc.a(g, bArr);
    }

    public final int a() {
        return this.e;
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
            int[] r3 = com.google.android.gms.internal.ack.a
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
            com.google.android.gms.internal.acj r5 = new com.google.android.gms.internal.acj
            r5.<init>()
        L_0x0017:
            return r5
        L_0x0018:
            com.google.android.gms.internal.acj r5 = g
            goto L_0x0017
        L_0x001b:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r1 = r5.f
            r1.b()
            r5 = r0
            goto L_0x0017
        L_0x0022:
            com.google.android.gms.internal.acj$a r5 = new com.google.android.gms.internal.acj$a
            r5.<init>(r0)
            goto L_0x0017
        L_0x0028:
            com.google.android.gms.internal.ahc$h r7 = (com.google.android.gms.internal.ahc.h) r7
            com.google.android.gms.internal.acj r8 = (com.google.android.gms.internal.acj) r8
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
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r0 = r5.f
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r1 = r8.f
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
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r0 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            boolean r0 = r0.a()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            if (r0 != 0) goto L_0x00a3
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r3 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            int r0 = r3.size()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            if (r0 != 0) goto L_0x00c7
            r0 = 10
        L_0x009d:
            com.google.android.gms.internal.ahh r0 = r3.a(r0)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            r5.f = r0     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
        L_0x00a3:
            com.google.android.gms.internal.ahh<com.google.android.gms.internal.acj$b> r3 = r5.f     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.acj$b r0 = com.google.android.gms.internal.acj.b.g()     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.ahc r0 = r7.a(r0, r8)     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
            com.google.android.gms.internal.acj$b r0 = (com.google.android.gms.internal.acj.b) r0     // Catch:{ ahi -> 0x007e, IOException -> 0x00b3 }
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
            com.google.android.gms.internal.acj r5 = g
            goto L_0x0017
        L_0x00ce:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acj> r0 = h
            if (r0 != 0) goto L_0x00e3
            java.lang.Class<com.google.android.gms.internal.acj> r1 = com.google.android.gms.internal.acj.class
            monitor-enter(r1)
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acj> r0 = h     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.internal.ahc$b r0 = new com.google.android.gms.internal.ahc$b     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.acj r2 = g     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e7 }
            h = r0     // Catch:{ all -> 0x00e7 }
        L_0x00e2:
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
        L_0x00e3:
            com.google.android.gms.internal.aij<com.google.android.gms.internal.acj> r5 = h
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acj.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
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

    public final List<b> b() {
        return this.f;
    }

    public final int c() {
        return this.f.size();
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
