package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class tm implements Callable<String> {
    private /* synthetic */ String a;
    private /* synthetic */ tk b;

    tm(tk tkVar, String str) {
        this.b = tkVar;
        this.a = str;
    }

    public final /* synthetic */ Object call() {
        rd b2 = this.b.q().b(this.a);
        if (b2 != null) {
            return b2.c();
        }
        this.b.f().A().a("App info was null when attempting to get app instance id");
        return null;
    }
}
