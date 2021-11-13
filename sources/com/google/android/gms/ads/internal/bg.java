package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.atk;
import com.google.android.gms.internal.bdo;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nk;

final class bg implements Runnable {
    final /* synthetic */ ew a;
    final /* synthetic */ ei b;
    final /* synthetic */ bd c;
    private /* synthetic */ atj d;

    bg(bd bdVar, ew ewVar, ei eiVar, atj atj) {
        this.c = bdVar;
        this.a = ewVar;
        this.b = eiVar;
        this.d = atj;
    }

    public final void run() {
        if (this.a.b.r && this.c.e.z != null) {
            String str = null;
            if (this.a.b.a != null) {
                au.e();
                str = gw.a(this.a.b.a);
            }
            atk atk = new atk(this.c, str, this.a.b.b);
            this.c.e.F = 1;
            try {
                this.c.c = false;
                this.c.e.z.a(atk);
                return;
            } catch (RemoteException e) {
                fn.c("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.c.c = true;
            }
        }
        br brVar = new br(this.c.e.c, this.b, this.a.b.E);
        try {
            mw a2 = this.c.a(this.a, brVar, this.b);
            a2.setOnTouchListener(new bi(this, brVar));
            a2.setOnClickListener(new bj(this, brVar));
            this.c.e.F = 0;
            av avVar = this.c.e;
            au.d();
            avVar.h = bdo.a(this.c.e.c, this.c, this.a, this.c.e.d, a2, this.c.i, this.c, this.d);
        } catch (nk e2) {
            fn.b("Could not obtain webview.", e2);
            gw.a.post(new bh(this));
        }
    }
}
