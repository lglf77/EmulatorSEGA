package com.google.firebase.a;

import android.content.Context;
import com.google.firebase.a;
import java.util.concurrent.atomic.AtomicReference;

public final class b {
    private static final AtomicReference<b> a = new AtomicReference<>();

    private b(Context context) {
    }

    public static b a(Context context) {
        a.compareAndSet((Object) null, new b(context));
        return a.get();
    }

    public static void a(a aVar) {
    }
}
