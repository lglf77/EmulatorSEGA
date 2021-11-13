package com.google.android.gms.internal;

public final class akr extends ajz<akr> {
    private static volatile akr[] f;
    public Integer a = null;
    public String b = null;
    public akm c = null;
    public Integer d = null;
    public String[] e = aki.f;
    private ako g = null;
    private Integer h = null;
    private int[] i = aki.a;
    private String j = null;

    public akr() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.akr a(com.google.android.gms.internal.ajw r8) {
        /*
            r7 = this;
            r1 = 0
        L_0x0001:
            int r0 = r8.a()
            switch(r0) {
                case 0: goto L_0x000e;
                case 8: goto L_0x000f;
                case 18: goto L_0x001a;
                case 26: goto L_0x0021;
                case 34: goto L_0x0032;
                case 40: goto L_0x0043;
                case 48: goto L_0x004e;
                case 50: goto L_0x0081;
                case 58: goto L_0x00c3;
                case 64: goto L_0x00cb;
                case 74: goto L_0x0102;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r8, r0)
            if (r0 != 0) goto L_0x0001
        L_0x000e:
            return r7
        L_0x000f:
            int r0 = r8.c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.a = r0
            goto L_0x0001
        L_0x001a:
            java.lang.String r0 = r8.e()
            r7.b = r0
            goto L_0x0001
        L_0x0021:
            com.google.android.gms.internal.akm r0 = r7.c
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.internal.akm r0 = new com.google.android.gms.internal.akm
            r0.<init>()
            r7.c = r0
        L_0x002c:
            com.google.android.gms.internal.akm r0 = r7.c
            r8.a((com.google.android.gms.internal.akf) r0)
            goto L_0x0001
        L_0x0032:
            com.google.android.gms.internal.ako r0 = r7.g
            if (r0 != 0) goto L_0x003d
            com.google.android.gms.internal.ako r0 = new com.google.android.gms.internal.ako
            r0.<init>()
            r7.g = r0
        L_0x003d:
            com.google.android.gms.internal.ako r0 = r7.g
            r8.a((com.google.android.gms.internal.akf) r0)
            goto L_0x0001
        L_0x0043:
            int r0 = r8.c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.h = r0
            goto L_0x0001
        L_0x004e:
            r0 = 48
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            int[] r0 = r7.i
            if (r0 != 0) goto L_0x0074
            r0 = r1
        L_0x0059:
            int r2 = r2 + r0
            int[] r2 = new int[r2]
            if (r0 == 0) goto L_0x0063
            int[] r3 = r7.i
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x0063:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x0078
            int r3 = r8.c()
            r2[r0] = r3
            r8.a()
            int r0 = r0 + 1
            goto L_0x0063
        L_0x0074:
            int[] r0 = r7.i
            int r0 = r0.length
            goto L_0x0059
        L_0x0078:
            int r3 = r8.c()
            r2[r0] = r3
            r7.i = r2
            goto L_0x0001
        L_0x0081:
            int r0 = r8.g()
            int r3 = r8.c(r0)
            int r2 = r8.l()
            r0 = r1
        L_0x008e:
            int r4 = r8.k()
            if (r4 <= 0) goto L_0x009a
            r8.c()
            int r0 = r0 + 1
            goto L_0x008e
        L_0x009a:
            r8.e(r2)
            int[] r2 = r7.i
            if (r2 != 0) goto L_0x00b8
            r2 = r1
        L_0x00a2:
            int r0 = r0 + r2
            int[] r0 = new int[r0]
            if (r2 == 0) goto L_0x00ac
            int[] r4 = r7.i
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
        L_0x00ac:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x00bc
            int r4 = r8.c()
            r0[r2] = r4
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00b8:
            int[] r2 = r7.i
            int r2 = r2.length
            goto L_0x00a2
        L_0x00bc:
            r7.i = r0
            r8.d(r3)
            goto L_0x0001
        L_0x00c3:
            java.lang.String r0 = r8.e()
            r7.j = r0
            goto L_0x0001
        L_0x00cb:
            int r2 = r8.l()
            int r3 = r8.c()     // Catch:{ IllegalArgumentException -> 0x00f1 }
            switch(r3) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00fa;
                default: goto L_0x00d6;
            }     // Catch:{ IllegalArgumentException -> 0x00f1 }
        L_0x00d6:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00f1 }
            r5 = 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00f1 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            java.lang.String r5 = " is not a valid enum AdResourceType"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x00f1 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x00f1 }
        L_0x00f1:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x00fa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            r7.d = r3     // Catch:{ IllegalArgumentException -> 0x00f1 }
            goto L_0x0001
        L_0x0102:
            r0 = 74
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            java.lang.String[] r0 = r7.e
            if (r0 != 0) goto L_0x0128
            r0 = r1
        L_0x010d:
            int r2 = r2 + r0
            java.lang.String[] r2 = new java.lang.String[r2]
            if (r0 == 0) goto L_0x0117
            java.lang.String[] r3 = r7.e
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x0117:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x012c
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r8.a()
            int r0 = r0 + 1
            goto L_0x0117
        L_0x0128:
            java.lang.String[] r0 = r7.e
            int r0 = r0.length
            goto L_0x010d
        L_0x012c:
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r7.e = r2
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.akr.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.akr");
    }

    public static akr[] b() {
        if (f == null) {
            synchronized (akd.b) {
                if (f == null) {
                    f = new akr[0];
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a() + ajx.b(1, this.a.intValue());
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += ajx.b(3, (akf) this.c);
        }
        if (this.g != null) {
            a2 += ajx.b(4, (akf) this.g);
        }
        if (this.h != null) {
            a2 += ajx.b(5, this.h.intValue());
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = 0;
            for (int a3 : this.i) {
                i2 += ajx.a(a3);
            }
            a2 = a2 + i2 + (this.i.length * 1);
        }
        if (this.j != null) {
            a2 += ajx.b(7, this.j);
        }
        if (this.d != null) {
            a2 += ajx.b(8, this.d.intValue());
        }
        if (this.e == null || this.e.length <= 0) {
            return a2;
        }
        int i3 = 0;
        int i4 = 0;
        for (String str : this.e) {
            if (str != null) {
                i4++;
                i3 += ajx.a(str);
            }
        }
        return a2 + i3 + (i4 * 1);
    }

    public final void a(ajx ajx) {
        ajx.a(1, this.a.intValue());
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.a(3, (akf) this.c);
        }
        if (this.g != null) {
            ajx.a(4, (akf) this.g);
        }
        if (this.h != null) {
            ajx.a(5, this.h.intValue());
        }
        if (this.i != null && this.i.length > 0) {
            for (int a2 : this.i) {
                ajx.a(6, a2);
            }
        }
        if (this.j != null) {
            ajx.a(7, this.j);
        }
        if (this.d != null) {
            ajx.a(8, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    ajx.a(9, str);
                }
            }
        }
        super.a(ajx);
    }
}
