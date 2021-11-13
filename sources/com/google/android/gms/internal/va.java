package com.google.android.gms.internal;

final class va implements Runnable {
    private /* synthetic */ um a;

    va(um umVar) {
        this.a = umVar;
    }

    public final void run() {
        um umVar = this.a;
        umVar.c();
        umVar.Q();
        umVar.t().D().a("Resetting analytics data (FE)");
        umVar.i().A();
    }
}
