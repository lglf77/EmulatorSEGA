package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

@bfk
public final class ml extends fj {
    final md a;
    final mp b;
    private final String c;

    ml(md mdVar, mp mpVar, String str) {
        this.a = mdVar;
        this.b = mpVar;
        this.c = str;
        au.x().a(this);
    }

    public final void a() {
        try {
            this.b.a(this.c);
        } finally {
            gw.a.post(new mm(this));
        }
    }

    public final void b() {
        this.b.a();
    }
}
