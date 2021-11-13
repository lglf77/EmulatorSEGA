package com.google.android.gms.internal;

import com.google.android.gms.internal.ajz;

public abstract class ajz<M extends ajz<M>> extends akf {
    protected akb X;

    /* access modifiers changed from: protected */
    public int a() {
        if (this.X == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.X.a(); i2++) {
            i += this.X.b(i2).a();
        }
        return i;
    }

    public void a(ajx ajx) {
        if (this.X != null) {
            for (int i = 0; i < this.X.a(); i++) {
                this.X.b(i).a(ajx);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(ajw ajw, int i) {
        int l = ajw.l();
        if (!ajw.b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        akh akh = new akh(i, ajw.a(l, ajw.l() - l));
        akc akc = null;
        if (this.X == null) {
            this.X = new akb();
        } else {
            akc = this.X.a(i2);
        }
        if (akc == null) {
            akc = new akc();
            this.X.a(i2, akc);
        }
        akc.a(akh);
        return true;
    }

    /* renamed from: c */
    public M clone() {
        M m = (ajz) super.clone();
        akd.a(this, (ajz) m);
        return m;
    }

    public /* synthetic */ akf d() {
        return (ajz) clone();
    }
}
