package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.au;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@bfk
@TargetApi(14)
public final class amb implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long a = ((Long) app.f().a(asw.aZ)).longValue();
    private final Context b;
    private Application c;
    private final WindowManager d;
    private final PowerManager e;
    private final KeyguardManager f;
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private amg j;
    private it k = new it(a);
    private boolean l = false;
    private int m = -1;
    private HashSet<amf> n = new HashSet<>();
    private DisplayMetrics o;

    public amb(Context context, View view) {
        this.b = context.getApplicationContext();
        this.d = (WindowManager) context.getSystemService("window");
        this.e = (PowerManager) this.b.getSystemService("power");
        this.f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.b instanceof Application) {
            this.c = (Application) this.b;
            this.j = new amg((Application) this.b, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        View view2 = this.i != null ? (View) this.i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (au.g().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        if (this.n.size() != 0 && this.i != null) {
            View view = (View) this.i.get();
            boolean z = i2 == 1;
            boolean z2 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            boolean z3 = false;
            Rect rect3 = new Rect();
            boolean z4 = false;
            Rect rect4 = new Rect();
            Rect rect5 = new Rect();
            rect5.right = this.d.getDefaultDisplay().getWidth();
            rect5.bottom = this.d.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                z3 = view.getGlobalVisibleRect(rect2);
                z4 = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e2) {
                    fn.b("Failure getting view location.", e2);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.m != -1) {
                windowVisibility = this.m;
            }
            boolean z5 = !z2 && au.e().a(view, this.e, this.f) && z3 && z4 && windowVisibility == 0;
            if (z && !this.k.a() && z5 == this.l) {
                return;
            }
            if (z5 || this.l || i2 != 1) {
                ame ame = new ame(au.k().b(), this.e.isScreenOn(), view != null ? au.g().a(view) : false, view != null ? view.getWindowVisibility() : 8, a(rect5), a(rect), a(rect2), z3, a(rect3), z4, a(rect4), this.o.density, z5);
                Iterator<amf> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().a(ame);
                }
                this.l = z5;
            }
        }
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.g = new amd(this);
            au.C().a(this.b, this.g, intentFilter);
        }
        if (this.c != null) {
            try {
                this.c.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                fn.b("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b() {
        au.e();
        gw.a.post(new amc(this));
    }

    private final void b(View view) {
        try {
            if (this.h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception e2) {
            fn.b("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            fn.b("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.g != null) {
            try {
                au.C().a(this.b, this.g);
            } catch (IllegalStateException e4) {
                fn.b("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                au.i().a((Throwable) e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.g = null;
        }
        if (this.c != null) {
            try {
                this.c.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                fn.b("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void a() {
        a(4);
    }

    public final void a(amf amf) {
        this.n.add(amf);
        a(3);
    }

    public final void b(amf amf) {
        this.n.remove(amf);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        b();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        b();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        b();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        b();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        b();
    }

    public final void onGlobalLayout() {
        a(2);
        b();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        a(3);
        b();
        b(view);
    }
}
