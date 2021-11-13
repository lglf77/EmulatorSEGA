package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class pf extends ajz<pf> {
    private Long a = null;
    private Integer b = null;
    private Boolean c = null;
    private int[] d = aki.a;
    private Long e = null;

    public pf() {
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b.intValue());
        }
        if (this.c != null) {
            this.c.booleanValue();
            a2 += ajx.b(3) + 1;
        }
        if (this.d != null && this.d.length > 0) {
            int i = 0;
            for (int a3 : this.d) {
                i += ajx.a(a3);
            }
            a2 = a2 + i + (this.d.length * 1);
        }
        if (this.e == null) {
            return a2;
        }
        return a2 + ajx.b(5) + ajx.a(this.e.longValue());
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Long.valueOf(ajw.h());
                    continue;
                case 16:
                    this.b = Integer.valueOf(ajw.g());
                    continue;
                case 24:
                    this.c = Boolean.valueOf(ajw.d());
                    continue;
                case 32:
                    int a3 = aki.a(ajw, 32);
                    int length = this.d == null ? 0 : this.d.length;
                    int[] iArr = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = ajw.g();
                        ajw.a();
                        length++;
                    }
                    iArr[length] = ajw.g();
                    this.d = iArr;
                    continue;
                case 34:
                    int c2 = ajw.c(ajw.g());
                    int l = ajw.l();
                    int i = 0;
                    while (ajw.k() > 0) {
                        ajw.g();
                        i++;
                    }
                    ajw.e(l);
                    int length2 = this.d == null ? 0 : this.d.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = ajw.g();
                        length2++;
                    }
                    this.d = iArr2;
                    ajw.d(c2);
                    continue;
                case 40:
                    this.e = Long.valueOf(ajw.h());
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
            ajx.b(1, this.a.longValue());
        }
        if (this.b != null) {
            ajx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            ajx.a(3, this.c.booleanValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (int a2 : this.d) {
                ajx.a(4, a2);
            }
        }
        if (this.e != null) {
            ajx.a(5, this.e.longValue());
        }
        super.a(ajx);
    }
}
