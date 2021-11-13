package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@bfk
@TargetApi(19)
public final class bdt extends bdq {
    private Object d = new Object();
    private PopupWindow e;
    private boolean f = false;

    bdt(Context context, ew ewVar, mw mwVar, bdp bdp) {
        super(context, ewVar, mwVar, bdp);
    }

    private final void e() {
        synchronized (this.d) {
            this.f = true;
            if ((this.a instanceof Activity) && ((Activity) this.a).isDestroyed()) {
                this.e = null;
            }
            if (this.e != null) {
                if (this.e.isShowing()) {
                    this.e.dismiss();
                }
                this.e = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        e();
        super.a(i);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Window window = this.a instanceof Activity ? ((Activity) this.a).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.a).isDestroyed()) {
            FrameLayout frameLayout = new FrameLayout(this.a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            mw mwVar = this.b;
            if (mwVar == null) {
                throw null;
            }
            frameLayout.addView((View) mwVar, -1, -1);
            synchronized (this.d) {
                if (!this.f) {
                    this.e = new PopupWindow(frameLayout, 1, 1, false);
                    this.e.setOutsideTouchable(true);
                    this.e.setClippingEnabled(false);
                    fn.b("Displaying the 1x1 popup off the screen.");
                    try {
                        this.e.showAtLocation(window.getDecorView(), 0, -1, -1);
                    } catch (Exception e2) {
                        this.e = null;
                    }
                }
            }
        }
    }

    public final void c() {
        e();
        super.c();
    }
}
