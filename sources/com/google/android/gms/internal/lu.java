package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.y;

@bfk
public final class lu {
    private final Context a;
    private final md b;
    private final ViewGroup c;
    private lr d;

    private lu(Context context, ViewGroup viewGroup, md mdVar, lr lrVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = mdVar;
        this.d = null;
    }

    public lu(Context context, ViewGroup viewGroup, mw mwVar) {
        this(context, viewGroup, mwVar, (lr) null);
    }

    public final lr a() {
        y.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }

    public final void a(int i, int i2, int i3, int i4) {
        y.b("The underlay may only be modified from the UI thread.");
        if (this.d != null) {
            this.d.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z, mc mcVar) {
        if (this.d == null) {
            atc.a(this.b.j().a(), this.b.c(), "vpr2");
            this.d = new lr(this.a, this.b, i5, z, this.b.j().a(), mcVar);
            this.c.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
            this.d.a(i, i2, i3, i4);
            this.b.a(false);
        }
    }

    public final void b() {
        y.b("onPause must be called from the UI thread.");
        if (this.d != null) {
            this.d.i();
        }
    }

    public final void c() {
        y.b("onDestroy must be called from the UI thread.");
        if (this.d != null) {
            this.d.n();
            this.c.removeView(this.d);
            this.d = null;
        }
    }
}
