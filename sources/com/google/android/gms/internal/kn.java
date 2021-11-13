package com.google.android.gms.internal;

import java.util.concurrent.Executor;

@bfk
public final class kn {
    public static final Executor a = new ko();
    public static final Executor b = new kp();
    private static kl c = a(a);
    private static kl d = a(b);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.kq, com.google.android.gms.internal.kl] */
    private static kl a(Executor executor) {
        return new kq(executor, (ko) null);
    }
}
