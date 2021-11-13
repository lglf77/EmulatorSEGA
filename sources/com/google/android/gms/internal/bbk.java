package com.google.android.gms.internal;

import android.os.RemoteException;

public final class bbk extends arb {
    private final Object a = new Object();
    private volatile ard b;

    public final void a() {
        throw new RemoteException();
    }

    public final void a(ard ard) {
        synchronized (this.a) {
            this.b = ard;
        }
    }

    public final void a(boolean z) {
        throw new RemoteException();
    }

    public final void b() {
        throw new RemoteException();
    }

    public final boolean c() {
        throw new RemoteException();
    }

    public final int d() {
        throw new RemoteException();
    }

    public final float e() {
        throw new RemoteException();
    }

    public final float f() {
        throw new RemoteException();
    }

    public final float g() {
        throw new RemoteException();
    }

    public final ard h() {
        ard ard;
        synchronized (this.a) {
            ard = this.b;
        }
        return ard;
    }

    public final boolean i() {
        throw new RemoteException();
    }

    public final boolean j() {
        throw new RemoteException();
    }
}
