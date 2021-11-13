package com.google.android.gms.internal;

@bfk
public final class ho {
    private boolean a = false;
    private float b = 1.0f;

    private final synchronized boolean c() {
        return this.b >= 0.0f;
    }

    public final synchronized float a() {
        return c() ? this.b : 1.0f;
    }

    public final synchronized void a(float f) {
        this.b = f;
    }

    public final synchronized void a(boolean z) {
        this.a = z;
    }

    public final synchronized boolean b() {
        return this.a;
    }
}
