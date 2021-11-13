package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class akm extends ajz<akm> {
    public akl[] a = akl.b();
    private akn b = null;
    private byte[] c = null;
    private byte[] d = null;
    private Integer e = null;

    public akm() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.b != null) {
            a2 += ajx.b(1, (akf) this.b);
        }
        if (this.a != null && this.a.length > 0) {
            int i = a2;
            for (akl akl : this.a) {
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
        return this.e != null ? a2 + ajx.b(5, this.e.intValue()) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new akn();
                    }
                    ajw.a((akf) this.b);
                    continue;
                case 18:
                    int a3 = aki.a(ajw, 18);
                    int length = this.a == null ? 0 : this.a.length;
                    akl[] aklArr = new akl[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, aklArr, 0, length);
                    }
                    while (length < aklArr.length - 1) {
                        aklArr[length] = new akl();
                        ajw.a((akf) aklArr[length]);
                        ajw.a();
                        length++;
                    }
                    aklArr[length] = new akl();
                    ajw.a((akf) aklArr[length]);
                    this.a = aklArr;
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
        if (this.b != null) {
            ajx.a(1, (akf) this.b);
        }
        if (this.a != null && this.a.length > 0) {
            for (akl akl : this.a) {
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
        super.a(ajx);
    }
}
