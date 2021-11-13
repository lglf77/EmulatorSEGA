package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.xn;
import com.google.android.gms.internal.xq;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@bfk
public final class g implements xn, Runnable {
    private final List<Object[]> a;
    private final AtomicReference<xn> b;
    private Context c;
    private jp d;
    private CountDownLatch e;

    private g(Context context, jp jpVar) {
        this.a = new Vector();
        this.b = new AtomicReference<>();
        this.e = new CountDownLatch(1);
        this.c = context;
        this.d = jpVar;
        app.a();
        if (jc.b()) {
            gq.a((Runnable) this);
        } else {
            run();
        }
    }

    public g(av avVar) {
        this(avVar.c, avVar.e);
    }

    private final boolean a() {
        try {
            this.e.await();
            return true;
        } catch (InterruptedException e2) {
            fn.c("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (!this.a.isEmpty()) {
            for (Object[] next : this.a) {
                if (next.length == 1) {
                    this.b.get().a((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    this.b.get().a(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.a.clear();
        }
    }

    public final String a(Context context) {
        xn xnVar;
        if (!a() || (xnVar = this.b.get()) == null) {
            return "";
        }
        b();
        return xnVar.a(b(context));
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        xn xnVar;
        if (!a() || (xnVar = this.b.get()) == null) {
            return "";
        }
        b();
        return xnVar.a(b(context), str, view, activity);
    }

    public final void a(int i, int i2, int i3) {
        xn xnVar = this.b.get();
        if (xnVar != null) {
            b();
            xnVar.a(i, i2, i3);
            return;
        }
        this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(MotionEvent motionEvent) {
        xn xnVar = this.b.get();
        if (xnVar != null) {
            b();
            xnVar.a(motionEvent);
            return;
        }
        this.a.add(new Object[]{motionEvent});
    }

    public final void a(View view) {
        xn xnVar = this.b.get();
        if (xnVar != null) {
            xnVar.a(view);
        }
    }

    public final void run() {
        try {
            this.b.set(xq.a(this.d.a, b(this.c), !((Boolean) app.f().a(asw.az)).booleanValue() && (this.d.d)));
        } finally {
            this.e.countDown();
            this.c = null;
            this.d = null;
        }
    }
}
