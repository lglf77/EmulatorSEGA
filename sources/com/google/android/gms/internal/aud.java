package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.v4.c.f;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@bfk
public final class aud extends awf implements auk {
    private final atw a;
    private final String b;
    private final f<String, aty> c;
    private final f<String, String> d;
    private ara e;
    private View f;
    private final Object g = new Object();
    /* access modifiers changed from: private */
    public aui h;

    public aud(String str, f<String, aty> fVar, f<String, String> fVar2, atw atw, ara ara, View view) {
        this.b = str;
        this.c = fVar;
        this.d = fVar2;
        this.a = atw;
        this.e = ara;
        this.f = view;
    }

    public final String a(String str) {
        return this.d.get(str);
    }

    public final List<String> a() {
        int i = 0;
        String[] strArr = new String[(this.c.size() + this.d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            strArr[i2] = this.c.b(i3);
            i2++;
        }
        while (i < this.d.size()) {
            strArr[i2] = this.d.b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public final void a(aui aui) {
        synchronized (this.g) {
            this.h = aui;
        }
    }

    public final boolean a(a aVar) {
        if (this.h == null) {
            jn.c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f == null) {
            return false;
        } else {
            aue aue = new aue(this);
            this.h.a((View) (FrameLayout) c.a(aVar), (aug) aue);
            return true;
        }
    }

    public final a b() {
        return c.a(this.h);
    }

    public final avh b(String str) {
        return this.c.get(str);
    }

    public final ara c() {
        return this.e;
    }

    public final void c(String str) {
        synchronized (this.g) {
            if (this.h == null) {
                jn.c("Attempt to call performClick before ad initialized.");
            } else {
                this.h.a((View) null, str, (Bundle) null, (Map<String, WeakReference<View>>) null, (View) null);
            }
        }
    }

    public final void d() {
        synchronized (this.g) {
            if (this.h == null) {
                jn.c("Attempt to perform recordImpression before ad initialized.");
            } else {
                this.h.a((View) null, (Map<String, WeakReference<View>>) null);
            }
        }
    }

    public final a e() {
        return c.a(this.h.i().getApplicationContext());
    }

    public final void f() {
        gw.a.post(new auf(this));
        this.e = null;
        this.f = null;
    }

    public final String k() {
        return "3";
    }

    public final String l() {
        return this.b;
    }

    public final atw m() {
        return this.a;
    }

    public final View o() {
        return this.f;
    }
}
