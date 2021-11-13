package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.fn;
import java.lang.ref.WeakReference;

final class al implements Runnable {
    private /* synthetic */ WeakReference a;
    private /* synthetic */ ak b;

    al(ak akVar, WeakReference weakReference) {
        this.b = akVar;
        this.a = weakReference;
    }

    public final void run() {
        boolean unused = this.b.d = false;
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aoy a2 = this.b.c;
            if (aVar.c(a2)) {
                aVar.b(a2);
                return;
            }
            fn.d("Ad is not visible. Not refreshing ad.");
            aVar.d.b(a2);
        }
    }
}
