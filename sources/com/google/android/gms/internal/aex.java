package com.google.android.gms.internal;

public final class aex extends aft {
    private static volatile String d = null;
    private static final Object e = new Object();

    public aex(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 29);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.o = "E";
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (String) this.c.invoke((Object) null, new Object[]{this.a.a()});
                }
            }
        }
        synchronized (this.b) {
            this.b.o = py.a(d.getBytes(), true);
        }
    }
}
