package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@bfk
@TargetApi(14)
public abstract class lp extends TextureView implements mh {
    protected final lw a = new lw();
    protected final mg b;

    public lp(Context context) {
        super(context);
        this.b = new mg(context, this);
    }

    public abstract String a();

    public abstract void a(float f, float f2);

    public abstract void a(int i);

    public abstract void a(lo loVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
