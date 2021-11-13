package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xh extends ajz<xh> {
    public long[] a = aki.b;
    public long[] b = aki.b;

    public xh() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (long a3 : this.a) {
                i2 += ajx.a(a3);
            }
            i = a2 + i2 + (this.a.length * 1);
        }
        if (this.b == null || this.b.length <= 0) {
            return i;
        }
        int i3 = 0;
        for (long a4 : this.b) {
            i3 += ajx.a(a4);
        }
        return i + i3 + (this.b.length * 1);
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    int a3 = aki.a(ajw, 8);
                    int length = this.a == null ? 0 : this.a.length;
                    long[] jArr = new long[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = ajw.h();
                        ajw.a();
                        length++;
                    }
                    jArr[length] = ajw.h();
                    this.a = jArr;
                    continue;
                case 10:
                    int c = ajw.c(ajw.g());
                    int l = ajw.l();
                    int i = 0;
                    while (ajw.k() > 0) {
                        ajw.h();
                        i++;
                    }
                    ajw.e(l);
                    int length2 = this.a == null ? 0 : this.a.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.a, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = ajw.h();
                        length2++;
                    }
                    this.a = jArr2;
                    ajw.d(c);
                    continue;
                case 16:
                    int a4 = aki.a(ajw, 16);
                    int length3 = this.b == null ? 0 : this.b.length;
                    long[] jArr3 = new long[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.b, 0, jArr3, 0, length3);
                    }
                    while (length3 < jArr3.length - 1) {
                        jArr3[length3] = ajw.h();
                        ajw.a();
                        length3++;
                    }
                    jArr3[length3] = ajw.h();
                    this.b = jArr3;
                    continue;
                case 18:
                    int c2 = ajw.c(ajw.g());
                    int l2 = ajw.l();
                    int i2 = 0;
                    while (ajw.k() > 0) {
                        ajw.h();
                        i2++;
                    }
                    ajw.e(l2);
                    int length4 = this.b == null ? 0 : this.b.length;
                    long[] jArr4 = new long[(i2 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.b, 0, jArr4, 0, length4);
                    }
                    while (length4 < jArr4.length) {
                        jArr4[length4] = ajw.h();
                        length4++;
                    }
                    this.b = jArr4;
                    ajw.d(c2);
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
        if (this.a != null && this.a.length > 0) {
            for (long a2 : this.a) {
                ajx.a(1, a2);
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (long a3 : this.b) {
                ajx.a(2, a3);
            }
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        if (!akd.a(this.a, xhVar.a)) {
            return false;
        }
        if (!akd.a(this.b, xhVar.b)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xhVar.X == null || xhVar.X.b() : this.X.equals(xhVar.X);
    }

    public final int hashCode() {
        return ((this.X == null || this.X.b()) ? 0 : this.X.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + akd.a(this.a)) * 31) + akd.a(this.b)) * 31);
    }
}
