package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.ac;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.k;
import java.lang.ref.WeakReference;

@bfk
public final class beh {
    private final Object a = new Object();
    private final Context b;
    private final xr c;
    private final ew d;
    private final atj e;
    /* access modifiers changed from: private */
    public final ac f;
    private ViewTreeObserver.OnGlobalLayoutListener g;
    private ViewTreeObserver.OnScrollChangedListener h;
    private it i;
    private int j = -1;
    private int k = -1;

    public beh(Context context, xr xrVar, ew ewVar, atj atj, ac acVar) {
        this.b = context;
        this.c = xrVar;
        this.d = ewVar;
        this.e = atj;
        this.f = acVar;
        this.i = new it(200);
    }

    /* access modifiers changed from: private */
    public final ViewTreeObserver.OnGlobalLayoutListener a(WeakReference<mw> weakReference) {
        if (this.g == null) {
            this.g = new ben(this, weakReference);
        }
        return this.g;
    }

    /* access modifiers changed from: private */
    public final void a(mw mwVar) {
        mx w = mwVar.w();
        w.a("/video", (aa<? super mw>) k.l);
        w.a("/videoMeta", (aa<? super mw>) k.m);
        w.a("/precache", (aa<? super mw>) new mt());
        w.a("/delayPageLoaded", (aa<? super mw>) k.p);
        w.a("/instrument", (aa<? super mw>) k.n);
        w.a("/log", (aa<? super mw>) k.g);
        w.a("/videoClicked", (aa<? super mw>) k.h);
        w.a("/trackActiveViewUnit", (aa<? super mw>) new bel(this));
        w.a("/untrackActiveViewUnit", (aa<? super mw>) new bem(this));
    }

    /* access modifiers changed from: private */
    public final void a(WeakReference<mw> weakReference, boolean z) {
        mw mwVar;
        if (weakReference != null && (mwVar = (mw) weakReference.get()) != null) {
            if (mwVar == null) {
                throw null;
            } else if (((View) mwVar) == null) {
            } else {
                if (z && !this.i.a()) {
                    return;
                }
                if (mwVar == null) {
                    throw null;
                }
                int[] iArr = new int[2];
                ((View) mwVar).getLocationOnScreen(iArr);
                app.a();
                int b2 = jc.b(this.b, iArr[0]);
                app.a();
                int b3 = jc.b(this.b, iArr[1]);
                synchronized (this.a) {
                    if (!(this.j == b2 && this.k == b3)) {
                        this.j = b2;
                        this.k = b3;
                        mwVar.w().a(this.j, this.k, !z);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final ViewTreeObserver.OnScrollChangedListener b(WeakReference<mw> weakReference) {
        if (this.h == null) {
            this.h = new bep(this, weakReference);
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final mw a() {
        return au.f().a(this.b, or.a(), "native-video", false, false, this.c, this.d.a.k, this.e, (an) null, this.f.h(), this.d.i);
    }
}
