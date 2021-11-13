package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.f;

@bfk
public final class atk extends atn {
    private final f a;
    private final String b;
    private final String c;

    public atk(f fVar, String str, String str2) {
        this.a = fVar;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.a.a_((View) c.a(aVar));
        }
    }

    public final String b() {
        return this.c;
    }

    public final void c() {
        this.a.b_();
    }

    public final void d() {
        this.a.c_();
    }
}
