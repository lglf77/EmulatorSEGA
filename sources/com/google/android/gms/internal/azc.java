package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.l;

final class azc {
    l a;
    aoy b;
    axw c;
    long d;
    boolean e;
    boolean f;
    private /* synthetic */ azb g;

    azc(azb azb, axv axv) {
        this.g = azb;
        this.a = axv.b(azb.c);
        this.c = new axw();
        axw axw = this.c;
        l lVar = this.a;
        lVar.a((apv) new axx(axw));
        lVar.a((aql) new ayf(axw));
        lVar.a((atq) new ayh(axw));
        lVar.a((aps) new ayj(axw));
        lVar.a((cu) new ayl(axw));
    }

    azc(azb azb, axv axv, aoy aoy) {
        this(azb, axv);
        this.b = aoy;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.e) {
            return false;
        }
        this.f = this.a.b(ayz.b(this.b != null ? this.b : this.g.b));
        this.e = true;
        this.d = au.k().a();
        return true;
    }
}
