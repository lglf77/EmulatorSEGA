package com.google.android.gms.ads.internal;

import android.view.View;

final class bj implements View.OnClickListener {
    private /* synthetic */ br a;
    private /* synthetic */ bg b;

    bj(bg bgVar, br brVar) {
        this.b = bgVar;
        this.a = brVar;
    }

    public final void onClick(View view) {
        this.a.a();
        if (this.b.b != null) {
            this.b.b.c();
        }
    }
}
