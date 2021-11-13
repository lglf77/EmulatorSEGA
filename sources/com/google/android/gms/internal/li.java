package com.google.android.gms.internal;

final class li implements Runnable {
    private /* synthetic */ le a;

    li(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.a();
        }
    }
}
