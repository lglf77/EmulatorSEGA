package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

final class asx implements Callable<Void> {
    private /* synthetic */ Context a;

    asx(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        app.f().a(this.a);
        return null;
    }
}
