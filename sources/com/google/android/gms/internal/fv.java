package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fv extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ gp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fv(Context context, gp gpVar) {
        super((fq) null);
        this.a = context;
        this.b = gpVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", sharedPreferences.getInt("version_code", 0));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
