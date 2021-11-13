package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.Random;

final class ayx extends apw {
    private final apv a;

    ayx(apv apv) {
        this.a = apv;
    }

    public final void a() {
        if (azg.a()) {
            int intValue = ((Integer) app.f().a(asw.aN)).intValue();
            int intValue2 = ((Integer) app.f().a(asw.aO)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                au.q().a();
            } else {
                gw.a.postDelayed(ayy.a, (long) (new Random().nextInt(intValue2 + 1) + intValue));
            }
        }
        this.a.a();
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b() {
        this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final void d() {
        this.a.d();
    }

    public final void e() {
        this.a.e();
    }

    public final void f() {
        this.a.f();
    }
}
