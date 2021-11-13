package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xf extends ajz<xf> {
    public xg[] a = xg.b();

    public xf() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null && this.a.length > 0) {
            for (xg xgVar : this.a) {
                if (xgVar != null) {
                    a2 += ajx.b(1, (akf) xgVar);
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
                case 10:
                    int a3 = aki.a(ajw, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    xg[] xgVarArr = new xg[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, xgVarArr, 0, length);
                    }
                    while (length < xgVarArr.length - 1) {
                        xgVarArr[length] = new xg();
                        ajw.a((akf) xgVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    xgVarArr[length] = new xg();
                    ajw.a((akf) xgVarArr[length]);
                    this.a = xgVarArr;
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
            for (xg xgVar : this.a) {
                if (xgVar != null) {
                    ajx.a(1, (akf) xgVar);
                }
            }
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        if (!akd.a((Object[]) this.a, (Object[]) xfVar.a)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xfVar.X == null || xfVar.X.b() : this.X.equals(xfVar.X);
    }

    public final int hashCode() {
        return ((this.X == null || this.X.b()) ? 0 : this.X.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + akd.a((Object[]) this.a)) * 31);
    }
}
