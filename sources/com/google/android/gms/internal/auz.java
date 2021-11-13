package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class auz implements aug {
    private /* synthetic */ View a;
    private /* synthetic */ aux b;

    auz(aux aux, View view) {
        this.b = aux;
        this.a = view;
    }

    public final void a() {
        this.b.onClick(this.a);
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch((View) null, motionEvent);
    }
}
