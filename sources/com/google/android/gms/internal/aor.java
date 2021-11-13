package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class aor extends ajz<aor> {
    public String a = null;
    public long[] b = aki.b;
    public aoq c = null;
    public aop d = null;

    public aor() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(10, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = 0;
            for (long a3 : this.b) {
                i += ajx.a(a3);
            }
            a2 = a2 + i + (this.b.length * 1);
        }
        if (this.c != null) {
            a2 += ajx.b(15, (akf) this.c);
        }
        return this.d != null ? a2 + ajx.b(18, (akf) this.d) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 82:
                    this.a = ajw.e();
                    continue;
                case 112:
                    int a3 = aki.a(ajw, 112);
                    int length = this.b == null ? 0 : this.b.length;
                    long[] jArr = new long[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = ajw.h();
                        ajw.a();
                        length++;
                    }
                    jArr[length] = ajw.h();
                    this.b = jArr;
                    continue;
                case 114:
                    int c2 = ajw.c(ajw.g());
                    int l = ajw.l();
                    int i = 0;
                    while (ajw.k() > 0) {
                        ajw.h();
                        i++;
                    }
                    ajw.e(l);
                    int length2 = this.b == null ? 0 : this.b.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = ajw.h();
                        length2++;
                    }
                    this.b = jArr2;
                    ajw.d(c2);
                    continue;
                case 122:
                    if (this.c == null) {
                        this.c = new aoq();
                    }
                    ajw.a((akf) this.c);
                    continue;
                case 146:
                    if (this.d == null) {
                        this.d = new aop();
                    }
                    ajw.a((akf) this.d);
                    continue;
                default:
                    if (!super.a(ajw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.a(10, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (long a2 : this.b) {
                ajx.a(14, a2);
            }
        }
        if (this.c != null) {
            ajx.a(15, (akf) this.c);
        }
        if (this.d != null) {
            ajx.a(18, (akf) this.d);
        }
        super.a(ajx);
    }
}
