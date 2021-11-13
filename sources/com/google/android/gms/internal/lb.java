package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.au;
import java.lang.ref.WeakReference;

@bfk
final class lb extends ld implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> a;

    public lb(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.a = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void b(ViewTreeObserver viewTreeObserver) {
        au.g().a(viewTreeObserver, (ViewTreeObserver.OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
