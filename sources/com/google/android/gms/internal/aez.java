package com.google.android.gms.internal;

final class aez implements Runnable {
    private /* synthetic */ aws a;
    private /* synthetic */ xw b;

    aez(xw xwVar, aws aws) {
        this.b = xwVar;
        this.a = aws;
    }

    public final void run() {
        try {
            this.b.c.put(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
