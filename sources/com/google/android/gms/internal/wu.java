package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class wu extends ajz<wu> {
    private static volatile wu[] e;
    public wx a = null;
    public wv b = null;
    public Boolean c = null;
    public String d = null;

    public wu() {
        this.X = null;
        this.Y = -1;
    }

    public static wu[] b() {
        if (e == null) {
            synchronized (akd.b) {
                if (e == null) {
                    e = new wu[0];
                }
            }
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, (akf) this.a);
        }
        if (this.b != null) {
            a2 += ajx.b(2, (akf) this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            a2 += ajx.b(3) + 1;
        }
        return this.d != null ? a2 + ajx.b(4, this.d) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new wx();
                    }
                    ajw.a((akf) this.a);
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new wv();
                    }
                    ajw.a((akf) this.b);
                    continue;
                case 24:
                    this.c = Boolean.valueOf(ajw.d());
                    continue;
                case 34:
                    this.d = ajw.e();
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
            ajx.a(1, (akf) this.a);
        }
        if (this.b != null) {
            ajx.a(2, (akf) this.b);
        }
        if (this.c != null) {
            ajx.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            ajx.a(4, this.d);
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wu)) {
            return false;
        }
        wu wuVar = (wu) obj;
        if (this.a == null) {
            if (wuVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wuVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wuVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wuVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (wuVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(wuVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (wuVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(wuVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wuVar.X == null || wuVar.X.b() : this.X.equals(wuVar.X);
    }

    public final int hashCode() {
        int i = 0;
        wx wxVar = this.a;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int hashCode2 = wxVar == null ? 0 : wxVar.hashCode();
        wv wvVar = this.b;
        int hashCode3 = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((wvVar == null ? 0 : wvVar.hashCode()) + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode3 + i;
    }
}
