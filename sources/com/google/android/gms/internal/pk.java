package com.google.android.gms.internal;

public final class pk extends ajz<pk> {
    public byte[][] a = aki.g;
    public byte[] b = null;
    public Integer c;
    private Integer d;

    public pk() {
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.pk a(com.google.android.gms.internal.ajw r8) {
        /*
            r7 = this;
            r1 = 0
        L_0x0001:
            int r0 = r8.a()
            switch(r0) {
                case 0: goto L_0x000e;
                case 10: goto L_0x000f;
                case 18: goto L_0x0042;
                case 24: goto L_0x0049;
                case 32: goto L_0x007e;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r8, r0)
            if (r0 != 0) goto L_0x0001
        L_0x000e:
            return r7
        L_0x000f:
            r0 = 10
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            byte[][] r0 = r7.a
            if (r0 != 0) goto L_0x0035
            r0 = r1
        L_0x001a:
            int r2 = r2 + r0
            byte[][] r2 = new byte[r2][]
            if (r0 == 0) goto L_0x0024
            byte[][] r3 = r7.a
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x0024:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x0039
            byte[] r3 = r8.f()
            r2[r0] = r3
            r8.a()
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0035:
            byte[][] r0 = r7.a
            int r0 = r0.length
            goto L_0x001a
        L_0x0039:
            byte[] r3 = r8.f()
            r2[r0] = r3
            r7.a = r2
            goto L_0x0001
        L_0x0042:
            byte[] r0 = r8.f()
            r7.b = r0
            goto L_0x0001
        L_0x0049:
            int r2 = r8.l()
            int r3 = r8.g()     // Catch:{ IllegalArgumentException -> 0x006f }
            switch(r3) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0077;
                default: goto L_0x0054;
            }     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x0054:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x006f }
            r5 = 41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x006f }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.String r5 = " is not a valid enum ProtoName"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x006f }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x006f }
            throw r4     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x0077:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x006f }
            r7.d = r3     // Catch:{ IllegalArgumentException -> 0x006f }
            goto L_0x0001
        L_0x007e:
            int r2 = r8.l()
            int r3 = r8.g()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            switch(r3) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00ad;
                default: goto L_0x0089;
            }     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x0089:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r5 = 48
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.String r5 = " is not a valid enum EncryptionMethod"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x00a4:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x00ad:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r7.c = r3     // Catch:{ IllegalArgumentException -> 0x00a4 }
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pk.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.pk");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.a) {
                if (bArr != null) {
                    i3++;
                    i2 += ajx.b(bArr);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.b != null) {
            i += ajx.b(2, this.b);
        }
        if (this.d != null) {
            i += ajx.b(3, this.d.intValue());
        }
        return this.c != null ? i + ajx.b(4, this.c.intValue()) : i;
    }

    public final void a(ajx ajx) {
        if (this.a != null && this.a.length > 0) {
            for (byte[] bArr : this.a) {
                if (bArr != null) {
                    ajx.a(1, bArr);
                }
            }
        }
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.d != null) {
            ajx.a(3, this.d.intValue());
        }
        if (this.c != null) {
            ajx.a(4, this.c.intValue());
        }
        super.a(ajx);
    }
}
