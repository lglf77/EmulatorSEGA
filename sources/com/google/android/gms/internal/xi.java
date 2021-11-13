package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xi extends ajz<xi> {
    private static volatile xi[] f;
    public Long a = null;
    public String b = null;
    public String c = null;
    public Long d = null;
    public Double e = null;
    private Float g = null;

    public xi() {
        this.X = null;
        this.Y = -1;
    }

    public static xi[] b() {
        if (f == null) {
            synchronized (akd.b) {
                if (f == null) {
                    f = new xi[0];
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += ajx.b(3, this.c);
        }
        if (this.d != null) {
            a2 += ajx.c(4, this.d.longValue());
        }
        if (this.g != null) {
            this.g.floatValue();
            a2 += ajx.b(5) + 4;
        }
        if (this.e == null) {
            return a2;
        }
        this.e.doubleValue();
        return a2 + ajx.b(6) + 8;
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
                case 18:
                    this.b = ajw.e();
                    continue;
                case 26:
                    this.c = ajw.e();
                    continue;
                case 32:
                    this.d = Long.valueOf(ajw.h());
                    continue;
                case 45:
                    this.g = Float.valueOf(Float.intBitsToFloat(ajw.i()));
                    continue;
                case 49:
                    this.e = Double.valueOf(Double.longBitsToDouble(ajw.j()));
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
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.a(3, this.c);
        }
        if (this.d != null) {
            ajx.b(4, this.d.longValue());
        }
        if (this.g != null) {
            ajx.a(5, this.g.floatValue());
        }
        if (this.e != null) {
            ajx.a(6, this.e.doubleValue());
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        if (this.a == null) {
            if (xiVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(xiVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (xiVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(xiVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (xiVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(xiVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (xiVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(xiVar.d)) {
            return false;
        }
        if (this.g == null) {
            if (xiVar.g != null) {
                return false;
            }
        } else if (!this.g.equals(xiVar.g)) {
            return false;
        }
        if (this.e == null) {
            if (xiVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(xiVar.e)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xiVar.X == null || xiVar.X.b() : this.X.equals(xiVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
