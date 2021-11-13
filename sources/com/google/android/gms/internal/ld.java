package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@bfk
abstract class ld {
    private final WeakReference<View> a;

    public ld(View view) {
        this.a = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        View view = (View) this.a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver c = c();
        if (c != null) {
            a(c);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ViewTreeObserver viewTreeObserver);

    public final void b() {
        ViewTreeObserver c = c();
        if (c != null) {
            b(c);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(ViewTreeObserver viewTreeObserver);
}
