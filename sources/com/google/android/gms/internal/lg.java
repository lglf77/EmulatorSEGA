package com.google.android.gms.internal;

final class lg implements Runnable {
    private /* synthetic */ le a;

    lg(le leVar) {
        this.a = leVar;
    }

    public final void run() {
        if (this.a.r != null) {
            this.a.r.e();
        }
    }
}
