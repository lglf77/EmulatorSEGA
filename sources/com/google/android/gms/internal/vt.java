package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class vt implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ re b;
    private /* synthetic */ boolean c;
    private /* synthetic */ vg d;

    vt(vg vgVar, AtomicReference atomicReference, re reVar, boolean z) {
        this.d = vgVar;
        this.a = atomicReference;
        this.b = reVar;
        this.c = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.a) {
            try {
                sb d2 = this.d.b;
                if (d2 == null) {
                    this.d.t().y().a("Failed to get user properties");
                    this.a.notify();
                    return;
                }
                this.a.set(d2.a(this.b, this.c));
                this.d.F();
                this.a.notify();
            } catch (RemoteException e) {
                this.d.t().y().a("Failed to get user properties", e);
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
