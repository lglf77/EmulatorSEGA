package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.aol;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ed;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.lq;
import com.google.android.gms.internal.lv;
import com.google.android.gms.internal.mi;
import com.google.android.gms.internal.mu;

@bfk
public final class bq {
    public final mu a;
    public final lq b;
    public final ej c;
    public final aol d;

    private bq(mu muVar, lq lqVar, ej ejVar, aol aol) {
        this.a = muVar;
        this.b = lqVar;
        this.c = ejVar;
        this.d = aol;
    }

    public static bq a(Context context) {
        return new bq(new mi(), new lv(), new ec(new ed()), new aol(context));
    }
}
