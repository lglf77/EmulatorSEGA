package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.o;
import com.google.android.gms.ads.internal.js.z;

@bfk
public final class azq {
    private static ia<o> a = new azr();
    private static ia<o> b = new azs();
    private final z c;

    public azq(Context context, jp jpVar, String str) {
        this.c = new z(context, jpVar, str, a, b);
    }

    public final <I, O> azi<I, O> a(String str, azl<I> azl, azk<O> azk) {
        return new azu(this.c, str, azl, azk);
    }
}
