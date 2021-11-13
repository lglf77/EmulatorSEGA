package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class afe implements Callable {
    private final yj a;
    private final pb b;

    public afe(yj yjVar, pb pbVar) {
        this.a = yjVar;
        this.b = pbVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        pb k = this.a.k();
        if (k == null) {
            return null;
        }
        try {
            synchronized (this.b) {
                akf.a(this.b, akf.a((akf) k));
            }
            return null;
        } catch (ake e) {
            return null;
        }
    }
}
