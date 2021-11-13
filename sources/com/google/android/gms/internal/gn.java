package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class gn extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ gp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gn(Context context, gp gpVar) {
        super((fq) null);
        this.a = context;
        this.b = gpVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", sharedPreferences.getString("content_url_hashes", ""));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
