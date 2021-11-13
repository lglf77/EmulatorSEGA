package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class jy implements Runnable {
    private final ju a;
    private final kh b;

    jy(ju juVar, kh khVar) {
        this.a = juVar;
        this.b = khVar;
    }

    public final void run() {
        ju juVar = this.a;
        try {
            juVar.a(this.b.get());
            return;
        } catch (ExecutionException e) {
            e = e.getCause();
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
        } catch (Exception e3) {
            e = e3;
        }
        juVar.a(e);
    }
}
