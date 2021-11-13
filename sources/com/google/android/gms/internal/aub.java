package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import java.util.List;

@bfk
public final class aub extends awb implements aul {
    private String a;
    private List<aty> b;
    private String c;
    private avh d;
    private String e;
    private String f;
    private atw g;
    private Bundle h;
    private ara i;
    private View j;
    private a k;
    private String l;
    private Object m = new Object();
    /* access modifiers changed from: private */
    public aui n;

    public aub(String str, List<aty> list, String str2, avh avh, String str3, String str4, atw atw, Bundle bundle, ara ara, View view, a aVar, String str5) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = avh;
        this.e = str3;
        this.f = str4;
        this.g = atw;
        this.h = bundle;
        this.i = ara;
        this.j = view;
        this.k = aVar;
        this.l = str5;
    }

    public final String a() {
        return this.a;
    }

    public final void a(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                fn.c("Attempt to perform click before content ad initialized.");
            } else {
                this.n.b(bundle);
            }
        }
    }

    public final void a(aui aui) {
        synchronized (this.m) {
            this.n = aui;
        }
    }

    public final List b() {
        return this.b;
    }

    public final boolean b(Bundle bundle) {
        boolean a2;
        synchronized (this.m) {
            if (this.n == null) {
                fn.c("Attempt to record impression before content ad initialized.");
                a2 = false;
            } else {
                a2 = this.n.a(bundle);
            }
        }
        return a2;
    }

    public final a c() {
        return this.k;
    }

    public final void c(Bundle bundle) {
        synchronized (this.m) {
            if (this.n == null) {
                fn.c("Attempt to perform click before app install ad initialized.");
            } else {
                this.n.c(bundle);
            }
        }
    }

    public final String d() {
        return this.l;
    }

    public final String e() {
        return this.c;
    }

    public final avh f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final ara i() {
        return this.i;
    }

    public final a j() {
        return c.a(this.n);
    }

    public final String k() {
        return "1";
    }

    public final String l() {
        return "";
    }

    public final atw m() {
        return this.g;
    }

    public final Bundle n() {
        return this.h;
    }

    public final View o() {
        return this.j;
    }

    public final avd p() {
        return this.g;
    }

    public final void q() {
        gw.a.post(new auc(this));
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.i = null;
        this.j = null;
    }
}
