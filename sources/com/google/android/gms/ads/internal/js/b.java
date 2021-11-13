package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.kw;
import com.google.android.gms.internal.ky;

public final class b extends ky<k> {
    private final Object a = new Object();
    /* access modifiers changed from: private */
    public final f b;
    private boolean c;

    public b(f fVar) {
        this.b = fVar;
    }

    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                a(new c(this), new kw());
                a(new d(this), new e(this));
            }
        }
    }
}
