package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;

@bfk
public final class aty extends avi {
    private final Drawable a;
    private final Uri b;
    private final double c;

    public aty(Drawable drawable, Uri uri, double d) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
    }

    public final a a() {
        return c.a(this.a);
    }

    public final Uri b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }
}
