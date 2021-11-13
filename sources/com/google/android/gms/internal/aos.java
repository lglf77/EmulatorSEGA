package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class aos extends ajz<aos> {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;

    public aos() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b.intValue());
        }
        return this.c != null ? a2 + ajx.b(3, this.c.intValue()) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Integer.valueOf(ajw.g());
                    continue;
                case 16:
                    this.b = Integer.valueOf(ajw.g());
                    continue;
                case 24:
                    this.c = Integer.valueOf(ajw.g());
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
            ajx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            ajx.a(2, this.b.intValue());
        }
        if (this.c != null) {
            ajx.a(3, this.c.intValue());
        }
        super.a(ajx);
    }
}
