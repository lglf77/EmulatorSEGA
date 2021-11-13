package com.google.android.gms.internal;

final class xm implements Runnable {
    private /* synthetic */ xl a;

    xm(xl xlVar) {
        this.a = xlVar;
    }

    public final void run() {
        if (this.a.b == null) {
            synchronized (xl.d) {
                if (this.a.b == null) {
                    boolean booleanValue = ((Boolean) app.f().a(asw.bo)).booleanValue();
                    if (booleanValue) {
                        try {
                            xl.a = new aol(this.a.c.a, "ADSHIELD", (String) null);
                        } catch (Throwable th) {
                            booleanValue = false;
                        }
                    }
                    this.a.b = Boolean.valueOf(booleanValue);
                    xl.d.open();
                }
            }
        }
    }
}
