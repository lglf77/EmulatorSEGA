package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class pg extends ajz<pg> {
    public byte[] a = null;
    public byte[] b = null;
    public byte[] c = null;
    public byte[] d = null;

    public pg() {
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += ajx.b(3, this.c);
        }
        return this.d != null ? a2 + ajx.b(4, this.d) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    this.a = ajw.f();
                    continue;
                case 18:
                    this.b = ajw.f();
                    continue;
                case 26:
                    this.c = ajw.f();
                    continue;
                case 34:
                    this.d = ajw.f();
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
            ajx.a(1, this.a);
        }
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.a(3, this.c);
        }
        if (this.d != null) {
            ajx.a(4, this.d);
        }
        super.a(ajx);
    }
}
