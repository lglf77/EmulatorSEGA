package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class akl extends ajz<akl> {
    private static volatile akl[] c;
    public byte[] a = null;
    public byte[] b = null;

    public akl() {
        this.X = null;
        this.Y = -1;
    }

    public static akl[] b() {
        if (c == null) {
            synchronized (akd.b) {
                if (c == null) {
                    c = new akl[0];
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a() + ajx.b(1, this.a);
        return this.b != null ? a2 + ajx.b(2, this.b) : a2;
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
        ajx.a(1, this.a);
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        super.a(ajx);
    }
}
