package com.google.android.gms.internal;

final class je extends Thread {
    private /* synthetic */ String a;

    je(jd jdVar, String str) {
        this.a = str;
    }

    public final void run() {
        new jo().a(this.a);
    }
}
