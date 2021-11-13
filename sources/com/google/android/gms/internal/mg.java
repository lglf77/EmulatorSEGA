package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@bfk
@TargetApi(14)
public final class mg implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager a;
    private final mh b;
    private boolean c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    public mg(Context context, mh mhVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = mhVar;
    }

    private final void d() {
        boolean z = true;
        boolean z2 = this.d && !this.e && this.f > 0.0f;
        if (z2 && !this.c) {
            if (this.a != null && !this.c) {
                if (this.a.requestAudioFocus(this, 3, 2) != 1) {
                    z = false;
                }
                this.c = z;
            }
            this.b.e();
        } else if (!z2 && this.c) {
            if (this.a != null && this.c) {
                if (this.a.abandonAudioFocus(this) != 0) {
                    z = false;
                }
                this.c = z;
            }
            this.b.e();
        }
    }

    public final float a() {
        float f2 = this.e ? 0.0f : this.f;
        if (this.c) {
            return f2;
        }
        return 0.0f;
    }

    public final void a(float f2) {
        this.f = f2;
        d();
    }

    public final void a(boolean z) {
        this.e = z;
        d();
    }

    public final void b() {
        this.d = true;
        d();
    }

    public final void c() {
        this.d = false;
        d();
    }

    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.e();
    }
}
