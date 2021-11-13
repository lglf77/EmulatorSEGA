package com.google.android.gms.internal;

import android.os.RemoteException;

final class ns implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ boolean c;
    private /* synthetic */ boolean d;
    private /* synthetic */ nq e;

    ns(nq nqVar, int i, int i2, boolean z, boolean z2) {
        this.e = nqVar;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final void run() {
        boolean z = false;
        synchronized (this.e.b) {
            boolean z2 = this.a != this.b;
            boolean z3 = !this.e.h && this.b == 1;
            boolean z4 = z2 && this.b == 1;
            boolean z5 = z2 && this.b == 2;
            boolean z6 = z2 && this.b == 3;
            boolean z7 = this.c != this.d;
            nq nqVar = this.e;
            if (this.e.h || z3) {
                z = true;
            }
            boolean unused = nqVar.h = z;
            if (this.e.g != null) {
                if (z3) {
                    try {
                        this.e.g.a();
                    } catch (RemoteException e2) {
                        fn.c("Unable to call onVideoStart()", e2);
                    }
                }
                if (z4) {
                    try {
                        this.e.g.b();
                    } catch (RemoteException e3) {
                        fn.c("Unable to call onVideoPlay()", e3);
                    }
                }
                if (z5) {
                    try {
                        this.e.g.c();
                    } catch (RemoteException e4) {
                        fn.c("Unable to call onVideoPause()", e4);
                    }
                }
                if (z6) {
                    try {
                        this.e.g.d();
                    } catch (RemoteException e5) {
                        fn.c("Unable to call onVideoEnd()", e5);
                    }
                }
                if (z7) {
                    try {
                        this.e.g.a(this.d);
                    } catch (RemoteException e6) {
                        fn.c("Unable to call onVideoMute()", e6);
                    }
                }
            }
        }
    }
}
