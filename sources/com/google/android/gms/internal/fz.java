package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fz extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ gp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fz(Context context, gp gpVar) {
        super((fq) null);
        this.a = context;
        this.b = gpVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedPreferences.getBoolean("use_https", true));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
