package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import java.util.concurrent.Callable;

final class bv implements Callable<bs> {
    private /* synthetic */ Context a;
    private /* synthetic */ bu b;

    bv(bu buVar, Context context) {
        this.b = buVar;
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        bs a2;
        bw bwVar = (bw) this.b.a.get(this.a);
        if (bwVar != null) {
            if (!(bwVar.a + ((Long) app.f().a(asw.bc)).longValue() < au.k().a())) {
                if (((Boolean) app.f().a(asw.bb)).booleanValue()) {
                    a2 = new bt(this.a, bwVar.b).a();
                    this.b.a.put(this.a, new bw(this.b, a2));
                    return a2;
                }
            }
        }
        a2 = new bt(this.a).a();
        this.b.a.put(this.a, new bw(this.b, a2));
        return a2;
    }
}
