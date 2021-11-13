package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bae;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.mw;

final class bh implements Runnable {
    private /* synthetic */ bg a;

    bh(bg bgVar) {
        this.a = bgVar;
    }

    public final void run() {
        this.a.c.b(new ev(this.a.a, (mw) null, (bab) null, (bav) null, (String) null, (bae) null, (auk) null, (String) null));
    }
}
