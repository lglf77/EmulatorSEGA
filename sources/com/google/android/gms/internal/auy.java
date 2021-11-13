package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.au;

final class auy implements Runnable {
    private /* synthetic */ aum a;
    private /* synthetic */ aux b;

    auy(aux aux, aum aum) {
        this.b = aux;
        this.a = aum;
    }

    public final void run() {
        mw mwVar;
        if (this.b.f) {
            if (this.b.e == null) {
                View unused = this.b.e = new View(this.b.d.getContext());
                this.b.e.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            }
            if (this.b.d != this.b.e.getParent()) {
                this.b.d.addView(this.b.e);
            }
        }
        try {
            mwVar = this.a.e();
        } catch (Exception e) {
            au.g();
            if (hc.e()) {
                fn.e("Privileged processes cannot create HTML overlays.");
                mwVar = null;
            } else {
                fn.b("Error obtaining overlay.", e);
                mwVar = null;
            }
        }
        if (!(mwVar == null || this.b.a == null)) {
            FrameLayout frameLayout = this.b.a;
            if (mwVar == null) {
                throw null;
            }
            frameLayout.addView((View) mwVar);
        }
        this.b.a(this.a);
    }
}
