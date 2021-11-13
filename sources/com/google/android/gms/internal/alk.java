package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class alk implements amq {
    private final WeakReference<View> a;
    private final WeakReference<ev> b;

    public alk(View view, ev evVar) {
        this.a = new WeakReference<>(view);
        this.b = new WeakReference<>(evVar);
    }

    public final View a() {
        return (View) this.a.get();
    }

    public final boolean b() {
        return this.a.get() == null || this.b.get() == null;
    }

    public final amq c() {
        return new alj((View) this.a.get(), (ev) this.b.get());
    }
}
