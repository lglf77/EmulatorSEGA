package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class vj implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ re b;
    private /* synthetic */ vg c;

    vj(vg vgVar, AtomicReference atomicReference, re reVar) {
        this.c = vgVar;
        this.a = atomicReference;
        this.b = reVar;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.a) {
            try {
                sb d = this.c.b;
                if (d == null) {
                    this.c.t().y().a("Failed to get app instance id");
                    this.a.notify();
                    return;
                }
                this.a.set(d.c(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.f().a(str);
                    this.c.u().i.a(str);
                }
                this.c.F();
                this.a.notify();
            } catch (RemoteException e) {
                this.c.t().y().a("Failed to get app instance id", e);
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
