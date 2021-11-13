package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.aqw;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.jp;

@bfk
public final class x extends aqw {
    private static final Object b = new Object();
    private static x c;
    /* access modifiers changed from: private */
    public final Context a;
    private final Object d = new Object();
    private boolean e;
    private jp f;

    private x(Context context, jp jpVar) {
        this.a = context;
        this.f = jpVar;
        this.e = false;
    }

    public static x a(Context context, jp jpVar) {
        x xVar;
        synchronized (b) {
            if (c == null) {
                c = new x(context.getApplicationContext(), jpVar);
            }
            xVar = c;
        }
        return xVar;
    }

    public final void a() {
        synchronized (b) {
            if (this.e) {
                fn.e("Mobile ads is initialized already.");
                return;
            }
            this.e = true;
            asw.a(this.a);
            au.i().a(this.a, this.f);
            au.j().a(this.a);
        }
    }

    public final void a(float f2) {
        au.B().a(f2);
    }

    public final void a(a aVar, String str) {
        if (aVar == null) {
            fn.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) c.a(aVar);
        if (context == null) {
            fn.c("Context is null. Failed to open debug menu.");
            return;
        }
        hq hqVar = new hq(context);
        hqVar.a(str);
        hqVar.b(this.f.a);
        hqVar.a();
    }

    public final void a(String str) {
        asw.a(this.a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) app.f().a(asw.cc)).booleanValue()) {
                au.l().a(this.a, this.f, str, (Runnable) null);
            }
        }
    }

    public final void a(String str, a aVar) {
        y yVar;
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            asw.a(this.a);
            boolean booleanValue = ((Boolean) app.f().a(asw.cc)).booleanValue() | ((Boolean) app.f().a(asw.as)).booleanValue();
            if (((Boolean) app.f().a(asw.as)).booleanValue()) {
                yVar = new y(this, (Runnable) c.a(aVar));
                z = true;
            } else {
                yVar = null;
                z = booleanValue;
            }
            if (z) {
                au.l().a(this.a, this.f, str, yVar);
            }
        }
    }

    public final void a(boolean z) {
        au.B().a(z);
    }

    public final float b() {
        return au.B().a();
    }

    public final boolean c() {
        return au.B().b();
    }
}
