package com.google.android.gms.internal;

import android.view.View;

final class mz implements View.OnAttachStateChangeListener {
    private /* synthetic */ ei a;
    private /* synthetic */ mx b;

    mz(mx mxVar, ei eiVar) {
        this.b = mxVar;
        this.a = eiVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.a(view, this.a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
