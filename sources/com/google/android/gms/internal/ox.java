package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ox extends ajz<ox> {
    public String a = null;
    public Long b = null;
    private String c = null;
    private String d = null;
    private String e = null;
    private Long f = null;
    private Long g = null;
    private String h = null;
    private Long i = null;
    private String j = null;

    public ox() {
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += ajx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += ajx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += ajx.b(4, this.d);
        }
        if (this.e != null) {
            a2 += ajx.b(5, this.e);
        }
        if (this.f != null) {
            a2 += ajx.c(6, this.f.longValue());
        }
        if (this.g != null) {
            a2 += ajx.c(7, this.g.longValue());
        }
        if (this.h != null) {
            a2 += ajx.b(8, this.h);
        }
        if (this.i != null) {
            a2 += ajx.c(9, this.i.longValue());
        }
        return this.j != null ? a2 + ajx.b(10, this.j) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    this.a = ajw.e();
                    continue;
                case 16:
                    this.b = Long.valueOf(ajw.h());
                    continue;
                case 26:
                    this.c = ajw.e();
                    continue;
                case 34:
                    this.d = ajw.e();
                    continue;
                case 42:
                    this.e = ajw.e();
                    continue;
                case 48:
                    this.f = Long.valueOf(ajw.h());
                    continue;
                case 56:
                    this.g = Long.valueOf(ajw.h());
                    continue;
                case 66:
                    this.h = ajw.e();
                    continue;
                case 72:
                    this.i = Long.valueOf(ajw.h());
                    continue;
                case 82:
                    this.j = ajw.e();
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
            ajx.b(2, this.b.longValue());
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
        if (this.f != null) {
            ajx.b(6, this.f.longValue());
        }
        if (this.g != null) {
            ajx.b(7, this.g.longValue());
        }
        if (this.h != null) {
            ajx.a(8, this.h);
        }
        if (this.i != null) {
            ajx.b(9, this.i.longValue());
        }
        if (this.j != null) {
            ajx.a(10, this.j);
        }
        super.a(ajx);
    }
}
