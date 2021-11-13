package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import java.lang.ref.WeakReference;

@bfk
public final class ak {
    private final am a;
    private final Runnable b;
    /* access modifiers changed from: private */
    public aoy c;
    /* access modifiers changed from: private */
    public boolean d;
    private boolean e;
    private long f;

    public ak(a aVar) {
        this(aVar, new am(gw.a));
    }

    private ak(a aVar, am amVar) {
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a = amVar;
        this.b = new al(this, new WeakReference(aVar));
    }

    public final void a() {
        this.d = false;
        this.a.a(this.b);
    }

    public final void a(aoy aoy) {
        this.c = aoy;
    }

    public final void a(aoy aoy, long j) {
        if (this.d) {
            fn.e("An ad refresh is already scheduled.");
            return;
        }
        this.c = aoy;
        this.d = true;
        this.f = j;
        if (!this.e) {
            fn.d(new StringBuilder(65).append("Scheduling ad refresh ").append(j).append(" milliseconds from now.").toString());
            this.a.a(this.b, j);
        }
    }

    public final void b() {
        this.e = true;
        if (this.d) {
            this.a.a(this.b);
        }
    }

    public final void b(aoy aoy) {
        a(aoy, 60000);
    }

    public final void c() {
        this.e = false;
        if (this.d) {
            this.d = false;
            a(this.c, this.f);
        }
    }

    public final boolean d() {
        return this.d;
    }
}
