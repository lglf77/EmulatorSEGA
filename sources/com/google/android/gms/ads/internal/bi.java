package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

final class bi implements View.OnTouchListener {
    private /* synthetic */ br a;
    private /* synthetic */ bg b;

    bi(bg bgVar, br brVar) {
        this.b = bgVar;
        this.a = brVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a();
        if (this.b.b == null) {
            return false;
        }
        this.b.b.c();
        return false;
    }
}
