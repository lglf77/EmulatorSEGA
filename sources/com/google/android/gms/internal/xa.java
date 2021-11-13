package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xa extends ajz<xa> {
    private static volatile xa[] c;
    public String a = null;
    public String b = null;

    public xa() {
        this.X = null;
        this.Y = -1;
    }

    public static xa[] b() {
        if (c == null) {
            synchronized (akd.b) {
                if (c == null) {
                    c = new xa[0];
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a);
        }
        return this.b != null ? a2 + ajx.b(2, this.b) : a2;
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
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        if (this.a == null) {
            if (xaVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(xaVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (xaVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(xaVar.b)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xaVar.X == null || xaVar.X.b() : this.X.equals(xaVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
