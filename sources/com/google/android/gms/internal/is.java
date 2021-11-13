package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;

@bfk
public final class is extends fj {
    private final jo a;
    private final String b;

    public is(Context context, String str, String str2) {
        this(str2, au.e().a(context, str));
    }

    private is(String str, String str2) {
        this.a = new jo(str2);
        this.b = str;
    }

    public final void a() {
        this.a.a(this.b);
    }

    public final void b() {
    }
}
