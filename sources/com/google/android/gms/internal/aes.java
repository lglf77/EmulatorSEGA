package com.google.android.gms.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class aes extends WeakReference<Throwable> {
    private final int a;

    public aes(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, (ReferenceQueue) null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        aes aes = (aes) obj;
        return this.a == aes.a && get() == aes.get();
    }

    public final int hashCode() {
        return this.a;
    }
}
