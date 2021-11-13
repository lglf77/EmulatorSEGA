package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class wy extends ajz<wy> {
    private static volatile wy[] e;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public Integer d = null;

    public wy() {
        this.X = null;
        this.Y = -1;
    }

    public static wy[] b() {
        if (e == null) {
            synchronized (akd.b) {
                if (e == null) {
                    e = new wy[0];
                }
            }
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            a2 += ajx.b(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            a2 += ajx.b(3) + 1;
        }
        return this.d != null ? a2 + ajx.b(4, this.d.intValue()) : a2;
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
                    this.b = Boolean.valueOf(ajw.d());
                    continue;
                case 24:
                    this.c = Boolean.valueOf(ajw.d());
                    continue;
                case 32:
                    this.d = Integer.valueOf(ajw.g());
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
            ajx.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            ajx.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            ajx.a(4, this.d.intValue());
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        if (this.a == null) {
            if (wyVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wyVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wyVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wyVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (wyVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(wyVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (wyVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(wyVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wyVar.X == null || wyVar.X.b() : this.X.equals(wyVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
