package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.aot;
import com.google.android.gms.internal.arm;

public final class g {
    private final arm a;

    public g(Context context) {
        this.a = new arm(context);
        y.a(context, (Object) "Context cannot be null");
    }

    public final void a(a aVar) {
        this.a.a(aVar);
        if (aVar != null && (aVar instanceof aot)) {
            this.a.a((aot) aVar);
        } else if (aVar == null) {
            this.a.a((aot) null);
        }
    }

    public final void a(c cVar) {
        this.a.a(cVar.a());
    }

    public final void a(c cVar) {
        this.a.a(cVar);
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(boolean z) {
        this.a.a(true);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final void b(boolean z) {
        this.a.b(z);
    }
}
