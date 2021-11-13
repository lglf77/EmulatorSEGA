package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@bfk
@TargetApi(14)
public final class lw {
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) app.f().a(asw.t)).longValue());
    private long b;
    private boolean c = true;

    lw() {
    }

    public final void a() {
        this.c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, lo loVar) {
        if (loVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.c || Math.abs(timestamp - this.b) >= this.a) {
                this.c = false;
                this.b = timestamp;
                gw.a.post(new lx(this, loVar));
            }
        }
    }
}
