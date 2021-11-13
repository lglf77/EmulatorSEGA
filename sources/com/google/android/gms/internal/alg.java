package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class alg implements amq {
    private WeakReference<aui> a;

    public alg(aui aui) {
        this.a = new WeakReference<>(aui);
    }

    public final View a() {
        aui aui = (aui) this.a.get();
        if (aui != null) {
            return aui.h();
        }
        return null;
    }

    public final boolean b() {
        return this.a.get() == null;
    }

    public final amq c() {
        return new ali((aui) this.a.get());
    }
}
