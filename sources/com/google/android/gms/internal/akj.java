package com.google.android.gms.internal;

public final class akj extends ajz<akj> {
    public Integer a = null;
    public String b = null;
    public String c = null;
    public akk d = null;
    public akr[] e = akr.b();
    public String f = null;
    public akq g = null;
    public aks h = null;
    private Integer i = null;
    private String j = null;
    private Boolean k = null;
    private String[] l = aki.f;
    private String m = null;
    private Boolean n = null;
    private Boolean o = null;
    private byte[] p = null;

    public akj() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.akj a(com.google.android.gms.internal.ajw r8) {
        /*
            r7 = this;
            r1 = 0
        L_0x0001:
            int r0 = r8.a()
            switch(r0) {
                case 0: goto L_0x000e;
                case 10: goto L_0x000f;
                case 18: goto L_0x0016;
                case 26: goto L_0x001d;
                case 34: goto L_0x0024;
                case 40: goto L_0x0063;
                case 50: goto L_0x006e;
                case 58: goto L_0x00a2;
                case 64: goto L_0x00aa;
                case 72: goto L_0x00b6;
                case 80: goto L_0x00c2;
                case 88: goto L_0x00f9;
                case 98: goto L_0x0130;
                case 106: goto L_0x0142;
                case 114: goto L_0x014a;
                case 122: goto L_0x015c;
                case 138: goto L_0x0164;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r8, r0)
            if (r0 != 0) goto L_0x0001
        L_0x000e:
            return r7
        L_0x000f:
            java.lang.String r0 = r8.e()
            r7.b = r0
            goto L_0x0001
        L_0x0016:
            java.lang.String r0 = r8.e()
            r7.c = r0
            goto L_0x0001
        L_0x001d:
            java.lang.String r0 = r8.e()
            r7.j = r0
            goto L_0x0001
        L_0x0024:
            r0 = 34
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            com.google.android.gms.internal.akr[] r0 = r7.e
            if (r0 != 0) goto L_0x0050
            r0 = r1
        L_0x002f:
            int r2 = r2 + r0
            com.google.android.gms.internal.akr[] r2 = new com.google.android.gms.internal.akr[r2]
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.internal.akr[] r3 = r7.e
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x0039:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x0054
            com.google.android.gms.internal.akr r3 = new com.google.android.gms.internal.akr
            r3.<init>()
            r2[r0] = r3
            r3 = r2[r0]
            r8.a((com.google.android.gms.internal.akf) r3)
            r8.a()
            int r0 = r0 + 1
            goto L_0x0039
        L_0x0050:
            com.google.android.gms.internal.akr[] r0 = r7.e
            int r0 = r0.length
            goto L_0x002f
        L_0x0054:
            com.google.android.gms.internal.akr r3 = new com.google.android.gms.internal.akr
            r3.<init>()
            r2[r0] = r3
            r0 = r2[r0]
            r8.a((com.google.android.gms.internal.akf) r0)
            r7.e = r2
            goto L_0x0001
        L_0x0063:
            boolean r0 = r8.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.k = r0
            goto L_0x0001
        L_0x006e:
            r0 = 50
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            java.lang.String[] r0 = r7.l
            if (r0 != 0) goto L_0x0094
            r0 = r1
        L_0x0079:
            int r2 = r2 + r0
            java.lang.String[] r2 = new java.lang.String[r2]
            if (r0 == 0) goto L_0x0083
            java.lang.String[] r3 = r7.l
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x0083:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x0098
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r8.a()
            int r0 = r0 + 1
            goto L_0x0083
        L_0x0094:
            java.lang.String[] r0 = r7.l
            int r0 = r0.length
            goto L_0x0079
        L_0x0098:
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r7.l = r2
            goto L_0x0001
        L_0x00a2:
            java.lang.String r0 = r8.e()
            r7.m = r0
            goto L_0x0001
        L_0x00aa:
            boolean r0 = r8.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.n = r0
            goto L_0x0001
        L_0x00b6:
            boolean r0 = r8.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.o = r0
            goto L_0x0001
        L_0x00c2:
            int r2 = r8.l()
            int r3 = r8.c()     // Catch:{ IllegalArgumentException -> 0x00e8 }
            switch(r3) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00f1;
                case 9: goto L_0x00f1;
                default: goto L_0x00cd;
            }     // Catch:{ IllegalArgumentException -> 0x00e8 }
        L_0x00cd:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r5 = 42
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            java.lang.String r5 = " is not a valid enum ReportType"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x00e8 }
        L_0x00e8:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x00f1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00e8 }
            r7.a = r3     // Catch:{ IllegalArgumentException -> 0x00e8 }
            goto L_0x0001
        L_0x00f9:
            int r2 = r8.l()
            int r3 = r8.c()     // Catch:{ IllegalArgumentException -> 0x011f }
            switch(r3) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0128;
                case 2: goto L_0x0128;
                case 3: goto L_0x0128;
                case 4: goto L_0x0128;
                default: goto L_0x0104;
            }     // Catch:{ IllegalArgumentException -> 0x011f }
        L_0x0104:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x011f }
            r5 = 39
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x011f }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x011f }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x011f }
            java.lang.String r5 = " is not a valid enum Verdict"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x011f }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x011f }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x011f }
            throw r4     // Catch:{ IllegalArgumentException -> 0x011f }
        L_0x011f:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x0128:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x011f }
            r7.i = r3     // Catch:{ IllegalArgumentException -> 0x011f }
            goto L_0x0001
        L_0x0130:
            com.google.android.gms.internal.akk r0 = r7.d
            if (r0 != 0) goto L_0x013b
            com.google.android.gms.internal.akk r0 = new com.google.android.gms.internal.akk
            r0.<init>()
            r7.d = r0
        L_0x013b:
            com.google.android.gms.internal.akk r0 = r7.d
            r8.a((com.google.android.gms.internal.akf) r0)
            goto L_0x0001
        L_0x0142:
            java.lang.String r0 = r8.e()
            r7.f = r0
            goto L_0x0001
        L_0x014a:
            com.google.android.gms.internal.akq r0 = r7.g
            if (r0 != 0) goto L_0x0155
            com.google.android.gms.internal.akq r0 = new com.google.android.gms.internal.akq
            r0.<init>()
            r7.g = r0
        L_0x0155:
            com.google.android.gms.internal.akq r0 = r7.g
            r8.a((com.google.android.gms.internal.akf) r0)
            goto L_0x0001
        L_0x015c:
            byte[] r0 = r8.f()
            r7.p = r0
            goto L_0x0001
        L_0x0164:
            com.google.android.gms.internal.aks r0 = r7.h
            if (r0 != 0) goto L_0x016f
            com.google.android.gms.internal.aks r0 = new com.google.android.gms.internal.aks
            r0.<init>()
            r7.h = r0
        L_0x016f:
            com.google.android.gms.internal.aks r0 = r7.h
            r8.a((com.google.android.gms.internal.akf) r0)
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.akj.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.akj");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += ajx.b(1, this.b);
        }
        if (this.c != null) {
            a2 += ajx.b(2, this.c);
        }
        if (this.j != null) {
            a2 += ajx.b(3, this.j);
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = a2;
            for (akr akr : this.e) {
                if (akr != null) {
                    i2 += ajx.b(4, (akf) akr);
                }
            }
            a2 = i2;
        }
        if (this.k != null) {
            this.k.booleanValue();
            a2 += ajx.b(5) + 1;
        }
        if (this.l != null && this.l.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.l) {
                if (str != null) {
                    i4++;
                    i3 += ajx.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.m != null) {
            a2 += ajx.b(7, this.m);
        }
        if (this.n != null) {
            this.n.booleanValue();
            a2 += ajx.b(8) + 1;
        }
        if (this.o != null) {
            this.o.booleanValue();
            a2 += ajx.b(9) + 1;
        }
        if (this.a != null) {
            a2 += ajx.b(10, this.a.intValue());
        }
        if (this.i != null) {
            a2 += ajx.b(11, this.i.intValue());
        }
        if (this.d != null) {
            a2 += ajx.b(12, (akf) this.d);
        }
        if (this.f != null) {
            a2 += ajx.b(13, this.f);
        }
        if (this.g != null) {
            a2 += ajx.b(14, (akf) this.g);
        }
        if (this.p != null) {
            a2 += ajx.b(15, this.p);
        }
        return this.h != null ? a2 + ajx.b(17, (akf) this.h) : a2;
    }

    public final void a(ajx ajx) {
        if (this.b != null) {
            ajx.a(1, this.b);
        }
        if (this.c != null) {
            ajx.a(2, this.c);
        }
        if (this.j != null) {
            ajx.a(3, this.j);
        }
        if (this.e != null && this.e.length > 0) {
            for (akr akr : this.e) {
                if (akr != null) {
                    ajx.a(4, (akf) akr);
                }
            }
        }
        if (this.k != null) {
            ajx.a(5, this.k.booleanValue());
        }
        if (this.l != null && this.l.length > 0) {
            for (String str : this.l) {
                if (str != null) {
                    ajx.a(6, str);
                }
            }
        }
        if (this.m != null) {
            ajx.a(7, this.m);
        }
        if (this.n != null) {
            ajx.a(8, this.n.booleanValue());
        }
        if (this.o != null) {
            ajx.a(9, this.o.booleanValue());
        }
        if (this.a != null) {
            ajx.a(10, this.a.intValue());
        }
        if (this.i != null) {
            ajx.a(11, this.i.intValue());
        }
        if (this.d != null) {
            ajx.a(12, (akf) this.d);
        }
        if (this.f != null) {
            ajx.a(13, this.f);
        }
        if (this.g != null) {
            ajx.a(14, (akf) this.g);
        }
        if (this.p != null) {
            ajx.a(15, this.p);
        }
        if (this.h != null) {
            ajx.a(17, (akf) this.h);
        }
        super.a(ajx);
    }
}
