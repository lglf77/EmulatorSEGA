package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.mw;
import java.util.ArrayList;

public final class aw extends ViewSwitcher {
    private final hq a;
    private final jb b;
    private boolean c = true;

    public aw(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.a = new hq(context);
        this.a.a(str);
        this.a.b(str2);
        if (context instanceof Activity) {
            this.b = new jb((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.b = new jb((Activity) null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.b.a();
    }

    public final hq a() {
        return this.a;
    }

    public final void b() {
        fn.a("Disable position monitoring on adFrame.");
        if (this.b != null) {
            this.b.b();
        }
    }

    public final void c() {
        fn.a("Enable debug gesture detector on adFrame.");
        this.c = true;
    }

    public final void d() {
        fn.a("Disable debug gesture detector on adFrame.");
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            this.b.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.c) {
            return false;
        }
        this.a.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof mw)) {
                arrayList.add((mw) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((mw) obj).destroy();
        }
    }
}
