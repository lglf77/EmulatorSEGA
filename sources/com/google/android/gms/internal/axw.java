package com.google.android.gms.internal;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

@bfk
final class axw {
    /* access modifiers changed from: private */
    public final List<ayv> a = new LinkedList();

    axw() {
    }

    /* access modifiers changed from: package-private */
    public final void a(ayw ayw) {
        Handler handler = gw.a;
        for (ayv ayu : this.a) {
            handler.post(new ayu(this, ayu, ayw));
        }
        this.a.clear();
    }
}
