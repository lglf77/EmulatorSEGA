package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ako extends ajz<ako> {
    private akp a = null;
    private akl[] b = akl.b();
    private byte[] c = null;
    private byte[] d = null;
    private Integer e = null;
    private byte[] f = null;

    public ako() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, (akf) this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = a2;
            for (akl akl : this.b) {
                if (akl != null) {
                    i += ajx.b(2, (akf) akl);
                }
            }
            a2 = i;
        }
        if (this.c != null) {
            a2 += ajx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += ajx.b(4, this.d);
        }
        if (this.e != null) {
            a2 += ajx.b(5, this.e.intValue());
        }
        return this.f != null ? a2 + ajx.b(6, this.f) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new akp();
                    }
                    ajw.a((akf) this.a);
                    continue;
                case 18:
                    int a3 = aki.a(ajw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    akl[] aklArr = new akl[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, aklArr, 0, length);
                    }
                    while (length < aklArr.length - 1) {
                        aklArr[length] = new akl();
                        ajw.a((akf) aklArr[length]);
                        ajw.a();
                        length++;
                    }
                    aklArr[length] = new akl();
                    ajw.a((akf) aklArr[length]);
                    this.b = aklArr;
                    continue;
                case 26:
                    this.c = ajw.f();
                    continue;
                case 34:
                    this.d = ajw.f();
                    continue;
                case 40:
                    this.e = Integer.valueOf(ajw.c());
                    continue;
                case 50:
                    this.f = ajw.f();
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
            ajx.a(1, (akf) this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (akl akl : this.b) {
                if (akl != null) {
                    ajx.a(2, (akf) akl);
                }
            }
        }
        if (this.c != null) {
            ajx.a(3, this.c);
        }
        if (this.d != null) {
            ajx.a(4, this.d);
        }
        if (this.e != null) {
            ajx.a(5, this.e.intValue());
        }
        if (this.f != null) {
            ajx.a(6, this.f);
        }
        super.a(ajx);
    }
}
