package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

final class dz implements Runnable {
    private /* synthetic */ Bitmap a;
    private /* synthetic */ dy b;

    dz(dy dyVar, Bitmap bitmap) {
        this.b = dyVar;
        this.a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.b.g) {
            this.b.b.g = new akq();
            this.b.b.g.c = byteArrayOutputStream.toByteArray();
            this.b.b.g.b = "image/png";
            this.b.b.g.a = 1;
        }
    }
}
