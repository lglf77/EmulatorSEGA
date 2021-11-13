package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class wt extends ajz<wt> {
    private static volatile wt[] e;
    public Integer a = null;
    public String b = null;
    public wu[] c = wu.b();
    public wv d = null;
    private Boolean f = null;

    public wt() {
        this.X = null;
        this.Y = -1;
    }

    public static wt[] b() {
        if (e == null) {
            synchronized (akd.b) {
                if (e == null) {
                    e = new wt[0];
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
            a2 += ajx.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (wu wuVar : this.c) {
                if (wuVar != null) {
                    i += ajx.b(3, (akf) wuVar);
                }
            }
            a2 = i;
        }
        if (this.f != null) {
            this.f.booleanValue();
            a2 += ajx.b(4) + 1;
        }
        return this.d != null ? a2 + ajx.b(5, (akf) this.d) : a2;
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
                    int a3 = aki.a(ajw, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    wu[] wuVarArr = new wu[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, wuVarArr, 0, length);
                    }
                    while (length < wuVarArr.length - 1) {
                        wuVarArr[length] = new wu();
                        ajw.a((akf) wuVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    wuVarArr[length] = new wu();
                    ajw.a((akf) wuVarArr[length]);
                    this.c = wuVarArr;
                    continue;
                case 32:
                    this.f = Boolean.valueOf(ajw.d());
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new wv();
                    }
                    ajw.a((akf) this.d);
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
        if (this.c != null && this.c.length > 0) {
            for (wu wuVar : this.c) {
                if (wuVar != null) {
                    ajx.a(3, (akf) wuVar);
                }
            }
        }
        if (this.f != null) {
            ajx.a(4, this.f.booleanValue());
        }
        if (this.d != null) {
            ajx.a(5, (akf) this.d);
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        if (this.a == null) {
            if (wtVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wtVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wtVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wtVar.b)) {
            return false;
        }
        if (!akd.a((Object[]) this.c, (Object[]) wtVar.c)) {
            return false;
        }
        if (this.f == null) {
            if (wtVar.f != null) {
                return false;
            }
        } else if (!this.f.equals(wtVar.f)) {
            return false;
        }
        if (this.d == null) {
            if (wtVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(wtVar.d)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wtVar.X == null || wtVar.X.b() : this.X.equals(wtVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f == null ? 0 : this.f.hashCode()) + (((((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + akd.a((Object[]) this.c)) * 31);
        wv wvVar = this.d;
        int hashCode2 = ((wvVar == null ? 0 : wvVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode2 + i;
    }
}
