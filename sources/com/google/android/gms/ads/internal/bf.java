package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bae;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.mw;

final class bf implements Runnable {
    private /* synthetic */ ew a;
    private /* synthetic */ bd b;

    bf(bd bdVar, ew ewVar) {
        this.b = bdVar;
        this.a = ewVar;
    }

    public final void run() {
        this.b.b(new ev(this.a, (mw) null, (bab) null, (bav) null, (String) null, (bae) null, (auk) null, (String) null));
    }
}
