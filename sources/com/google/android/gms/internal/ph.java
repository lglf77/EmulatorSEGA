package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ph extends ajz<ph> {
    public Long a = null;
    private String b = null;
    private byte[] c = null;

    public ph() {
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.b(3, this.b);
        }
        return this.c != null ? a2 + ajx.b(4, this.c) : a2;
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
                case 26:
                    this.b = ajw.e();
                    continue;
                case 34:
                    this.c = ajw.f();
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
            ajx.a(3, this.b);
        }
        if (this.c != null) {
            ajx.a(4, this.c);
        }
        super.a(ajx);
    }
}
