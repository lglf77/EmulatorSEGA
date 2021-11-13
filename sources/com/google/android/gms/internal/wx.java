package com.google.android.gms.internal;

public final class wx extends ajz<wx> {
    public Integer a = null;
    public String b = null;
    public Boolean c = null;
    public String[] d = aki.f;

    public wx() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.wx a(com.google.android.gms.internal.ajw r8) {
        /*
            r7 = this;
            r1 = 0
        L_0x0001:
            int r0 = r8.a()
            switch(r0) {
                case 0: goto L_0x000e;
                case 8: goto L_0x000f;
                case 18: goto L_0x0044;
                case 24: goto L_0x004b;
                case 34: goto L_0x0056;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.a(r8, r0)
            if (r0 != 0) goto L_0x0001
        L_0x000e:
            return r7
        L_0x000f:
            int r2 = r8.l()
            int r3 = r8.g()     // Catch:{ IllegalArgumentException -> 0x0035 }
            switch(r3) {
                case 0: goto L_0x003d;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x003d;
                case 5: goto L_0x003d;
                case 6: goto L_0x003d;
                default: goto L_0x001a;
            }     // Catch:{ IllegalArgumentException -> 0x0035 }
        L_0x001a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0035 }
            r5 = 41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0035 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0035 }
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x0035 }
            java.lang.String r5 = " is not a valid enum MatchType"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x0035 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x0035 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0035 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x0035 }
        L_0x0035:
            r3 = move-exception
            r8.e(r2)
            r7.a(r8, r0)
            goto L_0x0001
        L_0x003d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0035 }
            r7.a = r3     // Catch:{ IllegalArgumentException -> 0x0035 }
            goto L_0x0001
        L_0x0044:
            java.lang.String r0 = r8.e()
            r7.b = r0
            goto L_0x0001
        L_0x004b:
            boolean r0 = r8.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.c = r0
            goto L_0x0001
        L_0x0056:
            r0 = 34
            int r2 = com.google.android.gms.internal.aki.a(r8, r0)
            java.lang.String[] r0 = r7.d
            if (r0 != 0) goto L_0x007c
            r0 = r1
        L_0x0061:
            int r2 = r2 + r0
            java.lang.String[] r2 = new java.lang.String[r2]
            if (r0 == 0) goto L_0x006b
            java.lang.String[] r3 = r7.d
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
        L_0x006b:
            int r3 = r2.length
            int r3 = r3 + -1
            if (r0 >= r3) goto L_0x0080
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r8.a()
            int r0 = r0 + 1
            goto L_0x006b
        L_0x007c:
            java.lang.String[] r0 = r7.d
            int r0 = r0.length
            goto L_0x0061
        L_0x0080:
            java.lang.String r3 = r8.e()
            r2[r0] = r3
            r7.d = r2
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wx.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.wx");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            a2 += ajx.b(3) + 1;
        }
        if (this.d == null || this.d.length <= 0) {
            return a2;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.d) {
            if (str != null) {
                i2++;
                i += ajx.a(str);
            }
        }
        return a2 + i + (i2 * 1);
    }

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.a(3, this.c.booleanValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    ajx.a(4, str);
                }
            }
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        if (this.a == null) {
            if (wxVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wxVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wxVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wxVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (wxVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(wxVar.c)) {
            return false;
        }
        if (!akd.a((Object[]) this.d, (Object[]) wxVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wxVar.X == null || wxVar.X.b() : this.X.equals(wxVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31) + akd.a((Object[]) this.d)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
