package com.google.android.gms.internal;

public final class aop extends ajz<aop> {
    public Integer a = null;

    public aop() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.aop a(com.google.android.gms.internal.ajw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 56: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
        L_0x000d:
            return r6
        L_0x000e:
            int r1 = r7.l()
            int r2 = r7.g()     // Catch:{ IllegalArgumentException -> 0x0034 }
            switch(r2) {
                case 0: goto L_0x003c;
                case 1: goto L_0x003c;
                case 2: goto L_0x003c;
                case 3: goto L_0x003c;
                case 4: goto L_0x003c;
                case 5: goto L_0x003c;
                case 6: goto L_0x003c;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                case 9: goto L_0x003c;
                default: goto L_0x0019;
            }     // Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0019:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0034 }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0034 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0034 }
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0034 }
            java.lang.String r4 = " is not a valid enum AdInitiater"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ IllegalArgumentException -> 0x0034 }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0034 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0034 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x003c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0034 }
            r6.a = r2     // Catch:{ IllegalArgumentException -> 0x0034 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aop.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.aop");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        return this.a != null ? a2 + ajx.b(7, this.a.intValue()) : a2;
    }

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.a(7, this.a.intValue());
        }
        super.a(ajx);
    }
}
