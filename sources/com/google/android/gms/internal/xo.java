package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.a;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class xo implements xn {
    protected MotionEvent a;
    protected LinkedList<MotionEvent> b = new LinkedList<>();
    protected long c = 0;
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected double j;
    protected float k;
    protected float l;
    protected float m;
    protected float n;
    protected boolean o = false;
    protected DisplayMetrics p;
    private double q;
    private double r;
    private boolean s = false;

    protected xo(Context context) {
        try {
            if (((Boolean) app.f().a(asw.by)).booleanValue()) {
                qa.a();
            } else {
                qd.a();
            }
            this.p = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    private final String a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        pb a2;
        if (z) {
            try {
                a2 = a(context, view, activity);
                this.s = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
                return Integer.toString(7);
            } catch (Throwable th) {
                return Integer.toString(3);
            }
        } else {
            a2 = a(context, (oy) null);
        }
        return (a2 == null || a2.f() == 0) ? Integer.toString(5) : qa.a(a2, str);
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract pb a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract pb a(Context context, oy oyVar);

    public final String a(Context context) {
        if (zz.b()) {
            if (((Boolean) app.f().a(asw.bA)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, (String) null, false, (View) null, (Activity) null, (byte[]) null);
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        return a(context, str, true, view, activity, (byte[]) null);
    }

    public final void a(int i2, int i3, int i4) {
        if (this.a != null) {
            this.a.recycle();
        }
        if (this.p != null) {
            this.a = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * this.p.density, ((float) i3) * this.p.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.a = null;
        }
        this.o = false;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.s) {
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.g = 0;
            this.i = 0;
            this.h = 0;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.b.clear();
            this.a = null;
            this.s = false;
        }
        switch (motionEvent.getAction()) {
            case a.b.AdsAttrs_adSize:
                this.j = 0.0d;
                this.q = (double) motionEvent.getRawX();
                this.r = (double) motionEvent.getRawY();
                break;
            case a.b.AdsAttrs_adSizes:
            case 2:
                double rawX = (double) motionEvent.getRawX();
                double rawY = (double) motionEvent.getRawY();
                double d2 = rawX - this.q;
                double d3 = rawY - this.r;
                this.j = Math.sqrt((d2 * d2) + (d3 * d3)) + this.j;
                this.q = rawX;
                this.r = rawY;
                break;
        }
        switch (motionEvent.getAction()) {
            case a.b.AdsAttrs_adSize:
                if (((Boolean) app.f().a(asw.bv)).booleanValue()) {
                    this.k = motionEvent.getX();
                    this.l = motionEvent.getY();
                    this.m = motionEvent.getRawX();
                    this.n = motionEvent.getRawY();
                }
                this.c++;
                break;
            case a.b.AdsAttrs_adSizes:
                this.a = MotionEvent.obtain(motionEvent);
                this.b.add(this.a);
                if (this.b.size() > 6) {
                    this.b.remove().recycle();
                }
                this.e++;
                try {
                    this.g = a(new Throwable().getStackTrace());
                    break;
                } catch (yg e2) {
                    break;
                }
            case 2:
                this.d += (long) (motionEvent.getHistorySize() + 1);
                try {
                    yy b2 = b(motionEvent);
                    if ((b2 == null || b2.d == null || b2.g == null) ? false : true) {
                        this.h += b2.d.longValue() + b2.g.longValue();
                    }
                    if ((this.p == null || b2 == null || b2.e == null || b2.h == null) ? false : true) {
                        this.i = b2.h.longValue() + b2.e.longValue() + this.i;
                        break;
                    }
                } catch (yg e3) {
                    break;
                }
                break;
            case 3:
                this.f++;
                break;
        }
        this.o = true;
    }

    public void a(View view) {
    }

    /* access modifiers changed from: protected */
    public abstract yy b(MotionEvent motionEvent);
}
