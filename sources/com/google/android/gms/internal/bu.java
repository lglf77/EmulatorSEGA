package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@bfk
public final class bu {
    /* access modifiers changed from: private */
    public WeakHashMap<Context, bw> a = new WeakHashMap<>();

    public final Future<bs> a(Context context) {
        return gq.a((ExecutorService) gq.a, new bv(this, context));
    }
}
