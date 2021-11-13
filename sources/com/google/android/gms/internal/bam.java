package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class bam implements Callable<bai> {
    private /* synthetic */ baf a;
    private /* synthetic */ bal b;

    bam(bal bal, baf baf) {
        this.b = bal;
        this.a = baf;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final bai call() {
        synchronized (this.b.i) {
            if (this.b.j) {
                return null;
            }
            return this.a.a(this.b.f, this.b.g);
        }
    }
}
