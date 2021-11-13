package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.fn;
import java.util.List;

final class af implements Runnable {
    private /* synthetic */ auk a;
    private /* synthetic */ int b;
    private /* synthetic */ List c;
    private /* synthetic */ ac d;

    af(ac acVar, auk auk, int i, List list) {
        this.d = acVar;
        this.a = auk;
        this.b = i;
        this.c = list;
    }

    public final void run() {
        boolean z = true;
        try {
            if ((this.a instanceof aub) && this.d.e.r != null) {
                ac acVar = this.d;
                if (this.b == this.c.size() - 1) {
                    z = false;
                }
                acVar.c = z;
                this.d.e.r.a((aub) this.a);
            } else if (!(this.a instanceof atz) || this.d.e.q == null) {
                ac acVar2 = this.d;
                if (this.b == this.c.size() - 1) {
                    z = false;
                }
                acVar2.a(3, z);
            } else {
                ac acVar3 = this.d;
                if (this.b == this.c.size() - 1) {
                    z = false;
                }
                acVar3.c = z;
                this.d.e.q.a((atz) this.a);
            }
        } catch (RemoteException e) {
            fn.c("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
