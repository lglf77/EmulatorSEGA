package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.b.c;

@bfk
public final class avk extends c.b {
    private final avh a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public avk(avh avh) {
        Drawable drawable;
        Uri uri = null;
        this.a = avh;
        try {
            a a2 = this.a.a();
            if (a2 != null) {
                drawable = (Drawable) com.google.android.gms.a.c.a(a2);
                this.b = drawable;
                uri = this.a.b();
                this.c = uri;
                double d2 = 1.0d;
                d2 = this.a.c();
                this.d = d2;
            }
        } catch (RemoteException e) {
            jn.b("Failed to get drawable.", e);
        }
        drawable = null;
        this.b = drawable;
        try {
            uri = this.a.b();
        } catch (RemoteException e2) {
            jn.b("Failed to get uri.", e2);
        }
        this.c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.a.c();
        } catch (RemoteException e3) {
            jn.b("Failed to get scale.", e3);
        }
        this.d = d22;
    }

    public final Drawable a() {
        return this.b;
    }

    public final Uri b() {
        return this.c;
    }

    public final double c() {
        return this.d;
    }
}
