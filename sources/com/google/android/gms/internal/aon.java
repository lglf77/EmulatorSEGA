package com.google.android.gms.internal;

import android.os.RemoteException;

public final class aon {
    private final byte[] a;
    private int b;
    private int c;
    private /* synthetic */ aol d;

    private aon(aol aol, byte[] bArr) {
        this.d = aol;
        this.a = bArr;
    }

    public final aon a(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void a() {
        try {
            if (this.d.b) {
                this.d.a.a(this.a);
                this.d.a.a(this.b);
                this.d.a.b(this.c);
                this.d.a.a((int[]) null);
                this.d.a.a();
            }
        } catch (RemoteException e) {
            jn.a("Clearcut log failed", e);
        }
        return;
    }

    public final aon b(int i) {
        this.c = i;
        return this;
    }
}
