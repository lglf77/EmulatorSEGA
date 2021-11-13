package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class ben implements ViewTreeObserver.OnGlobalLayoutListener {
    private /* synthetic */ WeakReference a;
    private /* synthetic */ beh b;

    ben(beh beh, WeakReference weakReference) {
        this.b = beh;
        this.a = weakReference;
    }

    public final void onGlobalLayout() {
        this.b.a((WeakReference<mw>) this.a, false);
    }
}
