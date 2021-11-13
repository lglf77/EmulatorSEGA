package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class oz extends ajz<oz> {
    public String a;
    private String b;
    private String c;
    private String d;
    private String e;

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
        if (this.d != null) {
            a2 += ajx.b(4, this.d);
        }
        return this.e != null ? a2 + ajx.b(5, this.e) : a2;
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
                case 18:
                    this.b = ajw.e();
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
        if (this.e != null) {
            ajx.a(5, this.e);
        }
        super.a(ajx);
    }
}
