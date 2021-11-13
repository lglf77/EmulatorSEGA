package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.hq;

@bfk
final class h extends RelativeLayout {
    boolean a;
    private hq b;

    public h(Context context, String str, String str2) {
        super(context);
        this.b = new hq(context, str);
        this.b.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        this.b.a(motionEvent);
        return false;
    }
}
