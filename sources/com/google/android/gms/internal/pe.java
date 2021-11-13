package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class pe extends ajz<pe> {
    public Long a = null;
    public Long b = null;
    public Long c = null;
    private Long d = null;
    private Long e = null;

    public pe() {
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.d != null) {
            a2 += ajx.c(1, this.d.longValue());
        }
        if (this.e != null) {
            a2 += ajx.c(2, this.e.longValue());
        }
        if (this.a != null) {
            a2 += ajx.c(3, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.c(4, this.b.longValue());
        }
        return this.c != null ? a2 + ajx.c(5, this.c.longValue()) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.d = Long.valueOf(ajw.h());
                    continue;
                case 16:
                    this.e = Long.valueOf(ajw.h());
                    continue;
                case 24:
                    this.a = Long.valueOf(ajw.h());
                    continue;
                case 32:
                    this.b = Long.valueOf(ajw.h());
                    continue;
                case 40:
                    this.c = Long.valueOf(ajw.h());
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
        if (this.d != null) {
            ajx.b(1, this.d.longValue());
        }
        if (this.e != null) {
            ajx.b(2, this.e.longValue());
        }
        if (this.a != null) {
            ajx.b(3, this.a.longValue());
        }
        if (this.b != null) {
            ajx.b(4, this.b.longValue());
        }
        if (this.c != null) {
            ajx.b(5, this.c.longValue());
        }
        super.a(ajx);
    }
}
