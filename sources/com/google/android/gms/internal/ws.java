package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ws extends ajz<ws> {
    private static volatile ws[] d;
    public Integer a = null;
    public ww[] b = ww.b();
    public wt[] c = wt.b();

    public ws() {
        this.X = null;
        this.Y = -1;
    }

    public static ws[] b() {
        if (d == null) {
            synchronized (akd.b) {
                if (d == null) {
                    d = new ws[0];
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
        if (this.b != null && this.b.length > 0) {
            int i = a2;
            for (ww wwVar : this.b) {
                if (wwVar != null) {
                    i += ajx.b(2, (akf) wwVar);
                }
            }
            a2 = i;
        }
        if (this.c != null && this.c.length > 0) {
            for (wt wtVar : this.c) {
                if (wtVar != null) {
                    a2 += ajx.b(3, (akf) wtVar);
                }
            }
        }
        return a2;
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
                    int a3 = aki.a(ajw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    ww[] wwVarArr = new ww[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, wwVarArr, 0, length);
                    }
                    while (length < wwVarArr.length - 1) {
                        wwVarArr[length] = new ww();
                        ajw.a((akf) wwVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    wwVarArr[length] = new ww();
                    ajw.a((akf) wwVarArr[length]);
                    this.b = wwVarArr;
                    continue;
                case 26:
                    int a4 = aki.a(ajw, 26);
                    int length2 = this.c == null ? 0 : this.c.length;
                    wt[] wtVarArr = new wt[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, wtVarArr, 0, length2);
                    }
                    while (length2 < wtVarArr.length - 1) {
                        wtVarArr[length2] = new wt();
                        ajw.a((akf) wtVarArr[length2]);
                        ajw.a();
                        length2++;
                    }
                    wtVarArr[length2] = new wt();
                    ajw.a((akf) wtVarArr[length2]);
                    this.c = wtVarArr;
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
        if (this.b != null && this.b.length > 0) {
            for (ww wwVar : this.b) {
                if (wwVar != null) {
                    ajx.a(2, (akf) wwVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (wt wtVar : this.c) {
                if (wtVar != null) {
                    ajx.a(3, (akf) wtVar);
                }
            }
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        if (this.a == null) {
            if (wsVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wsVar.a)) {
            return false;
        }
        if (!akd.a((Object[]) this.b, (Object[]) wsVar.b)) {
            return false;
        }
        if (!akd.a((Object[]) this.c, (Object[]) wsVar.c)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wsVar.X == null || wsVar.X.b() : this.X.equals(wsVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + akd.a((Object[]) this.b)) * 31) + akd.a((Object[]) this.c)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
