package com.google.android.gms.internal;

public final class afm extends aft {
    public afm(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 51);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            yi yiVar = new yi((String) this.c.invoke((Object) null, new Object[0]));
            this.b.G = yiVar.a;
            this.b.H = yiVar.b;
        }
    }
}
