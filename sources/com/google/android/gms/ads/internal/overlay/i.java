package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.mw;

@bfk
public final class i {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public i(mw mwVar) {
        this.b = mwVar.getLayoutParams();
        ViewParent parent = mwVar.getParent();
        this.d = mwVar.r();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        this.c = (ViewGroup) parent;
        ViewGroup viewGroup = this.c;
        if (mwVar == null) {
            throw null;
        }
        this.a = viewGroup.indexOfChild((View) mwVar);
        ViewGroup viewGroup2 = this.c;
        if (mwVar == null) {
            throw null;
        }
        viewGroup2.removeView((View) mwVar);
        mwVar.b(true);
    }
}
