package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

final class aq implements View.OnTouchListener {
    private /* synthetic */ ao a;

    aq(ao aoVar) {
        this.a = aoVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a.h == null) {
            return false;
        }
        this.a.h.a(motionEvent);
        return false;
    }
}
