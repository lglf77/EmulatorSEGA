package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.ia;
import com.google.android.gms.internal.kw;
import com.google.android.gms.internal.ky;

public final class f extends ky<o> {
    private final Object a = new Object();
    /* access modifiers changed from: private */
    public ia<o> b;
    private boolean c;
    private int d;

    public f(ia<o> iaVar) {
        this.b = iaVar;
        this.c = false;
        this.d = 0;
    }

    private final void f() {
        synchronized (this.a) {
            y.a(this.d >= 0);
            if (!this.c || this.d != 0) {
                fn.a("There are still references to the engine. Not destroying.");
            } else {
                fn.a("No reference is left (including root). Cleaning up engine.");
                a(new i(this), new kw());
            }
        }
    }

    public final b a() {
        b bVar = new b(this);
        synchronized (this.a) {
            a(new g(this, bVar), new h(this, bVar));
            y.a(this.d >= 0);
            this.d++;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        synchronized (this.a) {
            y.a(this.d > 0);
            fn.a("Releasing 1 reference for JS Engine");
            this.d--;
            f();
        }
    }

    public final void c() {
        boolean z = true;
        synchronized (this.a) {
            if (this.d < 0) {
                z = false;
            }
            y.a(z);
            fn.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.c = true;
            f();
        }
    }
}
