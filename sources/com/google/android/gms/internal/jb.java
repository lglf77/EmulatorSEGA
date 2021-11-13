package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.au;

@bfk
public final class jb {
    private final View a;
    private Activity b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ViewTreeObserver.OnGlobalLayoutListener f;
    private ViewTreeObserver.OnScrollChangedListener g;

    public jb(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
        this.g = onScrollChangedListener;
    }

    private final void e() {
        if (!this.c) {
            if (this.f != null) {
                if (this.b != null) {
                    au.e();
                    gw.a(this.b, this.f);
                }
                au.y();
                la.a(this.a, this.f);
            }
            if (this.g != null) {
                if (this.b != null) {
                    au.e();
                    gw.a(this.b, this.g);
                }
                au.y();
                la.a(this.a, this.g);
            }
            this.c = true;
        }
    }

    private final void f() {
        if (this.b != null && this.c) {
            if (!(this.f == null || this.b == null)) {
                au.g().a(this.b, this.f);
            }
            if (!(this.g == null || this.b == null)) {
                au.e();
                gw.b(this.b, this.g);
            }
            this.c = false;
        }
    }

    public final void a() {
        this.e = true;
        if (this.d) {
            e();
        }
    }

    public final void a(Activity activity) {
        this.b = activity;
    }

    public final void b() {
        this.e = false;
        f();
    }

    public final void c() {
        this.d = true;
        if (this.e) {
            e();
        }
    }

    public final void d() {
        this.d = false;
        f();
    }
}
