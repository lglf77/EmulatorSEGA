package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;

public final class aev extends aft {
    private final Activity d;
    private final View e;

    public aev(yj yjVar, String str, String str2, pb pbVar, int i, int i2, View view, Activity activity) {
        super(yjVar, str, str2, pbVar, i, 62);
        this.e = view;
        this.d = activity;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.e != null) {
            long[] jArr = (long[]) this.c.invoke((Object) null, new Object[]{this.e, this.d});
            synchronized (this.b) {
                this.b.Q = Long.valueOf(jArr[0]);
                this.b.R = Long.valueOf(jArr[1]);
            }
        }
    }
}
