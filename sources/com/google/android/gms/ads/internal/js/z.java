package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ia;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.xr;

@bfk
public final class z {
    /* access modifiers changed from: private */
    public final Object a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final String c;
    /* access modifiers changed from: private */
    public final jp d;
    /* access modifiers changed from: private */
    public ia<o> e;
    private ia<o> f;
    /* access modifiers changed from: private */
    public f g;
    /* access modifiers changed from: private */
    public int h;

    public z(Context context, jp jpVar, String str) {
        this.a = new Object();
        this.h = 1;
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = jpVar;
        this.e = new al();
        this.f = new al();
    }

    public z(Context context, jp jpVar, String str, ia<o> iaVar, ia<o> iaVar2) {
        this(context, jpVar, str);
        this.e = iaVar;
        this.f = iaVar2;
    }

    /* access modifiers changed from: protected */
    public final f a(xr xrVar) {
        f fVar = new f(this.f);
        au.e();
        gw.a((Runnable) new aa(this, xrVar, fVar));
        fVar.a(new ai(this, fVar), new aj(this, fVar));
        return fVar;
    }

    public final b b(xr xrVar) {
        b bVar;
        synchronized (this.a) {
            if (this.g == null || this.g.e() == -1) {
                this.h = 2;
                this.g = a((xr) null);
                bVar = this.g.a();
            } else if (this.h == 0) {
                bVar = this.g.a();
            } else if (this.h == 1) {
                this.h = 2;
                a((xr) null);
                bVar = this.g.a();
            } else {
                bVar = this.h == 2 ? this.g.a() : this.g.a();
            }
        }
        return bVar;
    }
}
