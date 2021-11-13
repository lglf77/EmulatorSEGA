package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ww extends ajz<ww> {
    private static volatile ww[] d;
    public Integer a = null;
    public String b = null;
    public wu c = null;

    public ww() {
        this.X = null;
        this.Y = -1;
    }

    public static ww[] b() {
        if (d == null) {
            synchronized (akd.b) {
                if (d == null) {
                    d = new ww[0];
                }
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        return this.c != null ? a2 + ajx.b(3, (akf) this.c) : a2;
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
                    this.b = ajw.e();
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new wu();
                    }
                    ajw.a((akf) this.c);
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
            ajx.a(2, this.b);
        }
        if (this.c != null) {
            ajx.a(3, (akf) this.c);
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        if (this.a == null) {
            if (wwVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wwVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wwVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wwVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (wwVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(wwVar.c)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wwVar.X == null || wwVar.X.b() : this.X.equals(wwVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31);
        wu wuVar = this.c;
        int hashCode2 = ((wuVar == null ? 0 : wuVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode2 + i;
    }
}
