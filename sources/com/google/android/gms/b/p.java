package com.google.android.gms.b;

import java.util.concurrent.Callable;

final class p implements Runnable {
    private /* synthetic */ o a;
    private /* synthetic */ Callable b;

    p(o oVar, Callable callable) {
        this.a = oVar;
        this.b = callable;
    }

    public final void run() {
        try {
            this.a.a(this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        }
    }
}
