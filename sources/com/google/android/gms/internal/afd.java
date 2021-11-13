package com.google.android.gms.internal;

import com.google.android.gms.ads.c.a;
import java.io.IOException;

public final class afd extends aft {
    public afd(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 24);
    }

    private final void c() {
        a m = this.a.m();
        if (m != null) {
            try {
                a.C0015a b = m.b();
                String a = zz.a(b.a());
                if (a != null) {
                    synchronized (this.b) {
                        this.b.S = a;
                        this.b.U = Boolean.valueOf(b.b());
                        this.b.T = 5;
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.a.g()) {
            c();
            return;
        }
        synchronized (this.b) {
            this.b.S = (String) this.c.invoke((Object) null, new Object[]{this.a.a()});
        }
    }

    public final Void b() {
        if (this.a.b()) {
            return super.call();
        }
        if (this.a.g()) {
            c();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return call();
    }
}
