package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xc extends ajz<xc> {
    private static volatile xc[] e;
    public Integer a = null;
    public xh b = null;
    public xh c = null;
    public Boolean d = null;

    public xc() {
        this.X = null;
        this.Y = -1;
    }

    public static xc[] b() {
        if (e == null) {
            synchronized (akd.b) {
                if (e == null) {
                    e = new xc[0];
                }
            }
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, (akf) this.b);
        }
        if (this.c != null) {
            a2 += ajx.b(3, (akf) this.c);
        }
        if (this.d == null) {
            return a2;
        }
        this.d.booleanValue();
        return a2 + ajx.b(4) + 1;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Integer.valueOf(ajw.g());
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new xh();
                    }
                    ajw.a((akf) this.b);
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new xh();
                    }
                    ajw.a((akf) this.c);
                    continue;
                case 32:
                    this.d = Boolean.valueOf(ajw.d());
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
            ajx.a(1, this.a.intValue());
        }
        if (this.b != null) {
            ajx.a(2, (akf) this.b);
        }
        if (this.c != null) {
            ajx.a(3, (akf) this.c);
        }
        if (this.d != null) {
            ajx.a(4, this.d.booleanValue());
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        if (this.a == null) {
            if (xcVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(xcVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (xcVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(xcVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (xcVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(xcVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (xcVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(xcVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xcVar.X == null || xcVar.X.b() : this.X.equals(xcVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
        xh xhVar = this.b;
        int i2 = hashCode * 31;
        int hashCode2 = xhVar == null ? 0 : xhVar.hashCode();
        xh xhVar2 = this.c;
        int hashCode3 = ((this.d == null ? 0 : this.d.hashCode()) + (((xhVar2 == null ? 0 : xhVar2.hashCode()) + ((hashCode2 + i2) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode3 + i;
    }
}
