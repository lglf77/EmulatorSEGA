package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class bep implements ViewTreeObserver.OnScrollChangedListener {
    private /* synthetic */ WeakReference a;
    private /* synthetic */ beh b;

    bep(beh beh, WeakReference weakReference) {
        this.b = beh;
        this.a = weakReference;
    }

    public final void onScrollChanged() {
        this.b.a((WeakReference<mw>) this.a, true);
    }
}
