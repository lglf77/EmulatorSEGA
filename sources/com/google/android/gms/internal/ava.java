package com.google.android.gms.internal;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.au;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@bfk
public final class ava extends avs implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    static final String[] a = {"2011", "1009"};
    private final Object b = new Object();
    private final WeakReference<View> c;
    private final Map<String, WeakReference<View>> d = new HashMap();
    private final Map<String, WeakReference<View>> e = new HashMap();
    private final Map<String, WeakReference<View>> f = new HashMap();
    private aui g;
    private View h;
    private Point i = new Point();
    private Point j = new Point();
    private WeakReference<amb> k = new WeakReference<>((Object) null);

    public ava(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        au.y();
        la.a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        au.y();
        la.a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.c = new WeakReference<>(view);
        a((Map<String, View>) hashMap);
        this.f.putAll(this.d);
        b(hashMap2);
        this.f.putAll(this.e);
        asw.a(view.getContext());
    }

    private final int a(int i2) {
        int b2;
        synchronized (this.b) {
            app.a();
            b2 = jc.b(this.g.i(), i2);
        }
        return b2;
    }

    private final void a(View view) {
        synchronized (this.b) {
            if (this.g != null) {
                aui d2 = this.g instanceof auh ? ((auh) this.g).d() : this.g;
                if (d2 != null) {
                    d2.b(view);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.aum r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r6.b
            monitor-enter(r2)
            java.lang.String[] r3 = a     // Catch:{ all -> 0x0039 }
            int r4 = r3.length     // Catch:{ all -> 0x0039 }
            r0 = 0
            r1 = r0
        L_0x0008:
            if (r1 >= r4) goto L_0x0029
            r0 = r3[r1]     // Catch:{ all -> 0x0039 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f     // Catch:{ all -> 0x0039 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0039 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0039 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0039 }
        L_0x001c:
            boolean r1 = r0 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002b
            r7.g()     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
        L_0x0024:
            return
        L_0x0025:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0008
        L_0x0029:
            r0 = 0
            goto L_0x001c
        L_0x002b:
            com.google.android.gms.internal.avc r1 = new com.google.android.gms.internal.avc     // Catch:{ all -> 0x0039 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0039 }
            boolean r3 = r7 instanceof com.google.android.gms.internal.auh     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x003c
            r7.b((android.view.View) r0, (com.google.android.gms.internal.aug) r1)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x0024
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r7.a((android.view.View) r0, (com.google.android.gms.internal.aug) r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ava.a(com.google.android.gms.internal.aum):void");
    }

    private final void a(Map<String, View> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            View view = (View) next.getValue();
            if (view != null) {
                this.d.put(str, new WeakReference(view));
                if (!"1098".equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(String[] strArr) {
        for (String str : strArr) {
            if (this.d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void b(Map<String, View> map) {
        for (Map.Entry next : map.entrySet()) {
            View view = (View) next.getValue();
            if (view != null) {
                this.e.put((String) next.getKey(), new WeakReference(view));
                view.setOnTouchListener(this);
            }
        }
    }

    public final void a() {
        synchronized (this.b) {
            this.h = null;
            this.g = null;
            this.i = null;
            this.j = null;
        }
    }

    public final void a(a aVar) {
        synchronized (this.b) {
            a((View) null);
            Object a2 = c.a(aVar);
            if (!(a2 instanceof aum)) {
                fn.e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            aum aum = (aum) a2;
            if (!aum.b()) {
                fn.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = (View) this.c.get();
            if (!(this.g == null || view == null)) {
                if (((Boolean) app.f().a(asw.bM)).booleanValue()) {
                    this.g.b(view, this.f);
                }
            }
            synchronized (this.b) {
                if (this.g instanceof aum) {
                    aum aum2 = (aum) this.g;
                    View view2 = (View) this.c.get();
                    if (!(aum2 == null || aum2.i() == null || view2 == null || !au.z().c(view2.getContext()))) {
                        el j2 = aum2.j();
                        if (j2 != null) {
                            j2.a(false);
                        }
                        amb amb = (amb) this.k.get();
                        if (!(amb == null || j2 == null)) {
                            amb.b((amf) j2);
                        }
                    }
                }
            }
            if (!(this.g instanceof auh) || !((auh) this.g).c()) {
                this.g = aum;
                if (aum instanceof auh) {
                    ((auh) aum).a((aui) null);
                }
            } else {
                ((auh) this.g).a(aum);
            }
            WeakReference weakReference = this.f.get("1098");
            if (weakReference == null) {
                fn.e("Ad choices asset view is not provided.");
            } else {
                View view3 = (View) weakReference.get();
                ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup != null) {
                    this.h = aum.a((View.OnClickListener) this, true);
                    if (this.h != null) {
                        this.f.put("1007", new WeakReference(this.h));
                        this.d.put("1007", new WeakReference(this.h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.h);
                    }
                }
            }
            aum.a(view, this.d, this.e, (View.OnTouchListener) this, (View.OnClickListener) this);
            gw.a.post(new avb(this, aum));
            a(view);
            this.g.a(view);
            synchronized (this.b) {
                if (this.g instanceof aum) {
                    aum aum3 = (aum) this.g;
                    View view4 = (View) this.c.get();
                    if (!(aum3 == null || aum3.i() == null || view4 == null || !au.z().c(view4.getContext()))) {
                        amb amb2 = (amb) this.k.get();
                        if (amb2 == null) {
                            amb2 = new amb(view4.getContext(), view4);
                            this.k = new WeakReference<>(amb2);
                        }
                        amb2.a((amf) aum3.j());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.lang.Object r6 = r7.b
            monitor-enter(r6)
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r6)     // Catch:{ all -> 0x0015 }
        L_0x0008:
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r0 = r7.c     // Catch:{ all -> 0x0015 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0015 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0015 }
            if (r5 != 0) goto L_0x0018
            monitor-exit(r6)     // Catch:{ all -> 0x0015 }
            goto L_0x0008
        L_0x0015:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0015 }
            r3.<init>()     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "x"
            android.graphics.Point r1 = r7.i     // Catch:{ all -> 0x0015 }
            int r1 = r1.x     // Catch:{ all -> 0x0015 }
            int r1 = r7.a((int) r1)     // Catch:{ all -> 0x0015 }
            float r1 = (float) r1     // Catch:{ all -> 0x0015 }
            r3.putFloat(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "y"
            android.graphics.Point r1 = r7.i     // Catch:{ all -> 0x0015 }
            int r1 = r1.y     // Catch:{ all -> 0x0015 }
            int r1 = r7.a((int) r1)     // Catch:{ all -> 0x0015 }
            float r1 = (float) r1     // Catch:{ all -> 0x0015 }
            r3.putFloat(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "start_x"
            android.graphics.Point r1 = r7.j     // Catch:{ all -> 0x0015 }
            int r1 = r1.x     // Catch:{ all -> 0x0015 }
            int r1 = r7.a((int) r1)     // Catch:{ all -> 0x0015 }
            float r1 = (float) r1     // Catch:{ all -> 0x0015 }
            r3.putFloat(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = "start_y"
            android.graphics.Point r1 = r7.j     // Catch:{ all -> 0x0015 }
            int r1 = r1.y     // Catch:{ all -> 0x0015 }
            int r1 = r7.a((int) r1)     // Catch:{ all -> 0x0015 }
            float r1 = (float) r1     // Catch:{ all -> 0x0015 }
            r3.putFloat(r0, r1)     // Catch:{ all -> 0x0015 }
            android.view.View r0 = r7.h     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x008e
            android.view.View r0 = r7.h     // Catch:{ all -> 0x0015 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x008e
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            boolean r0 = r0 instanceof com.google.android.gms.internal.auh     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0083
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.auh r0 = (com.google.android.gms.internal.auh) r0     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.aui r0 = r0.d()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0081
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.auh r0 = (com.google.android.gms.internal.auh) r0     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.aui r0 = r0.d()     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r7.f     // Catch:{ all -> 0x0015 }
            r1 = r8
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0015 }
        L_0x0081:
            monitor-exit(r6)     // Catch:{ all -> 0x0015 }
            goto L_0x0008
        L_0x0083:
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r7.f     // Catch:{ all -> 0x0015 }
            r1 = r8
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0015 }
            goto L_0x0081
        L_0x008e:
            com.google.android.gms.internal.aui r0 = r7.g     // Catch:{ all -> 0x0015 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r7.f     // Catch:{ all -> 0x0015 }
            r0.a(r8, r1, r3, r5)     // Catch:{ all -> 0x0015 }
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ava.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        View view;
        synchronized (this.b) {
            if (!(this.g == null || (view = (View) this.c.get()) == null)) {
                this.g.c(view, this.f);
            }
        }
    }

    public final void onScrollChanged() {
        View view;
        synchronized (this.b) {
            if (!(this.g == null || (view = (View) this.c.get()) == null)) {
                this.g.c(view, this.f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.b) {
            if (this.g != null) {
                View view2 = (View) this.c.get();
                if (view2 != null) {
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
                    this.i = point;
                    if (motionEvent.getAction() == 0) {
                        this.j = point;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setLocation((float) point.x, (float) point.y);
                    this.g.a(obtain);
                    obtain.recycle();
                }
            }
        }
        return false;
    }
}
