package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import android.view.View;

public final class afq extends aft {
    private final View d;

    public afq(yj yjVar, String str, String str2, pb pbVar, int i, int i2, View view) {
        super(yjVar, str, str2, pbVar, i, 57);
        this.d = view;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            DisplayMetrics displayMetrics = this.a.a().getResources().getDisplayMetrics();
            aba aba = new aba((String) this.c.invoke((Object) null, new Object[]{this.d, displayMetrics}));
            pe peVar = new pe();
            peVar.a = aba.a;
            peVar.b = aba.b;
            peVar.c = aba.c;
            this.b.M = peVar;
        }
    }
}
