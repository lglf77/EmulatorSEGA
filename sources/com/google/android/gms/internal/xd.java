package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xd extends ajz<xd> {
    private static volatile xd[] f;
    public xe[] a = xe.b();
    public String b = null;
    public Long c = null;
    public Long d = null;
    public Integer e = null;

    public xd() {
        this.X = null;
        this.Y = -1;
    }

    public static xd[] b() {
        if (f == null) {
            synchronized (akd.b) {
                if (f == null) {
                    f = new xd[0];
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (xe xeVar : this.a) {
                if (xeVar != null) {
                    a2 += ajx.b(1, (akf) xeVar);
                }
            }
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null) {
            a2 += ajx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += ajx.c(4, this.d.longValue());
        }
        return this.e != null ? a2 + ajx.b(5, this.e.intValue()) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    int a3 = aki.a(ajw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    xe[] xeVarArr = new xe[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, xeVarArr, 0, length);
                    }
                    while (length < xeVarArr.length - 1) {
                        xeVarArr[length] = new xe();
                        ajw.a((akf) xeVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    xeVarArr[length] = new xe();
                    ajw.a((akf) xeVarArr[length]);
                    this.a = xeVarArr;
                    continue;
                case 18:
                    this.b = ajw.e();
                    continue;
                case 24:
                    this.c = Long.valueOf(ajw.h());
                    continue;
                case 32:
                    this.d = Long.valueOf(ajw.h());
                    continue;
                case 40:
                    this.e = Integer.valueOf(ajw.g());
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
        if (this.a != null && this.a.length > 0) {
            for (xe xeVar : this.a) {
                if (xeVar != null) {
                    ajx.a(1, (akf) xeVar);
                }
            }
        }
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.b(3, this.c.longValue());
        }
        if (this.d != null) {
            ajx.b(4, this.d.longValue());
        }
        if (this.e != null) {
            ajx.a(5, this.e.intValue());
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        if (!akd.a((Object[]) this.a, (Object[]) xdVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (xdVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(xdVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (xdVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(xdVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (xdVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(xdVar.d)) {
            return false;
        }
        if (this.e == null) {
            if (xdVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(xdVar.e)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xdVar.X == null || xdVar.X.b() : this.X.equals(xdVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + akd.a((Object[]) this.a)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
