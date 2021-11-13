package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class ke implements Runnable {
    private final ks a;
    private final kh b;

    ke(ks ksVar, kh khVar) {
        this.a = ksVar;
        this.b = khVar;
    }

    public final void run() {
        ks ksVar = this.a;
        try {
            ksVar.b(this.b.get());
        } catch (ExecutionException e) {
            ksVar.a(e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ksVar.a(e2);
        } catch (Exception e3) {
            ksVar.a(e3);
        }
    }
}
