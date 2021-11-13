package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.au;

@bfk
public final class fg {
    private final Object a;
    private int b;
    private int c;
    private final fa d;
    private final String e;

    private fg(fa faVar, String str) {
        this.a = new Object();
        this.d = faVar;
        this.e = str;
    }

    public fg(String str) {
        this(au.i(), str);
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.b);
            bundle.putInt("pmnll", this.c);
        }
        return bundle;
    }

    public final void a(int i, int i2) {
        synchronized (this.a) {
            this.b = i;
            this.c = i2;
            this.d.a(this.e, this);
        }
    }
}
