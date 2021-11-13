package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class aks extends ajz<aks> {
    public String a = null;
    public Long b = null;
    public Boolean c = null;

    public aks() {
        this.X = null;
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
        if (this.c == null) {
            return a2;
        }
        this.c.booleanValue();
        return a2 + ajx.b(3) + 1;
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
                    this.b = Long.valueOf(ajw.b());
                    continue;
                case 24:
                    this.c = Boolean.valueOf(ajw.d());
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
            ajx.a(3, this.c.booleanValue());
        }
        super.a(ajx);
    }
}
