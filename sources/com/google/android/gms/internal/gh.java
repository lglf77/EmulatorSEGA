package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class gh extends go {
    private /* synthetic */ Context a;
    private /* synthetic */ gp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gh(Context context, gp gpVar) {
        super((fq) null);
        this.a = context;
        this.b = gpVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("first_ad_req_time_ms", sharedPreferences.getLong("first_ad_req_time_ms", 0));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
