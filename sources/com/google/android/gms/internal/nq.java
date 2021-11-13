package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;

@bfk
public final class nq extends arb {
    /* access modifiers changed from: private */
    public final md a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    private final boolean c;
    private final boolean d;
    private final float e;
    private int f;
    /* access modifiers changed from: private */
    public ard g;
    /* access modifiers changed from: private */
    public boolean h;
    private boolean i = true;
    private float j;
    private float k;
    private boolean l = true;
    private boolean m;
    private boolean n;

    public nq(md mdVar, float f2, boolean z, boolean z2) {
        this.a = mdVar;
        this.e = f2;
        this.c = z;
        this.d = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        au.e();
        gw.a((Runnable) new nr(this, hashMap));
    }

    public final void a() {
        a("play", (Map<String, String>) null);
    }

    public final void a(float f2, int i2, boolean z, float f3) {
        boolean z2;
        int i3;
        synchronized (this.b) {
            this.j = f2;
            z2 = this.i;
            this.i = z;
            i3 = this.f;
            this.f = i2;
            float f4 = this.k;
            this.k = f3;
            if (Math.abs(this.k - f4) > 1.0E-4f) {
                md mdVar = this.a;
                if (mdVar == null) {
                    throw null;
                }
                ((View) mdVar).invalidate();
            }
        }
        au.e();
        gw.a((Runnable) new ns(this, i3, i2, z2, z));
    }

    public final void a(ard ard) {
        synchronized (this.b) {
            this.g = ard;
        }
    }

    public final void a(asf asf) {
        synchronized (this.b) {
            this.l = asf.a;
            this.m = asf.b;
            this.n = asf.c;
        }
        a("initialState", (Map<String, String>) e.a("muteStart", asf.a ? "1" : "0", "customControlsRequested", asf.b ? "1" : "0", "clickToExpandRequested", asf.c ? "1" : "0"));
    }

    public final void a(boolean z) {
        a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final void b() {
        a("pause", (Map<String, String>) null);
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.i;
        }
        return z;
    }

    public final int d() {
        int i2;
        synchronized (this.b) {
            i2 = this.f;
        }
        return i2;
    }

    public final float e() {
        float f2;
        synchronized (this.b) {
            f2 = this.k;
        }
        return f2;
    }

    public final float f() {
        return this.e;
    }

    public final float g() {
        float f2;
        synchronized (this.b) {
            f2 = this.j;
        }
        return f2;
    }

    public final ard h() {
        ard ard;
        synchronized (this.b) {
            ard = this.g;
        }
        return ard;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.c && this.m;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        boolean i2 = i();
        synchronized (this.b) {
            if (!i2) {
                if (this.n && this.d) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }
}
