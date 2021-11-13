package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class acb implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private final Context b;
    private Application c;
    private final PowerManager d;
    private final KeyguardManager e;
    private final yj f;
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private xx j;
    private boolean k = false;
    private int l = -1;
    private long m = -3;

    public acb(yj yjVar, View view) {
        this.f = yjVar;
        this.b = yjVar.a;
        this.d = (PowerManager) this.b.getSystemService("power");
        this.e = (KeyguardManager) this.b.getSystemService("keyguard");
        if (this.b instanceof Application) {
            this.c = (Application) this.b;
            this.j = new xx((Application) this.b, this);
        }
        a(view);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.l = i2;
            }
        }
    }

    private final void b() {
        a.post(new adc(this));
    }

    private final void b(View view) {
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
            this.g = new aed(this);
            this.b.registerReceiver(this.g, intentFilter);
        }
        if (this.c != null) {
            try {
                this.c.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r1 == false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            r3 = 1
            r2 = 0
            java.lang.ref.WeakReference<android.view.View> r0 = r9.i
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0018
            r0 = -3
            r9.m = r0
            r9.k = r2
            goto L_0x0006
        L_0x0018:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r6 = r0.getLocalVisibleRect(r1)
            com.google.android.gms.internal.yj r1 = r9.f
            boolean r1 = r1.j()
            if (r1 != 0) goto L_0x0053
            android.app.KeyguardManager r1 = r9.e
            boolean r1 = r1.inKeyguardRestrictedInputMode()
            if (r1 == 0) goto L_0x0092
            android.app.Activity r1 = com.google.android.gms.internal.zz.a((android.view.View) r0)
            if (r1 == 0) goto L_0x0090
            android.view.Window r1 = r1.getWindow()
            if (r1 != 0) goto L_0x008b
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x0090
            int r1 = r1.flags
            r4 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0090
            r1 = r3
        L_0x0051:
            if (r1 == 0) goto L_0x0092
        L_0x0053:
            r1 = r3
        L_0x0054:
            int r4 = r0.getWindowVisibility()
            int r7 = r9.l
            r8 = -1
            if (r7 == r8) goto L_0x005f
            int r4 = r9.l
        L_0x005f:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0094
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0094
            android.os.PowerManager r0 = r9.d
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0094
            if (r1 == 0) goto L_0x0094
            if (r6 == 0) goto L_0x0094
            if (r5 == 0) goto L_0x0094
            if (r4 != 0) goto L_0x0094
        L_0x007b:
            boolean r0 = r9.k
            if (r0 == r3) goto L_0x0006
            if (r3 == 0) goto L_0x0096
            long r0 = android.os.SystemClock.elapsedRealtime()
        L_0x0085:
            r9.m = r0
            r9.k = r3
            goto L_0x0006
        L_0x008b:
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            goto L_0x0047
        L_0x0090:
            r1 = r2
            goto L_0x0051
        L_0x0092:
            r1 = r2
            goto L_0x0054
        L_0x0094:
            r3 = r2
            goto L_0x007b
        L_0x0096:
            r0 = -2
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acb.c():void");
    }

    private final void c(View view) {
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
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
        }
        if (this.g != null) {
            try {
                this.b.unregisterReceiver(this.g);
            } catch (Exception e4) {
            }
            this.g = null;
        }
        if (this.c != null) {
            try {
                this.c.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e5) {
            }
        }
    }

    public final long a() {
        if (this.m == -2 && this.i.get() == null) {
            this.m = -3;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        View view2 = this.i != null ? (View) this.i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            c(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.m = -2;
            return;
        }
        this.m = -3;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        c();
    }

    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        c();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        c();
        b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        c();
    }

    public final void onActivityStopped(Activity activity) {
        c();
    }

    public final void onGlobalLayout() {
        c();
    }

    public final void onScrollChanged() {
        c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        b(view);
        c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        c();
        b();
        c(view);
    }
}
