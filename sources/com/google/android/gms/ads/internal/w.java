package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.bbe;
import com.google.android.gms.internal.bbh;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import java.util.Map;

final class w implements aa<mw> {
    private /* synthetic */ bbe a;
    private /* synthetic */ c b;
    private /* synthetic */ bbh c;

    w(bbe bbe, c cVar, bbh bbh) {
        this.a = bbe;
        this.b = cVar;
        this.c = bbh;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        if (mwVar == null) {
            throw null;
        }
        View view = (View) mwVar;
        if (view != null) {
            try {
                if (this.a != null) {
                    if (!this.a.k()) {
                        this.a.a(c.a(view));
                        this.b.a.e();
                        return;
                    }
                    r.b(mwVar);
                } else if (this.c == null) {
                } else {
                    if (!this.c.i()) {
                        this.c.a(c.a(view));
                        this.b.a.e();
                        return;
                    }
                    r.b(mwVar);
                }
            } catch (RemoteException e) {
                fn.c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
