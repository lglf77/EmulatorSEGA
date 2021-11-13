package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class en implements Callable {
    private final em a;
    private final Context b;

    en(em emVar, Context context) {
        this.a = emVar;
        this.b = context;
    }

    public final Object call() {
        return this.a.j(this.b);
    }
}
