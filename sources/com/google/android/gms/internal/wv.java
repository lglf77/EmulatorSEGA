package com.google.android.gms.internal;

public final class wv extends ajz<wv> {
    public Integer a = null;
    public Boolean b = null;
    public String c = null;
    public String d = null;
    public String e = null;

    public wv() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.wv a(com.google.android.gms.internal.ajw r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x000d;
                case 8: goto L_0x000e;
                case 16: goto L_0x0043;
                case 26: goto L_0x004e;
                case 34: goto L_0x0055;
                case 42: goto L_0x005c;
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
                default: goto L_0x0019;
            }     // Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0019:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0034 }
            r4 = 46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0034 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0034 }
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0034 }
            java.lang.String r4 = " is not a valid enum ComparisonType"
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
        L_0x0043:
            boolean r0 = r7.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.b = r0
            goto L_0x0000
        L_0x004e:
            java.lang.String r0 = r7.e()
            r6.c = r0
            goto L_0x0000
        L_0x0055:
            java.lang.String r0 = r7.e()
            r6.d = r0
            goto L_0x0000
        L_0x005c:
            java.lang.String r0 = r7.e()
            r6.e = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wv.a(com.google.android.gms.internal.ajw):com.google.android.gms.internal.wv");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null) {
            this.b.booleanValue();
            a2 += ajx.b(2) + 1;
        }
        if (this.c != null) {
            a2 += ajx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += ajx.b(4, this.d);
        }
        return this.e != null ? a2 + ajx.b(5, this.e) : a2;
    }

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            ajx.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            ajx.a(3, this.c);
        }
        if (this.d != null) {
            ajx.a(4, this.d);
        }
        if (this.e != null) {
            ajx.a(5, this.e);
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        if (this.a == null) {
            if (wvVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wvVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wvVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wvVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (wvVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(wvVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (wvVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(wvVar.d)) {
            return false;
        }
        if (this.e == null) {
            if (wvVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(wvVar.e)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wvVar.X == null || wvVar.X.b() : this.X.equals(wvVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
