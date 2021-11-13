package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class avc implements aug {
    private /* synthetic */ View a;
    private /* synthetic */ ava b;

    avc(ava ava, View view) {
        this.b = ava;
        this.a = view;
    }

    public final void a() {
        if (this.b.a(ava.a)) {
            this.b.onClick(this.a);
        }
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch((View) null, motionEvent);
    }
}
