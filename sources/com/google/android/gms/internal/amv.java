package com.google.android.gms.internal;

final class amv implements Runnable {
    private /* synthetic */ amu a;

    amv(amu amu) {
        this.a = amu;
    }

    public final void run() {
        synchronized (this.a.c) {
            if (!this.a.d || !this.a.e) {
                fn.b("App is still foreground");
            } else {
                boolean unused = this.a.d = false;
                fn.b("App went background");
                for (amw d : this.a.f) {
                    try {
                        d.d(false);
                    } catch (Exception e) {
                        fn.b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            }
        }
    }
}
