package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xe extends ajz<xe> {
    private static volatile xe[] e;
    public String a = null;
    public String b = null;
    public Long c = null;
    public Double d = null;
    private Float f = null;

    public xe() {
        this.X = null;
        this.Y = -1;
    }

    public static xe[] b() {
        if (e == null) {
            synchronized (akd.b) {
                if (e == null) {
                    e = new xe[0];
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
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += ajx.c(3, this.c.longValue());
        }
        if (this.f != null) {
            this.f.floatValue();
            a2 += ajx.b(4) + 4;
        }
        if (this.d == null) {
            return a2;
        }
        this.d.doubleValue();
        return a2 + ajx.b(5) + 8;
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
                case 24:
                    this.c = Long.valueOf(ajw.h());
                    continue;
                case 37:
                    this.f = Float.valueOf(Float.intBitsToFloat(ajw.i()));
                    continue;
                case 41:
                    this.d = Double.valueOf(Double.longBitsToDouble(ajw.j()));
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
            ajx.b(3, this.c.longValue());
        }
        if (this.f != null) {
            ajx.a(4, this.f.floatValue());
        }
        if (this.d != null) {
            ajx.a(5, this.d.doubleValue());
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        if (this.a == null) {
            if (xeVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(xeVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (xeVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(xeVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (xeVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(xeVar.c)) {
            return false;
        }
        if (this.f == null) {
            if (xeVar.f != null) {
                return false;
            }
        } else if (!this.f.equals(xeVar.f)) {
            return false;
        }
        if (this.d == null) {
            if (xeVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(xeVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xeVar.X == null || xeVar.X.b() : this.X.equals(xeVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
